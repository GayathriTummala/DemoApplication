package com.example.demo.demoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {



  public static EditText username;
  public static EditText password;
  public static Button button;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

     username = (EditText)findViewById(R.id.username);
     password = (EditText)findViewById(R.id.password);
     button = (Button)findViewById(R.id.button);


    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
       // Toast.makeText(LoginActivity.this, strusername +" "+strpassword,Toast.LENGTH_SHORT).show();

        if(username.getText().toString().equals("user1")&& password.getText().toString().equals("user1"))
        {
          Toast.makeText(LoginActivity.this, "Password is correct",Toast.LENGTH_SHORT).show();
          Intent intent=new Intent(LoginActivity.this,Welcome.class);
          startActivity(intent);
        }
        else {
          Toast.makeText(LoginActivity.this, "Incorrect Password",Toast.LENGTH_SHORT).show();
        }

      }

    });


  }
  public static boolean isValidUserName(EditText username){
    return  username != null;


  }
}
