public class GenericYazdir <E> {

        //Sana E tipinde veriler gonderecegim bunları E gordugun yere yazdir.
        //Genereic Classlar.
    public void yazdir(E[] dizi){

        for(E e: dizi){

            System.out.println(e);
        }

    }
}
