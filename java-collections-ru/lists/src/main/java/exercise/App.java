package exercise;

import org.apache.commons.lang3.StringUtils;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;

public class App {

	    public static Boolean scrabble(String symbols, String word)  {
		            var symbolsS = symbols.toLowerCase().split("");
			            var wordS = word.toLowerCase().split("");
				            LinkedList<String> symbolsSL = new LinkedList<>(Arrays.asList(symbolsS));
					            LinkedList<String> wordSL = new LinkedList<>(Arrays.asList(wordS));

						            String t;
							            while ((t = wordSL.poll()) != null) {
									                if (!symbolsSL.remove(t)) {
												                return false;
														            }
											        }

								            return true;
									        }
}
