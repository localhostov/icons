package me.localx.icons.straight.bold

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

public val Icons.Bold.Brand: ImageVector
    get() {
        if (_brand != null) {
            return _brand!!
        }
        _brand = Builder(name = "Brand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.115f, 12.713f)
                lineTo(12.22f, 1.993f)
                lineToRelative(-7.278f, 0.786f)
                lineTo(2.167f, 0.0f)
                lineTo(0.044f, 2.121f)
                lineToRelative(2.749f, 2.752f)
                lineToRelative(-0.863f, 7.608f)
                lineToRelative(10.761f, 10.564f)
                curveToRelative(0.616f, 0.614f, 1.425f, 0.922f, 2.236f, 0.922f)
                curveToRelative(0.822f, 0.0f, 1.646f, -0.315f, 2.276f, -0.946f)
                lineToRelative(5.946f, -6.078f)
                curveToRelative(1.146f, -1.172f, 1.134f, -3.066f, -0.034f, -4.23f)
                close()
                moveTo(15.069f, 20.913f)
                curveToRelative(-0.073f, 0.074f, -0.202f, 0.065f, -0.27f, 0.0f)
                lineTo(5.076f, 11.366f)
                lineToRelative(0.429f, -3.779f)
                lineToRelative(1.533f, 1.535f)
                curveToRelative(-0.016f, 0.114f, -0.035f, 0.226f, -0.035f, 0.344f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.117f, 0.0f, -0.23f, 0.019f, -0.343f, 0.035f)
                lineToRelative(-1.497f, -1.498f)
                lineToRelative(3.466f, -0.375f)
                lineToRelative(9.876f, 9.718f)
                lineToRelative(-5.936f, 6.067f)
                close()
                moveTo(15.063f, 18.026f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _brand!!
    }

private var _brand: ImageVector? = null
