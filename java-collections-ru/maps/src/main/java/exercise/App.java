package exercise;

import java.util.HashMap;
import java.util.Map;

public class App {
	    public static Map<String, Integer> getWordCount(String sentence){
		            Map<String, Integer> result = new HashMap<>();
			            if (sentence.isEmpty()) {
					                return result;
							        }
				            var word = sentence.split(" ");
					            for (var w: word) {
							                result.merge(w, 1, Integer::sum);
									        }
						            return result;
							        }

	        public static String toString(Map<String, Integer> wordsCount) {
			        StringBuilder result = new StringBuilder("{");

				        for (var key: wordsCount.keySet()) {
						            result.append("\n  ").append(key).append(": ").append(wordsCount.get(key));
							            }
					        if (! wordsCount.isEmpty()) {
							            result.append("\n");
								            }
						        result.append("}");

							        return result.toString();
								    }
}
