package com.lawcase.app.webscraping;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ScraperService {
    //Reading data from property file to a list
    private String url = "https://civil.pjud.cl/CIVILPORWEB/";

    public List<CasesData> extractCases() {

        List<CasesData> casesDataList = new ArrayList<>();

        try {
            //loading the HTML to a Document Object
            Document document = Jsoup.connect(url).get();
            //Selecting the element which contains the ad list
            Element element = document.getElementById("case");
            element.attributes();
            //getting all the <a> tag elements inside the content div tag
//            Elements elements = element.getElementsByTag("a");
//            //traversing through the elements
//            for (Element ads: elements) {
//                CasesData casesData = new CasesData();
//
//                if (!StringUtils.isEmpty(ads.attr("title")) ) {
//                    //mapping data to the model class
//                    //casesData.setTitle(ads.attr("title"));
//                    casesData.setUrl(ads.attr("href"));
//                }
//                if (casesData.getUrl() != null) casesDataList.add(casesData);
//            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return casesDataList;
    }

}
