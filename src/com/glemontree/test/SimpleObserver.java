package com.glemontree.test;

import java.util.Observable;
import java.util.Observer;

public class SimpleObserver implements Observer {

    public SimpleObserver(SimpleObservable so) {
        so.addObserver(this);
    }

    // 回调函数
    public void update(Observable o, Object arg) {
        System.out.println("Data has changed to " + ((SimpleObservable)o).getData());
    }

}
