
public class GamerManager {
	
	public void update(Gamer gamer) {
		System.out.println("Bilgiler g�ncellendi. "+gamer.getUserName());
	}
	
	public void delete (Gamer gamer) {
		System.out.println("Oyuncu silindi. "+gamer.getUserName());
	}
	
}
