import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class shootCar{
    private int adrId;

    private String carNum;

    private Date shootTime;
public float getAvgTravel(int beginAddress, int endAddress, List<shootCar> shootCars){
        int sum = 0;
        int counter = 0;
        List<String> carPs = new ArrayList<String>();
        //取出车牌号
        for(shootCar car:shootCars){
        if(!carPs.contains(car.getCarNum())){
        carPs.add(car.getCarNum());
        }
        }
//按照车牌号分别获取开始结束时间，求时间差，因为求平均值，求和即可
        for(String num : carPs){
                //找出开始结束时间
            shootCar start = null;
            shootCar finish = null;
            for(shootCar car:shootCars){
                if(car.getCarNum().equals(num)){
                    if(car.getAdrId() == beginAddress){
                        start = car;
                        }

                    if(car.getAdrId() == endAddress){
                        finish = car;
                        }
                }
            }
    //计算各个时间，并且求和；；以及总车辆数
            if(start!=null && finish!=null){
                counter++;
                long missec = finish.getShootTime().getTime()-start.getShootTime().getTime();
                sum+=missec;
            }
        }
//输出
        if(counter==0){
            return -1;
            }else{
            DecimalFormat df = new DecimalFormat("#.00");
            Float mean = Float.parseFloat(df.format(sum / counter / 1000 / 60.0));
            return mean;
            }
        }
}