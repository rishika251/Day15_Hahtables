package com.bridgelabz.hashtables;

public class HahTableMain {
	public static void main(String[] args) {
		System.out.println("Wwlcome in Hash Tables program");
		HashTableImp1<String, Integer> hashImpl = new HashTableImp1();
		String message = "To be or not to be";
		String[] messageArray = message.toLowerCase().split(" ");

		for (String word : messageArray) {
			Integer value = hashImpl.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;
			hashImpl.add(word, value);

		}
		System.out.println(hashImpl);
	}
}

