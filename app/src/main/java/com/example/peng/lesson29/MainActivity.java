package com.example.peng.lesson29;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    private EditText userName;
    private EditText pwd;
    private View resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    this.userName= (EditText) this.findViewById(R.id.userName);
        this.pwd= (EditText) this.findViewById(R.id.pwd);
        this.resources=this.findViewById(R.values.s)
    }

    public void login(){

    }

    public void reset(){

    }
}
