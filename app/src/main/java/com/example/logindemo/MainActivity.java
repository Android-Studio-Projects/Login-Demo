package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public  void login(View View) {

        Log.i("Info","Button Pressed!");

        EditText editTextUsername = (EditText) findViewById(R.id.editTextUsername);

        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        Log.i("Username: ", editTextUsername.getText().toString());

        Log.i("Password: ", editTextPassword.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}