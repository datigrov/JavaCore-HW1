public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerWitchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, powerWitchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    private int finalScore(){
        return nobility + honor + bravery;
    }

    public void powerfullOfGryffindor(Gryffindor all) {
        if (this.finalScore() > all.finalScore()) {
            System.out.println(this.getName() + " сильнее чем " + all.getName());
        } else if (finalScore() < all.finalScore()){
            System.out.println(this.getName() + " слабее чем " + all.getName());
        } else {
            System.out.println("Сила волшебников равна");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
