package group41.student.com.colloquium.model;

public class TestPreview {

    private String mPreviewText;
    private TestStatus mStatus;

    public TestPreview(String previewText, TestStatus status) {
        this.mPreviewText = previewText;
        this.mStatus = status;
    }

    public String getPreviewText() {
        return mPreviewText;
    }

    public void setPreviewText(String previewText) {
        this.mPreviewText = previewText;
    }

    public TestStatus getStatus() {
        return mStatus;
    }

    public void setStatus(TestStatus status) {
        this.mStatus = status;
    }
}
