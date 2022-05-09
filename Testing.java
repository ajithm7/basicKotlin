package com.kotlindemo;

import java.io.IOException;

public class Testing {
    public static  void main(String[] args){
        System.out.println( BasicKt.sum(5));
       try{
    ExceptionAsExp.throwAnnotation();
    }catch(IOException e){

        }
}}
