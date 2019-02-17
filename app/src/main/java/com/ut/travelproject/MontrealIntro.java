package com.ut.travelproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

//Final project By Shih-chieh Ke

public class MontrealIntro extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_montreal_intro);
        Button monButton = (Button)findViewById(R.id.AirportLink);
        monButton.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.admtl.com/en";
        i.setData(Uri.parse(url));
        startActivity(i);
    }

}
