package com.test;

class Animal {
    Animal reproduce() {
        System.out.println("Animal reproducing...");
        return new Animal();
    }
    public int integr(String y) {
        int o = 29;
        return o;
    }
}

class Dog extends Animal {
    @Override
    Dog reproduce() {
        System.out.println("Dog reproducing...");
        return new Dog();
    }
        public String integrr(String x)
    {
        x=x+"yes";
        return x+"yes";
    }
}

class sync
{
    public static void main (String[] args) {
        Animal x = new Dog();
        Animal y = new Animal();
        System.out.println(y.reproduce().integr(""));
    }
}