public class Test3222 {

    public String losingPlayer(int x, int y) {

        //根据x的数量来确定y
        boolean flag=true;

        while(x>0 && y>0){
            x--;
            y-=4;
            if (y>=0){
                flag=!flag;
            }
        }
        return flag?"Alice":"Bob";
    }
}
