package com.enumexample;

public enum Directions {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");


    private final String show;

    Directions(String show) {
        this.show = show;
    }

    public String getShow() {
        return show;
    }

    public static void main(String[] args) {
       Directions d=Directions.EAST;
      String s= d.getShow ();
        System.out.println (s);

        for (Directions dir:Directions.values ()) {
            System.out.println (dir);
        }
    }
}


