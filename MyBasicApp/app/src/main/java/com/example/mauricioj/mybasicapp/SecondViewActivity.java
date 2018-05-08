package com.example.mauricioj.mybasicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class SecondViewActivity extends AppCompatActivity {

    public static final String PARECELABLE_ITEM = "com.example.user.mybasicapp.parelableitem";
    public static final String SIMPLE_ITEM = "com.example.user.mybasicapp.item";
    public static final String JSON_ITEM = "com.example.user.mybasicapp.jsonitem";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_view);

        Intent intent = getIntent();
        String valString = intent.getStringExtra(SIMPLE_ITEM);
        System.out.println(valString);

        ParcelableItemToSend val1 = intent.getParcelableExtra(PARECELABLE_ITEM);
        System.out.println(val1);


        Gson gson = new Gson();
        String jsonString = intent.getStringExtra(JSON_ITEM);
        JsonItemToSend valJson = gson.fromJson(jsonString, JsonItemToSend.class);
        System.out.println(valJson);


    }
}
