package ru.nikita.auth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import ru.nikita.auth.models.dto.finalizeRegistration.SapCdcFinalizeRegistrationRequest;
import ru.nikita.auth.models.dto.finalizeRegistration.SapCdcFinalizeRegistrationResponse;
import ru.nikita.auth.models.dto.login.SapCdcLoginRequest;
import ru.nikita.auth.models.dto.login.SapCdcLoginResponse;
import ru.nikita.auth.models.dto.smsCode.SendRegistrationSmsCodeRequest;
import ru.nikita.auth.models.dto.smsCode.SendRegistrationSmsCodeResponse;
import ru.nikita.auth.models.dto.update.SapCdcUpdateUserPhoneOrEmailRequest;
import ru.nikita.auth.models.dto.update.SapCdcUpdateUserPhoneOrEmailResponse;

@FeignClient(name = "SapClient", url = "https://accounts.ru1.gigya.com")
public interface MegaSapCdcClient {

	@PostMapping("/accounts.otp.sendCode")
	SendRegistrationSmsCodeResponse sendRegistrationCode(SendRegistrationSmsCodeRequest request);

	@PostMapping("/accounts.otp.login")
	SapCdcLoginResponse login(SapCdcLoginRequest request);

	@PostMapping("/accounts.otp.update")
	SapCdcUpdateUserPhoneOrEmailResponse updateUserPhoneOrEmail(SapCdcUpdateUserPhoneOrEmailRequest request);

	@PostMapping("/accounts.finalizeRegistration")
	SapCdcFinalizeRegistrationResponse finalizeRegistration(SapCdcFinalizeRegistrationRequest request);
}
