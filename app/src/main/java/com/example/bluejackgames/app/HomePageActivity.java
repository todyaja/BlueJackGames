package com.example.bluejackgames.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bluejackgames.R;

public class HomePageActivity extends AppCompatActivity {

    TextView product, about, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        setTitle("Welcome, " + username);

        product = findViewById(R.id.product_page);
        about = findViewById(R.id.about_page);
        logout = findViewById(R.id.logout_page);

        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, ProductPageActivity.class);
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, AboutPageActivity.class);
                intent.putExtra("username", username);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}