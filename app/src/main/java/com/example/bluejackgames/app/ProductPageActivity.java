package com.example.bluejackgames.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.bluejackgames.R;

public class ProductPageActivity extends AppCompatActivity {

    CardView genshin, rox, elden, titanfall, forza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_page);
        setTitle("Product Page");

        genshin = findViewById(R.id.genshin_card);
        rox = findViewById(R.id.rox_card);
        elden = findViewById(R.id.elden_card);
        titanfall = findViewById(R.id.titanfall_card);
        forza  = findViewById(R.id.forza_card);

        genshin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductPageActivity.this, GameDetailActivity.class);
                intent.putExtra("game", "genshin");
                startActivity(intent);
            }
        });

        rox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductPageActivity.this, GameDetailActivity.class);
                intent.putExtra("game", "rox");
                startActivity(intent);
            }
        });

        elden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductPageActivity.this, GameDetailActivity.class);
                intent.putExtra("game", "elden");
                startActivity(intent);
            }
        });

        titanfall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductPageActivity.this, GameDetailActivity.class);
                intent.putExtra("game", "titanfall");
                startActivity(intent);
            }
        });

        forza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductPageActivity.this, GameDetailActivity.class);
                intent.putExtra("game", "forza");
                startActivity(intent);
            }
        });

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