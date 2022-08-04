package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        if ((long) numberToBeRounded <= (numberToBeRounded - 0.5)){
        System.out.println((long) numberToBeRounded + 1);
        } else {
            System.out.println((long) numberToBeRounded);
        }

    }
}
