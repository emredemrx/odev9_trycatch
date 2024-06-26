package org.example;
public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int index = 5;
            indexSayisi(index);
            System.out.println(numbers[index]);
        } catch (CustomException e){
            System.out.println(e);
        }
    }
    public static void indexSayisi(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Hata: Negatif sayı girdiniz.");
        }else if(number > 2){
            throw new CustomException("index değerimiz dizi eleman sayısından buyuk olamaz");
        }
    }
}