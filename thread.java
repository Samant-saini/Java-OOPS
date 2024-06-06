class A extends Thread
{
    @Override
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("sam");
                Thread.sleep(1000);
            }

        }
        catch(InterruptedException i){

        }
            
    }
}
class thread{
    public static void main(String[] args) throws InterruptedException{
        A t=new A();
        t.start();

        for(int i=1;i<=5;i++){
            System.out.println("thread");
            Thread.sleep(1000);
        }
            
    

    }
}