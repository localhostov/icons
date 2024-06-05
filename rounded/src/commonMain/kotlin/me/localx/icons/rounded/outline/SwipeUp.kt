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

public val Icons.Outline.SwipeUp: ImageVector
    get() {
        if (_swipeUp != null) {
            return _swipeUp!!
        }
        _swipeUp = Builder(name = "SwipeUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.085f, 10.327f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-5.084f, -1.129f)
                lineTo(15.001f, 3.107f)
                curveToRelative(0.0f, -1.516f, -1.076f, -2.835f, -2.503f, -3.067f)
                curveToRelative(-0.878f, -0.142f, -1.768f, 0.102f, -2.439f, 0.674f)
                curveToRelative(-0.672f, 0.571f, -1.058f, 1.404f, -1.058f, 2.286f)
                verticalLineToRelative(11.565f)
                lineToRelative(-0.955f, -0.758f)
                curveToRelative(-1.207f, -1.128f, -3.107f, -1.063f, -4.236f, 0.144f)
                curveToRelative(-1.13f, 1.208f, -1.066f, 3.11f, 0.13f, 4.23f)
                lineToRelative(3.71f, 3.577f)
                curveToRelative(1.499f, 1.445f, 3.471f, 2.241f, 5.552f, 2.241f)
                horizontalLineToRelative(5.798f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-3.791f)
                curveToRelative(0.0f, -2.361f, -1.61f, -4.368f, -3.915f, -4.882f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.798f)
                curveToRelative(-1.561f, 0.0f, -3.04f, -0.597f, -4.164f, -1.681f)
                lineToRelative(-3.721f, -3.587f)
                curveToRelative(-0.403f, -0.378f, -0.424f, -1.013f, -0.047f, -1.416f)
                curveToRelative(0.19f, -0.203f, 0.445f, -0.309f, 0.711f, -0.309f)
                curveToRelative(0.26f, 0.0f, 0.53f, 0.102f, 0.758f, 0.312f)
                lineToRelative(2.637f, 2.1f)
                curveToRelative(0.302f, 0.239f, 0.714f, 0.288f, 1.057f, 0.118f)
                curveToRelative(0.346f, -0.166f, 0.566f, -0.517f, 0.566f, -0.9f)
                lineTo(10.999f, 3.0f)
                curveToRelative(0.0f, -0.294f, 0.129f, -0.572f, 0.353f, -0.763f)
                curveToRelative(0.227f, -0.193f, 0.517f, -0.273f, 0.822f, -0.223f)
                curveToRelative(0.462f, 0.075f, 0.825f, 0.555f, 0.825f, 1.093f)
                verticalLineToRelative(6.893f)
                curveToRelative(0.0f, 0.469f, 0.326f, 0.875f, 0.783f, 0.977f)
                lineToRelative(5.868f, 1.304f)
                curveToRelative(1.383f, 0.308f, 2.349f, 1.512f, 2.349f, 2.929f)
                verticalLineToRelative(3.791f)
                close()
                moveTo(3.0f, 9.0f)
                lineTo(3.0f, 2.871f)
                lineToRelative(-1.293f, 1.293f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                reflectiveCurveTo(-0.098f, 3.141f, 0.293f, 2.75f)
                lineTo(2.367f, 0.677f)
                curveTo(2.813f, 0.23f, 3.399f, 0.006f, 3.986f, 0.003f)
                curveToRelative(0.005f, 0.0f, 0.009f, -0.003f, 0.014f, -0.003f)
                reflectiveCurveToRelative(0.009f, 0.003f, 0.014f, 0.003f)
                curveToRelative(0.587f, 0.004f, 1.173f, 0.227f, 1.62f, 0.674f)
                lineToRelative(2.074f, 2.073f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.293f, -1.293f)
                verticalLineToRelative(6.129f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _swipeUp!!
    }

private var _swipeUp: ImageVector? = null
