package com.ut.travelproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import java.net.URI;

//Final project By Shih-chieh Ke

public class cityIntro extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_intro);

        Button PearsonButton = (Button)findViewById(R.id.AirportLink);
        PearsonButton.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.torontopearson.com/#";
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}
