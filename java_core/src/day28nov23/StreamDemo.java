package day28nov23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<>();
			a1.add(10);
			a1.add(50);
			a1.add(40);
			a1.add(30);
			a1.add(20);
			
			//----------------------------------------print element using ForEach
			Stream<Integer> s = a1.stream();
//			s.forEach(x->System.out.println(x + ","));
			
//			s.forEach(x->System.out.println(x));
//			s.forEach(System.out::println);  // method reference

			// java.lang.IllegalStateException: stream has already been operated upon or 
			//closed
			//s.forEach(x->System.out.println(x));
			
			//--------------------------------------------------------
			
			System.out.println("Sortrd list===========================>");
			a1.stream().sorted()
			           .forEach(x->System.out.println(x));
			
			System.out.println("ASC Sorted list using compareTor ========>");
			a1.stream().sorted((x,y)->x.compareTo(y)).forEach(x->System.out.println(x));
			
			System.out.println("DESC Sorted list using comparator=================>");
			a1.stream().sorted((x,y)->y.compareTo(x))
			          .forEach(x->System.out.println(x));
			
			System.out.println("DESC Sorted list using comparator ==========> ");
			a1.stream().sorted((x,y)->-(x-y))
			           .forEach(x->System.out.println(x));
			
			System.out.println("ASC Sorted list using comparator==================>");
			a1.stream().sorted((x,y)->x-y)
			.forEach(x->System.out.println(x));
			
			//------------------FILTER PREDICATE------------------------
			System.out.println("Print Even nos-------------------->");
			a1.stream().filter(x->x%2==0)
			.forEach(x->System.out.println(x));
			
			System.out.println("Print ODD nos ---------------------->");
			a1.stream().filter(x->x%2==1)
			.forEach(x->System.out.println(x));
			
				List<String> sal = new ArrayList<>();
				sal.add("Virat");
				sal.add("Arjun");
				sal.add("Dhoni");
				sal.add("Rohit");
				sal.add("Rishabh");
				sal.add("Shikhar");
				sal.add("Dhoni");
				
				System.out.println("Print names starts with R------------->");
				sal.stream().filter(x->x.startsWith("R"))
				.forEach(System.out::println);
				
				System.out.println("Print names whoes name start with R and length is > 5 ------> ");
				sal.stream().filter(x->x.startsWith("R"))
				.filter(x->x.length()>5)
				.forEach(System.out::println);
				System.out.println("find distinct name -------------------->");
				sal.stream().distinct().forEach(x->System.out.println(x));
				
				System.out.println("Print name in uppper case-------------->");
				sal.stream().distinct().map(x->x.toUpperCase()).forEach(z->System.out.println(z));
				
				System.out.println("Print name in lower case--------------->");
				sal.stream().map(x->x.toLowerCase()).forEach(System.out::println);
				
				System.out.println("Print name in sorted distinct order in upper case---------------->");
				sal.stream().map(x->x.toUpperCase()).distinct().sorted().forEach(System.out::println);
				
				System.out.println("Convert sorted list into an list");
				List<String>list = sal.stream().sorted().collect(Collectors.toList());
				System.out.println("1= " + 1);
				
				System.out.println("Count total no of EVEN nos--------->");
				long cnt = a1.stream().filter(x->x%2==0).count();
				System.out.println("even cnt : " + cnt);
				
				System.out.println("Find square of every no:------>");
				a1.stream().map(x->x*x).sorted().forEach(x->System.out.println(x));
				
				System.out.println("Find square of every no and store in a set:-------->");
				Set<Integer> set = a1.stream().map(x->x*x).collect(Collectors.toSet());
				System.out.println("set="+set);
				
				System.out.println(set instanceof Set);//true
				System.out.println(set instanceof List);//false
				System.out.println(set instanceof Object);//true
				System.out.println(set instanceof Collection);//true
				System.out.println(set instanceof Iterable);//true
				
				System.out.println("Find square of every no and store in a ArrayList:------->");
				List<Integer>l1 = a1.stream().map(x->x*x).collect(Collectors.toList());
				System.out.println("l1="+l1);
				
				System.out.println("Replace character R to Y and print ---->");
				sal.stream().map(x->x.replace("R", "Y")).forEach(x->System.out.println(x));
				
				System.out.println("Find a sum of all numbers from a list of integers----->");
				Integer sum = a1.stream().reduce(0,(n1,n2)->n1+n2);
				System.out.println("sum = " + sum);
				
				System.out.println("Find length of every string --------->");
				sal.stream().map(x->x.length()).forEach(System.out::println);
			
				System.out.println("finding out max from a list ----->");
				Optional<Integer> ol = List.of(12,5,4,8,23,67,54,89,32,89,23).stream().max(   (n1,n2)->Integer.compare(n1,n2)    );
				System.out.println(ol.get()); 
				
				System.out.println("finding out min from a list ----->");
				Optional<Integer> minFromList = List.of(12,5,4,8,23,2,67,54,89,32,89,23).stream().min((n1,n2)->Integer.compare(n1,n2));
				System.out.println(minFromList.get());   
				
				System.out.println("finding out min from a list ----->");
				List<Integer> emptyList = new ArrayList<>();	
				Optional<Integer> minFromList1Optional = emptyList.stream().min((n1,n2)->Integer.compare(n1,n2));
				
				//System.out.println(minFromList1Optional.get());  //java.util.NoSuchElementException: No value present when list is empty
				//to avoid this use orElse
				System.out.println(minFromList1Optional.orElse(-1));  // -1
				
				System.out.println("Find a max even number from a list of integers-------->");
				Optional<Integer> ol1 = List.of(3,5,7).stream().filter(e->e%2==0).max(   (n1,n2)->Integer.compare(n1,n2));
				System.out.println("ol1.isEmpty() : " + ol1.isEmpty()); // true
				System.out.println("ol1.isPresent() : " + ol1.isPresent()); //false
				System.out.println("ol1.orElse() : " + ol1.orElse(-1)); //-1
				System.out.println("ol1.orElse() " + ol1.get());  //NoSuchElementException
				
				System.exit(0);
				 
				
				
			
	}

}
