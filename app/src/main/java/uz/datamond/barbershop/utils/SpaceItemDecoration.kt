package uz.umbrellasoft.nomerbor.utils

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class SpaceItemDecoration(
        private val space: Int,
        private val horizontal: Boolean = true,
        private val grid: Boolean = false,
        private val span: Int=0,
        private val vertical:Boolean=false
) : RecyclerView.ItemDecoration(){
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        val itemPosition = parent.getChildLayoutPosition(view)


        if(horizontal&&span==1){
            outRect.top = space
            outRect.bottom = space
            if (itemPosition == 0) {
                outRect.left = space * 2
                outRect.right = space

            } else {
                outRect.left = 0
                outRect.right = space
            }
        }

        if(vertical&&span==1){
            if(itemPosition==0){
                outRect.top=space*2
            }else{
                outRect.top=space
            }
            outRect.left=space*2
            outRect.right=space*2
            outRect.bottom=space
        }

        if(grid&&span==2){
            if (itemPosition == 0 || itemPosition == 1) {
                outRect.top = space * 3
            } else {
                outRect.top = space
            }
            outRect.bottom = space
            if (itemPosition % 2 == 0) {
                outRect.left = space * 2
                outRect.right = space
            } else {
                outRect.left = space
                outRect.right = space * 2
            }
        }
    }
}


class SpaceItemDecorationForHeader(
    private val space: Int,
    private val horizontal: Boolean = true,
    private val grid: Boolean = false,
    private val span: Int=0,
    private val vertical:Boolean=false
) : RecyclerView.ItemDecoration(){
    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        super.getItemOffsets(outRect, view, parent, state)
        var itemPosition = parent.getChildLayoutPosition(view)
        if (itemPosition == 0) { return }
        itemPosition--

        if(horizontal&&span==1){
            outRect.top = space
            outRect.bottom = space
            if (itemPosition == 0) {
                outRect.left = space * 2
                outRect.right = space

            } else {
                outRect.left = 0
                outRect.right = space
            }
        }

        if(vertical&&span==1){
            if(itemPosition==0){
                outRect.top=space*2
            }else{
                outRect.top=space
            }
            outRect.left=space*2
            outRect.right=space*2
            outRect.bottom=space
        }

        if(grid&&span==2){

            if (itemPosition == 0 || itemPosition == 1) {
                outRect.top = space * 3
            } else {
                outRect.top = space
            }
            outRect.bottom = space
            if (itemPosition % 2 == 0) {
                outRect.left = space * 2
                outRect.right = space
            } else {
                outRect.left = space
                outRect.right = space * 2
            }
        }
    }
}