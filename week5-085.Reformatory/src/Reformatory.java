public class Reformatory {
    private int numberofWeights = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.numberofWeights++;
        return person.getWeight();
    }
    
    public void feed (Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.numberofWeights;
    }

}
