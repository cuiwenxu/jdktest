package com.jdktest;

import org.openjdk.jol.info.ClassLayout;

public class ObjectLayout {

    public static void main(String[] args) {
        Object o =new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        synchronized (o){
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }

}
