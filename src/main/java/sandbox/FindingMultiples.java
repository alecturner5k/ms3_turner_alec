package sandbox;

import java.util.*;
import java.util.stream.IntStream;

public class FindingMultiples {
	
	public List<String> multiplesInRange(int[] numberRange)
	{
		
		List<String> result = new ArrayList<>();
		
		for(int i = 0; i < numberRange.length; i++)
		{
			if(numberRange[i] % 3 == 0 && numberRange[i] % 7 == 0)
			{
				result.add(numberRange[i] + " : " + "MS3 and ME");
			}else if(numberRange[i] % 7 == 0)
			{
				result.add(numberRange[i] + " : " +  "MS3");
			}else if(numberRange[i] % 3 == 0)
			{
				result.add(numberRange[i] + " : " + "ME");
			}
		}
		
		return result;
	}

	
	public int[] getRange(int floor, int ceiling)
	{
		int[] range;
		
		if(floor > ceiling)
		{
			 return range = IntStream.rangeClosed(ceiling, floor).toArray();
		}else
		{
			 return range = IntStream.rangeClosed(floor, ceiling).toArray();
		}
	}
}