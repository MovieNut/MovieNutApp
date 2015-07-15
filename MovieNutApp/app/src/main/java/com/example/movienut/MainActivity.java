package com.example.movienut;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
/**
 * Created by WeiLin on 4/7/15.
 */

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TabHost tabHost = getTabHost();

        tabHost.addTab(tabHost.newTabSpec("first").setIndicator("Search").setContent(new Intent(this, SearchFeatures.class)));

    }
}
