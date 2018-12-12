package group41.student.com.colloquium.controller.ui.Hr;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

import group41.student.com.colloquium.R;
import group41.student.com.colloquium.model.Hr.VacancyPreview;

public class VacancyPreviewAdapter {

    public interface VacancyPreviewClickHandler {

        void onClick(VacancyPreview item);
    }

    private final static Locale DEFAULT_LOCALE = new Locale("ru","RU");
    private final static String COMPANY_AND_CITY_PATTERN = "(%s, %s)";
    private final static String DEPARTMENT_PATTERN = "Отдел: %s";
    private final static String EMPLOYMENT_RATE_PATTERN = "Уровень занятости: %s";
    private final static String REQUIREMENTS_PATTERN = "Требований: %d";
    private final static String TESTS_PATTERN = "Тестовых заданий: %d";
    private final static String ADVICES_PATTERN = "Советов: %d";

    private LayoutInflater mLayoutInflater;
    private LinearLayout mContainer;

    public VacancyPreviewAdapter(LayoutInflater layoutInflater, LinearLayout container) {

        mLayoutInflater = layoutInflater;
        mContainer = container;
    }

    public void fillContainer(List<VacancyPreview> data, VacancyPreviewClickHandler handler) {

        clear();

        for (int i = 0; i < data.size(); i++) {

            mContainer.addView(generateView(data.get(i), handler));
        }
    }

    private void clear() {

        mContainer.removeAllViews();
    }

    private View generateView(final VacancyPreview data, final VacancyPreviewClickHandler handler) {

        View result = mLayoutInflater.inflate(R.layout.view_hr_vacancy_preview, mContainer, false);

        ((TextView)result.findViewById(R.id.vacancy_name)).setText(data.getVacancy());
        ((TextView)result.findViewById(R.id.date)).setText(data.getDate());
        ((TextView)result.findViewById(R.id.department)).
                setText(String.format(DEPARTMENT_PATTERN, data.getDepartment()));
        ((TextView)result.findViewById(R.id.employment_rate)).
                setText(String.format(EMPLOYMENT_RATE_PATTERN, data.getEmploymentRate()));
        ((TextView)result.findViewById(R.id.requirements)).
                setText(String.format(DEFAULT_LOCALE, REQUIREMENTS_PATTERN, data.getRequirements()));
        ((TextView)result.findViewById(R.id.tests)).
                setText(String.format(DEFAULT_LOCALE, TESTS_PATTERN, data.getTests()));
        ((TextView)result.findViewById(R.id.advices)).
                setText(String.format(DEFAULT_LOCALE, ADVICES_PATTERN, data.getAdvices()));

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handler.onClick(data);
            }
        });

        return result;
    }
}
