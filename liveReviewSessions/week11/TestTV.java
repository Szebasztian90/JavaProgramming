package week11;

import java.util.ArrayList;

public class TestTV {
    public static void main(String[] args) {

        // we will create a TV object

        TV Samsung = new TV(); //new keyword invokes our constructor with no parameters and creates my objects
        System.out.println(Samsung.toString());

        Samsung.turnOn();
        Samsung.setChannel(7);
        Samsung.setVolumeLevel(3);
        System.out.println(Samsung); //toString is redundant


        TV LG = new TV();
        LG.setVolumeLevel(5);
        LG.setChannel(10);
        System.out.println(LG.toString());

        LG.turnOn();
        LG.setVolumeLevel(5);
        LG.setChannel(10);
        System.out.println(LG.toString());

        System.out.println("--------------------------------------");

        TV Sony = new TV(3,5,false);
        System.out.println(Sony);



        //ArrayList
        ArrayList<TV> tvList = new ArrayList<>();
        tvList.add(Samsung);
        tvList.add(LG);
        tvList.add(Sony);

        for( TV eachTV : tvList){ //eachTV: becomes object reference for our TV objects
            System.out.println("Is the Tv on? " + eachTV.on);
        }


    }


}
