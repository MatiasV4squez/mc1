package org.proyecto;



import java.awt.*;

class Animal extends Organismo{

    protected String nombre;

    public Animal(int Posx, int Posy, int life, int energia, int speed, String nom){
        super(Posx,Posy, life, energia,speed);
        this.nombre = nom;
    }

    @Override
    public String ShowInfo(){
        return super.ShowInfo() + "\nNombre del animal";
    }

}


