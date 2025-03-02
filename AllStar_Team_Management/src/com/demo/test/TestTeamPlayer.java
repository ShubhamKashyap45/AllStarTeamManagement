package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Team;
import com.demo.service.TeamService;

public class TestTeamPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Add a new Team ");
			System.out.println("2. Delete the Team");
			System.out.println("3. Search by Team ID");
			System.out.println("4. Search by Player ID");
			System.out.println("5. Delete Player from Team");
			System.out.println("6. Add New Player in the Team");
			System.out.println("7 Display All");
			System.out.println("8. Exit");
			System.out.println();
			System.out.println("Enter your Choice: ");
			System.out.println();
			choice = scn.nextInt();
			
			switch(choice) {
			case 1: 
				TeamService.addNewTeam();
				System.out.println();
				break;
			
			case 2:
				break;
				
			case 3:
				System.out.println("Enter team id to search");
				int tid = scn.nextInt();
				Team t = TeamService.findTeamById(tid);
				if(t!=null) {
					System.out.println(t);
				} else {
					System.out.println("Not Found");
				}
				System.out.println();
				break;
				
			case 4:
				System.out.println("Enter player id to search");
				int pid = scn.nextInt();
				t = TeamService.SearchByPlayerId(pid);
				if(t != null) {
					System.out.println(t);
				} else {
					System.out.println("Not Found");
				}
				
				System.out.println();
				break;
			case 5:
				break;
				
			case 6:
				System.out.println("Enter team id");
				tid = scn.nextInt();
				boolean status = TeamService.addNewPlayer(tid);
				if(status) {
					System.out.println("Player added to the team");
				} else {
					System.out.println("Team not found");
				}
				
				System.out.println();
				break;
				
			case 7:
				Team[] tarr = TeamService.findAll();
				for(Team t1: tarr) {
					if(t1 != null) {
						System.out.println(t1);
					} else {
						System.out.println();
						break;
					}
				}
				
			case 8:
				System.out.println("Thank You for Visiting....");
				scn.close();
				break;
				
			default: 
				break;
			}
		} while(choice != 8);
		
	}

}
