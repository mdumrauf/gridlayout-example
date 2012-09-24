package com.mdumrauf.android.examples;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Simple activity that displays the gridlayout example.
 * 
 * @author mdumrauf
 * @since Sep 24, 2012
 */
public class GridLayoutActivity extends Activity {

    private static String TAG = "gridlayout-example";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
        setContentView(R.layout.grid_layout_1);
    }

}

