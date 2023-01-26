//모선별 관제 현황

const express = require('express')();
const server = require('http').createServer(express);
const io = require('socket.io')(server);
var request = require('request');
var convert = require("xml-js");

var url = 'http://apis.data.go.kr/1192000/CntlVssl2/Info';
var ServiceKey = "=NYQp85bV4GjxauduBdSwaoZb3uT9jcgbECXr1WNuzKbPSx5%2Fdv7m%2B5gV6xRZk3yYt5M4dzOuspvMzSwrPgtd7g%3D%3D"
var queryParams = '?' + encodeURIComponent('serviceKey') + ServiceKey; /* Service Key*/
queryParams += '&' + encodeURIComponent('pageNo') + '=' + encodeURIComponent('1'); /*페이지 번호*/
queryParams += '&' + encodeURIComponent('numOfRows') + '=' + encodeURIComponent('10'); /*한 페이지 결과 수*/
queryParams += '&' + encodeURIComponent('prtAgCd') + '=' + encodeURIComponent('020'); /*항만 청 코드*/
queryParams += '&' + encodeURIComponent('sde') + '=' + encodeURIComponent('20170209'); /*검색 시작일*/
queryParams += '&' + encodeURIComponent('ede') + '=' + encodeURIComponent('20170209'); /* 검색 종료일*/
queryParams += '&' + encodeURIComponent('clsgn') + '=' + encodeURIComponent('9VHZ8'); /*호출 부호*/

request.get(url + queryParams, (err, response, body)=>{

if(err){
    console.log(err);

} else{

    if(response.statusCode == 200){
         var result = body;
         var xmlToJson = convert.xml2json(result, {compact: true, spaces : 4});
         console.log(xmlToJson+"\n");
      

     const prtCdData = JSON.parse(xmlToJson).response.body.items.item.prtAgCd._text;
     const prtAgNm = JSON.parse(xmlToJson).response.body.items.item.prtAgNm._text;
     const clsgn = JSON.parse(xmlToJson).response.body.items.item.clsgn._text;
     const vsslKndNm = JSON.parse(xmlToJson).response.body.items.item.vsslKndNm._text;
     const vsslNm = JSON.parse(xmlToJson).response.body.items.item.vsslNm._text;
     const vsslNltyNm = JSON.parse(xmlToJson).response.body.items.item.vsslNltyNm._text;
     const cntrlOpertDt = JSON.parse(xmlToJson).response.body.items.item.

     console.log(prtCdData);
     console.log(prtAgNm);
     console.log(clsgn);
     console.log(vsslKndNm);
     console.log(vsslNm);
     console.log(vsslNltyNm);
     console.log(cntrlOpertDt);
    }
   }
});