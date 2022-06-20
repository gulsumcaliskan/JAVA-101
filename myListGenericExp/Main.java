public class Main {
    
    public static void main (String[] args) {
        
        MyList<Integer> list = new MyList<>();
        System.out.println("The size of the array: " + list.size());
        System.out.println("The capacity of the array: " + list.getCapacity());
        System.out.println();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        System.out.println("The size of the array: " + list.size());
        System.out.println("The capacity of the array: " + list.getCapacity());
        System.out.println();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        
        System.out.println("The size of the array: " + list.size());
        System.out.println("The capacity of the array: " + list.getCapacity());
        System.out.println();
        
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println("The index of the 2 (second): " + list.get(2));
        list.remove(2);
        list.add(40);
        list.set(0, 100);
        System.out.println("The index of the 2 (second): " + list.get(2));
        System.out.println(list.toString());
        System.out.println();
        
        System.out.println("The condition of the list: " + (list.isEmpty() ? "Empty" : "Full"));
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println("The condition of the list: " + (list.isEmpty() ? "Empty" : "Full"));
    
        // given the first index that found
        System.out.println("Index : " + list.indexOf(20));

        // if didn't, returns -1
        System.out.println("Index :" + list.indexOf(100));

        // given the last index that found
        System.out.println("Index : " + list.lastIndexOf(20));

        // return back the list as a Object[] 
        Object[] arr = list.toArray();
        System.out.println("The first element of the Object array :" + arr[0]);

        // it is created a sublist that list data type
        MyList<Integer> mySubList = list.subList(0, 3);
        System.out.println(mySubList.toString());

        // queried the myValue in the list whether or not 
        System.out.println("20 value in my list: " + list.contains(20));
        System.out.println("120 value in my list : " + list.contains(120));

        // clears the whole list and turns as a default size.
        list.clear();
        System.out.println(list.toString());
        
        
    }
}