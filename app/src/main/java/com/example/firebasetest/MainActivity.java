package com.example.firebasetest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FirebaseAuth.getInstance().createUserWithEmailAndPassword("","123456")
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Log.i("sghdvhsvhc", "onComplete: "+FirebaseAuth.getInstance().getCurrentUser().getEmail()+"  "+FirebaseAuth.getInstance().getCurrentUser().getUid());
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.i("sghdvhsvhc", "onFailure: "+e.toString());
            }
        });

//        FirebaseAuth.getInstance().signInWithEmailAndPassword("m@gmail.com","123456")
//                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
//                    @Override
//                    public void onSuccess(AuthResult authResult) {
//                        Log.i("sghdvhsvhc", "onComplete: "+FirebaseAuth.getInstance().getCurrentUser().getEmail()+"  "+FirebaseAuth.getInstance().getCurrentUser().getUid());
//                    }
//                }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//                Log.i("sghdvhsvhc", "onFailure: "+e.toString());
//            }
//        });


      //  FirebaseAuth.getInstance().signOut();


    }
}
