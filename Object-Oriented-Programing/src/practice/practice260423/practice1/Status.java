package practice.practice260423.practice1;
import java.time.*;

public enum Status {
    LogIn(LocalDateTime.now()), LogOut(LocalDateTime.now());
    private LocalDateTime now;
    String getTime() {
        return now.toString();
    }
    Status(LocalDateTime now){
        this.now = now;
    }
}

class Main {
    public static void main(String[] args) {
        Status s = Status.LogOut;
        switch(s){
            case LogIn:
                System.out.println("로그인 되었습니다. 시각 : " + Status.LogIn.getTime());
                break;
            case LogOut:
                System.out.println("로그아웃 되었습니다. 시각 : " + Status.LogOut.getTime());
        }
    }
}
