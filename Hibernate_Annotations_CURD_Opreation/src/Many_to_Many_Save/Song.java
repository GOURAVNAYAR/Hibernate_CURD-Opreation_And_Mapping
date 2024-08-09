package Many_to_Many_Save;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "song_5012")
public class Song {

	@Id
	@Column(name = "songId")
	private int songId;

	@Column(name = "songName")
	private String songName;

	@ManyToMany(targetEntity = Artist.class, fetch = FetchType.LAZY)
	private Set artist;

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Set getArtist() {
		return artist;
	}

	public void setArtist(Set artist) {
		this.artist = artist;
	}

}
