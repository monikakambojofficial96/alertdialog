package com.example.myapplication;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;



public class alertdialog extends AppCompatActivity {
    private static final String TAG="alertdialog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alertdialog);
        AlertDialog.Builder builder;
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP)
        {

            builder = new AlertDialog.Builder(alertdialog.this, android.R.style.Widget);

        }
        else
        {
            builder=new android.support.v7.app.AlertDialog.Builder(this);

        }

        builder.setTitle("DO YOU WANT TO DELETE THIS ENTRY")
                .setMessage("pkka delete kr du?")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d(TAG, "onClickpositive: " +which);

                    }
                })
                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d(TAG, "onClick: Negtive Button" +which);
                    }
                })
                .show();
    }
}
