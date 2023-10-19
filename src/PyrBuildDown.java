public class PyrBuildDown
{
    public static void main(String[] arg)
    {
        String stars = "";
        for(int i = 5; i >= 1; i--)
        {
            for(int s = i; s >= 1; s--)
                stars += "*";
            System.out.println(stars);
            stars = "";
        }

    }
}
