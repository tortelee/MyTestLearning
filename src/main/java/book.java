public class book {
    private int pageNum =200;
    private String name;

    public void setPageNum(int pageNum) {
        if(pageNum<200){
            System.out.println("worry number");
        }else{
        this.pageNum = pageNum;}
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getName() {
        return name;
    }
    public void detail(){
        System.out.println("bookname:"+this.name+"page:"+this.pageNum);
    }
}
