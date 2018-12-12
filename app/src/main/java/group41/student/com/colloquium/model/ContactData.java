package group41.student.com.colloquium.model;

public class ContactData {

    private String mPhone;
    private String mEmail;
    private String mOfficeAddress;

    public ContactData(String phone, String email, String officeAddress) {
        this.mPhone = phone;
        this.mEmail = email;
        this.mOfficeAddress = officeAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        this.mPhone = phone;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public String getOfficeAddress() {
        return mOfficeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.mOfficeAddress = officeAddress;
    }
}
