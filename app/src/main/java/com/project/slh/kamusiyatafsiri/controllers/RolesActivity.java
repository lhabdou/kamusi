package com.project.slh.kamusiyatafsiri.controllers;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.project.slh.kamusiyatafsiri.entities.Role;
import com.project.slh.kamusiyatafsiri.model.RoleViewModel;

import java.util.List;

public class RolesActivity extends AppCompatActivity {

    private RoleViewModel roleViewModel;
    private Button tsahaButton;
    private EditText inputRole;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roles);
        roleViewModel = ViewModelProviders.of(this).get(RoleViewModel.class);

        List<Role> allRoles = roleViewModel.getAllRoles().getValue();


        tsahaButton = findViewById(R.id.buttonTsahaRole);

        inputRole = findViewById(R.id.edit_motCle);

        inputRole.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                tsahaButton.setEnabled(charSequence.toString().length() >= 4);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        tsahaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("OK");

            }
        });

    }
}
