package com.backtocding.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SampleFragment : Fragment() {

    companion object {
        private const val TAG = "Logging: SampleFragment"
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach: SampleFragment")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: SampleFragment")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: SampleFragment")
        return inflater.inflate(R.layout.fragment_sample, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated: SampleFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: SampleFragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: SampleFragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: SampleFragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: SampleFragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: SampleFragment")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: SampleFragment")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach: SampleFragment")
    }
}