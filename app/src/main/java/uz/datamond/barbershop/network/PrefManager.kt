package uz.datamond.barbershop.network

import android.content.Context
import android.content.SharedPreferences

private const val USSD_APP = "ussd_app"
private const val APP_COLOR = "app_color"
private const val LOG_IN = "log_in"
private const val LOCALE_LANG = "localeLang"
private const val TOKEN = "token"
private const val NAME = "name"
private const val SURNAME = "surname"
private const val PHONE = "phone"
private const val LINK = "link"
private const val SHARE_MESSAGE_UZ = "shereUz"
private const val SHARE_MESSAGE_RU = "shereRu"
private const val USER_ID = "userId"
private const val USSD_SHARE_UZ = "ussdShareUz"
private const val USSD_SHARE_RU = "ussdShareRu"
private const val LAST_UPDATE = "last_update"
private const val IS_SUBSCRIBED = "is_subscribed"

class PrefManager {
    companion object {
        private fun getInstance(context: Context): SharedPreferences {
            return context.getSharedPreferences(USSD_APP, Context.MODE_PRIVATE)
        }

        fun saveSubscription(context: Context, isSubscribed: Boolean) {
            getInstance(context).edit().putBoolean(IS_SUBSCRIBED, isSubscribed).apply()
        }
        fun getSubscription(context: Context): Boolean {
            return getInstance(context).getBoolean(IS_SUBSCRIBED, false)
        }

        fun saveAppColor(context: Context, color: String) {
            getInstance(context).edit().putString(APP_COLOR, color).apply()
        }




        fun getAppColor(context: Context): String {
            return getInstance(context).getString(APP_COLOR, "#8700CC")!!
        }

        fun getAppGreenColor(context: Context): String {
            return getInstance(context).getString(APP_COLOR, "#0ACC64")!!
        }

        fun saveLocale(context: Context, localeLang: String) {
            getInstance(context).edit().putString(LOCALE_LANG, localeLang).apply()
        }

        fun getLocale(context: Context): String {
            return getInstance(context).getString(LOCALE_LANG, "uz")!!
        }

        fun saveToken(context: Context, token: String) {
            getInstance(context).edit().putString(
                TOKEN, token
            ).apply()
        }

        fun getToken(context: Context): String {
            return getInstance(
                context
            ).getString(TOKEN, "")!!
        }

        fun saveName(context: Context, token: String) {
            getInstance(context).edit().putString(
                NAME, token
            ).apply()
        }

        fun getName(context: Context): String {
            return getInstance(
                context
            ).getString(NAME, "")!!
        }

        fun saveSurname(context: Context, token: String) {
            getInstance(context).edit().putString(
                SURNAME, token
            ).apply()
        }

        fun getSurname(context: Context): String {
            return getInstance(
                context
            ).getString(SURNAME, "")!!
        }

        fun savePhone(context: Context, token: String) {
            getInstance(context).edit().putString(
                PHONE, token
            ).apply()
        }

        fun getPhone(context: Context): String {
            return getInstance(
                context
            ).getString(PHONE, "")!!
        }

        fun saveCabinetLink(context: Context, token: String) {
            getInstance(context).edit().putString(
                LINK, token
            ).apply()
        }

        fun getCabinetLink(context: Context): String {
            return getInstance(
                context
            ).getString(LINK, "")!!
        }

        fun saveShareMessageUz(context: Context, token: String) {
            getInstance(context).edit().putString(
                SHARE_MESSAGE_UZ, token
            ).apply()
        }

        fun saveShareMessageRu(context: Context, token: String) {
            getInstance(context).edit().putString(
                SHARE_MESSAGE_RU, token
            ).apply()
        }

        fun getShareMessageUz(context: Context): String {
            return getInstance(
                context
            ).getString(SHARE_MESSAGE_UZ, "")!!
        }

        fun getShareMessageRu(context: Context): String {
            return getInstance(
                context
            ).getString(SHARE_MESSAGE_RU, "")!!
        }

        fun saveUserId(context: Context, token: String) {
            getInstance(context).edit().putString(
                USER_ID, token
            ).apply()
        }

        fun getUserId(context: Context): String {
            return getInstance(
                context
            ).getString(USER_ID, "")!!
        }

        fun saveUssdCodeShareUz(context: Context, token: String) {
            getInstance(context).edit().putString(
                USSD_SHARE_UZ, token
            ).apply()
        }

        fun getUssdCodeShareUz(context: Context): String {
            return getInstance(
                context
            ).getString(
                USSD_SHARE_UZ,
                "%USSD_kod% -  %nimani_kodiligi%\\nUshbu kod USSD Bonus dasturi orqali yuborildi. Dasturni o’rnating 1 000 000 so'm yutib oling! \\nPlay Marketdan yuklab oling: https://play.google.com/store/apps/details?id=uz.ussdbonus.app\\nUSSD Bonus - internet, daqiqa, sms to'plam sotib oling va tarifinigizni boshqaring!\\n"
            )!!
        }

        fun saveUssdCodeShareRu(context: Context, token: String) {
            getInstance(context).edit().putString(
                USSD_SHARE_RU, token
            ).apply()
        }

        fun getUssdCodeShareRu(context: Context): String {
            return getInstance(
                context
            ).getString(
                USSD_SHARE_RU,
                "%USSD_kod% -  %nimani_kodiligi%\\nUshbu kod USSD Bonus dasturi orqali yuborildi. Dasturni o’rnating 1 000 000  сум yutib oling! \\nPlay Marketdan yuklab oling: https://play.google.com/store/apps/details?id=uz.ussdbonus.app\\nUSSD Bonus - internet, daqiqa, sms to'plam sotib oling va tarifinigizni boshqaring!\\n"
            )!!
        }

        fun saveLastUpdate(context: Context, timestamp: Long) {
            getInstance(context).edit().putLong(
                LAST_UPDATE, timestamp
            ).apply()
        }

        fun getLastUpdate(context: Context): Long {
            return getInstance(
                context
            ).getLong(LAST_UPDATE, 1617217200000)!!
        }
    }
}