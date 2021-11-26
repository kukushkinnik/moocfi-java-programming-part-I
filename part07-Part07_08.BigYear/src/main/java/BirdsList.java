import java.util.ArrayList;

public class BirdsList {
    private Bird bird;
    private final ArrayList<Bird> birdsLibrary;

    public BirdsList() {
        this.birdsLibrary = new ArrayList<>();
    }

    public void add(String name, String nameInLatin) {
        if (checkList(name)) {
            System.out.println("This bird already in list!");

        } else {
            this.bird = new Bird();
            this.bird.setBirdName(name);
            this.bird.setBirdNameInLatin(nameInLatin);
            birdsLibrary.add(this.bird);
        }
    }

    public void all() {
        for (Bird br : birdsLibrary) {
            System.out.println(br.getBirdName() + " (" + br.getBirdNameInLatin() + "): " + br.getObservation() + " observation");
        }
    }

    public void one(String name) {
        for (Bird br : birdsLibrary) {
            if (name.equals(br.getBirdName())) {
                System.out.println(br.getBirdName() + " (" + br.getBirdNameInLatin() + "): " + br.getObservation() + " observation");
            }
        }
    }

    public void observe(String name) {
        for (Bird br : birdsLibrary) {
            if (name.equals(br.getBirdName())) {
                br.increaseObesravation();
            }
        }
    }

    public boolean checkList(String name) {
        boolean exist = false;
        for (Bird br : birdsLibrary) {
            if (name.equals(br.getBirdName())) {
                exist = true;
                break;
            }
        }
        return exist;
    }


}
