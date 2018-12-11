package group41.student.com.colloquium.model;

public class VacancyPreview {

    private long mId;
    private String mVacancy;
    private String mCity;
    private String mCompany;
    private String mDate;
    private String mDepartment;
    private String mEmploymentRate;
    private long mRequirements;
    private long mTests;
    private long mAdvices;

    public VacancyPreview(
            long id,
            String vacancy,
            String city,
            String company,
            String date,
            String department,
            String employmentRate,
            long requirements,
            long tests,
            long advices) {
        
        mId = id;
        mVacancy = vacancy;
        mCity = city;
        mCompany = company;
        mDate = date;
        mDepartment = department;
        mEmploymentRate = employmentRate;
        mRequirements = requirements;
        mTests = tests;
        mAdvices = advices;
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getVacancy() {
        return mVacancy;
    }

    public void setVacancy(String vacancy) {
        mVacancy = vacancy;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getCompany() {
        return mCompany;
    }

    public void setCompany(String company) {
        mCompany = company;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getDepartment() {
        return mDepartment;
    }

    public void setDepartment(String department) {
        mDepartment = department;
    }

    public String getEmploymentRate() {
        return mEmploymentRate;
    }

    public void setEmploymentRate(String employmentRate) {
        mEmploymentRate = employmentRate;
    }

    public long getRequirements() {
        return mRequirements;
    }

    public void setRequirements(long requirements) {
        mRequirements = requirements;
    }

    public long getTests() {
        return mTests;
    }

    public void setTests(long tests) {
        mTests = tests;
    }

    public long getAdvices() {
        return mAdvices;
    }

    public void setAdvices(long advices) {
        mAdvices = advices;
    }
}
