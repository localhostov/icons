package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) {
            return _swipeRight!!
        }
        _swipeRight = Builder(name = "SwipeRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.98f, 10.376f)
                lineToRelative(-5.98f, -1.196f)
                lineTo(12.0f, 3.107f)
                curveToRelative(0.0f, -1.516f, -1.076f, -2.835f, -2.503f, -3.067f)
                curveToRelative(-0.88f, -0.142f, -1.768f, 0.102f, -2.439f, 0.674f)
                curveToRelative(-0.672f, 0.571f, -1.058f, 1.404f, -1.058f, 2.286f)
                verticalLineToRelative(11.566f)
                lineToRelative(-0.955f, -0.759f)
                curveToRelative(-1.208f, -1.128f, -3.107f, -1.063f, -4.235f, 0.143f)
                curveToRelative(-1.13f, 1.208f, -1.067f, 3.11f, 0.129f, 4.231f)
                lineToRelative(3.71f, 3.577f)
                curveToRelative(1.499f, 1.445f, 3.472f, 2.241f, 5.554f, 2.241f)
                horizontalLineToRelative(6.798f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-3.721f)
                curveToRelative(0.0f, -2.375f, -1.69f, -4.438f, -4.02f, -4.903f)
                close()
                moveTo(20.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.798f)
                curveToRelative(-1.562f, 0.0f, -3.041f, -0.597f, -4.165f, -1.681f)
                lineToRelative(-3.721f, -3.587f)
                curveToRelative(-0.402f, -0.378f, -0.424f, -1.013f, -0.046f, -1.416f)
                curveToRelative(0.182f, -0.194f, 0.429f, -0.307f, 0.694f, -0.315f)
                curveToRelative(0.012f, 0.0f, 0.023f, 0.0f, 0.035f, 0.0f)
                curveToRelative(0.253f, 0.0f, 0.496f, 0.097f, 0.739f, 0.32f)
                lineToRelative(2.638f, 2.1f)
                curveToRelative(0.301f, 0.239f, 0.711f, 0.288f, 1.058f, 0.118f)
                curveToRelative(0.346f, -0.166f, 0.565f, -0.517f, 0.565f, -0.9f)
                lineTo(7.999f, 3.0f)
                curveToRelative(0.0f, -0.294f, 0.129f, -0.572f, 0.353f, -0.763f)
                curveToRelative(0.228f, -0.193f, 0.52f, -0.273f, 0.822f, -0.223f)
                curveToRelative(0.463f, 0.075f, 0.825f, 0.555f, 0.825f, 1.093f)
                verticalLineToRelative(6.893f)
                curveToRelative(0.0f, 0.477f, 0.337f, 0.887f, 0.804f, 0.98f)
                lineToRelative(6.784f, 1.356f)
                curveToRelative(1.397f, 0.279f, 2.412f, 1.518f, 2.412f, 2.942f)
                verticalLineToRelative(3.721f)
                close()
                moveTo(24.0f, 4.0f)
                curveToRelative(0.0f, 0.617f, -0.24f, 1.197f, -0.678f, 1.634f)
                lineToRelative(-2.072f, 2.073f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.292f, -1.293f)
                horizontalLineToRelative(-6.128f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.128f)
                lineToRelative(-1.292f, -1.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.073f, 2.074f)
                curveToRelative(0.437f, 0.436f, 0.677f, 1.016f, 0.677f, 1.633f)
                close()
            }
        }
        .build()
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
