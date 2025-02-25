package com.android.camp.answer

import android.content.res.ColorStateList
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.android.camp.R
import com.android.camp.data.model.Answer

class AnswerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val layoutRoot by lazy { itemView.findViewById<View>(R.id.layout_root) }
    private val textViewType by lazy { itemView.findViewById<TextView>(R.id.text_view_type) }
    private val textViewAnswer by lazy { itemView.findViewById<TextView>(R.id.text_view_answer) }
    private val imageView by lazy { itemView.findViewById<ImageView>(R.id.image_view) }

    fun bind(answer: Answer, selectedType: String) {
        textViewType.text = "${answer.type}: "
        textViewAnswer.text = answer.answer

        layoutRoot.backgroundTintList = ColorStateList.valueOf(
            ContextCompat.getColor(
                layoutRoot.context,
                if (answer.type == selectedType) R.color.yellow else R.color.default_answer_color
            )
        )

        textViewAnswer.setTextColor(ContextCompat.getColor(
            layoutRoot.context,
            if (answer.type == selectedType) R.color.black else R.color.white
        ))

        imageView.imageTintList = ColorStateList.valueOf(
            ContextCompat.getColor(
                layoutRoot.context,
                if (answer.type == selectedType) R.color.black else R.color.white
            )
        )

    }
}