package com.example.alertdialog;


import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button button;
//        button=findViewById(R.id.button);
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        button.setOnClickListener(v -> {
//
//            builder.setMessage("Follow this C and T")
//                    .setIcon(R.drawable.baseline_info_24)
//                    .setTitle("Terms and Conditions")
//                    .setPositiveButton("I have Read T and C", (dialog, id) ->
//                            Toast.makeText(MainActivity.this, "Yes you can process now", Toast.LENGTH_SHORT).show());
//
//            AlertDialog alert = builder.create();
//            alert.show();
//
//        });


//       AlertDialog.Builder deldialog=new AlertDialog.Builder(MainActivity.this);
//       deldialog.setTitle("Delete");
//       deldialog.setIcon(R.drawable.baseline_delete_24);
//       deldialog.setMessage("Are you sure want to delete?");
//        deldialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//                Toast.makeText(MainActivity.this, "Item Deleted", Toast.LENGTH_SHORT).show();
//            }
//        });
//       deldialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
//           @Override
//           public void onClick(DialogInterface dialog, int which) {
//               Toast.makeText(MainActivity.this, "Item not Deleted", Toast.LENGTH_SHORT).show();
//           }
//       });
//       deldialog.show();










    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {

        AlertDialog.Builder exit = new AlertDialog.Builder(this);
        exit.setTitle("Exit");
        exit.setIcon(R.drawable.baseline_exit_to_app_24);
        exit.setMessage("Are you sure want to exit?");
        exit.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this, "Welcome back!", Toast.LENGTH_SHORT).show();
            }
        });
        exit.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.super.onBackPressed();
            }
        });
        exit.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Cancel operation", Toast.LENGTH_SHORT).show();
            }
        });
        exit.show();

    }

}