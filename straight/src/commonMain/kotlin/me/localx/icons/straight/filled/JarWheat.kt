package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.JarWheat: ImageVector
    get() {
        if (_jarWheat != null) {
            return _jarWheat!!
        }
        _jarWheat = Builder(name = "JarWheat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 3.0f)
                curveToRelative(-0.695f, 0.0f, -1.366f, 0.102f, -2.0f, 0.292f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(3.292f)
                curveToRelative(-0.634f, -0.189f, -1.305f, -0.292f, -2.0f, -0.292f)
                lineTo(7.0f, 3.0f)
                close()
                moveTo(17.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(3.786f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.497f, -0.269f, -0.948f, -0.549f, -1.186f, -0.787f)
                curveToRelative(-0.721f, -0.721f, -1.103f, -3.714f, -1.103f, -3.714f)
                curveToRelative(0.0f, 0.0f, 2.993f, 0.382f, 3.714f, 1.103f)
                curveToRelative(0.439f, 0.439f, 0.668f, 1.025f, 0.783f, 1.61f)
                lineToRelative(0.003f, 0.006f)
                verticalLineToRelative(-2.674f)
                curveToRelative(-0.089f, -0.037f, -2.684f, -1.119f, -3.393f, -1.828f)
                curveToRelative(-0.721f, -0.721f, -1.104f, -3.716f, -1.104f, -3.716f)
                curveToRelative(0.0f, 0.0f, 2.995f, 0.382f, 3.716f, 1.104f)
                curveToRelative(0.437f, 0.437f, 0.666f, 1.02f, 0.782f, 1.602f)
                verticalLineToRelative(-2.605f)
                curveToRelative(-0.55f, -0.711f, -1.123f, -1.589f, -1.123f, -2.165f)
                curveToRelative(0.0f, -1.108f, 2.125f, -4.437f, 2.125f, -4.437f)
                curveToRelative(0.0f, 0.0f, 2.125f, 3.329f, 2.125f, 4.437f)
                curveToRelative(0.0f, 0.576f, -0.574f, 1.455f, -1.126f, 2.167f)
                verticalLineToRelative(2.279f)
                curveToRelative(0.135f, -0.46f, 0.354f, -0.901f, 0.703f, -1.251f)
                curveToRelative(0.736f, -0.736f, 3.798f, -1.132f, 3.798f, -1.132f)
                curveToRelative(0.0f, 0.0f, -0.439f, 3.105f, -1.176f, 3.841f)
                curveToRelative(-0.654f, 0.654f, -2.844f, 1.583f, -3.327f, 1.784f)
                verticalLineToRelative(2.594f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.115f, -0.585f, 0.345f, -1.171f, 0.783f, -1.61f)
                curveToRelative(0.721f, -0.721f, 3.72f, -1.109f, 3.72f, -1.109f)
                curveToRelative(0.0f, 0.0f, -0.388f, 2.999f, -1.109f, 3.72f)
                curveToRelative(-0.236f, 0.236f, -0.682f, 0.514f, -1.174f, 0.78f)
                horizontalLineToRelative(3.783f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.345f, 3.0f, -3.0f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _jarWheat!!
    }

private var _jarWheat: ImageVector? = null
