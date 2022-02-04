package uz.umbrellasoft.nomerbor.utils

import androidx.lifecycle.MutableLiveData

class GlobalValues {
    companion object{
        var  selectedOperator=MutableLiveData<Int>(-1)
        var previousPosition=-1
        var checkBalanceUssd=""
        var checkInternetUssd=""
        var checkMinute=""
        var checkSms=""
        var companyName=""
        var infoDialogMessage=""

        //bonus fragment global variables
        var userName=""
        var userPhone=""
        var userBones=""
        var userPoints=""
        var bonusRules=""
        var userRank=-1

        var titl=""
    }
}