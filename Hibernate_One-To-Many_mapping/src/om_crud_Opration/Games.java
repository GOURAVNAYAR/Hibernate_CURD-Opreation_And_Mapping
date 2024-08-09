package om_crud_Opration;

public class Games {
	private int gamesId;
	private String gamesName;
	private int gamesTotalplayer;
	private Playground parentObjects;

	public int getGamesId() {
		return gamesId;
	}

	public void setGamesId(int gamesId) {
		this.gamesId = gamesId;
	}

	public String getGamesName() {
		return gamesName;
	}

	public void setGamesName(String gamesName) {
		this.gamesName = gamesName;
	}

	public int getGamesTotalplayer() {
		return gamesTotalplayer;
	}

	public void setGamesTotalplayer(int gamesTotalplayer) {
		this.gamesTotalplayer = gamesTotalplayer;
	}

	public Playground getParentObjects() {
		return parentObjects;
	}

	public void setParentObjects(Playground parentObjects) {
		this.parentObjects = parentObjects;
	}

}
