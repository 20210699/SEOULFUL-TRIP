package com.seoulfultrip.seoulfultrip


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.seoulfultrip.seoulfultrip.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class HomeFragment : Fragment(){
    lateinit var binding: FragmentHomeBinding
    //val mainActivity = activity as MainActivity
    //private lateinit var bottomNavigationView: BottomNavigationView

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setHasOptionsMenu(true)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    /*private fun setOnClickListener() {
        binding.homeTextbtn.setOnClickListener {
            mainActivity.loadFragment(SearchFragment())
        }
    }*/

    /*override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.nav1 -> {item.setIcon(R.drawable.search_1)}
        }
    }*/

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false)
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        //bottomNavigationView = requireView().findViewById(R.id.bottomNavigationView)

        val mainActivity = activity as MainActivity
        //val item = bottomNavigationView.menu

        binding.homeTextbtn.setOnClickListener {
            mainActivity.loadFragment(SearchFragment())
            //setOnClickListener()
            //SearchIcon(item)
            //mainActivity.hideBottomNavigation(true)
        }

        return binding.root

    }



    /*override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()
        inflater.inflate(R.menu.bottom_nav, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //val id = item.itemId
        /*when (item.itemId) {
            //item.itemId -> R.drawable.search
            R.id.nav1 -> item.setIcon(R.drawable.search_1)
        }*/
        if (item.itemId == R.id.home_textbtn) {
            item.setIcon(R.drawable.search_1)
            bottomNavigationView.menu.findItem(R.id.nav1).setIcon(R.drawable.home)
            bottomNavigationView.menu.findItem(R.id.nav3).setIcon(R.drawable.star)
            bottomNavigationView.menu.findItem(R.id.nav4).setIcon(R.drawable.my)
        }


        return super.onOptionsItemSelected(item)
    }*/


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragement.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}