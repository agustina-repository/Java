package generic.genericmethode;

public class Additional {

    private String userId;
    private String kodeWilayah;

    public Additional(String userId, String kodeWilayah) {
        this.userId = userId;
        this.kodeWilayah = kodeWilayah;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getKodeWilayah() {
        return kodeWilayah;
    }

    public void setKodeWilayah(String kodeWilayah) {
        this.kodeWilayah = kodeWilayah;
    }

    @Override
    public String toString() {
        return "Additional{" +
                "userId='" + userId + '\'' +
                ", kodeWilayah='" + kodeWilayah + '\'' +
                '}';
    }
}
