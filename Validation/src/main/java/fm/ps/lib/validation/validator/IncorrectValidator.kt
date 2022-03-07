package fm.ps.lib.validation.validator

import android.widget.EditText
import fm.ps.lib.validation.R
import fm.ps.lib.validation.abstract.ValidatorAbstract
import fm.ps.lib.validation.keys.Validations
import fm.ps.lib.validation.util.VariableUtil

/**
 * Created With Love For : Annat Travel
 * The owner has been granted all rights in the application and has the freedom to dispose of everything
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 03 : 51 : 30
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class IncorrectValidator(private var editText: EditText, private var type : Int) : ValidatorAbstract(editText)  {

    override val isValid: Boolean
        get() {
            return when (type) {
                Validations.NAME -> {
                    validationName()
                }
                Validations.EMAIL -> {
                    validationEmail()
                }
                Validations.PASSWORD -> {
                    validationPassword()
                }
                Validations.PASSPORT -> {
                    validationPassport()
                }
                else -> {
                    false
                }
            }
        }

    private fun validationName() : Boolean{
        return if (VariableUtil.isTheNameCorrect(editText)){
            editText.error = null
            true
        }else{
            editText.error = getErrorMessage(editText)
            false
        }
    }

    private fun validationEmail() : Boolean{
        return if (VariableUtil.isTheEmailCorrect(editText)){
            editText.error = null
            true
        }else{
            editText.error = getErrorMessage(editText)
            false
        }
    }

    private fun validationPassword() : Boolean{
        return if (VariableUtil.isThePasswordCorrect(editText)){
            editText.error = null
            true
        }else{
            editText.error = getErrorMessage(editText)
            false
        }
    }

    private fun validationPassport() : Boolean{
        return if (VariableUtil.isThePassportCorrect(editText)){
            editText.error = null
            true
        }else{
            editText.error = getErrorMessage(editText)
            false
        }
    }

    private fun getErrorMessage(editText: EditText): String {
        return editText.context.getString(R.string.error_incorrect, editText.hint)
    }

}