package entity;

/**
 * Copyright (c) 2017 Guangdong Sun Railway Information Technology, Inc.
 * All rights reserved.
 *
 * @author shanchanglu
 * Description: 返回类
 * Changelog:
 * Revision 1.0  2018/5/22 shanchanglu
 */
public class Result {

    private int flowNum;
    private double ix;
    private double iy;
    private double iz;
    private double iix;
    private double iiy;
    private double iiz;
    private double iiix;
    private double iiiy;
    private double iiiz;

    public int getFlowNum() {
        return flowNum;
    }

    public void setFlowNum(int flowNum) {
        this.flowNum = flowNum;
    }

    public double getIx() {
        return ix;
    }

    public void setIx(double ix) {
        this.ix = ix;
    }

    public double getIy() {
        return iy;
    }

    public void setIy(double iy) {
        this.iy = iy;
    }

    public double getIz() {
        return iz;
    }

    public void setIz(double iz) {
        this.iz = iz;
    }

    public double getIix() {
        return iix;
    }

    public void setIix(double iix) {
        this.iix = iix;
    }

    public double getIiy() {
        return iiy;
    }

    public void setIiy(double iiy) {
        this.iiy = iiy;
    }

    public double getIiz() {
        return iiz;
    }

    public void setIiz(double iiz) {
        this.iiz = iiz;
    }

    public double getIiix() {
        return iiix;
    }

    public void setIiix(double iiix) {
        this.iiix = iiix;
    }

    public double getIiiy() {
        return iiiy;
    }

    public void setIiiy(double iiiy) {
        this.iiiy = iiiy;
    }

    public double getIiiz() {
        return iiiz;
    }

    public void setIiiz(double iiiz) {
        this.iiiz = iiiz;
    }

    @Override
    public String toString() {
        return "Result{" +
                "flowNum=" + flowNum +
                ", ix='" + ix + '\'' +
                ", iy='" + iy + '\'' +
                ", iz='" + iz + '\'' +
                ", iix='" + iix + '\'' +
                ", iiy='" + iiy + '\'' +
                ", iiz='" + iiz + '\'' +
                ", iiix='" + iiix + '\'' +
                ", iiiy='" + iiiy + '\'' +
                ", iiiz='" + iiiz + '\'' +
                '}';
    }
}
