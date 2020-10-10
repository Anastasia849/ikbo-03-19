package ru.mirea.practice6;

public class Tester {
    public static void insertSort(Student[] array){
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            Student value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.compareTo(array[i])<0) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
    }

    public static Student[] mergeSort(Student[] a1, Student[] a2) {
        Student[] a3 = new Student[a1.length + a2.length];

        int i = 0, j = 0;
        for (int k = 0; k < a3.length; k++) {

            if (i > a1.length - 1) {
                Student a = a2[j];
                a3[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else if (a1[i].getGPA() < a2[j].getGPA()) {
                Student a = a1[i];
                a3[k] = a;
                i++;
            } else {
                Student b = a2[j];
                a3[k] = b;
                j++;
            }
        }
        return a3;
    }



    public static void main(String[] args) {

        Student[] students1 = new Student[20];
        System.out.println("Arr1");
        for (int i =0;i<20;i++)
        {
            students1[i]=new Student(100-i,300-i);
            System.out.print(students1[i]);
            System.out.print(' ');
        }
        System.out.println();
        System.out.println("t1");
        insertSort(students1);
        for (Student student:students1) {
            System.out.print(student);
            System.out.print(' ');
        };
        new SortingStudentsByGPA().quickSort(students1,0,students1.length-1);
        System.out.println();
        System.out.println("t2");
        for (Student student:students1) {
            System.out.print(student);
            System.out.print(' ');
        };
        Student[] students2=new Student[10];
        System.out.println();
        System.out.println("Arr2");
        for (int i =0;i<10;i++)
        {
            students2[i]=new Student(200-i,200+i);
            System.out.print(students2[i]);
            System.out.print(' ');
        }
        Student[] students3=mergeSort(students1,students2);
        System.out.println();
        System.out.println("t3");
        for (Student student:students3) {
            System.out.print(student);
            System.out.print(' ');
        };

    }
}
