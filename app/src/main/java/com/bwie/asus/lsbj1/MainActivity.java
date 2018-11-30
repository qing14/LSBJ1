package com.bwie.asus.lsbj1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        final WeekFlowLayout fl=findViewById(R.id.fl);
        final EditText et = findViewById(R.id.et);
        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv=new TextView(MainActivity.this);
                tv.setText(et.getText());
                tv.setTextColor(Color.CYAN);
                fl.addView(tv);

            }
        });
    }
}
