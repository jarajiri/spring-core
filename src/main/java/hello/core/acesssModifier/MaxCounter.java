package hello.core.acesssModifier;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }
    public void increment(){
        if(isMax(this.count)){
            count++;
        }else {
            System.out.println("최대입니다.");
        }
    }
    private boolean isMax(int count){
        return this.count != max;
    }
    public int getCount(){
        return this.count;
    }
}
