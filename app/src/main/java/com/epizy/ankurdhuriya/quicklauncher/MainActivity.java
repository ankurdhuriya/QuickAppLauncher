package com.epizy.ankurdhuriya.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondActivity = (Button) findViewById(R.id.secondActivityBtn);
        secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(startIntent);
            }
        });

        Button fbBtn  = (Button) findViewById(R.id.fbBtn);
        fbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fb = "https://www.facebook.com/IamAnkurDhuriya";
                Uri webAddress = Uri.parse(fb);
                Intent goToFb = new Intent(Intent.ACTION_VIEW, webAddress);
                if (goToFb.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToFb);
                }
            }
        });
    }
}
