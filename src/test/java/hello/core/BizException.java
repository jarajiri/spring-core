package hello.core;

public class BizException extends RuntimeException{
    public BizException(String msg){
        super(msg);
    }
    public BizException(Exception e){
        super(e);
    }
}
