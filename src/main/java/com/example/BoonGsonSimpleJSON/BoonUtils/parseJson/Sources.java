/**
 * 2.24 evening
 * https://www.tutorialspoint.com/boon/boon_sources.htm
 */
package com.example.BoonGsonSimpleJSON.BoonUtils.parseJson;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

import java.util.Map;

public class Sources {
    public static void main(String args[]) {
        ObjectMapper mapper = JsonFactory.create();
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        char[] jsonCharAray = jsonString.toCharArray();
        Map studentMap = mapper.readValue(jsonCharAray, Map.class);

        System.out.println("Name: " + studentMap.get("name"));
        System.out.println("Age: " + studentMap.get("age"));
    }
}
