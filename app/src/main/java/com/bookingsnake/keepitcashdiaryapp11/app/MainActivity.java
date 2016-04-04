package com.bookingsnake.keepitcashdiaryapp11.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

      public void diary (View view){


         Toast.makeText(this, "You Stink !! ", Toast.LENGTH_SHORT).show();



      }


}
