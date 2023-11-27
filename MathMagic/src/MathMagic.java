public class MathMagic {
    public static void main(String[] args) {

        int myNumber = 10;

        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println(stepSix);

//        Whichever number you use, you will end up wiith the same result.
//        I guess thats the magic of the math.

    }
}