package com.brocode;

public class Polymorphism {
    public static void main(String[] args){
        // polymorphism = greek word for poly-"many", morph-"form"
        //                The ability of an object to identify as more than one type


        Store store=new Store();
        Stock stock=new Stock();
        Save save=new Save();

        Stay[] racers={store,stock,save};

        //store.go();
        //stock.go();
        //save.go();

        for(Stay x:racers){
            x.go();
        }
    }
}
