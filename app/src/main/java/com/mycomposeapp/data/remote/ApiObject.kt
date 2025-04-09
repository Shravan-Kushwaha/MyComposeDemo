package com.mycomposeapp.data.remote

class ApiObject {

    object ApiHeaderKey {
        const val LANG = "lang"
        const val X_API_KEY = "x-api-key"
    }

    object ApiHeaderValue {
        const val LANG_EN = "en"
        const val LANG_AR = "ar"
    }

    object MiddlePoint {
        const val AUTH = "customer/Auth/"
        const val PRODUCTS = "customer/Products/"
        const val DELIVERY_ADDRESSES = "customer/DeliveryAddresses/"
        const val PROFILE = "customer/Profile/"
        const val WALLET_MANAGE = "customer/WalletManage/"
        const val PAYMENT_CARDS = "customer/PaymentCards/"
        const val USERS = "customer/Users/"
        const val ORDER = "customer/Order/"
        const val SERVICE = "customer/Service/"
        const val GIFT_CARD = "customer/GiftCard/"
        const val CHAT = "common/Chat/"
        const val COMMON = "customer/Common/"
        const val PRODUCT_REVIEW_RATINGS = "customer/ProductReviewRatings/"
        const val GAME = "customer/Games/"
        const val FOOD_DELIVERY = "customer/FoodDelivery/"
        const val AIR_TICKET = "customer/AirTicket/"
        const val AI = "customer/ai/"
        const val GROCERY_DELIVERY = "customer/GroceryDelivery/"
        const val PHARMACY_DELIVERY = "customer/PharmacyDelivery/"
        const val LABORATORY_DELIVERY = "customer/LaboratoryDelivery/"
        const val TELE_HEALTH = "customer/TeleHealth/"
        const val MERCHANT_STORE = "customer/MerchantStore/"
        const val TOP_UP = "customer/Topup/"
        const val VISA = "customer/Onevisa/"
        const val E_SIM = "customer/Esim/"
        const val UTILITY = "customer/Utility/"
    }

    object EndPoint {
        const val INIT = MiddlePoint.AUTH.plus("init")
        const val SEND_OTP = MiddlePoint.AUTH.plus("send_otp")
        const val SEND_GIFT_CARD_OTP = MiddlePoint.GIFT_CARD.plus("send_otp")
        const val NEW_LOGIN = MiddlePoint.AUTH.plus("new_login")
        const val LOGOUT = MiddlePoint.AUTH.plus("logout")
        const val DELETE_ACCOUNT = MiddlePoint.AUTH.plus("delete_account")
        const val APP_REVIEW = MiddlePoint.AUTH.plus("app_review")

