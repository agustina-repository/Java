package generic.genericmethode;

public class Resp<T> {
    private String originalReferenceNo;
    private T additionalInfo;

    public Resp(String originalReferenceNo, T additionalInfo) {
        this.originalReferenceNo = originalReferenceNo;
        this.additionalInfo = additionalInfo;
    }

    public String getOriginalReferenceNo() {
        return originalReferenceNo;
    }

    public void setOriginalReferenceNo(String originalReferenceNo) {
        this.originalReferenceNo = originalReferenceNo;
    }

    public T getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(T additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
