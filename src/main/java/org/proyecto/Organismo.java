package org.proyecto;

class Organismo {

    protected int PosicionX;
    protected int PosicionY;
    protected int vida;
    protected int stamina;
    protected int velocidad;

    public  Organismo(int Posx, int Posy, int life, int energia, int speed){
        this.PosicionX = Posx;
        this.PosicionY = Posy;
        this.vida = life;
        this.stamina = energia;
        this.velocidad = speed;
    }


    public String ShowInfo() {
        return "Posicion del en el ambiente : ("+PosicionX+", "+PosicionY+")"+
                "\nPuntos de vida : "+ vida +
                "\nPuntos de energia : " + stamina +
                "\nVelocidad : "+ velocidad;
    }

}
