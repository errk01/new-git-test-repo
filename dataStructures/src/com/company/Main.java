package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
//        // String array
//	    String[] fruit;
//
//	    // int array
//        int[] numArray;
//
//        // boolean array
//        boolean[] isToggle;
//
//
//        String[] names = {"John","Sara","Daryl","Ann"};
//
//        int size = names.length;
//        System.out.print("names: "+ size);

// ******* types of arrays
//        List <Boolean> listOne = new ArrayList<>();
//        List <String> list2 = new LinkedList<>();
//        List <Integer> list3 = new Vector<>();
//        List <String> list4 = new Stack<>();

/// **** ArrayLists
        ArrayList<String> names = new ArrayList<>(5);

        names.add("John");
        names.add("Ann");
        names.add("Jill");

//        System.out.println(names);


        names.add(1, "Finn");


        names.remove("Finn");
//        System.out.println(names.get(1));

        Collections.reverse(names);



        boolean isMatch = names.contains("Jill");

        String str = "This is a String";

        String arrStr[] = str.split(" ");

        List<String> arrList = new ArrayList<>();
        arrList = Arrays.asList(str);

//        System.out.println(arrList);

        /// ***** Hashmaps
HashMap<String, String> person = new HashMap<>();
// .put adds the item to the hash map

        person.put("Joan", "23");
        person.put("Erik", "83");
        person.put("Ali", "59");

        person.remove("Erik");

        boolean personKey = person.containsKey("Joan");
        boolean personValue = person.containsValue("79");

        boolean isClearArr = person.isEmpty();

//        System.out.println(isClearArr);

//        for(String name : names){
//            System.out.println(name);
//        }

//        for(String name: names) {
//
//        }

//        for(Map.Entry<String, String> entry : person.entrySet()){
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key+ " " + value);
//        }
///// ******** LinkedLists
        LinkedList<String> animalList = new LinkedList<>();
        animalList.add("frog");
        animalList.add("Tiger");
        animalList.add("Lion");
        animalList.add("Mongoose");

//        System.out.println(animalList);
        animalList.addFirst("Shark");

//        System.out.println(animalList);
        animalList.addLast("Koala");
//        System.out.println(animalList);

        animalList.add(3,"Bear");

        animalList.remove(2);

        animalList.removeFirst();

        animalList.removeLast();


        boolean listAnimals = animalList.contains("Lion");



//        System.out.println(animalList.get(3));

///***** Queues
        Queue<Integer> myQ = new LinkedList<>();

        for(int i = 5; i <10; i++){
            myQ.add(i);
        }




        int removeHead = myQ.remove();

        System.out.println("removeHead "+ removeHead);

        int head = myQ.peek();


        int myQsize = myQ.size();
        System.out.println(myQsize);


        // ***** Stacks

        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(4);
        myStack.push(9);


        System.out.println(myStack.peek());
        System.out.println(myStack);





    }
}
