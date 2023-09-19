//import android.graphics.Canvas
//import android.graphics.Color
//import android.graphics.Paint
//import android.graphics.PorterDuff
//import android.graphics.PorterDuffXfermode
//import android.graphics.drawable.Drawable
//
//class GlassmorphicDrawable : Drawable() {
//
//    private val paint = Paint()
//    private val overlayPaint = Paint()
//
//    init {
//        paint.color = Color.WHITE
//        overlayPaint.xfermode = PorterDuffXfermode(PorterDuff.Mode.OVERLAY)
//    }
//
//    override fun draw(canvas: Canvas) {
//        // Draw the white background with blending mode
//        canvas.drawRect(bounds, paint)
//        canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.SRC)
//
//        // Restore the blending mode
//        canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.SRC_OVER)
//    }
//
//    override fun setAlpha(alpha: Int) {
//        // Not needed for this example
//    }
//
//    override fun setColorFilter(colorFilter: android.graphics.ColorFilter?) {
//        // Not needed for this example
//    }
//
//    override fun getOpacity(): Int {
//        return android.graphics.PixelFormat.TRANSLUCENT
//    }
//}
