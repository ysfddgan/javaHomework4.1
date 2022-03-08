
public class Main {

	public static void main(String[] args) {
		Gamer gamer1= new Gamer(1, "ysfdgn", "Yusuf Doğan", "123456");
		GamerManager gamerManager = new GamerManager();
		GamerSaveManager gamerSaveManager = new GamerSaveManager();
		gamerSaveManager.save(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);
		
		
		
		SellingManager sellingManager = new SellingManager();
		sellingManager.sell(gamer1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(gamer1);
		campaignManager.delete(gamer1);
		campaignManager.update(gamer1);
		
		
	}

}
