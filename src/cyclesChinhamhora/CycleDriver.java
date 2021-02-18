package cyclesChinhamhora;

/**************************************************************
 * Name        : Abstract Class Driver class
 * Author      : Rumbi Chinhamhora
 * Created     : 1/31/2021
 * Course      : CIS 152 Data Structures
 * Language    : Java
 * Version     : 1.0
 * OS          : Windows 10
 * Copyright   : This is my own original work based on
 *               specifications issued by our instructor
 * Description : This program overall description here
 *               Input:  list and describe
 *               Output: list and describe
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or
 * unmodified. I have not given other fellow student(s) access to
 * my program.
 ***************************************************************/
public class CycleDriver {
    public static void main( String[] args ) {
        new CycleDriver().go();
    }

    private void go() {
        Bicycle bicycle = new Bicycle(2, 0);
        System.out.println(bicycle);
        System.out.println(bicycle.ride());
        System.out.println(bicycle.stop());
        bicycle.setNumberOfFlats(1);
        System.out.println(bicycle);
    }
}
