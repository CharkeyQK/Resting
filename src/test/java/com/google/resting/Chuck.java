package com.google.resting;

import com.google.resting.component.impl.ServiceResponse;
import com.google.resting.component.impl.json.JSONAlias;
import com.google.resting.transform.impl.JSONTransformer;
import org.apache.commons.lang.StringUtils;

import java.util.List;

public class Chuck {

    public static void main(String[] args) {

        ServiceResponse serviceResponse = Resting.get("http://localhost/testresting/rest/hello/ssbt", 8080);

        String resultant = StringUtils.remove(serviceResponse.getResponseString(), "es:");
        resultant = StringUtils.remove(resultant, "ibmsc:");
        System.out.println(resultant);
        JSONTransformer<com.google.resting.vo.Entry> etransformer = new JSONTransformer<com.google.resting.vo.Entry>();
        List<com.google.resting.vo.Entry> entries = etransformer.getEntityList(resultant, com.google.resting.vo.Entry.class, new JSONAlias("result"));
        System.out.println("Parsing entries: No. of result items" + entries.size());


    }

}
