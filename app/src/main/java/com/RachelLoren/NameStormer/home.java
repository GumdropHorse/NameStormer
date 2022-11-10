package com.RachelLoren.NameStormer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class home extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        configureFBtn();
        configureMBtn();
        configureNBtn();
        configureABtn();
        configureLogoutBtn();
    }

    private void configureFBtn(){
        Button fbtn = (Button) findViewById(R.id.fGenerateScreen);
        fbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(home.this, fNameGeneration.class));
            }
        });
    }

    private void configureMBtn(){
        Button mbtn = (Button) findViewById(R.id.mGenerateScreen);
        mbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(home.this, mNameGeneration.class));
            }
        });
    }

    private void configureNBtn(){
        Button nbtn = (Button) findViewById(R.id.nGenerateScreen);
        nbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(home.this, nNameGeneration.class));
            }
        });
    }

    private void configureABtn(){
        Button abtn = (Button) findViewById(R.id.allScreen);
        abtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(home.this, aNameGeneration.class));
            }
        });
    }

    private void configureLogoutBtn(){
        Button logoutbtn = (Button) findViewById(R.id.logoutbtn);
        if(MainActivity.guest==false){
            logoutbtn.setText("LOG OUT");
            logoutbtn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                    firebaseAuth.signOut();
                    finish();
                }
            });
        }else{
            logoutbtn.setText("Back");
            logoutbtn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    finish();
                }
            });
        }
    }
}