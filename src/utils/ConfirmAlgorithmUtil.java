package utils;

import contants.AlgorithmValue;

/**
 * Copyright (c) 2017 Guangdong Sun Railway Information Technology, Inc.
 * All rights reserved.
 *
 * @author shanchanglu
 * Description:
 * Changelog:
 * Revision 1.0  2018/5/22 shanchanglu
 */
public class ConfirmAlgorithmUtil {
    public static String confirm(String designPlanValue, String isSuperHighValue, String preDirectionVaule){
        designPlanValue = "路中".equals(designPlanValue) ? "1" : "2";
        isSuperHighValue = "无超高".equals(isSuperHighValue) ? "1" : "2";
        preDirectionVaule = "上行".equals(preDirectionVaule) ? "1" : "2";

        return designPlanValue + "-" + isSuperHighValue + "-" + preDirectionVaule;
    }
}
