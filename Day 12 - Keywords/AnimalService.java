public class AnimalService {
    Animal myAnimal;

    public AnimalService(){
        myAnimal = new Animal();
    }

    public void changeAnimalName(String name){
        myAnimal.setName(name);
    }
}
