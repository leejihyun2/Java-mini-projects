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
/*
    프로그램 설명
    취향을 고려한 기프트 카드를 보내기 위한 기프트 카드
    
    코드 설명
    1. 편의점 과 카페 중에 하나를 선택한다 
    2. 편의점은 CU, GS, 7/11 이 있다 
    3-1. 카페는 프차 와 저가 중 하나를 선택한다 
    3-2. 프차는 스벅, 투썸, 할리스 가 있다
    3-3. 저가는 메가, 컴포트, 더벤티 가 있다 

    코드 문제점
    - 사용자에게 입력 받는 부분이 조건문마다 중복이 된다 
    - 하드코딩 되어있어서 편의점명 카페명을 변경하기 어렵다 
    
    개선하기
    - 하드코딩된 카테고리를 배열에 담아서 사용하기 
    - 입력받는 부분 메서드로 만들어서 중복 줄이기 
    - if문 사용을 줄이기 위해 반복문 사용하기 
*/