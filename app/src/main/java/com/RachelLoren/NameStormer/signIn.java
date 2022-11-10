package com.RachelLoren.NameStormer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signIn extends AppCompatActivity {

    EditText emailET,passwordET;
    Button loginbtn;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        configureBackBtn();
        emailET = (EditText)findViewById(R.id.email);
        passwordET = (EditText)findViewById(R.id.password);
        loginbtn = (Button) findViewById(R.id.loginbtn);

        mAuth = FirebaseAuth.getInstance();

        loginbtn.setOnClickListener((v)->{
            MainActivity.guest = false;
            loginUser();
        });

    }

    void loginUser(){
        String email = emailET.getText().toString();
        String password = passwordET.getText().toString();

        loginbtn.setOnClickListener((v)->loginUser());

        boolean isValidated = validateData(email,password);
        if(!isValidated){
            return;
        }

        loginAccountInFirebase(email,password);
    }

    void loginAccountInFirebase(String email, String password){
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    if(firebaseAuth.getCurrentUser().isEmailVerified()){
                        //go to home, login sucess
                        startActivity(new Intent(signIn.this,home.class));
                    }else{
                        Context context = getApplicationContext();
                        CharSequence text = "Please verify your email";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }else{
                    Context context = getApplicationContext();
                    CharSequence text = task.getException().getLocalizedMessage();
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });
    }

    boolean validateData(String email, String password){
        //Checks the dat inputted by the user to see if it is legal
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Context context = getApplicationContext();
            CharSequence text = "Email is invalid";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return false;
        }
        if(password.length()<6||password.length()>12){
            Context context = getApplicationContext();
            CharSequence text = "Password length is invalid";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return false;
        }
        return true;
    }

    private void configureBackBtn(){
        Button backBtn = (Button) findViewById(R.id.backbtn);
        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }
}