package com.example.videoplayerwithteams.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.videoplayerwithteams.R;

public class MainActivity extends AppCompatActivity
{
    int videoSeekTime = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
