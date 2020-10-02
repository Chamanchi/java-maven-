package MavenProject;

public class DataProvider {
    public void setData(String username, String password){
        System.out.println("your username is :" + username@gmail.com);
        System.out.println("your password is :" +password123);
    }
    @DataProvider
    public object[][] getData(){
        object[][] data=new object[1][0];
        data[0][0]="username@gmail.com";
        data[0][1]="password123";
        return data;
    }
}
