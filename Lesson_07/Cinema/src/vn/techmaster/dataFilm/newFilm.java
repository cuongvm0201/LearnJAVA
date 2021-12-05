package vn.techmaster.dataFilm;


public class newFilm {
    private int idFilm;
    private String nameFilm;
    private String typeFilm;
    private int runTime;
    private String directorFilm;
    private int releaseTime;

    public newFilm(int idFilm, String nameFilm, String typeFilm, int runTime, String directorFilm, int releaseTime) {
        this.idFilm = idFilm;
        this.nameFilm = nameFilm;
        this.typeFilm = typeFilm;
        this.runTime = runTime;
        this.directorFilm = directorFilm;
        this.releaseTime = releaseTime;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public String getTypeFilm() {
        return typeFilm;
    }

    public void setTypeFilm(String typeFilm) {
        this.typeFilm = typeFilm;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public String getDirectorFilm() {
        return directorFilm;
    }

    public void setDirectorFilm(String directorFilm) {
        this.directorFilm = directorFilm;
    }

    public int getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(int releaseTime) {
        this.releaseTime = releaseTime;
    }

    @Override
    public String toString() {
        return "Mã: " + idFilm + "\n" +
                "Tên phim: " + nameFilm + "\n" +
                "Thể loại: " + typeFilm + "\n" +
                "Thời lượng(phút): " + runTime + "\n" +
                "Đạo diễn: " + directorFilm + "\n" +
                "Năm sản xuất: " + releaseTime;
    }
}
