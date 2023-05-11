public class Train implements AbstractTrain {
    private int trainNumber;
    private String rout;
    private int distanceBetweenCities;
    private Status Status;
    private int numberOfLitresInTheTank;
    private int consumption;
    private IsEmpty IsEmpty;

    public Train(int trainNumber, String rout, int distanceBetweenCities, Status status, int numberOfLitresInTheTank, int consumption, IsEmpty isEmpty) {
        this.trainNumber = trainNumber;
        this.rout = rout;
        this.distanceBetweenCities = distanceBetweenCities;
        Status = status;
        this.numberOfLitresInTheTank = numberOfLitresInTheTank;
        this.consumption = consumption;
        IsEmpty = isEmpty;
    }

    @Override
    public void refueling() {
        int fuel = 10;
        setNumberOfLitresInTheTank(getNumberOfLitresInTheTank() + fuel);
    }

    @Override
    public void departure() {
        try {
            if (100 / getConsumption() * getDistanceBetweenCities() <= getNumberOfLitresInTheTank()) {
                System.out.println("поезд отправляется");
            } else {
                ThrowException.throwException3();
            }
        } catch (MyException myException) {
            throw new ExceptionRun(myException.getMessage(), myException.getCode());
        }
    }

    @Override
    public void statusChange(int k) {
        switch (k) {
            case 1:
                setStatus(Status.OnMyWay);
                break;
            case 2:
                setStatus(Status.Loading);
                break;
            case 3:
                setStatus(Status.Unloads);
                break;
            default:
                throw new RuntimeException("Выбрали неверный пункт");
        }


    }

    @Override
    public void setIsEmpty(int k) {
        switch (k) {
            case 1:
                setIsEmpty(IsEmpty.Loaded);
                break;
            case 2:
                setIsEmpty(IsEmpty.EMPTY);
                break;
            default:
                throw new RuntimeException("Выбрали неверный пункт");
        }
    }

    @Override
    public void unloading() {
        try {
            if (Status.equals(Status.OnMyWay)) {
                ThrowException.throwException();
            } else if (Status.equals(Status.Unloads) && (IsEmpty.equals(IsEmpty.EMPTY))) {
                ThrowException.throwException1();
                ;
            } else {
                System.out.println("поезд разгружается");
            }
        } catch (MyException myException) {
            throw new ExceptionRun(myException.getMessage(), myException.getCode());
        }


    }

    @Override
    public void loading() {
        try {
            if (Status.equals(Status.OnMyWay)) {
                ThrowException.throwException4();
            } else if (Status.equals(Status.Loading) && (IsEmpty.equals(IsEmpty.Loaded))) {
                ThrowException.throwException2();
            } else {
                System.out.println("поезд загружается");
            }
        } catch (MyException myException) {
            throw new ExceptionRun(myException.getMessage(), myException.getCode());
        }

    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getRout() {
        return rout;
    }

    public void setRout(String rout) {
        this.rout = rout;
    }

    public int getDistanceBetweenCities() {
        return distanceBetweenCities;
    }

    public void setDistanceBetweenCities(int distanceBetweenCities) {
        this.distanceBetweenCities = distanceBetweenCities;
    }

    public Status getStatus() {
        return Status;
    }

    public void setStatus(Status status) {
        Status = status;
    }

    public int getNumberOfLitresInTheTank() {
        return numberOfLitresInTheTank;
    }

    public void setNumberOfLitresInTheTank(int numberOfLitresInTheTank) {
        this.numberOfLitresInTheTank = numberOfLitresInTheTank;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public IsEmpty getIsEmpty() {
        return IsEmpty;
    }

    public void setIsEmpty(IsEmpty isEmpty) {
        IsEmpty = isEmpty;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNumber=" + trainNumber +
                ", rout='" + rout + '\'' +
                ", distanceBetweenCities=" + distanceBetweenCities +
                ", Status=" + Status +
                ", numberOfLitresInTheTank=" + numberOfLitresInTheTank +
                ", consumption=" + consumption +
                ", IsEmpty=" + IsEmpty +
                '}';
    }
}
