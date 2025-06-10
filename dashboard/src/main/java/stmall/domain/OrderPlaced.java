package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private String itemId;
    private Integer qty;
    private String address;
}
