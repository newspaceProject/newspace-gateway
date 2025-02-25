package com.lgcns.newspacegateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public ResponseEntity<String> fallback() {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                .body("[Circuit Breaker] 서비스를 이용할 수 없습니다. 잠시 후 다시 시도해주세요.");
    }
}
