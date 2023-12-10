import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter =
                new Gryffindor("Гарри Поттер", 1,5, 1, 1, 1);
        Gryffindor germionaGrainger =
                new Gryffindor("Гермиона Греинджер", 1, 4, 2, 1, 1);
        harryPotter.powerfullOfGryffindor(germionaGrainger);
        harryPotter.powerfullStudent(germionaGrainger);

        Hufflepuff zachariahSmith =
                new Hufflepuff("Захария Смитт", 1, 3, 1, 1, 1);
        Hufflepuff cedricDiggory =
                new Hufflepuff("Седриг Диггори", 1, 1, 1, 2, 1);

        zachariahSmith.powerfullOfHufflepuff(cedricDiggory);
        zachariahSmith.powerfullStudent(cedricDiggory);


        Slytherin dracoMalfoy =
                new Slytherin("Драко Малфой",1,2,1,1,1,1,1);
        Slytherin gregoryGoyle =
                new Slytherin("Грегори Гоил", 1, 1, 1, 1, 1, 1, 1);
        dracoMalfoy.powerfullOfSlytherin(gregoryGoyle);
        dracoMalfoy.powerfullStudent(gregoryGoyle);


        Kogtervan zhouChang =
                new Kogtervan("Чжоу Чанг", 1, 1, 1, 1, 1);
        Kogtervan padmaPatil =
                new Kogtervan("Падма Патил", 1, 1, 2, 1, 1);
        zhouChang.powerfullOfKogtervan(padmaPatil);
        zhouChang.powerfullStudent(padmaPatil);

        harryPotter.powerfullStudent(dracoMalfoy);

    }
}






