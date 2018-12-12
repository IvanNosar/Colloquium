package group41.student.com.colloquium.view.Employee;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import group41.student.com.colloquium.R;
import group41.student.com.colloquium.controller.network.Employee.VacancyPreviewsLoader;
import group41.student.com.colloquium.controller.ui.Employee.VacancyPreviewAdapter;
import group41.student.com.colloquium.model.Employee.VacancyPreview;
import group41.student.com.colloquium.view.StartActivity;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_main_screen);

        setupTitle();
    }

    private void setupTitle() {
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {

            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        setTitle(getString(R.string.main_screen_activity_title));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {

            Intent intent = new Intent(this, StartActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

            startActivity(intent);
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void search(View view) {

        final LayoutInflater inflater = getLayoutInflater();
        final LinearLayout container = findViewById(R.id.search_results_container);

        final VacancyPreviewAdapter.VacancyPreviewClickHandler clickHandler = new VacancyPreviewAdapter.VacancyPreviewClickHandler() {
            @Override
            public void onClick(VacancyPreview item) {

                startActivity(new Intent(MainScreenActivity.this, DetailedVacancyActivity.class));
            }
        };

        new VacancyPreviewsLoader().load(new VacancyPreviewsLoader.VacancyLoadedHandler() {
            @Override
            public void receive(List<VacancyPreview> results) {

                new VacancyPreviewAdapter(inflater, container).
                        fillContainer(results, clickHandler);
            }
        });
    }
}
