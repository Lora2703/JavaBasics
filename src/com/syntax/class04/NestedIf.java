package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=true;
		int dose=1;
		if (vaccine) {
			System.out.println("Let me check how many doses you have");
			if(dose==1) {
				System.out.println("You need 1 more shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
			
		}
		
		String month="May";
		int day=8;
		
		if (month.equals("May")) {
			System.out.println("Let me check day in May");
			if(day==8) {
				System.out.println("Today is a Mother's Day");
			}
		}else if (month.equals("June")) {
			System.out.println("Let me check day in June");
			if (day==19) {
				System.out.println("Today is Father's Day");
			}
		}

	}

}
