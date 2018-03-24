package com.example.lcasa.techworks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.FocusFinder;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.login1);

        Button botaoLogin = (Button)
    }

    public void onClink (View V){
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}
