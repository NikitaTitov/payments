package ru.nikita.auth.models.dto.login;

import lombok.Data;
import ru.nikita.auth.models.dto.GigyaAccount;

@Data
public class SapCdcLoginResponse {
	private String UID;
	private String UIDSignature;
	private boolean isNewUser;
	private String sessionInfo;
	private String regToken;
	private GigyaAccount account;
	private int apiVersion;
	private String callId;
	private int errorCode;
	private String errorDetails;
	private String errorMessage;
	private String fullEventName;
	private String time;

}
