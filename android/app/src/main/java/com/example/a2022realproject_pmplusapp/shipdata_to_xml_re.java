package com.example.a2022realproject_pmplusapp;

import android.util.Log;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.net.URL;

class shipdata_to_xml_re {

     String code;
     String day1;
     String day2;
     String call;

     String[] total_array = new String[15];
     String[] total_array_2 = new String[15];
     String[] total_array_3 = new String[15];
     String[] total_array_4 = new String[15];
     String[] total_array_5 = new String[15];

     String[] total_array_6 = new String[15];
     String[] total_array_7 = new String[15];
     String[] total_array_8 = new String[15];
     String[] total_array_9 = new String[15];
     String[] total_array_10 = new String[15];

     String[] total_array_11 = new String[15];
     String[] total_array_12 = new String[15];
     String[] total_array_13 = new String[15];
     String[] total_array_14 = new String[15];
     String[] total_array_15 = new String[15];

     String[] total_array_16 = new String[15];
     String[] total_array_17 = new String[15];
     String[] total_array_18 = new String[15];
     String[] total_array_19 = new String[15];
     String[] total_array_20 = new String[15];

    public shipdata_to_xml_re(String rs_sc, String rs_day1, String rs_day2, String rs_call) {
        this.code = rs_sc;
        this.day1 = rs_day1;
        this.day2 = rs_day2;
        this.call = rs_call;
    }

      public String[] shipdata_to_xml_re() {

         String datatag = "parsing";

            String a_d2 = this.day2;
            String a_d1 = this.day1;
            String a_s = this.code;
            String a_c = this.call;

        String ship_url = "http://apis.data.go.kr/1192000/VsslEtrynd2/Info?" +
                "serviceKey=NYQp85bV4GjxauduBdSwaoZb3uT9jcgbECXr1WNuzKbPSx5%2Fdv7m%2B5gV6xRZk3yYt5M4dzOuspvMzSwrPgtd7g%3D%3D" +
                "&sde="+a_d1+"&ede="+a_d2+"&prtAgCd="+a_s+"&clsgn="+a_c+"&pageNo=1&numOfRows=1";


        try {
            URL url = new URL(ship_url);
            InputStream is = url.openStream();

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new InputStreamReader(is, "UTF-8"));


            String tag;

            xpp.next();
            int eventType = xpp.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                switch (eventType) {
                    case XmlPullParser.START_DOCUMENT:
                        break;

                    case XmlPullParser.START_TAG:
                        tag = xpp.getName();

                        if (tag.equals("item")) {
                            System.out.println("item목록 파싱입니다.");

                        } else if (tag.equals("prtAgCd")) {
                            String result_s_prtAgCd = xpp.getText();
                            total_array[0] = result_s_prtAgCd;
                            Log.i(datatag,"data : "+ total_array[0]);

                        } else if (tag.equals("prtAgNm")) { //
                           String result_s_prtAgNm = xpp.getText();
                            total_array[1] = result_s_prtAgNm;
                            Log.i(datatag,"data : "+ total_array[1]);

                        } else if (tag.equals("clsgn")) { //
                            String result_s_clsgn = xpp.getText();
                            total_array[2] = result_s_clsgn;
                            Log.i(datatag,"data : "+ total_array[2]);

                        } else if (tag.equals("vsslNm")) { //
                            String result_s_vsslNm = xpp.getText();
                            total_array[3] = result_s_vsslNm;

                        } else if (tag.equals("vsslNltyNm")) {
                            String result_s_vsslNltyNm = xpp.getText();
                            total_array[4] = result_s_vsslNltyNm;

                        } else if (tag.equals("vsslKndNm")) {
                           String result_s_vsslKndNm = xpp.getText();
                            total_array[5] = result_s_vsslKndNm;

                        } else if (tag.equals("etryptPurpsNm")) {
                           String result_s_etryptPurpsNm = xpp.getText();
                            total_array[6] = result_s_etryptPurpsNm;

                        } else if (tag.equals("dstnPrtNm")) {
                           String result_s_dstnPrtNm = xpp.getText();
                            total_array[7] = result_s_dstnPrtNm;

                        }else if (tag.equals("details")) {
                            System.out.println("detail목록 파싱입니다.");

                            } else if (tag.equals("etryptDt")) {
                                String result_s_etryptDt = xpp.getText();
                                total_array[8] = result_s_etryptDt;

                            } else if (tag.equals("ibobprtNm")) {
                                String result_s_ibobprtNm = xpp.getText();
                                total_array[9] = result_s_ibobprtNm;

                            } else if (tag.equals("laidupFcltyNm")) {
                                String result_s_laidupFcltyNm = xpp.getText();
                                total_array[10] = result_s_laidupFcltyNm;

                            } else if (tag.equals("ldadngFrghtClCd")) {
                                String result_s_ldadngFrghtClCd = xpp.getText();
                                total_array[11] = result_s_ldadngFrghtClCd;

                            } else if (tag.equals("grtg")) {
                                String result_s_grtg = xpp.getText();
                                total_array[12] = result_s_grtg;

                            } else if(tag.equals("satmntEntrpsNm")) {
                                String result_s_satmntEntrpsNm = xpp.getText();
                                total_array[13] = result_s_satmntEntrpsNm;

                            } else if(tag.equals("tkoffDt")) {
                                String result_s_tkoffDt = xpp.getText();
                                total_array[14] = result_s_tkoffDt;

                            }
                        break;

                    case XmlPullParser.TEXT:
                        break;

                    case XmlPullParser.END_TAG:
                             tag = xpp.getText();
                             if (tag.equals("item")){
                               break;
                             }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return total_array;
    }


    public shipdata_to_xml_re(){ }

    public String[] total(){
        return total_array;
    }

    public String[] total2(){
         return total_array_2;
    }


}
