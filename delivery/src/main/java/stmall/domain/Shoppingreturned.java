package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Shoppingreturned extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String itemId;
    private Integer qty;
    private String status;
    private String address;

    public Shoppingreturned() {
        super();
    }
}
//>>> DDD / Domain Event
