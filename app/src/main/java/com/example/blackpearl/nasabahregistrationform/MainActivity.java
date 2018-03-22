package com.example.blackpearl.nasabahregistrationform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.google.common.collect.Range;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //The view objects
    private EditText editTextName, editTextMobile, editTextAddress,
            editTextZipCode, editTextPassword, editTextRePassword;

    private Button buttonSubmit;

    //defining AwesomeValidation object
    private AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        //initializing view objects
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextMobile = (EditText) findViewById(R.id.editTextMobile);
        editTextAddress = (EditText) findViewById(R.id.editTextAddress);
        editTextZipCode = (EditText) findViewById(R.id.editTextZipCode);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextRePassword = (EditText) findViewById(R.id.editTextRePassword);

        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);

        //adding validation to edittexts
        awesomeValidation.addValidation(this, R.id.editTextName, "^([ \\u00c0-\\u01ffa-zA-Z'\\-])+$", R.string.nameError);
        awesomeValidation.addValidation(this, R.id.editTextMobile, "^(08|628|62)[\\s\\)\\-]*(\\s|(\\d){3,})", R.string.mobileError);
        awesomeValidation.addValidation(this, R.id.editTextAddress, "/^(?:\\w+\\.?,?\\s?){1,60}$/", R.string.addressError);
        awesomeValidation.addValidation(this, R.id.editTextZipCode, "\\b\\d{5}(?:-\\d{4})?\\b", R.string.zipCodeError);
        awesomeValidation.addValidation(this, R.id.editTextPassword,"^(?=.*[a-z])(?=.*[A-Z])(?=.*[\\\\d])(?=.*[~`!@#\\\\$%\\\\^&\\\\*\\\\(\\\\)\\\\-_\\\\+=\\\\{\\\\}\\\\[\\\\]\\\\|\\\\;:\\\"<>,./\\\\?]).{8,}", R.string.passwordError);
        awesomeValidation.addValidation(this, R.id.editTextRePassword, R.id.editTextPassword, R.string.rePasswordError);


        buttonSubmit.setOnClickListener(this);
    }

    private void submitForm() {
        //first validate the form then move ahead
        //if this becomes true that means validation is successfull
        if (awesomeValidation.validate()) {
            Toast.makeText(this, "Validation Successfull", Toast.LENGTH_LONG).show();

            //process the data further
        }
    }

    @Override
    public void onClick(View view) {
        if (view == buttonSubmit) {
            submitForm();
        }
    }
//    public static void main(String[] args) {
//        HorizontalStepView horizontalStepView = new HorizontalStepView();
//        horizontalStepView.setpview5();
//    }
}
