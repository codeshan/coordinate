package entity;

/**
 * Copyright (c) 2017 Guangdong Sun Railway Information Technology, Inc.
 * All rights reserved.
 *
 * @author shanchanglu
 * Description: 路中无超高参数实体类
 * Changelog:
 * Revision 1.0  2018/5/22 shanchanglu
 */
public class OneOneParam {

    //参数序号
    private int flowNum;
    //线路中心线坐标X
    private double roadMiddleX;
    //线路中心坐标Y
    private double roadMiddleY;
    //横坡值
    private double pz;
    //设计高程
    private double designH;
    //护栏内侧到线路中心线距离E
    private double e;
    //线路中心线距离桥面边缘F
    private double f;
    //节段宽度
    private double d;
    //左边分幅
    private String v;
    //是否起始节段线Y
    private String y;


    public int getFlowNum() {
        return flowNum;
    }

    public void setFlowNum(int flowNum) {
        this.flowNum = flowNum;
    }

    public double getRoadMiddleX() {
        return roadMiddleX;
    }

    public void setRoadMiddleX(double roadMiddleX) {
        this.roadMiddleX = roadMiddleX;
    }

    public double getRoadMiddleY() {
        return roadMiddleY;
    }

    public void setRoadMiddleY(double roadMiddleY) {
        this.roadMiddleY = roadMiddleY;
    }

    public double getPz() {
        return pz;
    }

    public void setPz(double pz) {
        this.pz = pz;
    }

    public double getDesignH() {
        return designH;
    }

    public void setDesignH(double designH) {
        this.designH = designH;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "OneOneParam{" +
                "flowNum=" + flowNum +
                ", roadMiddleX='" + roadMiddleX + '\'' +
                ", roadMiddleY='" + roadMiddleY + '\'' +
                ", pz='" + pz + '\'' +
                ", designH='" + designH + '\'' +
                ", e='" + e + '\'' +
                ", f='" + f + '\'' +
                ", d='" + d + '\'' +
                ", v='" + v + '\'' +
                ", y='" + y + '\'' +
                '}';
    }
}
