package com.example.bulkup_today.Utils.sharedPreference

import android.content.Context

object SharedPreferenceManager {

    // String
    fun setStringValue(context: Context, id: String, value: String?) {
        SharedPreferenceUtil.setStringPreference(context, id, value)
    }

    fun getStringValue(context: Context, id: String): String? {
        return SharedPreferenceUtil.getStringPreference(context, id)
    }

    // Long
    fun setLongValue(context: Context, id: String, value: Long) {
        SharedPreferenceUtil.setLongPreference(context, id, value)
    }

    fun getLongValue(context: Context, id: String, defaultValue: Long): Long {
        return SharedPreferenceUtil.getLongPreference(context, id, defaultValue)
    }

    // Boolean
    fun setBooleanValue(context: Context, id: String, value: Boolean) {
        SharedPreferenceUtil.setBooleanPreference(context, id, value)
    }

    fun getBooleanValue(context: Context, id: String, defaultValue: Boolean): Boolean {
        return SharedPreferenceUtil.getBooleanPreference(context, id, defaultValue)
    }

    fun getHistoryItem(context: Context): String? {
        return SharedPreferenceUtil.getStringPreference(context, SharedPreferenceHelper.KEY_STRING_HISTORY )
    }

    fun setHistoryItem(context:Context, item: String?) {
        SharedPreferenceUtil.setStringPreference(context, SharedPreferenceHelper.KEY_STRING_HISTORY, item)
    }

    fun setPinUser(context: Context, pin: String, pinComplete: Boolean) {
        setStringValue(context, SharedPreferenceHelper.KEY_STRING_PIN_NUMBER, pin)
        setBooleanValue(context, SharedPreferenceHelper.KEY_BOOLEAN_PIN_COMPLETE, pinComplete)
    }
}