package ru.mirea.practice11;

public class Test {
    public static void main(String[] args) {
        System.out.println("ArrayQueueModule");
        for(int i = 0; i < 10; i++){
            ArrayQueueModule.enqueue(i);
        }
        System.out.println("Первый элемент: " + ArrayQueueModule.element());
        System.out.println("Размер: " + ArrayQueueModule.size());
        System.out.println("Метод dequeue: " + ArrayQueueModule.dequeue());
        System.out.println(ArrayQueueModule.StringValue());
        ArrayQueueModule.clear();

        System.out.println();
        System.out.println("ArrayQueue");

        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        for(int i = 0; i < 10; i++){
            arrayQueue.enqueue(i);
        }
        System.out.println("Первый элемент: " + arrayQueue.element());
        System.out.println("Размер: " + arrayQueue.size());
        System.out.println("Метод dequeue: " + arrayQueue.dequeue());
        System.out.println(arrayQueue);
        arrayQueue.clear();

        System.out.println();
        System.out.println("ArrayQueueADT");
        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        for(int i = 0; i < 10; i++){
            ArrayQueueADT.enqueue(arrayQueueADT, i);
        }
        System.out.println("Первый элемент: " + ArrayQueueADT.element(arrayQueueADT));
        System.out.println("Размер: " + ArrayQueueADT.size(arrayQueueADT));
        System.out.println("Метод dequeue: " + ArrayQueueADT.dequeue(arrayQueueADT));
        System.out.println(arrayQueueADT);
        ArrayQueueADT.clear(arrayQueueADT);

        System.out.println();
        System.out.println("LinkedQueue");
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        for(int i = 0; i < 10; i++){
            linkedQueue.enqueue(i);
        }
        System.out.println("Первый элемент: " + linkedQueue.element());
        System.out.println("Размер: " + linkedQueue.size());
        System.out.println("Метод dequeue: " + linkedQueue.dequeue());
        System.out.println(linkedQueue);
        linkedQueue.clear();
    }
}
