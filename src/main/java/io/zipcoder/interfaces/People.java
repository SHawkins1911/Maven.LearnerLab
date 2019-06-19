package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.*;

public class People<E extends Person>{
    ArrayList<E> personList;


    public People(ArrayList<E> personList){
        this.personList = personList;

    }

    public People(){
        this(new ArrayList<E>());
    }

    public Person findById(Long id) {
            for (Person value : personList) {
                if (value.getId() == id)
                    return value;
            }
            return null;
        }

        public Integer count(List<Person> personList){
           return personList.size();
        }


        public boolean isEmpty() {
            return false;
        }


        public boolean contains(Object o) {
            return false;
        }


        public Person[] toArray() {
            Person[] person = new Person[personList.size()];
            int i = 0;
                for (Person value : personList){
                        person[i] = value;
                        i++;
            }

            return new Person[0];
        }


       public boolean add(E person) {
            personList.add(person);
            return true;
        }


        public boolean remove(long id) {
            for (Person value : personList) {
                if (value.getId() == id)
                    personList.remove(value);
                return true;
            }
            return false;
        }

        public boolean remove(Person person) {
            for (Person value : personList) {
                if (value == person) {
                    personList.remove(value);
                    return true;
                }
            }
        return false;
    }


        public boolean containsAll(Collection<?> c) {
            return false;
        }


        public boolean addAll(Collection<? extends Person> c) {
            return false;
        }


        public boolean addAll(int index, Collection<? extends Person> c) {
            return false;
        }


        public boolean removeAll(List<Person> personList) {
            personList.clear();
            return true;
        }


        public boolean retainAll(Collection<?> c) {
            return false;
        }


        public void clear() {

        }


        public Person get(int index) {
            return null;
        }


        public Person set(int index, Person element) {
            return null;
        }


        public void add(int index, Person element) {

        }

    }

