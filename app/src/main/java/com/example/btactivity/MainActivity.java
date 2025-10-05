package com.example.btactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usernameEditText = findViewById(R.id.editTextUsername);
        EditText passwordEditText = findViewById(R.id.editTextPassword);
        Button loginButton = findViewById(R.id.buttonLogin);

        final String CORRECT_USERNAME = "Nguyen Buu";
        final String CORRECT_PASSWORD = "123";

        loginButton.setOnClickListener(v -> {
            String enteredUsername = usernameEditText.getText().toString();
            String enteredPassword = passwordEditText.getText().toString();

            if (enteredUsername.equals(CORRECT_USERNAME) && enteredPassword.equals(CORRECT_PASSWORD)) {

                Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);

                profileIntent.putExtra("EXTRA_USERNAME", enteredUsername);

                startActivity(profileIntent);

            } else {
                Toast.makeText(MainActivity.this, "Tên đăng nhập hoặc Mật khẩu không đúng! Vui lòng thử lại. ❌", Toast.LENGTH_LONG).show();
            }
        });
    }
}