        const val HOME = MiddlePoint.PRODUCTS.plus("home")
        const val GET_CATEGORY_RESTAURANTS = MiddlePoint.PRODUCTS.plus("get_category_restaurants")
        const val GET_NEARBY_RESTAURANTS = MiddlePoint.PRODUCTS.plus("nearby_restaurants")
        const val GET_ALL_RESTAURANTS = MiddlePoint.PRODUCTS.plus("all_restaurants")
        const val GET_ALL_SERVICE_MERCHANTS = MiddlePoint.PRODUCTS.plus("get_all_service_merchants")
        const val GET_FEATURED_PRODUCTS = MiddlePoint.PRODUCTS.plus("featured_products")
        const val GET_PRODUCTS_LIST = MiddlePoint.PRODUCTS.plus("products_list")
        const val GET_PRODUCTS_LIST_NEW = MiddlePoint.PRODUCTS.plus("products_list_new")
        const val GET_MOST_SELLING_PRODUCTS = MiddlePoint.PRODUCTS.plus("most_selling_products")
        const val GET_WISHLIST_PRODUCTS = MiddlePoint.PRODUCTS.plus("get_wishlist_products")
        const val GET_SPECIAL_OFFER_PRODUCTS = MiddlePoint.PRODUCTS.plus("special_offer_products")
        const val GET_BRANDS_PRODUCTS = MiddlePoint.PRODUCTS.plus("brand_products")
        const val GET_BRANDS = MiddlePoint.PRODUCTS.plus("brands")
        const val GET_MERCHANT_DETAIL = MiddlePoint.PRODUCTS.plus("get_merchant_detail")
        const val SET_FAVORITE_UNFAVORITE_RESTAURANT = MiddlePoint.PRODUCTS.plus("favorite_unfavorite_restaurant")
        const val FAVORITE_UNFAVORITE_PRODUCT = MiddlePoint.PRODUCTS.plus("favorite_unfavorite_product")
        const val GET_CATEGORIES = MiddlePoint.PRODUCTS.plus("get_store_type_category")
//        const val GET_CATEGORIES = MiddlePoint.PRODUCTS.plus("get_sub_category")
        const val GET_PRODUCT_CATEGORIES_SUB_CATEGORIES_WISE = MiddlePoint.PRODUCTS.plus("product_list_category_and_sub_category_wise")
        const val GET_PRODUCT_DETAILS = MiddlePoint.PRODUCTS.plus("product_details_new")
        const val SEARCH = MiddlePoint.PRODUCTS.plus("search")
        const val GET_FAVORITE_RESTAURANT = MiddlePoint.PRODUCTS.plus("get_favorite_restaurant")
        const val GET_PROMO_CODE = MiddlePoint.PRODUCTS.plus("get_promocode")
        const val APPLY_PROMO_CODE = MiddlePoint.PRODUCTS.plus("apply_promocode")
        const val LIKE_CARD_CATEGORIES = MiddlePoint.PRODUCTS.plus("like_card_categories")
        const val HOI_PROVIDER_LIST = MiddlePoint.PRODUCTS.plus("hoi_provider_list")
        const val LIKE_CARD_PRODUCTS = MiddlePoint.PRODUCTS.plus("like_card_products")
        const val HOI_VOUCHER_LIST = MiddlePoint.PRODUCTS.plus("hoi_voucher_list")
        const val SERVICE_DETAIL = MiddlePoint.PRODUCTS.plus("service_detail")

        const val GET_PAYMENT_CARDS = MiddlePoint.PAYMENT_CARDS.plus("get_payment_cards")
        const val ADD_PAYMENT_CARD = MiddlePoint.PAYMENT_CARDS.plus("add_payment_card")

        const val ADD_TO_CART_NEW = MiddlePoint.ORDER.plus("add_to_cart_new")
        const val GET_ALL_ORDERS = MiddlePoint.ORDER.plus("get_all_orders")
        const val GET_ORDER_DETAIL = MiddlePoint.ORDER.plus("get_order_detail")
        const val GET_CART_DATA = MiddlePoint.ORDER.plus("get_cart_data")
        const val GET_DELIVERY_CHARGE = MiddlePoint.ORDER.plus("get_delivery_charge")
        const val PLACE_ORDER = MiddlePoint.ORDER.plus("place_order")
        const val PLACE_ORDER_CHECK = MiddlePoint.ORDER.plus("place_order_check")
        const val CANCEL_ORDER = MiddlePoint.ORDER.plus("cancel_order")
        const val ISSUE = MiddlePoint.ORDER.plus("issue")
        const val REPORT_ISSUE = MiddlePoint.ORDER.plus("report_issue")
        const val UPDATE_CART_QUANTITY = MiddlePoint.ORDER.plus("update_cart_quantity")
        const val DELETE_CART_PRODUCT = MiddlePoint.ORDER.plus("delete_cart_product")
        const val ADD_RATING_REVIEW_TIP = MiddlePoint.ORDER.plus("add_rating_review_tip")
        const val RETURN_ORDER = MiddlePoint.ORDER.plus("return_order_new")
//        const val RETURN_ORDER = MiddlePoint.ORDER.plus("return_order")
        const val CHECK_WALLET_BALANCE = MiddlePoint.ORDER.plus("check_wallet_balance")
        const val CAPTURE_CASHBACK_AMOUNT = MiddlePoint.ORDER.plus("capture_cashback_amount")
        const val DOWNLOAD_INVOICE = MiddlePoint.ORDER.plus("download_invoice")
        const val DOWNLOAD_DELIVERY_INVOICE = MiddlePoint.ORDER.plus("download_delivery_invoice")
        const val GET_DELIVERY_CHARGE_FOR_RETURN_ORDER = MiddlePoint.ORDER.plus("get_delivery_charge_for_return_order")

