package entity;

/**
 * Copyright (c) 2017 Guangdong Sun Railway Information Technology, Inc.
 * All rights reserved.
 *
 * @author shanchanglu
 * Description:路中有超高参数实体类
 * Changelog:
 * Revision 1.0  2018/5/24 shanchanglu
 */
public class OneTwoParam {

    //参数序号
    private int flowNum;
    //线路中心线坐标X
    private double roadMiddleX;
    //线路中心坐标Y
    private double roadMiddleY;
    //直线段横坡Pz
    private double pz;
    //圆曲线横坡Py
    private double py;
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
    //缓和曲线节段线数L
    private int l;
    //道路转向T
    private String t;

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

    public double getPy() {
        return py;
    }

    public void setPy(double py) {
        this.py = py;
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

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "OneTwoParam{" +
                "flowNum=" + flowNum +
                ", roadMiddleX=" + roadMiddleX +
                ", roadMiddleY=" + roadMiddleY +
                ", pz=" + pz +
                ", py=" + py +
                ", designH=" + designH +
                ", e=" + e +
                ", f=" + f +
                ", d=" + d +
                ", v='" + v + '\'' +
                ", y='" + y + '\'' +
                ", l=" + l +
                ", t='" + t + '\'' +
                '}';
    }
}
