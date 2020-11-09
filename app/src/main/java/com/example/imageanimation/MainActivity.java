   package com.example.imageanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing=true;


    public void fade(View view){
        Log.i("info","Imageview Tapped");

        ImageView imageView2=(ImageView) findViewById(R.id.imageView2);

        ImageView imageView3=(ImageView)findViewById(R.id.imageView3);

        if(bartIsShowing) {

            bartIsShowing=false;

            imageView3.animate().alpha(1).setDuration(2000);

            imageView2.animate().alpha(0).setDuration(2000);
        }
        else{

            bartIsShowing=true;
            imageView3.animate().alpha(0).setDuration(2000);

            imageView2.animate().alpha(1).setDuration(2000);
        }



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}