        const val ADD_DELIVERY_ADDRESS = MiddlePoint.DELIVERY_ADDRESSES.plus("add_delivery_address")
        const val DELETE_DELIVERY_ADDRESS = MiddlePoint.DELIVERY_ADDRESSES.plus("delete_delivery_address")
        const val UPDATE_DELIVERY_ADDRESS = MiddlePoint.DELIVERY_ADDRESSES.plus("update_delivery_address")
        const val ADD_DEFAULT_ADDRESS = MiddlePoint.DELIVERY_ADDRESSES.plus("add_default_address")
        const val DELIVERY_ADDRESS_LIST = MiddlePoint.DELIVERY_ADDRESSES.plus("delivery_addresses_list")

        const val SUBMIT_CONTACT_US = MiddlePoint.PROFILE.plus("contact_us")
        const val PROFILE =  MiddlePoint.PROFILE.plus("profile")
        const val APPLY_REFERRAL_CODE =  MiddlePoint.PROFILE.plus("apply_referral_code")

        const val CARD_VERIFICATION = MiddlePoint.PAYMENT_CARDS.plus("card_verification")
        const val DELETE_PAYMENT_CARD = MiddlePoint.PAYMENT_CARDS.plus("delete_payment_card")
        const val SET_DEFAULT_PAYMENT_METHOD = MiddlePoint.PAYMENT_CARDS.plus("set_default_payment_method")
        const val GENERATE_CARD_TOKEN = MiddlePoint.PAYMENT_CARDS.plus("generate_card_token")

        const val NOTIFICATION_ON_OFF = MiddlePoint.USERS.plus("notification_on_off")
        const val NOTIFICATION = MiddlePoint.USERS.plus("notification")

        const val WALLET_HISTORY = MiddlePoint.WALLET_MANAGE.plus("wallet_history")
        const val ADD_TO_WALLET = MiddlePoint.WALLET_MANAGE.plus("add_to_wallet")
        const val SEND_MONEY = MiddlePoint.WALLET_MANAGE.plus("send_money")
        const val GET_RECEIVER_NAME = MiddlePoint.WALLET_MANAGE.plus("get_receiver_name")

        const val CHAT_MESSAGE = MiddlePoint.CHAT.plus("chat_messages")
        const val CHAT_HISTORY = MiddlePoint.CHAT.plus("chat_history")

        const val GET_FAQ = MiddlePoint.COMMON.plus("faq")

        const val LIKE_CARD_ORDER = MiddlePoint.GIFT_CARD.plus("likecard_order")
        const val ORDER_LIST = MiddlePoint.GIFT_CARD.plus("order_list")

        const val SERVICE_ORDER = MiddlePoint.SERVICE.plus("service_order")
        const val SERVICE_ORDER_LIST = MiddlePoint.SERVICE.plus("order_list")
        const val SERVICE_CANCEL_ORDER = MiddlePoint.SERVICE.plus("cancel_order")
        const val SERVICE_ORDER_DETAIL = MiddlePoint.SERVICE.plus("order_detail")

        const val PRODUCT_REVIEW_RATING = MiddlePoint.PRODUCT_REVIEW_RATINGS.plus("product_review_rating")

        const val GAME_FORTUNE_WHEEL = MiddlePoint.GAME.plus("fortune_wheel")
        const val SPIN_WHEEL_GAME = MiddlePoint.GAME.plus("spin_wheel_game")
        const val COMPLETE_FORTUNE_WHEEL_GAME = MiddlePoint.GAME.plus("complete_fortune_wheel_game")
        const val COMPLETE_SPIN_WHEEL_GAME = MiddlePoint.GAME.plus("complete_spin_wheel_game")
        const val PENDING_REWARDS = MiddlePoint.GAME.plus("pending_rewards_new")
        const val WINNING_REWARD_HISTORY = MiddlePoint.GAME.plus("winning_reward_history")

