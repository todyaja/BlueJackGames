package com.example.bluejackgames.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.bluejackgames.R;

public class ProductPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_page);
        setTitle("Product Page");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.hamburger, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        switch (item.getItemId()){
            case R.id.home_page:
                Intent intent1 = new Intent(ProductPageActivity.this, HomePageActivity.class);
                intent1.putExtra("username", username);
                startActivity(intent1);
                return true;
            case R.id.about_page:
                Intent intent2 = new Intent(ProductPageActivity.this, AboutPageActivity.class);
                intent2.putExtra("username", username);
                startActivity(intent2);
                return true;
            case R.id.logout_page:
                Intent intent3 = new Intent(ProductPageActivity.this, MainActivity.class);
                startActivity(intent3);
        }
        return super.onOptionsItemSelected(item);
    }
}