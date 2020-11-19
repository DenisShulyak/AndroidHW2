package com.example.mytask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);


        Intent i = getIntent();
        TextView tv = findViewById(R.id.textView);

        String s = i.getStringExtra("TEXT_EXTRA");
        tv.setText(s);

        Button a = findViewById(R.id.a);
        Button c = findViewById(R.id.c);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BActivity.this, AActivity.class);
                i.putExtra("TEXT_EXTRA", "Hello from B");
                startActivity(i);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BActivity.this, CActivity.class);
                i.putExtra("TEXT_EXTRA", "Hello from B");
                startActivity(i);
            }
        });




    }
}
