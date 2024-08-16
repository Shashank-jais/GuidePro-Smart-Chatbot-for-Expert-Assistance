package com.GuidePro;

import com.GuidePro.chat.ChatBot;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			ChatBot chatbot = new ChatBot(); 

			System.out.println("Welcome to the Travel Chatbot!");
			System.out.print("How can I assist you today? ");
			String input = scanner.nextLine();

			String response = chatbot.processInput(input);
			System.out.println(response);
		}
    }
}
