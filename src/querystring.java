public class querystring
{
    public static void main(String[] args) {
        String filename="first";
        String extension=".1";
        String path="c:/student/";

        String newfilename=String.format("%s%s%s",path,filename,extension);
        newfilename=path+filename+extension;
        System.out.println(newfilename);

    }
}
