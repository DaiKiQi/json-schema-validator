package com.networknt.schema.utils;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author pengjx
 * @date 2019/12/15
 */
public class PathUtil {
    public static JsonNode pathAll(JsonNode jsonNode, String path) {
        String[] split = path.split("\\.");
        JsonNode res = jsonNode;
        for (int i = 1; i < split.length; i++) {
            String s = split[i];
            res = res.path(s);
        }
        return res;
    }
}
