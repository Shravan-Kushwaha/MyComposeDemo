package com.mycomposeapp.domain

import com.google.gson.annotations.SerializedName

data class InitResponse(

	@field:SerializedName("is_cart")
	val isCart: Boolean? = null,

	@field:SerializedName("tamara_api_url")
	val tamaraApiUrl: String? = null,

	@field:SerializedName("show_app_review")
	val showAppReview: Boolean? = null,

	@field:SerializedName("order_game")
	val orderGame: String? = null,

	@field:SerializedName("currency_code")
	val currencyCode: String? = null,

	@field:SerializedName("referal_game")
	val referalGame: String? = null,

	@field:SerializedName("user_referal_code")
	val userReferalCode: String? = null,

	@field:SerializedName("state")
	val state: Int? = null,

	@field:SerializedName("invite_message_en_ios")
	val inviteMessageEnIos: String? = null,

	@field:SerializedName("enable_cod")
	val enableCod: Boolean? = null,

	@field:SerializedName("tamara_api_token")
	val tamaraApiToken: String? = null,

	@field:SerializedName("tamara_payment_mode")
	val tamaraPaymentMode: Boolean? = null,

	@field:SerializedName("invite_message")
	val inviteMessage: String? = null,

	@field:SerializedName("image_url")
	val imageUrl: String? = null,

	@field:SerializedName("wallet_balance")
	val walletBalance: String? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("moyasar_secret_key")
	val moyasarSecretKey: String? = null,

	@field:SerializedName("is_physical_cart")
	val isPhysicalCart: Boolean? = null,

	@field:SerializedName("tamara_installment")
	val tamaraInstallment: List<Int?>? = null,

	@field:SerializedName("invite_message_ar_ios")
	val inviteMessageArIos: String? = null,

	@field:SerializedName("country_code")
	val countryCode: String? = null,

	@field:SerializedName("auto_fill_mobile_no")
	val autoFillMobileNo: List<String?>? = null,

	@field:SerializedName("moyasar_publish_key")
	val moyasarPublishKey: String? = null,

	@field:SerializedName("tamara_notification_token")
	val tamaraNotificationToken: String? = null,

	@field:SerializedName("tamara_public_key")
	val tamaraPublicKey: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)
