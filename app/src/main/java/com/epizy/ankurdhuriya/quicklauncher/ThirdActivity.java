package com.epizy.ankurdhuriya.quicklauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        if(getIntent().hasExtra("com.epizy.ankurdhuriya.quicklauncher.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.epizy.ankurdhuriya.quicklauncher.SOMETHING");
            tv.setText(text);
        }
    }
}
