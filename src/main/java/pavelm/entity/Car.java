package pavelm.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "series")
    private int series;
    @Column(name = "model")
    private String model;
    @OneToMany(mappedBy = "car")
    private List<User> userList;

    public Car() {
    }

    public Car(int series, String model) {
        this.series = series;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}

////    @Override
////    public String toString() {
////        return "Car{" +
////                "id=" + id +
////                ", series=" + series +
////                ", model='" + model + '\'' +
////                ", userList=" + userList +
////                '}';
////    }
////
////    @Override
////    public boolean equals(Object o) {
////        if (this == o) return true;
////        if (o == null || getClass() != o.getClass()) return false;
////        Car car = (Car) o;
////        return id == car.id && series == car.series && Objects.equals(model, car.model) && Objects.equals(userList, car.userList);
////    }
////
////    @Override
////    public int hashCode() {
////        return Objects.hash(id, series, model, userList);
////    }
//}
