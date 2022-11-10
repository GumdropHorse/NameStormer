package com.RachelLoren.NameStormer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.jetbrains.annotations.NotNull;

public class fNameView extends AppCompatActivity {
    int name1Ref = 1;
    int name2Ref = 1;
    int name3Ref = 1;
    int name4Ref = 1;
    int name5Ref = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fname_view);

        configureBackBtn();
        //configureFavorites();

        int favNum = fNameGeneration.favNum;
        int ranNum = fNameGeneration.ranNum;
        int lettNum = fNameGeneration.lettNum;

        String des = favNum + " names are based on your preferred letter.";
        configureDescription(des);

        if (favNum > 0 && lettNum > 0){
            setFavorites(favNum, lettNum);
        }
        setRandom(favNum,ranNum,lettNum);
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

    /*private void configureFavorites(){
        TextView name1 = (TextView) findViewById(R.id.name1);
        ImageButton btn1 = (ImageButton) findViewById(R.id.fav1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (name1Ref==1) {
                    String favName1 = name1.getText().toString();

                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                    String uid = firebaseAuth.getCurrentUser().getUid();

                    //documentReference= dbFirestore.collection("CLIENT_DETAIL").document(mAuth.getUid());
                    //documentReference.set(userData);
                    FirebaseFirestore db = FirebaseFirestore.getInstance();
                    db.collection("users")
                            .add(uid)
                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                @Override
                                public void onSuccess(DocumentReference documentReference) {
                                    btn1.setImageResource(R.drawable.favorited);
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Context context = getApplicationContext();
                                    CharSequence text = "Failed";
                                    int duration = Toast.LENGTH_SHORT;
                                    Toast toast = Toast.makeText(context, text, duration);
                                    toast.show();
                                }
                            });
                    name1Ref = 0;
                }
            }
        });
    }*/

    private void configureDescription(String des){
        TextView description = (TextView)findViewById(R.id.favNames);
        description.setText(des);
    }

    private void setFavorites(int num, int letter){
        char pref = 'f';

        if (num == 1 && letter != 0){
            TextView name1 = (TextView)findViewById(R.id.name1);
            name1.setText(Utility.runFavorites(pref,letter));
            name1.setVisibility(View.VISIBLE);
        }
        if (num == 2 && letter != 0){
            TextView name1 = (TextView)findViewById(R.id.name1);
            name1.setText(Utility.runFavorites(pref,letter));
            name1.setVisibility(View.VISIBLE);

            TextView name2 = (TextView)findViewById(R.id.name2);
            name2.setText(Utility.runFavorites(pref,letter));

            //Need some way to check that name1 and name2 aren't the same here. While loop wasn't working.

            name2.setVisibility(View.VISIBLE);
        }
    }

    private void setRandom(int fav, int ran, int lett){
        char pref = 'f';
        if(fav==0 || lett==0){
            TextView name1 = (TextView)findViewById(R.id.name1);
            TextView name2 = (TextView)findViewById(R.id.name2);
            TextView name3 = (TextView)findViewById(R.id.name3);
            TextView name4 = (TextView)findViewById(R.id.name4);
            TextView name5 = (TextView)findViewById(R.id.name5);
            name1.setVisibility(View.INVISIBLE);
            name2.setVisibility(View.INVISIBLE);
            name3.setVisibility(View.INVISIBLE);
            name4.setVisibility(View.INVISIBLE);
            name5.setVisibility(View.INVISIBLE);

            switch(ran){
                case 5:
                    name5.setVisibility(View.VISIBLE);
                    name5.setText(Utility.generateName(pref));
                case 4:
                    name4.setVisibility(View.VISIBLE);
                    name4.setText(Utility.generateName(pref));
                    while(name5.getText()==name4.getText()){
                        name4.setText(Utility.generateName(pref));
                    }
                case 3:
                    name3.setVisibility(View.VISIBLE);
                    name3.setText(Utility.generateName(pref));
                    while(name5.getText()==name3.getText()){
                        name3.setText(Utility.generateName(pref));
                    }
                    while(name4.getText()==name3.getText()){
                        name3.setText(Utility.generateName(pref));
                    }
                case 2:
                    name2.setVisibility(View.VISIBLE);
                    name2.setText(Utility.generateName(pref));
                    while(name5.getText()==name2.getText()){
                        name2.setText(Utility.generateName(pref));
                    }
                    while(name4.getText()==name2.getText()){
                        name2.setText(Utility.generateName(pref));
                    }
                    while(name3.getText()==name2.getText()){
                        name2.setText(Utility.generateName(pref));
                    }
                case 1:
                    name1.setVisibility(View.VISIBLE);
                    name1.setText(Utility.generateName(pref));
                    while(name5.getText()==name1.getText()){
                        name1.setText(Utility.generateName(pref));
                    }
                    while(name4.getText()==name1.getText()){
                        name1.setText(Utility.generateName(pref));
                    }
                    while(name3.getText()==name1.getText()){
                        name1.setText(Utility.generateName(pref));
                    }
                    while(name2.getText()==name1.getText()){
                        name1.setText(Utility.generateName(pref));
                    }
            }
        }else if(fav==1){
            TextView name2 = (TextView)findViewById(R.id.name2);
            TextView name3 = (TextView)findViewById(R.id.name3);
            TextView name4 = (TextView)findViewById(R.id.name4);
            TextView name5 = (TextView)findViewById(R.id.name5);
            name2.setVisibility(View.INVISIBLE);
            name3.setVisibility(View.INVISIBLE);
            name4.setVisibility(View.INVISIBLE);
            name5.setVisibility(View.INVISIBLE);

            switch(ran) {
                case 4:
                    name5.setVisibility(View.VISIBLE);
                    name5.setText(Utility.generateName(pref));
                case 3:
                    name4.setVisibility(View.VISIBLE);
                    name4.setText(Utility.generateName(pref));
                    while (name5.getText() == name4.getText()) {
                        name4.setText(Utility.generateName(pref));
                    }
                case 2:
                    name3.setVisibility(View.VISIBLE);
                    name3.setText(Utility.generateName(pref));
                    while (name5.getText() == name3.getText()) {
                        name3.setText(Utility.generateName(pref));
                    }
                    while (name4.getText() == name3.getText()) {
                        name3.setText(Utility.generateName(pref));
                    }
                case 1:
                    name2.setVisibility(View.VISIBLE);
                    name2.setText(Utility.generateName(pref));
                    while (name5.getText() == name2.getText()) {
                        name2.setText(Utility.generateName(pref));
                    }
                    while (name4.getText() == name2.getText()) {
                        name2.setText(Utility.generateName(pref));
                    }
                    while (name3.getText() == name2.getText()) {
                        name2.setText(Utility.generateName(pref));
                    }
            }

        }else if(fav==2){
            TextView name3 = (TextView)findViewById(R.id.name3);
            TextView name4 = (TextView)findViewById(R.id.name4);
            TextView name5 = (TextView)findViewById(R.id.name5);
            name3.setVisibility(View.INVISIBLE);
            name4.setVisibility(View.INVISIBLE);
            name5.setVisibility(View.INVISIBLE);

            switch(ran) {
                case 3:
                    name5.setVisibility(View.VISIBLE);
                    name5.setText(Utility.generateName(pref));
                case 2:
                    name4.setVisibility(View.VISIBLE);
                    name4.setText(Utility.generateName(pref));
                    while (name5.getText() == name4.getText()) {
                        name4.setText(Utility.generateName(pref));
                    }
                case 1:
                    name3.setVisibility(View.VISIBLE);
                    name3.setText(Utility.generateName(pref));
                    while (name5.getText() == name3.getText()) {
                        name3.setText(Utility.generateName(pref));
                    }
                    while (name4.getText() == name3.getText()) {
                        name3.setText(Utility.generateName(pref));
                    }
            }
        }
    }
}