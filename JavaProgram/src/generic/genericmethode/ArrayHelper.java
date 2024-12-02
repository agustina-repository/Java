package generic.genericmethode;

public class ArrayHelper {

    public static <T> int count(T[] arrayParam){
        return arrayParam.length;
    }

    public static <T> String value(T param){

        Resp resp = new Resp("1", param);
        return resp.getAdditionalInfo() + "|" + resp.getOriginalReferenceNo() ;
    }
}
