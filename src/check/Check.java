package check;

/**
 * Copyright (c) 2017 Guangdong Sun Railway Information Technology, Inc.
 * All rights reserved.
 *
 * @author shanchanglu
 * Description:
 * Changelog:
 * Revision 1.0  2018/5/21 shanchanglu
 */
public class Check {

    public static boolean checkreturn(String account, String password){
        boolean checkbool = false;
        if ("account".equals(account) && "password".equals(password)){
            checkbool = true;
        }
        return checkbool;
    }

}
