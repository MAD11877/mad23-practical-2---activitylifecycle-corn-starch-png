package sg.edu.np.mad.madpractical;

public class User {
    private String name;
    private String description;
    private int id;
    private boolean followed;
    public User(String Name,String Description,int Id, boolean Followed){
            name = Name;
            description = Description;
            id = Id;
            followed = Followed;
    }
    public boolean getFollowed(){
        return followed;
    }
    public void setFollowed(boolean newFollowed) {
        followed = newFollowed;
    }

}
