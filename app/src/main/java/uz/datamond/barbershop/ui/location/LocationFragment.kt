package uz.datamond.barbershop.ui.location

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import uz.datamond.barbershop.R
import uz.datamond.barbershop.databinding.FragmentLocationBinding


class LocationFragment : Fragment() {


    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        val diller = LatLng(lat, long)
        val uzb = LatLng(41.311081, 69.240562)
        googleMap.addMarker(MarkerOptions().position(diller).title("Ucell Diller"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(uzb))

        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(diller, 17.0f))
    }

    var lat: Double = 0.0
    var long: Double = 0.0

    private var _binding: FragmentLocationBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            lat = it.getDouble("lat")
            long = it.getDouble("long")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLocationBinding.inflate(layoutInflater, container, false)


        binding.navigation.setOnClickListener {
            val mTitle = "Diller"
            val geoUri = "http://maps.google.com/maps?q=loc:$lat,$long ($mTitle)"

            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(geoUri))
            requireContext().startActivity(intent)


        }


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}