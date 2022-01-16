package ru.retail.modal;

import ru.retail.modal.kassa.MonneyKassa;


public class Bank {

    private MonneyKassa kassa;

    public Bank() {
        kassa = new MonneyKassa();
    }

    public static void main(String[] args) {
        Bank rossBank = new Bank();
        MonneyKassa kassaNomer1 = rossBank.getKassa();
        int myMoney = kassaNomer1.getMonney();

        /*int a = 2, b = 3, c;
        c = b - a;*/

        //       char b = 'b';

        /*String s = "Привет";
        String s2 = "Вася";

        System.out.println(s + " " + s2);*/

         /*int a = 10, b = 4;
         //a = a-b;

        a = - b;

          */

        /* boolean b = true;


                System.out.println(b);
                System.out.println(!b);

         */
        /*int i = 3;

        System.out.println(++i);// выведет 4
        System.out.println(i++);// выведет 3, т.к. сначала присвоит 3, выведет, а потом только прибавит
        System.out.println(i--);// выведет 4

         */
        /*int i = 1;
        i++;
        System.out.println(i);

         */
        /*int a = 3;
        int b = 4;
        System.out.println(a==b); // выведет fasle
        System.out.println(a!=b); // выведет true

         */
        /*int a = 3;
        int b = 4;
        boolean t = a<b;
        System.out.println(true); // выведет true
        boolean f = a>b;
        System.out.println(false); // выведет false

         */
        /*Bank bank1 = new Bank();
        Bank bank2 = new Bank();
        System.out.println(bank1 == bank2);//выведет fasle потому что ссылки разные

         */

        /*Bank bank1 = new Bank();
        MonneyKassa = bank1.getKassa();
        System.out.println(bank1 == bank1.getKassa()); //вернет правду, потому что ссылка одна, на один объект в памяти

         */
        /*Bank bank1 = new Bank();
        Object obj = bank1;
        System.out.println(obj.equals(bank1)); // переопределили equals наследуемый от Object  и проверяем, выведет true

         */
        /*int age = 35;
        boolean creditCard = true;
        boolean male = true;
        System.out.println(giveCredit(age,creditCard,male));

    }
    public static boolean giveCredit(int age, boolean hasCredit, boolean maleOrFemale){

        return (age > 35 && !hasCredit && maleOrFemale) || !maleOrFemale; // вернет false, логика отработывает в зависимости от 86 страка, где указан инт (возраст)
    }

         */
    int price = 49;
    boolean hasLoya = true;
    boolean payNow = true;
        System.out.println(giveCredit(price,hasLoya,payNow));

}
    public static boolean giveCredit(int price, boolean hasLoya, boolean payNow){

        return (price > 50 && hasLoya && payNow); // цена выше 50 р, есть скидка и платит сейчас

    }
    public MonneyKassa getKassa() {
        return kassa;
    }

    public void setKassa(MonneyKassa kassa) {
        this.kassa = kassa;
    }
    {
        System.out.println("Всем привет");
    }
}
