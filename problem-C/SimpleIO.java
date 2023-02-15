public class SimpleIO {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        File file;
        while(true){
            file = new File(s.next());
            if(file.exists()) break;
            else {
                System.out.println("Enter the correct path to your file:");
            }
        }

        File newFile;
        while(true){
            newFile = new File(s.next());
            if(!file.getName().equals(newFile.getName())) break;
            else {
                System.out.println("Enter the another name than in file:");
            }
        }   
        try{
            Scanner scanner = new Scanner(file);
            PrintWriter pr = new PrintWriter(newFile);
            int countThe = 0;
            while(scanner.hasNext()){
                if(scanner.next().toLowerCase().equals("the"))countThe++;
            }
            scanner.close();
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                pr.println(sc.nextLine());
            }
            pr.println(countThe);
            pr.close();
            sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        s.close();
    }
}
