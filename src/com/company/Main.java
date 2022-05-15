package com.company;

public class Main {


    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Shark(),
                                        new Turtle(),
                                        new Eagle()};

        Shark[] sharks = new Shark[2];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];


        for (Animal array : animals) {
            /**
            * Тапшырманын шартында getClass() жана instanceof() колдонуш керек деп жазылган
            */
            if (array.getClass().getName().equals("com.company.Shark")){   /** использовал getClass() */
                ((Shark) array).attack();
                sharks[0]= (Shark) array;
                System.out.println(sharks[0]);
            }
            else if (array instanceof Turtle){                               /** использовал instanceof() */
                ((Turtle) array).swim();
                turtles[0] = (Turtle) array;
                System.out.println(turtles[0]);
            }
            else if (array instanceof Eagle){
                ((Eagle) array).fly();
                eagles[0] = (Eagle) array;
                System.out.println(eagles[0]);
            }
        }
    }
}
