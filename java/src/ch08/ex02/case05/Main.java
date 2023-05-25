package ch08.ex02.case05;

import java.util.Arrays;
import java.util.List;

public class Main {
	   public static void main(String[] args) {
	      User user1 = new User("최한석", Level.COPPER);
	      User user2 = new User("한아름", Level.SILVER);
	      User user3 = new User("양승일", Level.GOLD);
	      
	      List<User> users = Arrays.asList(user1, user2, user3);
	      
	      users.forEach(user -> user.upgradeLevel());
	      System.out.println(users);
	   }
	}