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
        // Access TextViews
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        // Access EditTexts
        EditText edtFirstName = findViewById(R.id.edtTxtFirstname);
        EditText edtLastName = findViewById(R.id.edtTxtLastName);
        EditText edtEmail = findViewById(R.id.edtTxtEmail);

        // Update textViews
        txtFirstName.setText("First name: " + edtFirstName.getText().toString()); // Change text
        txtLastName.setText("Last name: " + edtLastName.getText().toString()); // Change text
        txtEmail.setText("Email: " + edtEmail.getText().toString()); // Change text

        // TODO: Registration page

    } // end onBtnClick

} // end MainActivity class