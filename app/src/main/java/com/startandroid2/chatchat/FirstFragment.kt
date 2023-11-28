package com.startandroid2.chatchat
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val listView: ListView = view.findViewById(R.id.listView)
        val items = arrayOf("Javascript", "Typescript", "Neo4j", "Next.js", "Postgres", "Tailwindcss", "React.js","Material UI", "Shad-cn UI")

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter
        return view
    }
}
