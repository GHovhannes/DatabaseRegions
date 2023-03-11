package com.example.databaseregions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import data.CountryEntity;
import data.Database;
import data.RegionEntity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    class DatabaseFiller extends Thread { //Data provider
        @Override
        public void run() {
            super.run();

            RegionEntity region1 = new RegionEntity();
            region1.name = "America";
            long region1Id = Database.getInstance(getApplicationContext()).getAppDatabase().regionDao().insertRegion(region1);

            CountryEntity country1 = new CountryEntity();
            country1.name = "Arshak";
            country1.countryId = region1Id;
            Database.getInstance(getApplicationContext()).getAppDatabase().countriesDAO().insertCountry(country1);
        }
    }
}