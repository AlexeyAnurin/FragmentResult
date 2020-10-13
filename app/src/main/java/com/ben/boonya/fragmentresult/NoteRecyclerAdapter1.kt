package com.ben.boonya.fragmentresult

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.viewholder_note.view.*

class NoteRecyclerAdapter1 : RecyclerView.Adapter<NoteRecyclerAdapter1.NoteViewHolder1>() {

    var data: ArrayList<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder1 {
        // from() - Obtains the LayoutInflater from the given context.
        val layoutInflater = LayoutInflater.from(parent.context)
        // inflate(@LayoutRes int resource, @Nullable ViewGroup root, boolean attachToRoot)
        val itemView = layoutInflater.inflate(R.layout.viewholder_note, parent, false)
        //  создать экземпляр холдера. А он принимает параметром itemView: View - большая вью,
        // лежащая в контейнере холдера.
        var holder = NoteViewHolder1(itemView)
        return holder
    }

    override fun onBindViewHolder(holder: NoteViewHolder1, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class NoteViewHolder1(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(note: String) {
            itemView.tv_viewHolder_note.text = note
        }
    }

}