public class GrosPoisson {
    private int posX;
    private int posY;
    private double vitesseX;
    public GrosPoisson(int posX, int posY, double vitesseX) {
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
        dessin.ajouteChaine(posX, posY, "; ,//; , ,;/", couleur);
        dessin.ajouteChaine(posX, posY-1, "o :::::::;;////", couleur);
        dessin.ajouteChaine(posX, posY-2, ">::::::::;;\\\\", couleur);
        dessin.ajouteChaine(posX, posY-3, "’ ’ \\\\\\ ’\" ’ ;", couleur);
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
