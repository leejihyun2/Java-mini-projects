import java.util.*;
public class GiftSearch {
    public static void main(String[] args){
        int num;

        System.out.print("편의점(1) or 카페(2) 중 하나를 선택하시오: ");
        Scanner sc = new Scanner(System.in);

        num = Integer.parseInt(sc.nextLine());

        if(num==1){//편의점
            System.out.print("CU(1) or GS(2) or 7/11(3) 중 하나를 선택하시오: ");
            num = Integer.parseInt(sc.nextLine());  

            if(num==1){
                System.out.println("CU입니다");
            }else if(num==2){
                System.out.println("GS입니다");
            }else if(num==3){
                System.out.println("7/11입니다");
            }

        }else if(num==2){
            System.out.print("프차(1) or 저가(2) 중 하나를 선택하시오: ");
            num = Integer.parseInt(sc.nextLine());  

            if(num==1){//프차
                System.out.print("스벅(1) or 투썸(2) or 할리스(3) 중 하나를 선택하시오: ");
                num = Integer.parseInt(sc.nextLine()); 
                if(num==1){
                    System.out.println("스벅입니다");
                }else if(num==2){
                    System.out.println("투썸입니다");
                }else if(num==3){
                    System.out.println("할리스입니다");
                }

            }else if(num==2){//저가
                System.out.print("메가(1) or 컴포즈(2) or 더벤티(3) 중 하나를 선택하시오: ");
                num = Integer.parseInt(sc.nextLine());  

                if(num==1){
                    System.out.println("메가입니다");
                }else if(num==2){
                    System.out.println("컴포즈입니다");
                }else if(num==3){
                    System.out.println("더벤티입니다");
                }
            }
        }
    }
    
}
