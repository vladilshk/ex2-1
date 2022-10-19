package com.example.ex21._2beerApp;

public class Beer {
    private String taste;
    private String country;
    private String alcoholic;
    private boolean light;
    private boolean dark;
    private boolean fruit;
    private boolean russian;
    private boolean nonAlcoholic;

    public Beer(String taste, String country, String alcoholic) {
        this.taste = taste;
        this.country = country;
        this.alcoholic = alcoholic;
        setParams();
    }

    public void setParams() {
        //taste
        if (taste.equals("light"))
            light = true;
        else if (taste.equals("dark"))
            dark = true;
        else
            fruit = true;

        //country
        if (country.equals("russian"))
            russian = true;

        //alcohol
        if (alcoholic.equals("Yes"))
            nonAlcoholic = true;
    }

    public String chooseBeer(){
        //essa
        if(light){
            if (russian){
                if (nonAlcoholic){
                    return "baltica 0";
                }
                else {
                    return "zigulovskoe";
                }
            }
            else {
                if (nonAlcoholic){
                    return "smth";
                }
                else {
                    return "krushovece";
                }
            }
        }



        if (dark){
            if (russian){
                if (nonAlcoholic){
                     return "Ohota porter";
                }
                else {
                    return "Ohota krepkoe dark";
                }
            }
            else {
                if (nonAlcoholic){
                    return "Krushovice zero";
                }
                else {
                    return "Leugarden";
                }
            }
        }

        if(fruit){
            if (russian){
                if (nonAlcoholic){
                    return "baltica 0 Raspberry";
                }
                else {
                    return "baltica 9 Cherry";
                }
            }
            else {
                if (nonAlcoholic){
                    return "Essa zero";
                }
                else {
                    return "essa";
                }
            }
        }

        return "beer not found";
    }
}
