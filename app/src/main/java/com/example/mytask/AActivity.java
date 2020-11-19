package com.example.mytask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class AActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button b = findViewById(R.id.b);
        Button c = findViewById(R.id.c);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.b){
            Intent intent = new Intent(AActivity.this, BActivity.class);
            intent.putExtra("TEXT_EXTRA", "Hello from A");
            TextView tv = findViewById(R.id.textView);
            String s = intent.getStringExtra("TEXT_EXTRA");
            tv.setText(s);
            startActivity(intent);
        }
        else if(v.getId() == R.id.c){
            Intent intent = new Intent(AActivity.this, CActivity.class);
            TextView tv = findViewById(R.id.textView);
            String s = intent.getStringExtra("TEXT_EXTRA");
            tv.setText(s);
            intent.putExtra("TEXT_EXTRA", "Hello from A");
            startActivity(intent);
        }
    }
}
