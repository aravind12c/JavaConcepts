package JavaCollections;

//	Iterator interface
//	Iterator interface provides the facility of iterating the elements in a forward direction only.

import java.util.Iterator;

// public boolean hasNext() -- It returns true if the iterator has more elements otherwise it returns false.
// public Object next() -- It returns the element and moves the cursor pointer to the next element.
// It removes the last elements returned by the iterator. It is less used.

//Collections
import java.util.Collections;
//List
import java.util.List;
import java.util.ArrayList;

import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.TreeMap;
//Map
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

//Set
import java.util.Set;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//Queue
import java.util.PriorityQueue;
import java.util.Deque;
import java.util.ArrayDeque;

public class CollectionsDemo {

   public static void main(String[] args) {
	   
	   //https://www.javatpoint.com/collections-in-java
	   
	  // List Interface
	   
		/*
		 * List interface is the child interface of Collection interface. It inhibits a
		 * list type data structure in which we can store the ordered collection of
		 * objects. It can have duplicate values. List interface is implemented by the
		 * classes ArrayList, LinkedList, Vector, and Stack.
		 */
	   
      // ArrayList
		/*
		 * The ArrayList class implements the List interface. It uses a dynamic array to
		 * store the duplicate element of different data types. The ArrayList class
		 * maintains the insertion order and is non-synchronized. The elements stored in
		 * the ArrayList class can be randomly accessed
		 */
	   
      List<String> a1 = new ArrayList<String>();
      a1.add("Zara");
      a1.add("Mahnaz");
      a1.add("Ayan");
      a1.add("Ayan");
      a1.add(null);
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + a1);
      System.out.println();
      // LinkedList
		/*
		 * LinkedList implements the Collection interface. It uses a doubly linked list
		 * internally to store the elements. It can store the duplicate elements. It
		 * maintains the insertion order and is not synchronized. 
		 * In LinkedList, the  manipulation is fast because no shifting is required.
		 */
      
