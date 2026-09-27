package test.Exceções;

public class desempilhamento_de_pilha {
    static void main(String[] args){
        try{
            method1();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void method1() throws Exception{
        try{
            method2();
        } catch (Exception e){
            throw new Exception("Exception thrown in method1");
        }
    }

    public static void method2() throws Exception{
        try{
            method3();
        } catch (Exception e){
            throw new Exception("Exception thrown in method2");
        }
    }

    public static void method3() throws Exception{
        throw new Exception("Exception thrwon in method3");
    }


}
