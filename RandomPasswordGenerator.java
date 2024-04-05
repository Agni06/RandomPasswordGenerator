public class RandomPasswordGenerator {
    public  void printPasswords(String[] pass)
    {
        for(int i=0;i<pass.length;i++)
        {
            System.out.println(pass[i]);
        }
    }
    public  char randomCharacter()
    {
        int rand = (int)(Math.random()*62);
        if(rand <= 9 )
        // 48 - 57
        {
            return (char)(rand+48);

        }
        else if(rand<= 35)
        //65 - 90
        {
            return (char)(rand+55);//65-10

        }
        else
        //97 - 122
        {
            return (char)(rand+61);//97 - 36
        }

    }

}
