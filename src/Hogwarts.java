public class Hogwarts {
    private final String name;
    private final int powerWitchcraft;
    private final int transgression;

    public Hogwarts(String name, int powerWitchcraft, int transgression) {
        this.name = name;
        this.powerWitchcraft = powerWitchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getPowerWitchcraft() {
        return powerWitchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", powerWitchcraft=" + powerWitchcraft +
                ", transgression=" + transgression;
    }

    private int finalScore() {
        return powerWitchcraft + transgression;
    }

    public void powerfullStudent(Hogwarts all) {
        if (this.finalScore() > all.finalScore()) {
            System.out.println(this.name + " обладает бОльшей мощностью магии, чем " + all.name);
        } else if (finalScore() < all.finalScore()){
            System.out.println(this.name + " слабее чем " + all.name);
        } else {
            System.out.println("Сила волшебников равна");
        }
    }

}
