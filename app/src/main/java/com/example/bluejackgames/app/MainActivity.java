package com.example.bluejackgames.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bluejackgames.MyDialog;
import com.example.bluejackgames.R;

public class MainActivity extends AppCompatActivity {

    EditText email, password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                String login = email.getText().toString();
                String pass = password.getText().toString();

                if(login.isEmpty() || pass.isEmpty()){
                    Toast.makeText(MainActivity.this, "Email dan password must be filled", Toast.LENGTH_LONG).show();
                }
                else if(!login.equals("admin@gmail.com") && !pass.equals("admin123")){
                    Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_LONG).show();
                }
                else if(login.equals("admin@gmail.com") && pass.equals("admin123")){
                    MyDialog dialog = new MyDialog();
                    dialog.show(getSupportFragmentManager(), "Login successs");
                }
            }
        });
    }
}