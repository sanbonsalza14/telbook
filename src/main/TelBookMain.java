package main;

import db.DBConn;
import dto.TelDto;
import view.UserView;

import java.sql.Connection;
import java.util.Scanner;

public class TelBookMain {


    public static void main(String[] args) {
        UserView useView = new UserView();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.입력2.수정3.삭제 4.목록5.검색6.종료");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    useView.insertView();
                    break;
                case 2:
                    useView.updateView();
                    break;
                case 3:
                    useView.deleteView();
                case 4:
                    useView.findAllView();
                case 5:
                    useView.searchView();
                    break;
                case 6:
                    return;

            }
        }

    }
}
