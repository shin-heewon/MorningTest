package BookMarket;//출력값이 Console창에 표현되는 방식 : CLI 프로그램 / GUI방식(사용자가 클릭만으로 조작할 수 있는 그래픽 화면을 제공하는 방식)

import java.util.Scanner;

public class MoningTest_0619 {


    public static void main(String[] args) {

        BookMarket mk = new BookMarket();

        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        mk.setName(sc.next());

        System.out.print("\n연락처를 입력하세요 : ");
        mk.setPhoneNum(sc.next());

        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";

        boolean quit = false;



        MoningTest_0619 mt = new MoningTest_0619();

        mt.menuIntroduction(greeting, tagline);



        while (quit==false) {


            System.out.print("\n메뉴 번호를 선택해주세요 ");
            int menuNum = Integer.parseInt(sc.next());
            ;
            System.out.println(menuNum + "번을 선택했습니다.\n");

            if (menuNum < 1 || menuNum > 8) {
                System.out.println("메뉴는 1부터 8까지의 숫자로 입력해 주세요!");

            } else {
                switch (menuNum) {
                    case 1:
                        mt.menuGuestInfo();
                        break;
                    case 2:
                        mt.menuCartItemList();
                        break;
                    case 3:
                        mt.menuCartClear();
                        break;
                    case 4:
                        mt.menuCartBill();
                        break;
                    case 5:
                        mt.menuCartAddItem();
                        break;
                    case 6:
                        mt.menucartRemoveItemCount();
                        break;
                    case 7:
                        mt.menuCartRemoveItem();
                        break;
                    case 8:
                        quit = mt.menuExit();
                        break;
                }//switch end

            }//else end
        }//while end



        /*while (quit==false) {
            System.out.println("****************************************************");

            System.out.println("\t\t" + greeting);
            System.out.println("\t\t" + tagline);

            System.out.println("****************************************************");
            System.out.println("1. 고객 정보 확인하기       5. 바구니에 항목 추가하기");
            System.out.println("2. 장바구니 상품 목록 보기   6. 장바구니의 항목 수량 줄이기");
            System.out.println("3. 장바구니 비우기          7. 장바구니의 항목 삭제하기");
            System.out.println("4. 영수증 표시하기          8. 종료");
            System.out.println("****************************************************");

            System.out.print("\n메뉴 번호를 선택해주세요 ");
            int menuNum = Integer.parseInt(sc.next());
            ;
            System.out.println(menuNum + "번을 선택했습니다.\n");

            if (menuNum < 1 || menuNum > 8) {
                System.out.println("메뉴는 1부터 8까지의 숫자로 입력해 주세요!");

            } else {
                switch (menuNum) {
                    case 1:
                        System.out.println("1. 고객 정보 확인하기");
                        System.out.println("고객 이름 : " + mk.getName() + ", 고객 번호 : " + mk.getPhoneNum());
                        break;
                    case 2:
                        System.out.println("2. 장바구니 상품 목록 보기");
                        break;
                    case 3:
                        System.out.println("3. 장바구니 비우기");
                        break;
                    case 4:
                        System.out.println("4. 영수증 표시하기");
                        break;
                    case 5:
                        System.out.println("5. 바구니에 항목 추가하기");
                        break;
                    case 6:
                        System.out.println("6. 장바구니의 항목 수량 줄이기");
                        break;
                    case 7:
                        System.out.println("7. 장바구니의 항목 삭제하기");
                        break;
                    case 8:
                        System.out.println("8. 종료");
                        System.out.println("온라인 도서몰을 찾아주셔서 감사합니다. 다음에 다시 뵙겠습니다.");
                        quit = true;
                        break;
                }//switch end

            }//else end
        }//while end*/





    }//main end



    void menuIntroduction(String greeting, String tagline) {

        System.out.println("****************************************************");

        System.out.println("\t\t" + greeting);
        System.out.println("\t\t" + tagline);

        System.out.println("****************************************************");
        System.out.println("1. 고객 정보 확인하기       5. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기   6. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기          7. 장바구니의 항목 삭제하기");
        System.out.println("4. 영수증 표시하기          8. 종료");
        System.out.println("****************************************************");

        ;

    }//menuIntroduction end


    void menuGuestInfo(){

        BookMarket mk = new BookMarket();

        System.out.println("1. 고객 정보 확인하기");
        System.out.println("고객 이름 : " + mk.getName() + ", 고객 번호 : " + mk.getPhoneNum());
    }

    void menuCartItemList(){
        System.out.println("2. 장바구니 상품 목록 보기");
    }


    void menuCartClear(){
        System.out.println("3. 장바구니 비우기");
    }

    void menuCartAddItem(){
        System.out.println("5. 바구니에 항목 추가하기");
    }

    void menuCartBill(){
        System.out.println("4. 영수증 표시하기");
    }

    void menucartRemoveItemCount(){
        System.out.println("6. 장바구니의 항목 수량 줄이기");
    }

    void menuCartRemoveItem(){
        System.out.println("7. 장바구니의 항목 삭제하기");
    }

    boolean menuExit(){
        System.out.println("8. 종료");
        System.out.println("온라인 도서몰을 찾아주셔서 감사합니다. 다음에 다시 뵙겠습니다.");

        return true;
    }

}

