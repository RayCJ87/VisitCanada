package com.ut.travelproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

//Final project By Shih-chieh Ke

public class CalgaryIntro extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calgary_intro);

        Button calButton = (Button)findViewById(R.id.AirportLink);
        calButton.setOnClickListener(this);

    }

    public void onClick(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        String url = "http://www.yyc.com/";
        i.setData(Uri.parse(url));
        startActivity(i);
    }


}
