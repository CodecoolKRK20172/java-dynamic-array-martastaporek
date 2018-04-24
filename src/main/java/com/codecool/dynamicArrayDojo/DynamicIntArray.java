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


        int [] tempArray = new int[this.array.length + 1];

        for(int i=0; i < this.array.length; i++){
            tempArray[i] = this.array[i];
        }
        tempArray [this.array.length] = number;
        setArray(tempArray);

    }

    public void remove(int number){

        int [] tempArray = new int[this.array.length - 1];

        int tempIndex = 0;

        for(int i=0; i < this.array.length; i++) {

            if (this.array[i] != number) {
                tempArray[tempIndex] = this.array[i];
                tempIndex++;
            }
        }

            setArray(tempArray);


    }

    public void insert(int position, int number){

        int [] tempArray = new int[this.array.length + 1];
        System.out.println(this.array.length);

        int tempIndex = 0;

        for(int i=0; i < this.array.length; i++) {

            if (i != position) {
                tempArray[tempIndex] = this.array[i];
                tempIndex++;
            }
            if(i == position){
                tempArray[tempIndex] = number;
                tempIndex++;
                tempArray[tempIndex] = this.array[i];
                tempIndex++;
            }
        }

        setArray(tempArray);
        if(position > this.array.length){
            this.array[this.array.length - 1] = number;
        }

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
