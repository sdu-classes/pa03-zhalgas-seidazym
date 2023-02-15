public static String[] ReadFile(String fileName){
        File file = new File("OOP\\HW_3\\Problem_B\\" + fileName);
        ArrayList<String> arr = new ArrayList<>();
        int lineCounter = 0;
        try(Scanner scan = new Scanner(file)){
            while(scan.hasNext()){
                arr.add(lineCounter, scan.nextLine());
                lineCounter++;
            }
        }catch(FileNotFoundException f){
            f.printStackTrace();
        }

        String[] lines = new String[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            lines[i] = arr.get(i);
        }

        return lines;
    }
