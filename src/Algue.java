public class Algue {
    private int posX;
    private boolean ondule;
    public Algue(int posX) {
        this.posX=posX;
        this.ondule=true;
    }
    public void ondule() {
        if (this.ondule==true) {
            this.ondule=false;
        }
        else if(this.ondule==false) {
            this.ondule=true;
        }
    }
    public Dessin getDessin() {
        Dessin dessin = new Dessin();
        String couleur="0x0000F0";
        if (this.ondule==true) {
            dessin.ajouteChaine(posX, 0+3, "(", couleur);
            dessin.ajouteChaine(posX, 0+2, ")", couleur);
            dessin.ajouteChaine(posX, 0+1, "(", couleur);
            dessin.ajouteChaine(posX, 0, ")", couleur);
            return dessin;
        }
        dessin.ajouteChaine(posX, 0+3, ")", couleur);
        dessin.ajouteChaine(posX, 0+2, "(", couleur);
        dessin.ajouteChaine(posX, 0+1, ")", couleur);
        dessin.ajouteChaine(posX, 0, "(", couleur);
        return dessin;
    }
}
