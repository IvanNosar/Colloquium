package group41.student.com.colloquium.view.Hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import group41.student.com.colloquium.R;

public class DetailedVacancyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hr_detailed_vacancy);

        setupTitle();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hr_detailed_vacancy_menu, menu);
        return true;
    }

    private void setupTitle() {
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {

            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        setTitle(getString(R.string.detailed_vacancy_activity_title));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {

            finish();
        }


        switch (item.getItemId()) {

            case android.R.id.home: {

                finish();
                break;
            }

            case R.id.action_save_vacancy: {

                finish();
                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }

    public void openTest(View view) {

        startActivity(new Intent(this, TestTaskActivity.class));
    }

    public void edit(View view) {

        TextView textView = findViewById(R.id.vacancy_name);
        boolean isSave = textView.getVisibility() != View.VISIBLE;

        textView.setVisibility(!isSave ? View.INVISIBLE : View.VISIBLE);

        EditText editText = findViewById(R.id.vacancy_name_edit);
        editText.setVisibility(isSave ? View.INVISIBLE : View.VISIBLE);

        textView.setText(editText.getText());

        ((ImageView)view).setImageResource(isSave ? R.drawable.ic_edit : R.drawable.ic_save);
    }
}
