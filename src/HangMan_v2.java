import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HangMan_v2 {

  // adam asmaca
  public static void main(String[] args) throws FileNotFoundException {
    String[] wordsFromFile = new String[4];
    Scanner scText = new Scanner(new File("src/kelimeler.txt"));
    int counter = 0;
    while (scText.hasNext()) {
      wordsFromFile[counter] = scText.nextLine();
      counter++;
      // split ',' ilede kelimeleri alabiliriz.
    }

    String word = wordsFromFile[(int) (Math.random() * wordsFromFile.length)];
    char[] hiddenWord = new char[word.length()];
    Arrays.fill(hiddenWord, '_');
    //for (int i = 0; i < hiddenWord.length; i++) {
    //  hiddenWord[i] = '_';
    //}
    // app__
    int wrongGuessCount = 0;
    Scanner sc = new Scanner(System.in);
    while (wrongGuessCount < 6 && new String(hiddenWord).contains("_")) {
      drawHangman(wrongGuessCount);
      System.out.println(hiddenWord);
      System.out.println("Bir harf tahmin edin: ");
      char guess = sc.next().charAt(0);
      boolean found = false;
      for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) == guess) {
          // apple
          // app__
          hiddenWord[i] = guess;
          found = true;
        }
      }
      if (!found) {
        wrongGuessCount++;
      }
      System.out.println(hiddenWord);
      System.out.println();
    } // while bitiş
    if (wrongGuessCount == 6) {
      System.out.println("Kaybettiniz!, kelime : " + word);
    } else {
      System.out.println("Kazandınız!, kelime : " + word);
    }
  }

  public static void drawHangman(int wrongGuessCount) {
    System.out.println("Yanlış tahmin sayınız: " + wrongGuessCount);
    switch (wrongGuessCount) {
      case 0:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 1:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 2:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("   |   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 3:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("  /|   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 4:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("  /|\\  |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 5:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("  /|\\  |");
        System.out.println("  /    |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 6:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("  /|\\  |");
        System.out.println("  / \\  |");
        System.out.println("       |");
        System.out.println("=========");
        break;
    }
  }
}
/*

switch (wrongGuessCount) {
      case 0:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 1:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 2:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("   |   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 3:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("  /|   |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 4:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("  /|\\  |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 5:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("  /|\\  |");
        System.out.println("  /    |");
        System.out.println("       |");
        System.out.println("=========");
        break;
      case 6:
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println("   O   |");
        System.out.println("  /|\\  |");
        System.out.println("  / \\  |");
        System.out.println("       |");
        System.out.println("=========");
        break;
    }
 */