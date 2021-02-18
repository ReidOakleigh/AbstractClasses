package cyclesChinhamhora;

/**
 * @author Rumbi Chinhamhora
 * Date: 1/31/21
 * Time: 11:01 PM
 */
public class Bicycle extends Cycle {

    public Bicycle( int numberOfTires, int numberOfFlats ) {
        super(numberOfTires, numberOfFlats);
    }

    @Override
    String ride() {
        return "Riding " + this.getClass().getSimpleName();
    }

    @Override
    String stop() {
        return "Stopping " + this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Bicycle: " + super.toString();
    }
}
