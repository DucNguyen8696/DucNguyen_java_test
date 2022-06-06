import CheckInPut.CheckInPut;
import Connection.ConnectionProvide;
import Repository.UserRepository;
import entity.User;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        ConnectionProvide.Question1KetNoi();
//        UserRepository.findByProjectId(2);
//        UserRepository.LogInAdmin("nguyenduc8696@gmail.com", "duc1234");
//        LogIn();
        CreateEployee();
    }

    public static void LogIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap email admin");
        String email = scanner.nextLine();
        if (!CheckInPut.CheckEmail(email)) {
            System.out.println("Email sai dinh dang");
            return;
        }
        System.out.println("hay nhap password");
        String password = scanner.nextLine();
        if (!CheckInPut.CheckPassword(password)) {
            System.out.println("password sai");
            return;
        }

        User user = UserRepository.LogInAdmin(email, password);
        if (user != null) {
            System.out.println("admin " + user.getFullname() + " da dang nhap");
        } else {
            System.out.println("Sai mat khau");
        }


    }
    public static void CreateEployee(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("hay nhap email");
        String email=scanner.nextLine();
        if (!CheckInPut.CheckEmail(email)){
            System.out.println("email sai dinh dang");
            return;
        }

        System.out.println("hay nhap full name");
        String fullname=scanner.nextLine();
        if (!CheckInPut.CheckFullName(fullname)){
            System.out.println("full name sai dinh dang");
            return;
        }

        UserRepository.taoUser(email,fullname);

    }

}
