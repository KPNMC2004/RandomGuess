import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {
        // Create an empty variable for userInput
        int userInput;

        // Generate a random number within the interval [1, 10]
        int answer = 1 + (int) (Math.random() * 10);

        int guess = 3;
        JOptionPane.showMessageDialog(null, "You have " + guess + " guesses");
        while (guess > 0) {

            if (guess != 3) {
                JOptionPane.showMessageDialog(null, "You have " + guess + " guesses left");
            }
            // Create an input dialog box that asks for user input
            while (true) {
                        try {
                            userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Think of a number between 1 and 10:"));

                            // Checks user input
                            // Discard when input is too high
                            if (userInput > 10) {
                                System.out.println("Value is too high");
                                continue;
                            }
                            // Discard when input is too low (less than one)
                            if (userInput <= 0) {
                                System.out.println("Value is too low");
                            }

                            // Otherwise, accept the input
                            else {
                                JOptionPane.showMessageDialog(null, "Your guess is : " + userInput);
                                break;
                            }
                        } catch (NumberFormatException e) {
                            // Anytime an NumberFormatException occurs run this block
                            JOptionPane.showMessageDialog(null, e);
                } /*catch () {
            }*/
            }
            if (userInput == answer) {
                    JOptionPane.showMessageDialog(null, "You won!");
                    break;
            }
            if (userInput > answer) {
                JOptionPane.showMessageDialog(null, "Your guess " + userInput + " is too high");
                guess--;
            }
            if (userInput < answer) {
                JOptionPane.showMessageDialog(null, "Your guess " + userInput + " is too low");
                guess--;
            }
        }

        if (guess == 0) {
            JOptionPane.showMessageDialog(null, "You lost, the answer is: " + answer);
        }
    }
}