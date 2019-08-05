package java.com.imooc.entity.enums;


//订单状态
public enum OrderSTatus {
    INIT("初始化"),
    PROCESS("处理中"),
    SUCCESS("成功"),
    FAIL("失败");

    private String desc;

    OrderSTatus(String desc) {
        this.desc=desc;
    }

    public String getDesc(){
        return desc;
    }
}
