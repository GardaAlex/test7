package com.test7;

public class Main {

    public static void main(String[] args) {
        sayHello("David");

        int x = sum(4,4);

        System.out.println(x);

        int ab =  abc(1,44);
        System.out.println(ab);

        Animal dog = new Animal();
        dog.bark();

        Car renault = new Car();
        renault.color();

        Utilaje UTB = new Utilaje();
        UTB.tractor();

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v1.color = "blue";
        v2.fuelCapacity = 100;
        System.out.print(v1.color + ". Rezervor de "+ v2.fuelCapacity);

        Cow fulga = new Cow();
        fulga.setColor("alba cu netru");
        System.out.println(fulga.getColor());

        Pasari porumbel = new Pasari("porumbel");

        System.out.println(porumbel);
    }
//////////////////////////////////////////////////////

    static void sayHello(String name){
     System.out.println("Nume: " + name);
    }
    // return
    public static int sum(int va1,int val2){
        return va1 + val2;
    }

    public static int abc(int a, int b){
        if(a>b){
            return a;
        } else{
            return b;
        }
    }
    // setter and getter
    public static class Cow{
        private String coloro;

        public String getColor(){
            return coloro;
        }
        public void setColor(String c){
            this.coloro = c;
        }
    }

    // constructors

    public static class Pasari{
        private String color;
        Pasari(String c){
            color = c;
        }
    }
}


