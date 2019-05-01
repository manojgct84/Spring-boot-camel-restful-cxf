package com.bac.novell.word;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class MaxDuplicateWordCount {

	public static void wordCount(String word) {

		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		List<String> punctuation = new ArrayList<String>();
		punctuation.add(",");
		punctuation.add(";");
		punctuation.add("!");
		punctuation.add("?");

		String[] st = word.split(" ");
		// StringTokenizer st = new StringTokenizer(word, "");

		for (int i = 0; i < st.length; i++) {
			char temp = 0;
			int index = 0;
			String str = null;
			StringBuilder sb = new StringBuilder();
			//if (punctuation.contains(st[i])) {
				while (index < st[i].length()) {
					temp = st[i].charAt(index);
					System.out.println("temp:" + temp);
					if (!(temp == ';') && !(temp == ',')) {
						sb.append(temp);
					}
					index++;
				}
			//}
			str = st[i];
			if (sb != null) {
				str = sb.toString();
			}
			if (wordCount.containsKey(str)) {
				int duplicate = wordCount.get(str);
				
				wordCount.put(str,++duplicate );

			} else {
				int count = 0;
				wordCount.put(str, ++count);
			}

		}

		for (Entry<String, Integer> wordMap : wordCount.entrySet()) {

			System.out.println("Word:" + wordMap.getKey() + "-->" + wordMap.getValue());
		}

	}

	public static void main(String[] args) {

		String str = "I am a good boy; i am done, my word , done? the word";
		wordCount(str);

	}

}
