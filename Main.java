package baitap;

public class Main {
    public static void main(String[] args) {
        KhaiBao kb= new KhaiBao();
        KhaiBao kb2=new KhaiBao("Nguyễn Hoàng Phi","Xây Dụng","A",8,9,10);
        kb2.caNhan();
        kb2.xepHang();
        kb2.full();
        System.out.println((kb2.tongDiem15(7,8,9)*1+ kb2.tongDiem1t(8,8,8)*2+ kb.tongDiemHk(9,9,9)*3)/18);
        KhaiBao kb3= new KhaiBao("Nguyễn Hoàng Phi","Xây Dựng","a");
        KhaiBao Kb15=new KhaiBao(8,9,10);


    }
}
