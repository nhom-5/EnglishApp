package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.facebook.accountkit.Account;
import com.facebook.accountkit.AccountKit;
import com.facebook.accountkit.AccountKitCallback;
import com.facebook.accountkit.AccountKitError;

public class Success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        Button btnSignOut = findViewById(R.id.btnLogout);
        btnSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AccountKit.logOut();
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        AccountKit.getCurrentAccount(new AccountKitCallback<Account>() {
            @Override
            public void onSuccess(Account account) {
                EditText edtUserId,edtPhone,edtEmail;

                edtUserId =findViewById(R.id.edtUserId);
                edtUserId.setText(String.format(" User Id %s",account.getId()));

                edtPhone =findViewById(R.id.edtPhone);
                edtPhone.setText(String.format(" Phone Id %s",account.getPhoneNumber() == null ?"":account.getPhoneNumber().toString()));

                edtEmail =findViewById(R.id.edtEmail);
                edtEmail.setText(String.format(" Email Id %s",account.getEmail()));
            }

            @Override
            public void onError(AccountKitError accountKitError) {

            }
        });
    }
}
