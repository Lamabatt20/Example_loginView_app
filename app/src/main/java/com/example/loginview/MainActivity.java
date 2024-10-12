package com.example.loginview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button loginB;
    private EditText editPassword,editUserName;
    private User user = new User();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        loginB=findViewById(R.id.loginB);
        editPassword=findViewById(R.id.editPassword);
        editUserName=findViewById(R.id.editUserName);

        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = editUserName.getText().toString().trim();
                String Password = editPassword.getText().toString().trim();

                if (Username.isEmpty() || Password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your username and password", Toast.LENGTH_SHORT).show();

                }else {
                    if (Username.equals(user.getUsername()) && Password.equals(user.getPassword())) {
                        Toast.makeText(MainActivity.this, "Login successfully ", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });








    }
}