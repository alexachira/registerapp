package com.reen.registerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText inputnames ,inputemail,inputpassword,inputdob,inputphone;
RadioButton radiomale,radiofemale;
CheckBox checkboxterms;
Button Buttonsumit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputnames=findViewById(R.id.Inputnames);
        inputemail=findViewById(R.id.Inputemail);
        inputpassword=findViewById(R.id.Inputpassword);
        inputdob=findViewById(R.id.Inputdob);
        inputphone=findViewById(R.id.Inputphone);
        radiomale=findViewById(R.id.Radiomale);
        radiofemale=findViewById(R.id.Radiofemale);
        checkboxterms=findViewById(R.id.checkBox);
        Buttonsumit=findViewById(R.id.buttonsubmmit);



        checkboxterms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Buttonsumit.setEnabled(true);
                }
                else {
                    Buttonsumit.setEnabled(false);
                }
            }
        });
    }

    public void register(View view) {
        String names=inputnames.getText().toString().trim();
        String email=inputemail.getText().toString().trim();
        String password=inputpassword.getText().toString().trim();
        String dob=inputdob.getText().toString().trim();
        String phone=inputphone.getText().toString().trim();

        String gender=radiomale.isChecked()?"female":"male";

        String data=names+" "+email+" "+dob+" "+gender+" "+password;

        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }


}
