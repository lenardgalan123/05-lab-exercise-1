package com.galan.shsstudentregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }
    public void onClick(View view){
        Toast toast = Toast.makeText(this, "The Record is submitted", Toast.LENGTH_LONG);
        toast.show();
    }
}
