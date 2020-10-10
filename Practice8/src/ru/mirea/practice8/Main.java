package ru.mirea.practice8;

public class Main {

    public static void main(String[] args) {
	    Waitlist<Integer> waitlist=new Waitlist<Integer>();
	    for(int i=0;i<10;i++)waitlist.add(i);
	    waitlist.remove();
        System.out.println(waitlist);

        BoundedWaitList<Integer> boundedWaitList=new BoundedWaitList<Integer>(5);
        for(int i =0;i<6;i++)boundedWaitList.add(i);
        System.out.println(boundedWaitList);
        
        UnfairWaitList<Integer> unfairWaitList=new UnfairWaitList<Integer>();
        for (int i=0;i<10;i++) unfairWaitList.add(i);
        unfairWaitList.remove(5);
        unfairWaitList.moveToBack(1);
        System.out.println(unfairWaitList);

    }
}
