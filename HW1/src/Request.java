public class Request {
    private String email;
    private int cc_num;
    private String sweetheart;
    private Boolean done;

    private Clubmember member;
    private Song song;

    public Request(String email, int cc_num, String sweetheart, Clubmember member, Song song){
        this.email = email;
        this.cc_num = cc_num;
        this.sweetheart = sweetheart;
        this.member = member;
        this.song = song;
    }

    public String getEmail() {
        return email;
    }

    public int getCcNum() {
        return cc_num;
    }

    public String getSweetheart() {
        return sweetheart;
    }

    public Boolean getDone() {
        return done;
    }

    public Clubmember getMember() {
        return member;
    }

    public Song getSong() {
        return song;
    }
}
