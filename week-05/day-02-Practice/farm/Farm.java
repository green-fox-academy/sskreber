import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {

    List<Animal> animals;
    int freeCapacity;

    public Farm() {
        this.animals = new ArrayList<Animal>();
        this.freeCapacity = 100;
    }

    public Farm(int freeCapacity) {
        this.animals = new ArrayList<Animal>();
        this.freeCapacity = freeCapacity;
    }

    public void breed() {
        if (freeCapacity > 0) {
            Animal newAnimal = new Animal();
            animals.add(newAnimal);
            freeCapacity--;
        }
    }

    public void addAnimalToFarm(Animal animalName) {
        animals.add(animalName);
        freeCapacity--;
    }

    public void slaughter() {
        int[] hungerLevels = new int[animals.size()];
        for (int i = 0; i < animals.size(); i++) {
            hungerLevels[i] = animals.get(i).hunger;
        }
        Arrays.sort(hungerLevels);
        int animalsToSlaughter = 0;
        int i = 0;
        while (i < animals.size()) {
            if (animals.get(i).hunger == hungerLevels[0]) {
                animalsToSlaughter++;
                System.out.println("Slaughtering animal with hunger level " + animals.get(i).hunger);
                animals.remove(animals.get(i));
                freeCapacity -= animalsToSlaughter;
            } else {
                System.out.println("Keeping animal with hunger level " + animals.get(i).hunger);
                i++;
            }
        }
    }
}

