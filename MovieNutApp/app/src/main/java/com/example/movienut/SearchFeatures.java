package com.example.movienut;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by WeiLin on 12/7/15.
 */
public class SearchFeatures extends Activity implements AdapterView.OnItemSelectedListener {
    private EditText movieOut;
    private String selectedType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_features);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.recommendationType, android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);
    }

    public void buttonOnClickFbLogin(View v) throws IOException {
        
    }

    public void buttonOnClick(View v) throws IOException {
        movieOut = (EditText) findViewById(R.id.editText);
        String searchKeyword = movieOut.getText().toString();



    }
    //APi : 3f2950a48b75db414b1dbb148cfcad89
    //weblink: http://api.themoviedb.org/3/movie/550?api_key=3f2950a48b75db414b1dbb148cfcad89
    //http://api.themoviedb.org/3/search/movie?api_key=3f2950a48b75db414b1dbb148cfcad89&query=avengers
    //  http://api.themoviedb.org/3/movie/8966/similar?api_key=3f2950a48b75db414b1dbb148cfcad89


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_search_feature, menu);
        return true;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner);
        selectedType = spinner1.getSelectedItem().toString();
        movieOut = (EditText) findViewById(R.id.editText);
        Button findButton = (Button) findViewById(R.id.button);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}



