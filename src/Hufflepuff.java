public class Hufflepuff extends Hogwarts{
    public int industriousness;
    public int loyalty;
    public int honesty;

    public Hufflepuff(String name, int powerWitchcraft, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, powerWitchcraft, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "industriousness=" + industriousness +
                ", loyalty=" + loyalty + ", honesty=" + honesty;
    }

    private int finalScore(){
        return industriousness + loyalty + honesty;
    }

    public void powerfullOfHufflepuff(Hufflepuff all) {
        if (this.finalScore() > all.finalScore()) {
            System.out.println(this.getName() + " сильнее чем " + all.getName());
        } else if (finalScore() < all.finalScore()){
            System.out.println(this.getName() + " слабее чем " + all.getName());
        } else {
            System.out.println("Сила волшебников равна");
        }
    }

}
