package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Player;
import com.demo.beans.Team;

public class TeamService {
	static Team[] tarr;
	static int count;
	
	static {
		tarr = new Team[30];
//		Default Data stored
		Player[] plist1 = new Player[15];
		plist1[0] = new Player(1, "Yuvraj", "Allrounder");
		plist1[1] = new Player(2, "Rohit Sharma", "Batsman");
		tarr[0] = new Team(10, "CSK", "Dhoni", new Player(1, "Yuvraj", "Allrounder"), plist1);
		
//		Default Data stored
		Player[] plist2 = new Player[15];
		plist2[0]=new Player(11,"Hardik Pandya","Allrounder");
		plist2[1]=new Player(12,"Virat Kohali","Batsman");
		tarr[1] = new Team(11, "MI", "Sachin", new Player(1, "Hardik Pandya", "Allrounder"), plist2);
		
		count=2;
	}

	public static void addNewTeam() {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter tid: ");
		int tid = scn.nextInt();
		scn.nextLine();
		
		System.out.println("Enter team name: ");
		String tname = scn.nextLine();
		
		System.out.println("Enter coach name: ");
		String cname = scn.nextLine();
		
		System.out.println("Enter Captain Id: ");
		int cpid = scn.nextInt();
		scn.nextLine();
		
		System.out.println("Enter Captain name: ");
		String cpname = scn.nextLine();
		
		System.out.println("Enter Captain Speciality: ");
		String speciality = scn.nextLine();
		
		Player p = new Player(cpid, cpname, speciality);
		Player[] plist = new Player[15];
		int pcount = 0;
		String ans = "y";
		
		do {
			System.out.println("Enter Player Id");
			int pid = scn.nextInt();
			scn.nextLine();
			System.out.println("Enter Player name: ");
			String pname = scn.nextLine();
			System.out.println("Enter Player speciality");
			String pspeciality = scn.nextLine();
			plist[pcount] = new Player(pid, pname, pspeciality);
			pcount++;
			
			System.out.println("Do you want to continue? (y/n)");
			ans = scn.next();
			
		} while(ans.equals("y"));
		tarr[count] = new Team(tid, tname, cname, p, plist);
		count++;
		
	}

	public static Team findTeamById(int tid) {
		// TODO Auto-generated method stub
		for(Team t: tarr) {
			if(t != null) {
				if(t.getTid() == tid) {
					return t;
				} else {
					break;
				}
			}
		}
		
		return null;
	}

	public static Team SearchByPlayerId(int pid) {
		// TODO Auto-generated method stub
		for(Team t: tarr) {
			if(t != null) {
				// retrieving list of players from team and storing it in plst
				Player[] plst = t.getPlist();
				for(Player p :plst) {
					if(p != null) {
						if(p.getPid() == pid) {
							return t;
						} else {
							break;
						}
					}
				} 
			} else {
				break;
			}
		}
		return null;
	}

	public static boolean addNewPlayer(int tid) {
		// TODO Auto-generated method stub
		Team t = findTeamById(tid);
		Scanner scn = new Scanner(System.in);
		if(t != null) {
			System.out.println("Enter player id");
			int pid = scn.nextInt();
			scn.nextLine();
			
			System.out.println("Enter player name ");
			String pname = scn.nextLine();
			
			System.out.println("Enter player sepeciality");
			String pspeciality = scn.nextLine();
			
			Player p = new Player(pid, pname, pspeciality);
			Player[] plst = t.getPlist();
			for(int i=0; i<plst.length; i++) {
				if(plst[i] == null) {
					plst[i] = p;
					return true;
				}
			}
		} 
		
		return false;
	}

	public static Team[] findAll() {
		// TODO Auto-generated method stub
		return tarr;
	}

}
