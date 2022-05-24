/*
    https://www.youtube.com/watch?v=fis26HvvDII
*/

package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    // Starting point
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // get layout from xml file

        // TODO: An example of TODO comment

    } // end onCreate()

    // Method (Event Listener)
    public void onBtnClick(View view)
    {
        // Access textview
        TextView txtHello = findViewById(R.id.txtMessage);

        EditText edtTxtName = findViewById(R.id.edtTxtName);
        txtHello.setText("Hello " + edtTxtName.getText().toString()); // Change text

        // Ended on 59:00

    } // end onBtnClick

} // end MainActivity class