        const val FOOD_HOME = MiddlePoint.FOOD_DELIVERY.plus("home")
        const val FOOD_GET_RESTAURANTS_DETAIL = MiddlePoint.FOOD_DELIVERY.plus("get_restaurants_detail")
        const val FOOD_PRODUCTS = MiddlePoint.FOOD_DELIVERY.plus("products_list")
        const val ADD_TO_CART = MiddlePoint.FOOD_DELIVERY.plus("add_to_cart")
        const val GET_FOOD_CART_DATA = MiddlePoint.FOOD_DELIVERY.plus("get_cart_data")
        const val FOOD_UPDATE_CART_QUANTITY = MiddlePoint.FOOD_DELIVERY.plus("update_cart_quantity")
        const val FOOD_DELETE_CART_PRODUCT = MiddlePoint.FOOD_DELIVERY.plus("delete_cart_product")
        const val FOOD_GET_PROMO_CODE = MiddlePoint.FOOD_DELIVERY.plus("get_promocode")
        const val FOOD_APPLY_PROMO_CODE = MiddlePoint.FOOD_DELIVERY.plus("apply_promocode")
        const val FOOD_GET_DELIVERY_CHARGE = MiddlePoint.FOOD_DELIVERY.plus("get_delivery_charge")
        const val FOOD_PLACE_ORDER = MiddlePoint.FOOD_DELIVERY.plus("place_order")
        const val FOOD_PLACE_ORDER_CHECK = MiddlePoint.FOOD_DELIVERY.plus("place_order_check")

        const val AIRPORT_SEARCH = MiddlePoint.AIR_TICKET.plus("airport_search")
        const val FLIGHT_SEARCH = MiddlePoint.AIR_TICKET.plus("flight_search")
        const val AIR_CABIN_CLASSES = MiddlePoint.AIR_TICKET.plus("air_cabin_classes")
        const val NATIONALITY = MiddlePoint.AIR_TICKET.plus("nationality")
        const val FLIGHT_BOOKING = MiddlePoint.AIR_TICKET.plus("booking")
        const val FLIGHT_BOOKING_LIST = MiddlePoint.AIR_TICKET.plus("booking_list")
        const val FLIGHT_BOOKING_DETAILS = MiddlePoint.AIR_TICKET.plus("booking_detail")
        const val FLIGHT_BOOKING_PAYMENT = MiddlePoint.AIR_TICKET.plus("booking_payment")
        const val FLIGHT_BOOKING_CANCEL_PNR = MiddlePoint.AIR_TICKET.plus("cancelled_pnr")

        const val AI_CATEGORY = MiddlePoint.AI.plus("category")
        const val AI_FIRST_QUESTIONS = MiddlePoint.AI.plus("first_questions")
        const val AI_OCCASION = MiddlePoint.AI.plus("occasion")
        //const val AI_SUB_CATEGORY = MiddlePoint.AI.plus("sub_category")
        const val AI_RECOMMENDATION = MiddlePoint.AI.plus("recommendation")
//        const val AI_RECOMMENDATION_NEW = MiddlePoint.AI.plus("recommendation_new")
        const val AI_RECOMMENDATION_NEW = MiddlePoint.AI.plus("recommendation_v2_new")
        const val AI_PRODUCTS_LIST = MiddlePoint.AI.plus("products_list")

        // Grocery delivery
        const val GROCERY_DELIVERY_HOME = MiddlePoint.GROCERY_DELIVERY.plus("home")
        const val GROCERY_PRODUCT_LIST = MiddlePoint.GROCERY_DELIVERY.plus("products_list")

        // Pharmacy delivery
        const val PHARMACY_DELIVERY_HOME = MiddlePoint.PHARMACY_DELIVERY.plus("home")
        const val PHARMACY_PRODUCT_LIST = MiddlePoint.PHARMACY_DELIVERY.plus("products_list")

        // Laboratory
        const val LABORATORY_DELIVERY_HOME = MiddlePoint.LABORATORY_DELIVERY.plus("home")
        const val LABORATORY_PRODUCT_LIST = MiddlePoint.LABORATORY_DELIVERY.plus("products_list")

