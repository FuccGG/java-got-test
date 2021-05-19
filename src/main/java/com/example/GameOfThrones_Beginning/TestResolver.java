package com.example.GameOfThrones_Beginning;
import static java.lang.Math.*;

public class TestResolver {
    public static int GetID(int firstAnswer, int secondAnswer, int thirdAnswer, int fourthAnswer)
    {
        int differenceWithID = 1;
        int result = (int) (firstAnswer*pow(2,3)+secondAnswer*pow(2,2)+thirdAnswer*pow(2,1)+fourthAnswer*pow(2,0));

        return result + differenceWithID;
    }
}
