package com.example.bluejackgames.app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

                if(login.isEmpty()){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage("Username must be provide");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                    //dialog.show(getSupportFragmentManager(), "Username must be filled");
                }
                else if(pass.isEmpty()){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage("Password must be provide");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                }
                else if(login.length()<=3){
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage("Username length must be greater than 3");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                    intent.putExtra("username", login);
                    startActivity(intent);
                }
            }
        });
    }
}