package com.sample1;
import java.util.*;
class StudCompare implements Comparator<SortListDemo>  // ordering the input based on the employeeid
{
        @Override
                public int compare(SortListDemo employee1, SortListDemo employee2)
        {
                if (employee1.getEmployeeId() > employee2.getEmployeeId())
                {
                        return 1;
                }
                return -1;
        }
}
class Main
{
        public static void main(String[] args)
        {
                LinkedList<SortListDemo> list = new LinkedList<SortListDemo>();
                list.add(new SortListDemo("John", 1001));
                list.add(new SortListDemo("Raju", 1005));
                list.add(new SortListDemo("Sham", 1000));
                list.add(new SortListDemo("Ravi", 1002));
                Collections.sort(list, new StudCompare());
                System.out.println("Sorted list based on employee id\n");
                System.out.println("**=============**=================**");
                for (SortListDemo stud: list )
                {
                        System.out.println(stud);
                }
                System.out.println("**=============**=================**\n");
        }
}