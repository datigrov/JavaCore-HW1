public class Slytherin extends Hogwarts {
    public int theTrick;
    public int determination;
    public int ambition;
    public int resourcefulness;
    public int thirstForPower;

    public Slytherin(String name, int powerWitchcraft, int transgression, int theTrick, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, powerWitchcraft, transgression);
        this.theTrick = theTrick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getTheTrick() {
        return theTrick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    private int finalScore(){
        return theTrick + determination + ambition + resourcefulness + thirstForPower;
    }

    public void powerfullOfSlytherin(Slytherin all) {
        if (this.finalScore() > all.finalScore()) {
            System.out.println(this.getName() + " сильнее чем " + all.getName());
        } else if (finalScore() < all.finalScore()) {
            System.out.println(this.getName() + " слабее чем " + all.getName());
        } else {
            System.out.println("Сила волшебников равна");
        }

    }

    @Override
    public String toString() {
        return super.toString() + "theTrick=" + theTrick + ", determination=" + determination +
                ", ambition=" + ambition + ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower;
    }
}
