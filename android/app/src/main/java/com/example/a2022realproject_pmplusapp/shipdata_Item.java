package com.example.a2022realproject_pmplusapp;

public class shipdata_Item {

    String prtAgCd;
    String prtAgNm;
    String clsgn;
    String vsslNm;
    String vsslNltyNm;
    String vsslKndNm;
    String etryptPurpsNm;
    String dstnPrtNm;

    String etryptDt;
    String tkoffDT;
    String ibobprtNm;
    String laidupFcltyNm;
    String ldadngFrghtClCd;
    String grtg;
    String satmntEntrpsNm;

    public void clear(){

         prtAgCd = "";
         prtAgNm = "";
         clsgn = "";
         vsslNm = "";
         vsslNltyNm = "";
         vsslKndNm = "";
         etryptPurpsNm = "";
         dstnPrtNm = "";

         etryptDt = "";
         tkoffDT = "";
         ibobprtNm = "";
         laidupFcltyNm = "";
         ldadngFrghtClCd = "";
         grtg = "";
         satmntEntrpsNm = "";



    }

    boolean checkRecvAllData(){
        return prtAgCd.length()  > 0
                && prtAgNm.length()  > 0
                && clsgn.length()    > 0
                && vsslNm.length()     > 0
                && vsslNltyNm.length()     > 0
                && vsslKndNm.length() > 0
                && etryptPurpsNm.length()  > 0
                && dstnPrtNm.length()    > 0
                && etryptDt.length()     > 0
                && tkoffDT.length()     > 0
                && ibobprtNm.length() > 0
                && laidupFcltyNm.length()  > 0
                && ldadngFrghtClCd.length()    > 0
                && grtg.length()     > 0
                && satmntEntrpsNm.length()    > 0;
    }
}
