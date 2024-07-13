package com.company;

import com.test.Testing;

public class Main extends Testing {

    @Override
    public Main method1()
    {
        return new Main();
    }

    public static void main(String[] args) {
	Main obj = new Main();
	System.out.println(obj.method1());
    }
}
