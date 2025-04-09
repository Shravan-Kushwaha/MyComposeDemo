package com.mycomposeapp.domain



import com.google.gson.annotations.SerializedName

data class LoginResponse(
    override val message: String,
    override val status: Boolean,
    @SerializedName("is_cart")
    val isCart: Boolean,
    @SerializedName("is_new_user")
    val isNewUser: Boolean,
    @SerializedName("show_app_review")
    val showAppReview: Boolean,
    @SerializedName("invite_message")
    val inviteMessage: String,
    @SerializedName("user_referal_code")
    val userReferalCode: String,
    val user: User,

    @SerializedName("enable_cod")
    val enableCOD: Boolean,
) : BaseResponseInterface