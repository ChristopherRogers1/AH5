

public class Solution {
    public static void main(String[] args) {

        System.out.println(mostFrequentChar("eleventennine"));

    }

    public static char mostFrequentChar(String input)
    {
        int highestCount=0, currentCount=0;
        char highestChar = input.charAt(0), currentChar;
        for (int i = 0; i < input.length(); i++)
        {
            currentChar = input.charAt(i);
            for (int n = 0; n < input.length(); n++)
            {
                if (currentChar == input.charAt(n))
                {
                    currentCount++;
                }
            }
            if (currentCount > highestCount)
            {
                highestCount = currentCount;
                highestChar = currentChar;
            }
            currentCount=0;
        }
        return highestChar;
    }
}
