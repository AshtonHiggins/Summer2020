package com.company;
public class KChallenge {
    public static final int SIZE= 6;
    public static void main(String[] args) {
        // Call all my functions
        Top();
        Bottom();
    }

        public static void Top(){
            for (int line=SIZE; line>0; line--){
                for(int letters=0; letters< line; letters++){
                    System.out.print((char)(65+letters));
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        public static void Bottom(){
            for(int line=1;line<= SIZE; line++){
                for(int letters= 0; letters<line; letters++){
                    System.out.print((char)(65+letters));
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
}