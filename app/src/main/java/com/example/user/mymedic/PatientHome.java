package com.example.user.mymedic;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PatientHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //this activity will be called for Top Bar when this page created
        //Below code segment is used for include the Top Bar to this Page.
        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //Creating a Patient Top Bar Object
        PatientTopBar patientTopBar = new PatientTopBar();
        fragmentTransaction.replace(android.R.id.content, patientTopBar);

        //Commiting Fragment
        fragmentTransaction.commit();
    }
}
