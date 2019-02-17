package com.ut.travelproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

//Final project By Shih-chieh Ke

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button chooseButton = (Button) findViewById(R.id.citybutton);
        chooseButton.setOnClickListener(this);
    }

    public void onClick(View v){
        Spinner theSpinner = (Spinner)findViewById(R.id.citySpinner);
        String selectedCity = String.valueOf(theSpinner.getSelectedItem());
        if (selectedCity.equals("Toronto")) { generateCityIntro("Toronto"); }
        else if (selectedCity.equals("Vancouver")) { generateCityIntro("Vancouver");}
        else if (selectedCity.equals("Montreal")) { generateCityIntro("Montreal");}
        else { generateCityIntro("Calgary");}
    }

    public void generateCityIntro(String city){
        if (city.equals("Toronto")){
            Intent intent = new Intent (this, cityIntro.class);
            startActivity(intent);
        }
        else if (city.equals("Vancouver")){
            Intent intent = new Intent (this, VancouverIntro.class);
            startActivity(intent);
        }
        else if (city.equals("Montreal")) {
            Intent intent = new Intent(this, MontrealIntro.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent (this, CalgaryIntro.class);
            startActivity(intent);
        }

    }
}
