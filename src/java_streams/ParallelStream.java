package java_streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
	
	String name;
	int score;
	
	ParallelStream(String name, int score)
	{
		this.name=name;
		this.score=score;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ParallelStream>ps=Arrays.asList
				
				(new ParallelStream("Parthi",80),new ParallelStream("Priya",90),new ParallelStream("Dev",95),new ParallelStream("Hem",100));
		ps.parallelStream().filter(p->p.score>80).forEach(n->System.out.println(n.name));
	}

}
