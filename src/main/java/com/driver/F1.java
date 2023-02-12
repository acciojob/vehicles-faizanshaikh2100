package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {

        super(name,4,4,5,isManual,name,4);

    }

    public void accelerate(int rate){

       int newSpeed = getCurrentSpeed()+rate;
        if(newSpeed >0 && newSpeed <=50){
            changeGear(1);
        }
        else if((newSpeed>=51 && newSpeed <=100)){
            changeGear(2);

        }else if((newSpeed>=101 && newSpeed <=150)){
            changeGear(3);
        }
        else if((newSpeed>=151 && newSpeed <=200)){
            changeGear(4);
        }
        else if((newSpeed>250)){
            changeGear(5);
        }
        else if(newSpeed == 0) {
            //Stop the car, set gear as 0
            changeGear(1);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
