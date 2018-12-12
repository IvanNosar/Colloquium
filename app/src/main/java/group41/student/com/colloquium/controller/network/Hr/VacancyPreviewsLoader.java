package group41.student.com.colloquium.controller.network.Hr;

import java.util.ArrayList;
import java.util.List;

import group41.student.com.colloquium.model.Hr.VacancyPreview;

public class VacancyPreviewsLoader {

    public interface VacancyLoadedHandler {

        void receive(List<VacancyPreview> results);
    }

    public void load(VacancyLoadedHandler handler) {

        handler.receive(returnMockList());
    }

    private List<VacancyPreview> returnMockList() {
        List<VacancyPreview> result = new ArrayList<VacancyPreview>();

        result.add(new VacancyPreview(0,"Junior developer", "01.02.2018", "Development", "Full day", 5, 6, 7));
        result.add(new VacancyPreview(0,"Senior developer", "02.02.2018", "Development", "Full day", 5, 6, 7));
        result.add(new VacancyPreview(0,"Middle developer", "03.02.2018", "Development", "Part time", 5, 6, 7));
        result.add(new VacancyPreview(0,"QA Tester", "04.02.2018", "Development", "Part time", 5, 6, 7));
        result.add(new VacancyPreview(0,"Team leader", "05.02.2018", "Development", "Full day", 5, 6, 7));

        return result;
    }
}
