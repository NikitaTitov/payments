package ru.nikita.auth.models.dto.update;

import lombok.Data;

@Data
public class SapCdcUpdateUserPhoneOrEmailResponse {
	private int apiVersion;
	private String callId;
	private int errorCode;
	private String errorDetails;
	private String errorMessage;
	private String fullEventName;
	private String time;
}
