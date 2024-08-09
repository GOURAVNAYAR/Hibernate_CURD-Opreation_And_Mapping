package mm_visual_delete;

import java.util.HashSet;
import java.util.Set;

public class Games {
    private Long gamesId;
    private String gamesName;
    private Set<Student> students = new HashSet<>();

    public Long getGamesId() {
        return gamesId;
    }

    public void setGamesId(Long gamesId) {
        this.gamesId = gamesId;
    }

    public String getGamesName() {
        return gamesName;
    }

    public void setGamesName(String gamesName) {
        this.gamesName = gamesName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
