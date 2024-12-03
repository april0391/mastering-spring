package hello.pay;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
//@Component
public class LocalPayClient implements PayClient {

    @Override
    public void pay(int money) {
        log.info("로컬 결제 money={}", money);
    }
}
