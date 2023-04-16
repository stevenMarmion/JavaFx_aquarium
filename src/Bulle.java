public class Bulle {
    private int posX;
    private int posY;
    private double vitesse;
    public Bulle(int posX, int posY, double vitesse) {
        this.posX=posX;
        this.posY=posY;
        this.vitesse=vitesse;
    }
    public void remonte() {
        this.posY+=this.vitesse;
    }
    public Dessin getDessin() {
        Dessin dessin = new Dessin();
        String couleur="0x0000F0";
        dessin.ajouteChaine(posX, posY, ".", couleur);
        return dessin;
    }
    public Dessin changeDessin() {
        Dessin dessin = new Dessin();
        String couleur="0x0000F0";
        dessin.ajouteChaine(posX, posY, "O", couleur);
        return dessin;
    }
    public int getPosY() {
        return this.posY;
    }
    public int getPosX() {
        return this.posX;
    }
    public void recommence() {
        this.posY=0;
    }
}
