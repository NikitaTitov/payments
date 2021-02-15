package ru.nikita.auth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import ru.nikita.auth.models.dto.SapUserDetailRequest;
import ru.nikita.auth.models.dto.SapUserDetailResponse;

@FeignClient(name = "SapClient", url = "https://accounts.ru1.gigya.com")
public interface MegaSapCdcClient {

	@PostMapping("/accounts.otp.sendCode")
	SapUserDetailResponse sendRegistrationCode(SapUserDetailRequest request);

	@PostMapping("/accounts.otp.login")
	SapUserDetailResponse login(SapUserDetailRequest request);

	@PostMapping("/accounts.otp.update")
	SapUserDetailResponse updateUserPhoneOrEmail(SapUserDetailRequest request);

	@PostMapping("/accounts.finalizeRegistration")
	SapUserDetailResponse finalizeRegistration(SapUserDetailRequest request);
}
