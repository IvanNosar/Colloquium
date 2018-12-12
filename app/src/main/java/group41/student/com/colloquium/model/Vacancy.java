package group41.student.com.colloquium.model;

import java.util.List;

public class Vacancy {

    private long mId;
    private String mCompany;
    private String mCity;
    private String mDate;
    private String mVacancy;
    private String mEmploymentRate;
    private ContactData mContacts;
    private String mDepartment;
    private String mVacancyDescription;
    private List<String> mRequirements;
    private List<TestPreview> mTests;
    private List<String> mAdvices;

    public Vacancy(
            long mId,
            String mCompany,
            String mCity,
            String mDate,
            String mVacancy,
            String mEmploymentRate,
            ContactData mContacts,
            String mDepartment,
            String mVacancyDescription,
            List<String> mRequirements,
            List<TestPreview> mTests,
            List<String> mAdvices) {
        this.mId = mId;
        this.mCompany = mCompany;
        this.mCity = mCity;
        this.mDate = mDate;
        this.mVacancy = mVacancy;
        this.mEmploymentRate = mEmploymentRate;
        this.mContacts = mContacts;
        this.mDepartment = mDepartment;
        this.mVacancyDescription = mVacancyDescription;
        this.mRequirements = mRequirements;
        this.mTests = mTests;
        this.mAdvices = mAdvices;
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        this.mId = id;
    }

    public String getCompany() {
        return mCompany;
    }

    public void setCompany(String company) {
        this.mCompany = company;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        this.mCity = city;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        this.mDate = date;
    }

    public String getVacancy() {
        return mVacancy;
    }

    public void setVacancy(String vacancy) {
        this.mVacancy = vacancy;
    }

    public String getEmploymentRate() {
        return mEmploymentRate;
    }

    public void setEmploymentRate(String employmentRate) {
        this.mEmploymentRate = employmentRate;
    }

    public ContactData getContacts() {
        return mContacts;
    }

    public void setContacts(ContactData contacts) {
        this.mContacts = contacts;
    }

    public String getDepartment() {
        return mDepartment;
    }

    public void setDepartment(String department) {
        this.mDepartment = department;
    }

    public String getVacancyDescription() {
        return mVacancyDescription;
    }

    public void setVacancyDescription(String vacancyDescription) {
        this.mVacancyDescription = vacancyDescription;
    }

    public List<String> getRequirements() {
        return mRequirements;
    }

    public void setRequirements(List<String> requirements) {
        this.mRequirements = requirements;
    }

    public List<TestPreview> getTests() {
        return mTests;
    }

    public void setTests(List<TestPreview> tests) {
        this.mTests = tests;
    }

    public List<String> getAdvices() {
        return mAdvices;
    }

    public void setAdvices(List<String> advices) {
        this.mAdvices = advices;
    }
}
