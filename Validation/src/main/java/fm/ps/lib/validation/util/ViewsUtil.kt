package fm.ps.lib.validation.util

import android.text.TextUtils
import android.view.View
import android.widget.EditText

/**
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 03 : 56 : 12
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object ViewsUtil {

    //==============================================================================================
    // Enabled And Disabled View  ...
    fun disabledViews(vararg view: View){
        for (thisView in view) {
            thisView.isEnabled = false
        }
    }

    fun enabledViews(vararg view: View){
        for (thisView in view) {
            thisView.isEnabled = true
        }
    }

    //==============================================================================================
    // Edit Text ...
    fun isTheEditTextEmpty(editText: EditText?): Boolean {
        if (editText == null) {
            return true
        }
        val str: CharSequence = editText.getText().toString()
        return TextUtils.isEmpty(str)
    }

    fun getTextFromEditText(editText: EditText?): String {
        return if (editText == null) "" else editText.getText().toString().trim { it <= ' ' }
    }


}