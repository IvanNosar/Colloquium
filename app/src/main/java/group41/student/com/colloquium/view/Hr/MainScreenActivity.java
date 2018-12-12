package group41.student.com.colloquium.view.Hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import group41.student.com.colloquium.R;
import group41.student.com.colloquium.controller.network.Hr.VacancyPreviewsLoader;
import group41.student.com.colloquium.controller.ui.Hr.VacancyPreviewAdapter;
import group41.student.com.colloquium.model.Hr.VacancyPreview;
import group41.student.com.colloquium.view.StartActivity;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hr_main_screen);

        setupTitle();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.hr_main_screen_menu, menu);
        return true;
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

        switch (item.getItemId()) {

            case android.R.id.home: {

                Intent intent = new Intent(this, StartActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

                startActivity(intent);
                finish();
                break;
            }

            case R.id.action_add_vacancy: {

                startActivity(new Intent(MainScreenActivity.this, DetailedVacancyActivity.class));
                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();

        final LayoutInflater inflater = getLayoutInflater();
        final LinearLayout container = findViewById(R.id.vacancies_container);

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
