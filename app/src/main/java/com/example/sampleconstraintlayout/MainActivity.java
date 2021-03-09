package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    //deklarasi variabel untuk button
    Button btnlogin;

    //deklarasi variabel untuk edittext
    EditText edemail, edpassword;

    //deklarasi variabel untuk menyimpan email dan password
    String nama, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel btnlogin dengan componen button pada layout
        btnlogin=findViewById(R.id.btSignin);

        //menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //menghubungkan variabel edpassword dengan componen button pada layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnlogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                if (edemail.getText().toString().equals("admin@mail.com")&&edpassword.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "login sukses", Toast.LENGTH_LONG).show(); //jika login sukses

                } else if (edemail.getText().toString().equals("admin1@mail.com")&&edpassword.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this,"email salah",Toast.LENGTH_LONG).show(); //jika email salah

                } else if (edemail.getText().toString().equals("admin@mail.com")&&edpassword.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity.this,"password salah",Toast.LENGTH_LONG).show(); //jika password salah

                } else {
                    Toast.makeText(MainActivity.this,"email dan password salah",Toast.LENGTH_LONG).show(); //jika login gagal

            }
            }
        });
    }
}