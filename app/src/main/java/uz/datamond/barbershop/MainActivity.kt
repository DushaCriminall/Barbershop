package uz.datamond.barbershop

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import uz.datamond.barbershop.databinding.ActivityMainBinding
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController

    private lateinit var toolbar: Toolbar

    private lateinit var drawerNavView: NavigationView

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        drawerLayout = findViewById(R.id.drawerLayout)
        drawerNavView = findViewById(R.id.drawerNavView)
        toolbar = binding.toolbar
        setSupportActionBar(toolbar)

        drawerNavView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.share -> {
                    try {
                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "BarberShop")
                        var shareMessage = "\nLet me recommend you this application\n\n"
                        shareMessage =
                            """
                            ${shareMessage}https://play.google.com/store/apps/details?id=${BuildConfig.APPLICATION_ID}
                            
                            
                            """.trimIndent()
                        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
                        startActivity(Intent.createChooser(shareIntent, "choose one"))
                    } catch (e: Exception) {
                        //e.toString();

                    }
                    true
                }
                R.id.rate -> {
                    rateApp()
                    true
                }
                R.id.exit -> {
                    exitAppCLICK()
                    true

                }
                else -> false
            }


        }

        binding.ibAccount.setOnClickListener {
            val view = View.inflate(this, R.layout.promo_dialog, null)
            val builder = AlertDialog.Builder(this)
            builder.setView(view)
            val dialog = builder.create()
            dialog.show()

            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
            dialog.setCancelable(false)

//            button.setOnClickListener {
//                dialog.dismiss()
//            }
        }

        binding.ibMenu.setOnClickListener {
            if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
                this.drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                this.drawerLayout.openDrawer(GravityCompat.START)
            }
        }

        navController = findNavController(R.id.nav_host_fragment)
        val toolbarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_services,
                R.id.navigation_barbers,
                R.id.navigation_location
            )
        )
        setupActionBarWithNavController(navController, toolbarConfiguration)
        binding.navView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    companion object {
        lateinit var openAuthActivityCustom: ActivityResultLauncher<Intent>
        const val ACCESS_TOKEN = "access_token"

    }

    fun rateApp() {
        val uri = Uri.parse("market://details?id=$packageName")
        val myAppLinkToMarket = Intent(Intent.ACTION_VIEW, uri)
        try {
            startActivity(myAppLinkToMarket)
        } catch (e: ActivityNotFoundException) {
            Toast.makeText(
                this,
                "Impossible to find an application for the market",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    fun exitAppCLICK() {
        finishAffinity()
        exitProcess(0)
    }

}