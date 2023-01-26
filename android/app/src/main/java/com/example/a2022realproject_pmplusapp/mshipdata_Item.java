package com.example.a2022realproject_pmplusapp;

public class mshipdata_Item {

    String m_prtAgCd;
    String m_prtAgNm;
    String m_clsgn;
    String m_vsslNm;
    String m_vsslNltyNm;
    String m_vsslKndNm;
    String m_vsslGrtg;
    String m_aprtfEtryptDt;
    String m_harborEntrpsNm;

    String m_cntrlNm;
    String m_cntrlOpertDt;
    String m_fcltyCd;
    String m_fcltySubCd;
    String m_fcltyNm;

    public void m_clear(){

        m_prtAgCd = "";
        m_prtAgNm = "";
        m_clsgn = "";
        m_vsslNm = "";
        m_vsslNltyNm = "";
        m_vsslKndNm = "";
        m_vsslGrtg = "";
        m_aprtfEtryptDt = "";
        m_harborEntrpsNm = "";

        m_cntrlNm = "";
        m_cntrlOpertDt = "";
        m_fcltyCd = "";
        m_fcltySubCd = "";
        m_fcltyNm = "";

    }

    boolean m_checkRecvAllData(){

        return m_prtAgCd.length()  > 0
                && m_prtAgNm.length()  > 0
                && m_clsgn.length()    > 0
                && m_vsslNm.length()     > 0
                && m_vsslNltyNm.length()     > 0
                && m_vsslKndNm.length() > 0
                && m_vsslGrtg.length()  > 0
                && m_aprtfEtryptDt.length()    > 0
                && m_harborEntrpsNm.length()     > 0
                && m_cntrlNm.length()     > 0
                && m_cntrlOpertDt.length() > 0
                && m_fcltyCd.length()  > 0
                && m_fcltySubCd.length()    > 0
                && m_fcltyNm.length()     > 0;
    }
}
