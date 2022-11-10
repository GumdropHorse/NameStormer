package com.RachelLoren.NameStormer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    public static boolean guest = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        if(currentUser!=null){
            startActivity(new Intent(MainActivity.this,home.class));
        }

        configureLoginNextBtn();
        configureRegisterNextBtn();
        configureGuestBtn();
    }
    private void configureLoginNextBtn(){
        Button loginNextBtn = (Button) findViewById(R.id.loginbtnScreen);
        loginNextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, signIn.class));
            }
        });
    }
    private void configureRegisterNextBtn(){
        Button registerNextBtn = (Button) findViewById(R.id.registerbtnScreen);
        registerNextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, register.class));
            }
        });
    }
    private void configureGuestBtn(){
        Button registerNextBtn = (Button) findViewById(R.id.guestScreen);
        registerNextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                guest = true;
                startActivity(new Intent(MainActivity.this, home.class));
            }
        });
    }
}