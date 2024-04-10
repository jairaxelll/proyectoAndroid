package com.example.tinytask;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterView extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize UI components
        usernameEditText = findViewById(R.id.usernameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        registerButton = findViewById(R.id.registerButton);

        // Set click listener for register button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input
                String username = usernameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Validate input (e.g., check if fields are not empty)
                if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    // Show toast message indicating missing fields
                    Toast.makeText(RegisterView.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return; // Exit onClick method early
                }

                // Perform registration process (e.g., save user data to database)
                // In this example, we'll just show a toast message indicating successful registration
                Toast.makeText(RegisterView.this, "Registration successful!", Toast.LENGTH_SHORT).show();

                // Optionally, navigate back to MainActivity or another activity
                // Intent intent = new Intent(RegisterView.this, MainActivity.class);
                // startActivity(intent);
                // finish(); // Optionally finish the current activity to prevent going back to it
            }
        });
    }
}
