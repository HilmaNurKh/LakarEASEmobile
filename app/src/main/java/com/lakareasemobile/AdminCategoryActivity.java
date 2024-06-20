package com.lakareasemobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView spicy, original, sweet,salt;
    private ImageView dry, wet, seblak, basreng;
    private ImageView basoaci, seasoning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        spicy = (ImageView) findViewById(R.id.spicy);
        original = (ImageView) findViewById(R.id.original);
        sweet = (ImageView) findViewById(R.id.sweet);
        salt = (ImageView) findViewById(R.id.salt);

        dry = (ImageView) findViewById(R.id.dry);
        wet = (ImageView) findViewById(R.id.wet);
        seblak = (ImageView) findViewById(R.id.seblak);
        basreng = (ImageView) findViewById(R.id.basreng);

        seasoning = (ImageView) findViewById(R.id.seasoning);
        basoaci = (ImageView) findViewById(R.id.basoaci);

        spicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "spicy");
                startActivity(intent);
            }
        });

        original.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "original");
                startActivity(intent);
            }
        });


        sweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "sweet");
                startActivity(intent);
            }
        });

        salt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "salt");
                startActivity(intent);
            }
        });

        dry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "dry");
                startActivity(intent);
            }
        });

        wet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "wet");
                startActivity(intent);
            }
        });

        seblak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "seblak");
                startActivity(intent);
            }
        });

        basreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "basreng");
                startActivity(intent);
            }
        });

        basoaci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "basoaci");
                startActivity(intent);
            }
        });

        seasoning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "seasoning");
                startActivity(intent);
            }
        });

    }
}
