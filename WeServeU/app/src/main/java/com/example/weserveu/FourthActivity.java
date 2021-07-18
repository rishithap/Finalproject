package com.example.weserveu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void dial1(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:9849332545"));
        startActivity(i);
    }

    public void dial2(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:8900556692"));
        startActivity(i);

    }

    public void dial3(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:9849321390"));
        startActivity(i);

    }

    public void dial4(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:7892341570"));
        startActivity(i);

    }

    public void dial5(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:8265890345"));
        startActivity(i);

    }
}