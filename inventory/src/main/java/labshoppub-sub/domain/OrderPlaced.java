package labshoppub-sub.domain;

import labshoppub-sub.domain.*;
import labshoppub-sub.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
}


