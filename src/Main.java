public class Main {
    String name;
    String surName;
    public static void main(String[] args) {
      Main people = new Main();
      people.people("Ruslan","Nazarenko");
        System.out.println("People name: "+ people.name+ " , "+ "sername: " + people.surName);
    }
        public String people(String name,String surName){
            this.name=name;
            this.surName=surName;
        return name+surName;
    }
    }
