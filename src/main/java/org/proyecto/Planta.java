package org.proyecto;



class Planta extends Organismo{
    protected String nombre;

    public Planta (int Posx, int Posy, int life, int energia, int speed, String nom) {
        super(Posx,Posy, life, energia,speed);
        this.nombre = nom;
    }

    @Override
    public String ShowInfo(){
        return super.ShowInfo() +
                "\nNombre de la planta " + nombre;
    }

}
