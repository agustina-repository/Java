package generic.genericclass;

public class CekStatusTaxResp<T, U> {
    private T additional;
    private U bankCode;

    public CekStatusTaxResp(T additional, U bankCode) {
        this.additional = additional;
        this.bankCode = bankCode;
    }

    public T getAdditional() {
        return additional;
    }

    public void setAdditional(T additional) {
        this.additional = additional;
    }

    public U getBankCode() {
        return bankCode;
    }

    public void setBankCode(U bankCode) {
        this.bankCode = bankCode;
    }
}
