class ParkingSystem {
    int big, medium, small;
    public ParkingSystem(int big, int medium, int small) {
        this.big= big;
        this.medium= medium;
        this.small= small;
    }
    int bigC=0;
    int medC=0;
    int smallC=0;    
    public boolean addCar(int carType) {
        if(carType==3){
            if(smallC< small){
                smallC++;
                return true;
            }
            return false;
        }
        else if(carType==2){
            if(medC< medium){
                medC++;
                return true;
            }
            return false;
        }
        else if(carType==1){
            if(bigC< big){
                bigC++;
                return true;
            }
            return false;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */