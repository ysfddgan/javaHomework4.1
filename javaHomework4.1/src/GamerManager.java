
public class GamerManager {
	
	public void update(Gamer gamer) {
		System.out.println("Bilgiler güncellendi. "+gamer.getUserName());
	}
	
	public void delete (Gamer gamer) {
		System.out.println("Oyuncu silindi. "+gamer.getUserName());
	}
	
}
