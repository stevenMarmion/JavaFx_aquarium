import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private Dessin dessin;
    private List<Bulle> listBulle;
    private List<PetitPoisson> listPetitPoisson;
    private List<GrosPoisson> listGrosPoisson;
    private List<Algue> listAlgues;
    private Texte t;
    public Aquarium() {
        this.dessin = new Dessin();
        this.listBulle = new ArrayList<>();
        listBulle.add(new Bulle(20, 26, 1));
        listBulle.add(new Bulle(60, 2, 3));
        listBulle.add(new Bulle(80, 0, 2));
        listBulle.add(new Bulle(10, 5, 2));
        listBulle.add(new Bulle(40, 20, 2));
        listBulle.add(new Bulle(100, 3, 2));
        listBulle.add(new Bulle(35, 2, 2));
        this.listPetitPoisson = new ArrayList<>();
        listPetitPoisson.add(new PetitPoisson(5, 5, 1));
        listPetitPoisson.add(new PetitPoisson(20, 20, 3));
        listPetitPoisson.add(new PetitPoisson(30, 10, 1));
        listPetitPoisson.add(new PetitPoisson(49, 49, 5));
        listPetitPoisson.add(new PetitPoisson(70, 60, 1));
        listPetitPoisson.add(new PetitPoisson(90, 20, 3));
        this.listGrosPoisson = new ArrayList<>();
        listGrosPoisson.add(new GrosPoisson(15, 15, 3));
        listGrosPoisson.add(new GrosPoisson(70, 40, 2));
        listGrosPoisson.add(new GrosPoisson(12, 26, 3));
        this.listAlgues = new ArrayList<>();
        listAlgues.add(new Algue(2));
        listAlgues.add(new Algue(10));
        listAlgues.add(new Algue(25));
        listAlgues.add(new Algue(100));
        listAlgues.add(new Algue(50));
        listAlgues.add(new Algue(35));
        listAlgues.add(new Algue(80));
        listAlgues.add(new Algue(70));
        this.t= new Texte(40, 45);
    }
    public int getHauteur(){
        return 50;
    }
    public int getLargeur(){
        return 120;
    }
    public Dessin getDessin() {
        Dessin dessin = new Dessin();
        for (Bulle b: listBulle) {
            dessin.union(b.getDessin());
            if (b.getPosY()>=this.getHauteur()/2) {
                dessin.union(b.changeDessin());
            }
        }
        for (PetitPoisson pP: listPetitPoisson) {
            dessin.union(pP.getDessin());
        }
        for (GrosPoisson gP: listGrosPoisson) {
            dessin.union(gP.getDessin());
        }
        for (Algue a: listAlgues) {
            dessin.union(a.getDessin());
        }
        dessin.union(this.t.getDessin());
        return dessin;
    }
    public void evolue() {
        for (Bulle b: listBulle) {
            b.remonte();
            if (b.getPosY()>=this.getHauteur()) {
                b.recommence();
            }
        }
        for (PetitPoisson pP: listPetitPoisson) {
            pP.nage();
            if (pP.getPosX()>=this.getLargeur()) {
                pP.changeDirection();
            }
            if (pP.getPosX()<=0) {
                pP.changeDirection();
            }
        }
        for (GrosPoisson gP: listGrosPoisson) {
            gP.nage();
            if (gP.getPosX()>=this.getLargeur()) {
                gP.changeDirection();
            }
            if (gP.getPosX()<=0) {
                gP.changeDirection();
            }
        }
        for (Algue a: listAlgues) {
            a.ondule();
        }
    }
}