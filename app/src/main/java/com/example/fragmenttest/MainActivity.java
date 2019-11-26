package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Presionaste(View view) {
        FragmentManager manager =  getSupportFragmentManager();
        FragmentTransaction transaction =  manager.beginTransaction()
                .replace(R.id.container, new BlankFragment());

        transaction.commit();
    }
}
