package com.introinterface;

class TestInerface2 {
    public static void main(String[] args){
        Bank b=new SBI();
        System.out.println("ROI: "+b.rateOfInterest());
    }
}
