package com.example.simpleprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView Name=(EditText) findViewById(R.id.Name);
        TextView Age=(EditText) findViewById(R.id.Age);
        TextView Gender=(EditText) findViewById(R.id.Gender);
        TextView Country=(EditText) findViewById(R.id.Country);
        TextView Hobbies=(EditText) findViewById(R.id.Hobbies);
        TextView About=(EditText) findViewById(R.id.About);

        MaterialButton Savebtn = (MaterialButton) findViewById(R.id.Savebtn);
        MaterialButton Registerbtn = (MaterialButton) findViewById(R.id.Registerbtn);

        //admin
        Registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Name.getText().toString().equals("admin"))
                //correct
                Toast.makeText( context:MainActivity.this, text:"Register SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText( context:MainActivity.this, text:"Register FAILED!!!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

 