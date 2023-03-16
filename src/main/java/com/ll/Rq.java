package com.ll;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    private String actionCode;
    private Map<String, String> params;


    public Rq(String cmd) {
        String[] cmdBits = cmd.split("\\?", 2);
        String actionCode = cmdBits[0];
        params = new HashMap<>();
        // '&'기준으로 command/id,authorName,text 나뉘도록
        String[] paramsBits = cmdBits[1].split("&");
        // '&'기준으로 옵션 id/authorName/text 각각 계속 나뉘도록
        for (String paramStr : paramsBits) {
            String[] paramStrBits = paramStr.split("&", 2);
            String key = paramStrBits[0];
            String value = paramStrBits[1];
            params.put(key, value);
        }
    }

    public String getActionCode() {
        return actionCode;
    }
    public String getParams(String name){
        return params.get(name);
    }
}
