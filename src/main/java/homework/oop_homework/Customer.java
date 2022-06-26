package homework.oop_homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@ToString
@Getter
@Setter
public class Customer {

    private String name;
    private boolean member;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }
//    public String getName() {
//        return name;
//    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public boolean isMember() {
        boolean isMember;
        if ((!Objects.equals(memberType, "Premium")) && (!Objects.equals(memberType, "Gold")) && (!Objects.equals(memberType, "Silver"))) {
            isMember = false;
        } else {
            isMember = true;
        }
        return isMember;
    }

}
