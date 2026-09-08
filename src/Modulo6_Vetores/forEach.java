package Modulo6_Vetores;

public class forEach {
    public static void main(String[] args){


        String[] vect = new String[] {"Danilo", "Larissa", "Lucca"};

        //for padrao
        for(int i = 0; i < vect.length; i++){

            System.out.println(vect[i]);
        }


        System.out.println("----------------");
        //For each
        // for (tipo vetor / apelido : vetor)

        for(String obj: vect){
            System.out.println(obj);
        }
    }
}
