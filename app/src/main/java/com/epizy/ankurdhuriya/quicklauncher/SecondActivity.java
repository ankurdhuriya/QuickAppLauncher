package com.epizy.ankurdhuriya.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button thirdActivity = (Button) findViewById(R.id.thirdActivityBtn);
        thirdActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent1 = new Intent(getApplicationContext(), ThirdActivity.class);
                startIntent1.putExtra("com.epizy.ankurdhuriya.quicklauncher.SOMETHING", "HI! IT'S ANKUR DHURIYA");
                startActivity(startIntent1);
            }
        });

        Button igBtn  = (Button) findViewById(R.id.igBtn);
        igBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ig = "https://www.instagram.com/haanjiankur";
                Uri webAddress1 = Uri.parse(ig);
                Intent goToIg = new Intent(Intent.ACTION_VIEW, webAddress1);
                if (goToIg.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToIg);
                }
            }
        });
    }
}
