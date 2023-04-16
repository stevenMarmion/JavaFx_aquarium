public class PetitPoisson {
    private int posX;
    private int posY;
    private double vitesseX;
    public PetitPoisson(int posX, int posY, double vitesseX) {
        this.posX=posX;
        this.posY=posY;
        this.vitesseX=vitesseX;
    }
    public void nage() {
        this.posX+=vitesseX;
    }
    public Dessin getDessin() {
        Dessin dessin = new Dessin();
        String couleur="0x0000F0";
        if (this.vitesseX>0) {
            dessin.ajouteChaine(posX, posY, "><>", couleur);
            return dessin;
        }
        dessin.ajouteChaine(posX, posY, "<><", couleur);
        return dessin;
    }
    public int getPosX() {
        return this.posX;
    }
    public int getPosY() {
        return this.posY;
    }
    public void changeDirection() {
        this.vitesseX*=-1;
    }
}
