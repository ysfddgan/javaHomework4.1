
public class CampaignManager {
	void add(Gamer gamer) {
		System.out.println(gamer.getNickName()+": kampanya eklendi");
	}
	
	void delete(Gamer gamer) {
		System.out.println(gamer.getNickName()+": kampanya silindi");
	}
	
	void update(Gamer gamer) {
		System.out.println(gamer.getNickName()+": kampanya güncellendi.");
	}
}
