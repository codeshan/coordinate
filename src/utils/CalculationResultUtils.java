package utils;

import entity.OneOneParam;
import entity.Result;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2017 Guangdong Sun Railway Information Technology, Inc.
 * All rights reserved.
 *
 * @author shanchanglu
 * Description: 算法
 * Changelog:
 * Revision 1.0  2018/5/22 shanchanglu
 */
public final class CalculationResultUtils {

    /**
     * 路中无超高算法
     * 包含上行和下行
     * @param params 参数
     * @param value 算法标识
     * @return 计算结果
     */
    public static List<Result> oneOne(List<OneOneParam> params,String value){

        List<Result> results = new ArrayList<>();
        Result result;

        for (int i=0;i<params.size();i++ ){
            //计算G
            double g = params.get(i).getD()/2;
            System.out.println(g);
            //计算C
            double c = params.get(i).getF() + g;
            System.out.println(c);
            //计算N
            double n = params.get(i).getE() - params.get(i).getF();
            System.out.println(n);
            //计算K
            double k;
            //判断上行还是下行
            String temp = value.substring(value.length() - 1);
            if ("1".equals(temp)){
                //上行
                if ("是".equals(params.get(i).getY())){
                    k = (params.get(i+1).getRoadMiddleY()-params.get(i).getRoadMiddleY())/(params.get(i+1).getRoadMiddleX() - params.get(i).getRoadMiddleX());
                }else {
                    k = (params.get(i).getRoadMiddleY()-params.get(i-1).getRoadMiddleY())/(params.get(i).getRoadMiddleX() - params.get(i-1).getRoadMiddleX());
                }
            }else {
                //下行
                if ("是".equals(params.get(i).getY())){
                    k = (params.get(i).getRoadMiddleY()-params.get(i-1).getRoadMiddleY())/(params.get(i).getRoadMiddleX() - params.get(i-1).getRoadMiddleX());
                }else {
                    k = (params.get(i+1).getRoadMiddleY()-params.get(i).getRoadMiddleY())/(params.get(i+1).getRoadMiddleX() - params.get(i).getRoadMiddleX());
                }
            }
            System.out.println(k);
            //计算B
            double b = params.get(i).getRoadMiddleY()-((-1/k)*(params.get(i).getRoadMiddleX()));
            System.out.println(b);
            //计算A和M
            double a,m;
            if ("左幅".equals(params.get(i).getV())){
                a = -1;
                m = 1;
            }else {
                a = 1;
                m = -1;
            }
            System.out.println(a+m);
            //计算i(x/y/z) i'(x/y/z) i''(x/y/z)
            result = new Result();
            result.setFlowNum(i+1);
            double ix = params.get(i).getRoadMiddleX()+a*(c/(Math.sqrt(1+(-1/k)*(-1/k))));
            double iy = (-1/k)*ix+b;
            double iz = params.get(i).getDesignH()-params.get(i).getPz()*(g-n)-0.1;
            result.setIx(new BigDecimal(ix).setScale(5,BigDecimal.ROUND_HALF_DOWN).doubleValue());
            result.setIy(new BigDecimal(iy).setScale(5,BigDecimal.ROUND_HALF_DOWN).doubleValue());
            result.setIz(new BigDecimal(iz).setScale(5,BigDecimal.ROUND_HALF_DOWN).doubleValue());
            //i''   i'
            double iiix,iiiy,iiiz;
            double iix,iiy,iiz;
            if ("1".equals(temp)){
                iiix = ix-m*a*(g/(Math.sqrt(1+(-1/k)*(-1/k))));
                iiiy = (-1/k)*iiix+b;
                iiiz = iz-a*params.get(i).getPz()*g;

                iix = ix-g/(Math.sqrt(1+(-1/k)*(-1/k)));
                iiy = (-1/k)*iix+b;
                iiz = iz+a*params.get(i).getPz()*g;

            }else {
                iiix = ix+m*a*(g/(Math.sqrt(1+(-1/k)*(-1/k))));
                iiiy = (-1/k)*ix+b;
                iiiz = iz+a*params.get(i).getPz()*g;

                iix = ix-a*m*g/(Math.sqrt(1+(-1/k)*(-1/k)));
                iiy = (-1/k)*iix+b;
                iiz = iz-a*params.get(i).getPz()*g;
            }

            result.setIix(new BigDecimal(iix).setScale(5,BigDecimal.ROUND_HALF_DOWN).doubleValue());
            result.setIiy(new BigDecimal(iiy).setScale(5,BigDecimal.ROUND_HALF_DOWN).doubleValue());
            result.setIiz(new BigDecimal(iiz).setScale(5,BigDecimal.ROUND_HALF_DOWN).doubleValue());
            result.setIiix(new BigDecimal(iiix).setScale(5,BigDecimal.ROUND_HALF_DOWN).doubleValue());
            result.setIiiy(new BigDecimal(iiiy).setScale(5,BigDecimal.ROUND_HALF_DOWN).doubleValue());
            result.setIiiz(new BigDecimal(iiiz).setScale(5,BigDecimal.ROUND_HALF_DOWN).doubleValue());

            results.add(result);

        }

        return results;

    }


    public static void main(String[] args) {
    }

}
