
public class GamerSaveManager implements CheckGamer {
	void save (Gamer gamer) {
		System.out.println("Oyuncu kaydedildi. "+gamer.getNickName());
	}
	@Override
	public boolean isValid(Gamer gamer) {
		return true;
	
	}
}
