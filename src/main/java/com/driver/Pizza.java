package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheese=0;

    private int extraTopping=0;
    private int takeAway=0;

    private int BillGenerated=0;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        this.price=300;

        else
           this.price=400;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese==0) {
            price = price + 80;
            extraCheese = 1;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraTopping==0) {
            if(isVeg)
                price = price + 70;

            else
                price=price+120;

            extraTopping = 1;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAway==0) {
            takeAway = 1;
            price = price + 20;
        }
    }

    public String getBill(){
        // your code goes here
        if(BillGenerated==0) {
            if (isVeg)
                bill = "Base Price Of The Pizza : 300" + "\n";
            else
                bill = "Base Price Of The Pizza : 400" + "\n";

            if (extraCheese == 1)
                bill = bill + "Extra Cheese Added : 80" + "\n";

            if (extraTopping == 1) {
                if (isVeg)
                    bill = bill + "Extra Toppings Added : 70" + "\n";

                else
                    bill = bill + "Extra Toppings Added : 120" + "\n";
            }

            if (takeAway == 1)
                bill = bill + "Paperbag Added : 20" + "\n";

            bill = bill + "Total Price : " + price;
            return this.bill;
        }
        return "";
    }
}
