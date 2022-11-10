package com.RachelLoren.NameStormer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class register extends AppCompatActivity {

    EditText emailET, passwordET,confirmPasswordET;
    Button regbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        configureBackBtn();

        emailET = (EditText) findViewById(R.id.email);
        passwordET = (EditText) findViewById(R.id.password);
        confirmPasswordET = (EditText) findViewById(R.id.confirmPassword);
        regbtn = (Button) findViewById(R.id.regbtn);

        regbtn.setOnClickListener(v->createAccount());
                    /*Context context = getApplicationContext();
                    CharSequence text = "PASSWORD DOESN'T MATCH";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();*/
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

    void createAccount(){
        String email=emailET.getText().toString();
        String password=passwordET.getText().toString();
        String confirmPassword=confirmPasswordET.getText().toString();

        boolean isValidated = validateData(email,password,confirmPassword);
        if(!isValidated){
            return;
        }

        createAccountInFirebase(email, password);{
            //create account here
        }

    }

    boolean validateData(String email, String password, String confirmPassword){
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
        if(!password.equals(confirmPassword)){
            Context context = getApplicationContext();
            CharSequence text = "Passwords don't match";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return false;
        }
        return true;
    }

    void createAccountInFirebase(String email, String password){
        Context context = getApplicationContext();
        CharSequence text = "Creating Account...";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>(){
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task){
                        if(task.isSuccessful()){
                            Context context = getApplicationContext();
                            CharSequence text = "Succesfully created account, check email to verify.";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();

                            //note, email goes to spam folder
                            firebaseAuth.getCurrentUser().sendEmailVerification();
                            firebaseAuth.signOut();
                            finish();
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
}