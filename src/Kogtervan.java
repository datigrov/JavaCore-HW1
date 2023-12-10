public class Kogtervan extends Hogwarts{
    public int wisdom;
    public int wit;
    public int creative;

    public Kogtervan(String name, int powerWitchcraft, int transgression, int wisdom, int wit, int creative) {
        super(name, powerWitchcraft, transgression);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreative() {
        return creative;
    }

    @Override
    public String toString() {
        return super.toString() + "wisdom=" + wisdom +
                ", wit=" + wit + ", creative=" + creative;
    }

    private int finalScore(){
        return wisdom + wit + creative;
    }

    public void powerfullOfKogtervan(Kogtervan all) {
        if (this.finalScore() > all.finalScore()) {
            System.out.println(this.getName() + " сильнее чем " + all.getName());
        } else if (finalScore() < all.finalScore()) {
            System.out.println(this.getName() + " слабее чем " + all.getName());
        } else {
            System.out.println("Сила волшебников равна");
        }

    }
}
