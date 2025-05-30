package com.example.constraintlayoutbasics;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterUser1Activity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private EditText password;
    private EditText confirmPassword;
    private Spinner location;
    private RadioButton maleRadio;

    private RadioButton femaleRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.register_user);

        firstName = findViewById(R.id.editTextFirstName);
        lastName = findViewById(R.id.editTextLastName);
        email = findViewById(R.id.editTextEmail);
        password = findViewById(R.id.editTextPassword);
        confirmPassword = findViewById(R.id.editTextConfirmPassword);
        location = findViewById(R.id.spinnerLocation);
        maleRadio = findViewById(R.id.radio_male);
        femaleRadio = findViewById(R.id.radio_female);

        getSupportFragmentManager().beginTransaction().
                setReorderingAllowed(true).
                add(R.id.fragment_container_view, CustomFragment.class,null)
                .commit();

    }
}