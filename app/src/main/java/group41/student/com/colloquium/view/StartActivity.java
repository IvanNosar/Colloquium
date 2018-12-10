package group41.student.com.colloquium.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import group41.student.com.colloquium.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void loginEmployee(View view) {

        startActivity(new Intent(this, EmployeeLoginActivity.class));
    }

    public void loginHr(View view) {

        startActivity(new Intent(this, HrLoginActivity.class));
    }
}