      List<String> l1 = new LinkedList<String>();
      l1.add("Zara");
      l1.add("Mahnaz");
      l1.add("Ayan");
      l1.add("Ayan");
      l1.add(null);
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + l1);

      //Vector
		/*
		 * Vector uses a dynamic array to store the data elements. It is similar to
		 * ArrayList. However, It is synchronized and contains many methods that are not
		 * the part of Collection framework.
		 */
      
      Vector<String> v=new Vector<String>();  
      v.add("Ayush");  
      v.add("Amit");  
      v.add("Ashish");  
      v.add("Garima");
      v.add("Garima");
      v.add(null);
      v.add(null);
      System.out.println();
      System.out.println("Vector Elements");
      Iterator<String> itr=v.iterator();  
      while(itr.hasNext()){  
      System.out.print("\t"+itr.next());  
      }
      System.out.println();
      
      //Stack
      
		/*
		 * The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack.
		 *  The stack contains all of the methods of Vector class
		 * and also provides its methods like boolean push(), boolean peek(), boolean
		 * push(object o), which defines its properties.
		 */
      
      Stack<String> stack = new Stack<String>();  
      stack.push("Ayush");  
      stack.push("Garvit");  
      stack.push("Amit");  
      stack.push("Ashish");  
      stack.push("Garima"); 
      stack.push("Garima"); 
      stack.push(null);
      stack.push(null);
      stack.pop();  
      System.out.println();
      System.out.println(" Stack Elements");
      
      Iterator<String> itr1=stack.iterator();  
      while(itr1.hasNext()){  
      System.out.print("\t"+itr1.next());  
      }  
      
      System.out.println();
      //Set Interface
		/*
		 * Set Interface in Java is present in java.util package. It extends the
		 * Collection interface. It represents the unordered set of elements which
		 * doesn't allow us to store the duplicate items. We can store at most one null
		 * value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
		 */
      
      
      // HashSet
      HashSet<String> s1 = new HashSet<String>(); 
      s1.add("Zara");
      s1.add("Mahnaz");
      s1.add("Ayan");
      s1.add("Ayan");
      s1.add(null);
      s1.add(null);
      System.out.println();
      System.out.println(" HashSet Elements");
      Iterator<String> itr5=stack.iterator();  
      while(itr5.hasNext()){  
      System.out.print("\t"+itr5.next());  
      } 
      System.out.println();
      //System.out.print("\t" + s1);

      //LinkedHashSet
		/*
		 * LinkedHashSet class represents the LinkedList implementation of Set
		 * Interface. It extends the HashSet class and implements Set interface. Like
		 * HashSet, It also contains unique elements. It maintains the insertion order
		 * and permits null elements.
		 */
      LinkedHashSet<String> set=new LinkedHashSet<String>();  
      
      set.add("Ravi");  
      set.add("Vijay");  
      set.add("Ravi");  
      set.add("Ajay");  
      set.add("Ajay"); 
      set.add(null);  
      System.out.println();
      System.out.println(" LinkedHashSet Elements");
      Iterator<String> itr2=set.iterator();  
      while(itr2.hasNext()){  
      System.out.print("\t"+itr2.next());  
      }  
      System.out.println();
      
     // TreeSet
		/*
		 * Java TreeSet class implements the Set interface that uses a tree for storage.
		 * Like HashSet, TreeSet also contains unique elements. However, the access and
		 * retrieval time of TreeSet is quite fast. 
		 * The elements in TreeSet stored in ascending order.
		 */
      
      TreeSet<String> TreeSetset=new TreeSet<String>();  
      TreeSetset.add("Ravi");  
      TreeSetset.add("Vijay");  
      TreeSetset.add("Ravi");  
      TreeSetset.add("Ajay");  
      //TreeSetset.add(null); 
     // TreeSetset.add(null); 
      //traversing elements  
      System.out.println();
      System.out.println(" TreeSet Elements");
      Iterator<String> itr3=TreeSetset.iterator();  
      while(itr3.hasNext()){  
      System.out.print("\t"+itr3.next());  
      }  
      System.out.println();
      //Map
      
		/*
		 * A map contains values on the basis of key, i.e. key and value pair. 
		 * Each key and value pair is known as an entry. 
		 * A Map contains unique keys.
		 *  A Map is useful if you have to search, update or delete elements on the basis of a key.
		 */
      
     // Java Map Hierarchy
		/*
		 * There are two interfaces for implementing Map in java: Map and SortedMap, and
		 * three classes: HashMap, LinkedHashMap, and TreeMap
		 * 
		 */      
      // HashMap
      HashMap<String, String> m1 = new HashMap<String, String>(); 
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      m1.put("Daisy", "14");
      m1.put(null,null);
      
      System.out.println();
      System.out.println(" HashMap Elements");
    //Traversing Map  
      Set set1=m1.entrySet();//Converting to Set so that we can traverse  
      Iterator itr4=set1.iterator();  
      while(itr4.hasNext()){  
          //Converting to Map.Entry so that we can get key and value separately  
          Map.Entry entry=(Map.Entry)itr4.next();  
          System.out.print("\t"+entry.getKey()+" "+entry.getValue());  
      }  
      System.out.println();
      //LinkedHashMap 
		/*
		 * Java LinkedHashMap contains values based on the key. Java LinkedHashMap
		 * contains unique elements. Java LinkedHashMap may have one null key and
		 * multiple null values. Java LinkedHashMap is non synchronized. Java
		 * LinkedHashMap maintains insertion order. The initial default capacity of Java
		 * HashMap class is 16 with a load factor of 0.75.
		 */
      LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
      hm.put(102,"Rahul");  
      hm.put(100,"Amit");  
      hm.put(101,"Vijay");  
     
      hm.put(102,"Rahul"); 
      hm.put(null,null); 
      hm.put(null,null); 
      System.out.println();
      System.out.println(" LinkedHashMap Elements"+"\n");
      //Fetching key  
      System.out.println("Keys: "+hm.keySet()+"\n");  
      //Fetching value  
      System.out.println("Values: "+hm.values()+"\n");  
      //Fetching key-value pair  
      System.out.println("Key-Value pairs: "+hm.entrySet()+"\n");  
    for(Map.Entry m:hm.entrySet()){  
       System.out.print("\t"+m.getKey()+" "+m.getValue());  
      } 
    System.out.println();
    
    // TreeMap
		/*
		 * Java TreeMap contains values based on the key. It implements the NavigableMap
		 * interface and extends AbstractMap class. Java TreeMap contains only unique
		 * elements. Java TreeMap cannot have a null key but can have multiple null
		 * values. Java TreeMap is non synchronized. Java TreeMap maintains ascending
		 * order.
		 */
    
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
    map.put(102,"Ravi");  
    map.put(100,"Amit");    
    map.put(102,"Ravi");    
    map.put(101,"Vijay");    
    map.put(103,"Rahul");
    map.put(103,"Rahul");
    map.put(104,null);
    System.out.println();
    System.out.println(" TreeMap Elements \n");
    System.out.println("Before invoking remove() method");  
    for(Map.Entry m:map.entrySet())  
    {  
        System.out.print("\t"+m.getKey()+" "+m.getValue());      
    }  
    map.remove(102);    
    System.out.println();
    System.out.println("After invoking remove() method");  
    for(Map.Entry m:map.entrySet())  
    {  
        System.out.print("\t"+m.getKey()+" "+m.getValue());      
    } 
    System.out.println();
    
    //Queue Interface
		/*
		 * Java Queue interface orders the element in FIFO(First In First Out) manner.
		 * In FIFO, first element is removed first and last element is removed at last
		 */
    
    //PriorityQueue class
		/*
		 * The PriorityQueue class provides the facility of using queue.
		 *  But it does not orders the elements in FIFO manner.
		 *  It inherits AbstractQueue class.
		 */
    
    PriorityQueue<String> queue=new PriorityQueue<String>();  
    queue.add("Jai");  
    queue.add("Amit");  
    queue.add("Vijay");
    queue.add("Jai");  
    queue.add("Karan");  
    //queue.add(null);  
    queue.add("Jai");  
    queue.add("Rahul");  
    System.out.println();
    System.out.println(" PriorityQueue Elements \n");
    System.out.println("head:"+queue.element());  
    System.out.println("head:"+queue.peek());  
    System.out.println("\n iterating the queue elements:");  
    Iterator itr6=queue.iterator();  
    while(itr6.hasNext()){  
    System.out.print("\t"+itr6.next());  
    }  
    queue.remove();  
    queue.poll();  
    System.out.println("\n after removing two elements:");  
    Iterator<String> itr7=queue.iterator();  
    while(itr7.hasNext()){  
    System.out.print("\t"+itr7.next());  
    }  
    
    //Deque Interface
    
		/*
		 * Java Deque Interface is a linear collection that supports element insertion
		 * and removal at both ends. Deque is an acronym for "double ended
		 */
    
    //ArrayDeque class
		/*
		 * The ArrayDeque class provides the facility of using deque and
		 * resizable-array. It inherits AbstractCollection class and implements the
		 * Deque interface.
		 */
    
		/*
		 * Unlike Queue, we can add or remove elements from both sides. Null elements
		 * are not allowed in the ArrayDeque. ArrayDeque is not thread safe, in the
		 * absence of external synchronization. ArrayDeque has no capacity restrictions.
		 * ArrayDeque is faster than LinkedList and Stack.
		 */
    
  //Creating Deque and adding elements  
    Deque<String> deque = new ArrayDeque<String>();  
    deque.add("Ravi");    
    deque.add("Vijay");
    deque.add("Ravi"); 
   // deque.add(null); 
    deque.add("Ajay");    
    //Traversing elements  
    System.out.println();
    System.out.println(" ArrayDeque Elements"+"\n");
    for (String str : deque) {  
    System.out.print("\t"+str);  
    }  
    
    System.out.println();
    
    //Java Hashtable class
		/*
		 * Java Hashtable class implements a hashtable, which maps keys to values. 
		 * It inherits Dictionary class and implements the Map interface
		 */
    
		/*
		 * A Hashtable is an array of a list. Each list is known as a bucket. The
		 * position of the bucket is identified by calling the hashcode() method. A
		 * Hashtable contains values based on the key. Java Hashtable class contains
		 * unique elements. Java Hashtable class doesn't allow null key or value. Java
		 * Hashtable class is synchronized. The initial default capacity of Hashtable
		 * class is 11 whereas loadFactor is 0.75.
		 */
    
    Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
    
    ht.put(100,"Amit");  
    ht.put(102,"Ravi");
   // ht.put(null,null);
    ht.put(102,"Ravi");
    ht.put(101,"Vijay");  
    ht.put(103,"Rahul");  
    System.out.println();
    System.out.println(" Hashtable Elements"+"\n");
    for(Map.Entry m:ht.entrySet()){  
     System.out.print("\t"+m.getKey()+" "+m.getValue());  
    }  
   }
}