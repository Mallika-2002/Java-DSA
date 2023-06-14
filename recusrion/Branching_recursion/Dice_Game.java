package Branching;

import java.util.ArrayList;

public class Dice_Game {

	public static ArrayList<String> dice(int curr,int end){
		if(curr==end)
		{
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}if(curr>end)
		{
			ArrayList<String> res = new ArrayList<>();
			return res;
		}
		ArrayList<String> fr = new ArrayList<>();
		for(int i=1;i<=6;i++) {
			int newval = curr+i;
			ArrayList<String> list = dice(newval,end);
			for(String t:list)
				fr.add(i+t);
		}return fr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> ar = dice(0,10);
for(String t:ar)
	System.out.print(t+" ");
	}

}