        // Tele Health
        const val TELE_HEALTH_HOME = MiddlePoint.TELE_HEALTH.plus("home")
        const val TELE_HEALTH_PRODUCT_LIST = MiddlePoint.TELE_HEALTH.plus("products_list")

        const val UPLOAD_CONTACT_LIST = MiddlePoint.WALLET_MANAGE.plus("upload_contacts")
        const val SCAN_SKU_QR = MiddlePoint.MERCHANT_STORE.plus("scan_merchant_product")
        const val GET_PHYSICAL_CART_PRODUCT = MiddlePoint.MERCHANT_STORE.plus("get_physical_cart_data")
        const val UPDATE_PHYSICAL_CART_PRODUCT = MiddlePoint.MERCHANT_STORE.plus("update_physical_cart_quantity")
        const val DELETE_PHYSICAL_CART_PRODUCT = MiddlePoint.MERCHANT_STORE.plus("delete_physical_cart_product")
        const val PLACE_ORDER_PHYSICAL_CART_PRODUCT = MiddlePoint.MERCHANT_STORE.plus("place_order")
        const val PLACE_ORDER_CHECK_PHYSICAL_CART_PRODUCT = MiddlePoint.MERCHANT_STORE.plus("place_order_check")
        const val GET_NEAREST_PHYSICAL_CART_PRODUCT = MiddlePoint.MERCHANT_STORE.plus("get_nearest_physical_store")

        // Top-up
        const val COUNTRIES = MiddlePoint.TOP_UP.plus("countries")
        const val TOP_UP_PRODUCT_LIST = MiddlePoint.TOP_UP.plus("product_list")
        const val SYNC_TOP_UP = MiddlePoint.TOP_UP.plus("sync_topup")
        const val TOP_UP_LIST = MiddlePoint.TOP_UP.plus("topup_list")

        // Visa
        const val COUNTRIES_VISA = MiddlePoint.VISA.plus("countries")
        const val PRODUCT_DETAIL_VISA = MiddlePoint.VISA.plus("product_detail")
        const val DOCUMENT_LIST_VISA = MiddlePoint.VISA.plus("document_list")
        const val PLACE_ORDER_VISA = MiddlePoint.VISA.plus("place_order")
        const val MY_VISA = MiddlePoint.VISA.plus("myorder")
        const val MY_VISA_ORDER_DETAILS = MiddlePoint.VISA.plus("order_detail")
        const val APPLICATION_DOCUMENT_VISA = MiddlePoint.VISA.plus("application_document")
        const val UPLOAD_DOCUMENT_VISA = MiddlePoint.VISA.plus("upload_document")

        // E SIM
        const val CATEGORIES_E_SIM = MiddlePoint.E_SIM.plus("categories")
        const val COUNTRIES_E_SIM = MiddlePoint.E_SIM.plus("countries")
        const val PRODUCTS_E_SIM = MiddlePoint.E_SIM.plus("products")
        const val ORDER_E_SIM = MiddlePoint.E_SIM.plus("orders")
        const val BUY_E_SIM = MiddlePoint.E_SIM.plus("buy")
        const val MY_ORDERS_E_SIM = MiddlePoint.E_SIM.plus("my_orders")

        // UTILITY
        const val COUNTRY_UTILITY = MiddlePoint.UTILITY.plus("utility_country")
        const val OPERATOR_UTILITY = MiddlePoint.UTILITY.plus("utility_operator")
        const val PRODUCTS_UTILITY = MiddlePoint.UTILITY.plus("utility_products")
        const val ACCOUNT_INQUIRY_UTILITY = MiddlePoint.UTILITY.plus("utility_account_inquiry")
        const val TRANSACTION_SYNC_UTILITY = MiddlePoint.UTILITY.plus("utility_transaction_sync")
        const val UTILITY_LIST = MiddlePoint.UTILITY.plus("my_orders")

    }

