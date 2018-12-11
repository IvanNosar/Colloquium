package group41.student.com.colloquium.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import group41.student.com.colloquium.R;
import group41.student.com.colloquium.view.Employee.LoginActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void loginEmployee(View view) {

        startActivity(new Intent(this, LoginActivity.class));
    }

    public void loginHr(View view) {

        startActivity(new Intent(this, group41.student.com.colloquium.view.Hr.LoginActivity.class));
    }
}
