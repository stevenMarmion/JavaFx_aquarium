public class Texte {
    private int posX;
    private int posY;
    public Texte(int posX, int posY) {
        this.posX=posX;
        this.posY=posY;
    }
    public Dessin getDessin() {
        Dessin dessin = new Dessin();
        String couleur="0x0000F0";
        dessin.ajouteChaine(posX, posY, "+---------------------------+", couleur);
        dessin.ajouteChaine(posX, posY+1, "|                           |", couleur);
        dessin.ajouteChaine(posX, posY+2, "|   L'Aquarium de Steven    |", couleur);
        dessin.ajouteChaine(posX, posY+3, "|                           |", couleur);
        dessin.ajouteChaine(posX, posY+4, "+---------------------------+", couleur);
        return dessin;
    }
}