    object Param {
        const val ID = "id"
        const val USER_ID = "user_id"
        const val COUNTRY_NAME = "country_name"
        const val COUNTRY_IMAGE = "country_image"
        const val PRODUCT_IMAGE = "product_image"
        const val DATA = "data"
        const val DURATION = "duration"
        const val PRICE = "price"
        const val ROAMING_COUNTRIES = "roaming_countries"
        const val CONTACT_LIST = "contact_list"
        const val CUSTOMER_ID = "customer_id"
        const val SENDER_ID = "sender_id"
        const val RECEIVER_ID = "receiver_id"
        const val PARAM_MESSAGE = "message"
        const val SENDER_TYPE = "sender_type"
        const val PATH_VERSION = "path_version"
        const val DEVICE_TYPE = "device_type"
        const val DEVICE_TOKEN = "device_token"
        const val DEVICE_NAME = "device_name"
        const val PHONE = "phone"
        const val TYPE = "type"
        const val LATITUDE = "latitude"
        const val LONGITUDE = "longitude"
        const val CITY_NAME = "city_name"
        const val FLOOR_NO = "floor_no"
        const val STORE_TYPE_ID = "store_type_id"
        const val CATEGORY_ID = "category_id"
        const val COUNTRY_ISO = "country_iso"
        const val PROVIDER_ID = "providerId"
        const val GENDER_ID = "gender_id"
        const val GENDER = "gender"
        const val USER_GENDER = "user_gender"
        const val USER_MEMORY = "user_memory"
        const val OCCASION = "occasion"
        const val CATEGORY = "category"
        const val SUB_CATEGORY_ID = "sub_category_id"
        const val SUB_CATEGORY = "sub_category"
        const val SUBCATEGORY = "subcategory"
        const val RESTAURANT_ID = "restaurant_id"
        const val OTP_CODE = "otp_code"
        const val STATUS = "status"
        const val LAT = "lat"
        const val LNG = "lng"
        const val FIRST_NAME = "first_name"
        const val LAST_NAME = "last_name"
        const val EMAIL = "email"
        const val FILTER = "filter"
        const val SORTING = "sorting"
        const val PAGE_NO = "page_no"
        const val PAGE  = "page"
        const val ALCOHOLIC = "alcoholic"
        const val PRODUCT_ID = "product_id"
        const val TRANSACTION_REQUIRED_FIELDS = "transaction_required_field"
        const val SERVICE_ID = "service_id"
        const val VENDOR_ID = "vendor_id"
        const val OPERATOR_ID = "operator_id"
        const val QTY = "qty"
        const val ADDON_ID = "addon_id"
        const val VARIANT_ID = "variant_id"
        const val INFLUENCER_REFERRAL_CODE = "influencer_referral_code"
        const val REFERRAL_CODE = "referral_code"
        const val SKU_QR_NUMBER = "sku_qr_number"
        const val SEARCH_TEXT = "search_text"
        const val SEARCH = "search"
        const val NAME = "name"
        const val COMMENT = "comment"
        const val PARAM_CARD_HOLDER_NAME = "card_holder_name"
        const val PARAM_CARD_NUMBER = "card_number"
        const val PARAM_EXPIRY_DATE = "expiry_date"
        const val PARAM_CVV = "cvv"
        const val VERIFICATION_STATUS = "verification_status"
        const val CARD_ID = "card_id"
        const val PAYMENT_CARD_ID = "payment_card_id"
        const val PARAM_ADDRESS = "address"
        const val PARAM_LOCATION = "location"
        const val PARAM_DELIVERY_ADDRESS_ID = "delivery_address_id"
        const val PARAM_ORDER_TYPE = "order_type"
        const val PAYMENT_METHOD = "payment_method"
        const val PAY_TYPE = "pay_type"
        const val TAMARA_PAYMENT_MODE = "tamara_payment_mode"
        const val ORDER_ID = "order_id"
        const val REFEREE_ID = "referee_id"
        const val RESULT_ID = "result_id"
        const val DELIVERY_ADDRESS_ID = "delivery_address_id"
        const val CART_PRODUCT_ID = "cart_product_id"
        const val AMOUNT = "amount"
        const val CONVERSATION_RATE = "conversation_rate"
        const val DESTINATION_AMOUNT = "destination_amount"
        const val COUNTRY_CODE = "country_code"
        const val PROMOCODE = "promocode"
        const val RATE = "rate"
        const val RATING = "rating"
        const val REVIEW = "review"
        const val RETURN_TYPE = "return_type"
        const val PROMO_CODE_ID = "promocode_id"
        const val PROMO_AMOUNT = "promo_amount"
        const val CART_ID = "cart_id"
        const val IS_PAYMENT_WITH_WALLET = "is_payment_with_wallet"
        const val SPECIAL_INSTRUCTION = "special_instruction"
        const val ISSUE_ID = "issue_id"
        const val DESCRIPTION = "description"
        const val PAYMENT_TYPE = "payment_type"
        const val MOBILE_NO = "mobile_no"
        const val PRODUCT_NAME = "product_name"
        const val REASON = "reason"
        const val BRAND_ID = "brand_id"
        const val DEPARTURE_LOCATION = "departure_location"
        const val DESTINATION = "destination"
        const val DEPARTURE_DATE = "departure_date"
        const val RETURN_DATE = "returndate"
        const val TRIP_TYPE = "trip_type"
        const val CABIN_CLASS = "cabin_class"
        const val ADULATS = "adulats"
        const val CHILDREN = "children"
        const val INFANT = "infant"
        const val PREFER_AIRLINES = "prefer_airlines"
        const val PROVIDER = "provider"
        const val ITINERARY = "itinerary"
        const val QUERY = "query"
        const val CONVERSATION_HISTORY = "conversation_history"
        const val USER_NAME = "user_name"
        const val FARE_INDEX = "fareIndex"
        const val DESTINATION_LOCATION = "destination_location"
        const val PRIMARY_PHONE = "primary_phone"
        const val PRIMARY_EMAIL = "primary_email"
        const val PASSENGER_DETAILS = "passenger_details"
        const val MOBILE = "mobile"
        const val VALIDITY = "validity"
        const val RESIDENCY = "residency"
        const val NATIONALITY = "nationality"
        const val NO_OF_APPLICANTS = "no_of_applicants"
        const val ADULT = "adult"
        const val CHILD = "child"
        const val CUSTOMER_FIRST_NAME = "customer_first_name"
        const val CUSTOMER_LAST_NAME = "customer_last_name"
        const val CUSTOMER_MOBILE = "customer_mobile"
        const val CUSTOMER_EMAIL = "customer_email"
        const val CUSTOMER_BILLING_ADDRESS_LINE_1 = "customer_billing_address_line_1"
        const val CUSTOMER_BILLING_ADDRESS_LINE_2 = "customer_billing_address_line_2"
        const val CUSTOMER_BILLING_COUNTRY = "customer_billing_country"
        const val CUSTOMER_BILLING_CITY = "customer_billing_city"
        const val CUSTOMER_BILLING_STATE = "customer_billing_state"
        const val CUSTOMER_BILLING_PINCODE = "customer_billing_pincode"
        const val SOURCE = "source"
        const val APPLICANTS = "applicants"
        const val TRAVEL_DATE = "travel_date"
        const val VISA_NAME = "visa_name"
        const val VISA_CODE = "visa_code"
        const val VISA_TYPE = "visa_type"
        const val VISA_DURATION = "visa_duration"
        const val VISA_VALIDITY = "visa_validity"
        const val TOTAL_AMOUNT = "total_amount"
        const val SERVICE_AMOUNT = "service_amount"
        const val TOTAL_TAX_AMOUNT = "total_tax_amount"
        const val GOVERNMENT_AMOUNT = "goverment_amount"
        const val PRICE_BREAKDOWN = "price_breakdown"
        const val APPLICATION_ID = "application_id"
        const val ORDER_NUMBER = "order_number"
        const val DOCUMENT_CODE = "document_code"
    }

    object DefaultParamValue {
        const val DEVICE_TYPE_ANDROID = "android"
        const val DEVICE_TYPE_INT = "1"
        const val TYPE_LOGIN = "login"
    }
}