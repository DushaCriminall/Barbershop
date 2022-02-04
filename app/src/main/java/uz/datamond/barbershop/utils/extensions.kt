package uz.umbrellasoft.nomerbor.utils

import android.R
import android.app.Activity
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import uz.datamond.barbershop.data.PrefManager
import java.util.*

fun Fragment.convertDpToPixel(dp:Int):Int{
    return (dp * requireContext().resources.displayMetrics.density).toInt()
}

fun getColorStateListApp(stateChecked:String, stateDefault:String):ColorStateList{
    return ColorStateList(
            arrayOf(
                    intArrayOf(-R.attr.state_checked),
                    intArrayOf(R.attr.state_checked)
            ), intArrayOf(
            Color.parseColor(stateDefault),  //1
            Color.parseColor(stateChecked)  //2
    )
    )
}

fun Activity.changeAppLocale(localeCode: String, context: Context) : Context {
    val resources = context.resources
    val config = resources.configuration
    config.setLocale(Locale(localeCode.toLowerCase(Locale.ROOT)))
    context.createConfigurationContext(config)
    config.setLayoutDirection(Locale(localeCode.toLowerCase(Locale.ROOT)))
    Log.d("language0",Locale(localeCode.toLowerCase(Locale.ROOT)).toString())
    return context
}

fun Fragment.showSnackbar(snackbarText: String, timeLength: Int = Snackbar.LENGTH_SHORT) {
    Log.d("works",snackbarText)
    val snackBar = Snackbar.make(requireView(), snackbarText, timeLength)
        .setBackgroundTint(Color.parseColor(PrefManager.getAppColor(requireContext())))
        .setActionTextColor(ContextCompat.getColor(requireContext(), android.R.color.white))
    val displayPixel = (86 * requireContext().resources.displayMetrics.density)
    val snackBarView=snackBar.view
//    val params = snackBarView.layoutParams as androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
//    params.setMargins(params.leftMargin+16, params.topMargin+0, params.rightMargin+16, params.bottomMargin+64)
//    snackBarView.layoutParams=params
    snackBarView.translationY = -(displayPixel)
    snackBar.show()
}