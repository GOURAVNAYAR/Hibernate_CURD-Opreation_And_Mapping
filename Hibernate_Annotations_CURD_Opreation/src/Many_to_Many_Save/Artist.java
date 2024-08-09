package Many_to_Many_Save;

import java.util.Set;
import Many_to_Many_Save.Artist;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Artist_512")
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "artistId")
	private int artistId;

	@Column(name = "artistName")
	private String artistName;

	@ManyToMany(targetEntity = Song.class, cascade = CascadeType.ALL)
	@JoinTable(name = "ARTIST_SONG", joinColumns = @JoinColumn(name = "artistId"), 
	inverseJoinColumns = @JoinColumn(name = "songId"))
	private Set<Song> songs;

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public Set<Song> getSongs() {
		return songs;
	}

	public void setSongs(Set<Song> songs) {
		this.songs = songs;
	}

}