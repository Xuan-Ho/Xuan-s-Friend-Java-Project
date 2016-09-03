
public class FriendStats {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------");
		System.out.println("/////////////////XUAN'S FRIENDS/////////////////");
		System.out.println("-------------------------------------------------");
		
		AlexQuang testAlex = new AlexQuang("Alex Quang", 24, "Male");
		testAlex.sayMyName();
		Friend testQuang = new QuangTran();
		testQuang.message();
		Friend testTrung = new TrungPham();
		testTrung.message();
		Friend testAnthony = new AnthonyQuang();
		testAnthony.message();
		
		
		
	}

}
