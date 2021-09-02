package com.example.heartdiseasechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    ProgressDialog progressDialog;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;
    CheckBox checkBox8;
    CheckBox checkBox9;
    CheckBox checkBox10;
    CheckBox checkBox11;
    CheckBox checkBox12;
    CheckBox checkBox13;
    CheckBox checkBox14;
    CheckBox checkBox15;
    CheckBox checkBox16;
    CheckBox checkBox17;
    CheckBox checkBox18;
    CheckBox checkBox19;
    CheckBox checkBox20;
    CheckBox checkBox21;
    CheckBox checkBox22;
    CheckBox checkBox23;
    CheckBox checkBox24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        checkBox1=findViewById(R.id.checkbox1);
        checkBox2=findViewById(R.id.checkbox2);
        checkBox3=findViewById(R.id.checkbox3);
        progressDialog=new ProgressDialog(this);
        checkBox4=findViewById(R.id.checkbox4);
        checkBox5=findViewById(R.id.checkbox5);
        checkBox6=findViewById(R.id.checkbox6);
        checkBox7=findViewById(R.id.checkbox7);
        checkBox8=findViewById(R.id.checkbox8);
        checkBox9=findViewById(R.id.checkbox9);
        checkBox10=findViewById(R.id.checkbox10);
        checkBox11=findViewById(R.id.checkbox11);
        checkBox12=findViewById(R.id.checkbox12);
        checkBox13=findViewById(R.id.checkbox13);
        checkBox14=findViewById(R.id.checkbox14);
        checkBox15=findViewById(R.id.checkbox15);
        checkBox16=findViewById(R.id.checkbox16);
        checkBox17=findViewById(R.id.checkbox17);
        checkBox18=findViewById(R.id.checkbox18);
        checkBox19=findViewById(R.id.checkbox19);
        checkBox20=findViewById(R.id.checkbox20);
        checkBox21=findViewById(R.id.checkbox21);
        checkBox23=findViewById(R.id.checkbox23);
        checkBox24=findViewById(R.id.checkbox24);

    }


    public void SEARCH(View view) {
        if (checkBox1.isChecked()==true && checkBox2.isChecked()==true&& checkBox4.isChecked()==true&& checkBox5.isChecked()==true){
            progressDialog.setTitle("Search");
            progressDialog.setMessage("Analysing your symptoms");
            progressDialog.show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent=new Intent(Home.this,CoronaryHeart.class);
                    startActivity(intent);
                    progressDialog.dismiss();
                }
            },7000);

        }


        else if (checkBox1.isChecked()==true && checkBox10.isChecked()==true && checkBox3.isChecked()==true && checkBox11.isChecked()==true){
            Intent intent=new Intent(this,HeartValve.class);
            startActivity(intent);
        }
       else if (checkBox1.isChecked()==true && checkBox18.isChecked()==true && checkBox7.isChecked()==true&& checkBox14.isChecked()==true && checkBox22.isChecked()==true && checkBox23.isChecked()==true && checkBox20.isChecked()==true && checkBox16.isChecked()==true){
            Intent intent=new Intent(this,PericardialDisease.class);
            startActivity(intent);
        }
        else if (checkBox16.isChecked()==true && checkBox24.isChecked()==true && checkBox11.isChecked()==true&& checkBox8.isChecked()==true && checkBox3.isChecked()==true){
            Intent intent=new Intent(this,Cardiomyoparthy.class);
            startActivity(intent);
        }
        else if (checkBox13.isChecked()==true && checkBox14.isChecked()==true && checkBox19.isChecked()==true&& checkBox15.isChecked()==true && checkBox16.isChecked()==true){
            Intent intent=new Intent(this,CongenitalHeartD.class);
            startActivity(intent);
        }
    else if (!checkBox1.isChecked()==true && !checkBox2.isChecked()==true && !checkBox3.isChecked()==true && !checkBox4.isChecked()==true && !checkBox5.isChecked()==true && !checkBox6.isChecked()==true && !checkBox7.isChecked()==true && !checkBox8.isChecked()==true && !checkBox9.isChecked()==true && !checkBox10.isChecked()==true && !checkBox11.isChecked()==true && !checkBox12.isChecked()==true && !checkBox13.isChecked()==true && !checkBox14.isChecked()==true && !checkBox15.isChecked()==true && !checkBox16.isChecked()==true && !checkBox17.isChecked()==true && !checkBox18.isChecked()==true && !checkBox19.isChecked()==true && !checkBox20.isChecked()==true && !checkBox21.isChecked()==true && !checkBox22.isChecked()==true && !checkBox23.isChecked()==true){
            Toast.makeText(this, "No symptoms seleceted", Toast.LENGTH_LONG).show();
        }
else {
            Toast.makeText(this, "Unmatched Symptoms detected Seek further medical attention", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}