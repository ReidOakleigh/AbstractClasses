package cyclesChinhamhora;

/**
 * @author Chinhamhora
 * Date: 1/31/21
 * Time: 10:58 PM
 */
public abstract class Cycle {
    private int numberOfTires;
    private int numberOfFlats;

    public Cycle( int numberOfTires, int numberOfFlats ) {
        this.numberOfTires = numberOfTires;
        this.numberOfFlats = numberOfFlats;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires( int numberOfTires ) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfFlats() {
        return numberOfFlats;
    }

    public void setNumberOfFlats( int numberOfFlats ) {
        this.numberOfFlats = numberOfFlats;
    }

    abstract String ride();
    abstract String stop();

    @Override
    public String toString() {
        return "Cycle{" +
            "numberOfTires=" + numberOfTires +
            ", numberOfFlats=" + numberOfFlats +
            '}';
    }
}
