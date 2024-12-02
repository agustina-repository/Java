package generic.application;

import generic.genericclass.AdditionalInfoTax;
import generic.genericclass.CekStatusTaxResp;

public class CekStatusApp {
    public static void main(String[] args) {

        AdditionalInfoTax tax = new AdditionalInfoTax("14410");
        CekStatusTaxResp<AdditionalInfoTax, String> taxResp = new CekStatusTaxResp<>(tax, "1001");

        System.out.println(taxResp.getBankCode() + "|" + taxResp.getAdditional().getKodeWilayah());
    }
}
