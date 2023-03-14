package com.caren.flixster

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class movieAdapter(models: List<Any>, param: Any?) {
    private val flixster: List<movies>,
    private val mListener: OnListFragmentInteractionListener? = null
    )
    : RecyclerView.Adapter<movieAdapter.flixstar>()
    {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movies {
            val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.flixstar_layout_xml, parent, false)
            return flixster(view)

            inner class BookViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
                var mItem: BestSellerBook? = null


                val mmovieName: TextView = mView.findViewById<View>(id.movie_title) as TextView
                val mmovieDescription: TextView = mView.findViewById<View>(id.movie_description) as TextView
                val mmovieImageUrl: ImageView = mView.findViewById<View>(id.movie_image) as ImageView





                override fun toString(): String {
                    return mmovieNamemovieName.toString() + " '" + m.text + "'"
                }
            }

            /**
             * This lets us "bind" each Views in the ViewHolder to its' actual data!
             */
            override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
                val book = books[position]

                holder.mmovieName = movie
                holder.mmovieDescription.text = movie.movieDescription
                holder.mmovieImageUrl.text = book.a

                holder.mView.setOnClickListener {
                    holder.mItem?.let { book ->
                        mListener?.onItemClick(book)
                    }
                }


                Glide.with(holder.mView)
                    .load(movies.movieImageUrl)
                    .centerInside()
                    .into(holder.mmovieImage)


            }

            /**
             * Remember: RecyclerView adapters require a getItemCount() method.
             */
            override fun getItemCount(): Int {
                return movies.size
            }
        }


}
}




