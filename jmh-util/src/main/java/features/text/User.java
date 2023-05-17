package features.text;

public class User {

    private int id;
    private String username;
    private String email;
    private String password;

    public User(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

   /*@Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }*/


    @Override
    public String toString() {
        return String.format(
                """
                    User: {
                     "username": "%s",
                     "email": "%s"
                   }
                """
                , username, email
        );
    }
}
