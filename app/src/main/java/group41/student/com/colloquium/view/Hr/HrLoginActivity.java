package group41.student.com.colloquium.view.Hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import group41.student.com.colloquium.R;
import group41.student.com.colloquium.view.Employee.EmployeeMainScreenActivity;
import group41.student.com.colloquium.view.Employee.EmployeeRegisterActivity;

public class HrLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hr_login);

        setupTitle();
    }

    private void setupTitle() {
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {

            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        setTitle(getString(R.string.login_activity_title));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {

            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void login(View view) {

        Intent intent = new Intent(this, HrMainScreenActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
        finish();
    }

    public void register(View view) {

        startActivity(new Intent(this, HrRegisterActivity.class));
    }
}
