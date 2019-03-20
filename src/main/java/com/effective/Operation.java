package com.effective;

import java.util.Arrays;

public enum Operation {
    PLUS("+"){
        @Override
        double apply(double x, double y) {
            return  x + y;
        }
    },
    MIMUS ("-"){
        @Override
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES ("*"){
        @Override
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        double apply(double x, double y) {
            return x / y;
        }
    };
    private final String sysmbol;

    Operation(String sysmbol){
        this.sysmbol = sysmbol;
    }

    @Override
    public String toString() {
        return sysmbol;
    }

    abstract double apply(double x, double y);


    public static void main(String[] args) {
        double x = 2.0;
        double y = 4.0;
        Arrays.asList(values()).forEach(o->{
            System.out.printf("%f %s %f = %f%n",x,o,y,o.apply(x,y));
        });
        System.out.printf(values().toString());
    }


}
