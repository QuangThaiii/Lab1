package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class testFirebase extends AppCompatActivity {


    Button btnAdd;

    FirebaseDatabase database;
    DatabaseReference node;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_firebase);
database=FirebaseDatabase.getInstance();
//        database=FirebaseDatabase.getInstance("https://task-manager-e2c58-default-rtdb.asia-southeast1.firebasedatabase.app/");
        node=database.getReference("daily");

        btnAdd=findViewById(R.id.addbtn);


        //nhan them vao firebase
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                node.setValue("a123");
            }
        });
        String test="day la giu lieu moi moi moi";
        String a="update 8h11";
    }
}