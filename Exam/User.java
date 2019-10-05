import java.util.*;

public class User {
    String name;
    User[] connections;
    String noOfConnections;
    
User (String n,String c)
{
    this.name = n;
    this.noOfConnections = c;
    this.connections = new User[20];
}

public String toString(String[] s) {
    // String f = "";
    // for (int i = 0; i < s.length(); i++) {
    //     f = f + " " + connections[i].name;
    // }
    return this.name + "is connected to " ;
}
public String getUserName() {
    return this.name;
}
public void setUserName(String toSet) {
    this.name = toSet;
}
}