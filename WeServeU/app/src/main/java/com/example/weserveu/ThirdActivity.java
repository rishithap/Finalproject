package com.example.weserveu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void acservice(View view) {
        Intent i=new Intent(this,FourthActivity.class);
        startActivity(i);

    }
    public void homecleaning(View view) {
        Intent i=new Intent(this,FifthActivity.class);
        startActivity(i);

    }

    public void laundry(View view) {
        Intent i=new Intent(this,SixthActivity.class);
        startActivity(i);

    }
}