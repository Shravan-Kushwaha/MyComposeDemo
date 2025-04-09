package com.mycomposeapp.domain



import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("account_id")
    val accountId: String,
    val active: Int,
    @SerializedName("api_key")
    val apiKey: String? = null,
    val balance: String,
    @SerializedName("transferable_balance")
    val transferableBalance: String,
    @SerializedName("expiry_balance")
    val expiryBalance: String,
    val city: String?,
    @SerializedName("default_payment_method")
    val defaultPaymentMethod: Int,
    @SerializedName("delivery_boy_type")
    val deliveryBoyType: Int,
    @SerializedName("driving_license")
    val drivingLicense: String,
    val duty: Int,
    val email: String? = null,
    @SerializedName("first_name")
    val firstName: String?,
    val group: String,
    val id: Int,
    @SerializedName("influencer_referral_code")
    val influencerReferralCode: String? = null,
    @SerializedName("influencer_referral_id")
    val influencerReferralId: Any,
    @SerializedName("insurance_certi")
    val insuranceCerti: String,
    @SerializedName("is_complete_profile")
    val isCompleteProfile: Int,
    @SerializedName("is_first")
    val isFirst: String,
    @SerializedName("last_name")
    val lastName: String?,
    @SerializedName("ai_gender")
    val aiGender: String?,
    val latitude: String,
    val longitude: String,
    @SerializedName("national_id")
    val nationalId: String?,
    @SerializedName("notification_status")
    val notificationStatus: Int,
    val phone: String,
    @SerializedName("profile_picture")
    val profilePicture: String,
    val rating: Int,
    @SerializedName("referral_code")
    val referralCode: String,
    @SerializedName("role_id")
    val roleId: Any,
    @SerializedName("social_id")
    val socialId: String,
    @SerializedName("social_type")
    val socialType: String?,
    @SerializedName("vendor_role_id")
    val vendorRoleId: String?,
    @SerializedName("vendor_sub_id")
    val vendorSubId: String?,
    @SerializedName("vendor_time")
    val vendorTime: String
)