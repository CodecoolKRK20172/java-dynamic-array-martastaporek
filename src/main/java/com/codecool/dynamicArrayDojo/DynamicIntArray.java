package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    private int [] array;

    public DynamicIntArray() {

        this.array = new int[0];
    }

    public DynamicIntArray(int size) {

        this.array = new int [size];
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void add(int number) {


        int [] newArray = new int[this.array.length + 1];

        for(int i=0; i < this.array.length; i++){
            newArray[i] = this.array[i];
        }
        newArray [this.array.length] = number;
        setArray(newArray);

    }

    public void remove(int number){

        int [] newArray = new int[this.array.length - 1];

        int j = 0;

        for(int i=0; i < this.array.length; i++) {

            if (this.array[i] != number) {
                newArray[j] = this.array[i];
                j++;
            }
        }

            setArray(newArray);


    }

    public void insert(int position, int number){

    }

    @Override
    public String toString() {
        String toString = "";
        for(int elem : this.array){
            toString += " " + elem;

        }
        return toString;
    }
}
