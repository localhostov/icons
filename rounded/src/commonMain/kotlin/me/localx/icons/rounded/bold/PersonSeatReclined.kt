package me.localx.icons.rounded.bold

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

public val Icons.Bold.PersonSeatReclined: ImageVector
    get() {
        if (_personSeatReclined != null) {
            return _personSeatReclined!!
        }
        _personSeatReclined = Builder(name = "PersonSeatReclined", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.0f, 2.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.121f, -2.5f, -2.5f)
                close()
                moveTo(22.5f, 21.0f)
                horizontalLineToRelative(-1.554f)
                lineToRelative(-2.394f, -4.789f)
                curveToRelative(-0.678f, -1.355f, -2.063f, -2.211f, -3.578f, -2.211f)
                horizontalLineToRelative(-4.747f)
                curveToRelative(-0.237f, 0.0f, -0.441f, -0.166f, -0.489f, -0.397f)
                lineToRelative(-0.383f, -1.603f)
                horizontalLineToRelative(5.145f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.75f)
                curveToRelative(-0.037f, 0.0f, -0.074f, 0.002f, -0.111f, 0.005f)
                lineToRelative(-0.433f, -1.812f)
                curveToRelative(-0.146f, -0.695f, -0.758f, -1.192f, -1.468f, -1.192f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.952f, 0.0f, -1.663f, 0.876f, -1.468f, 1.807f)
                lineToRelative(1.532f, 6.41f)
                curveToRelative(0.34f, 1.621f, 1.769f, 2.782f, 3.426f, 2.782f)
                horizontalLineToRelative(4.747f)
                curveToRelative(0.379f, 0.0f, 0.725f, 0.214f, 0.894f, 0.553f)
                lineToRelative(2.394f, 4.789f)
                curveToRelative(0.508f, 1.016f, 1.547f, 1.658f, 2.683f, 1.658f)
                horizontalLineToRelative(1.554f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.428f, 19.0f)
                horizontalLineToRelative(-3.283f)
                curveToRelative(-2.589f, 0.0f, -4.827f, -1.805f, -5.376f, -4.335f)
                lineToRelative(-1.803f, -7.483f)
                curveToRelative(-0.15f, -0.69f, -0.76f, -1.182f, -1.466f, -1.182f)
                curveToRelative(-0.956f, 0.0f, -1.668f, 0.883f, -1.466f, 1.817f)
                lineToRelative(1.803f, 7.484f)
                curveToRelative(0.847f, 3.909f, 4.306f, 6.698f, 8.305f, 6.698f)
                horizontalLineToRelative(3.285f)
                curveToRelative(1.115f, 0.0f, 1.84f, -1.173f, 1.342f, -2.171f)
                curveToRelative(-0.254f, -0.508f, -0.773f, -0.829f, -1.342f, -0.829f)
                close()
            }
        }
        .build()
        return _personSeatReclined!!
    }

private var _personSeatReclined: ImageVector? = null
