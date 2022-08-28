package interview_question;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MyController {
	private HashMap<Integer,Runner> hashmap=new HashMap<>();
	private static MyController control=null;
	private MyController() {}
	public static MyController getControl()
	{
		if(control==null)
		{
			control=new MyController();
		}
		return control;
	}
	public boolean checkLane(int laneNumber)
	{
		return !hashmap.containsKey(laneNumber);
	}
	public void assignLane(int choice, String runnerName) {
		hashmap.put(choice, new Runner(runnerName));
		
	}
	public String getAssignedList()
	{
		String allList="";
		Set<Entry<Integer,Runner>> allSet=hashmap.entrySet();
		Iterator<Entry<Integer,Runner>> iterate=allSet.iterator();
		while(iterate.hasNext())
		{
			Entry<Integer,Runner> entry=iterate.next();
			allList+="Lane "+entry.getKey()+" ----> "+entry.getValue().getName()+"\n";
		}
		if(allList.trim().equals(""))
		{
			return "no result";
		}
		return allList;
	}
	
	
	
	
	
}
