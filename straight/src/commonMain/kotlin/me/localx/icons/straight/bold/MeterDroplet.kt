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

public val Icons.Bold.MeterDroplet: ImageVector
    get() {
        if (_meterDroplet != null) {
            return _meterDroplet!!
        }
        _meterDroplet = Builder(name = "MeterDroplet", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 12.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.5f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(22.377f, 14.6f)
                curveToRelative(1.051f, 1.05f, 1.623f, 2.431f, 1.623f, 3.9f)
                reflectiveCurveToRelative(-0.572f, 2.851f, -1.611f, 3.889f)
                curveToRelative(-1.039f, 1.039f, -2.42f, 1.611f, -3.889f, 1.611f)
                reflectiveCurveToRelative(-2.852f, -0.572f, -3.89f, -1.612f)
                curveToRelative(-1.038f, -1.037f, -1.61f, -2.418f, -1.61f, -3.888f)
                reflectiveCurveToRelative(0.572f, -2.851f, 1.611f, -3.889f)
                lineToRelative(3.889f, -3.805f)
                lineToRelative(3.877f, 3.793f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, -0.668f, -0.26f, -1.295f, -0.732f, -1.768f)
                lineToRelative(-1.768f, -1.729f)
                lineToRelative(-1.779f, 1.74f)
                curveToRelative(-0.461f, 0.461f, -0.721f, 1.088f, -0.721f, 1.756f)
                reflectiveCurveToRelative(0.26f, 1.295f, 0.732f, 1.768f)
                curveToRelative(0.942f, 0.944f, 2.59f, 0.946f, 3.535f, 0.0f)
                curveToRelative(0.473f, -0.473f, 0.732f, -1.1f, 0.732f, -1.768f)
                close()
                moveTo(11.424f, 20.971f)
                curveToRelative(-4.694f, -0.3f, -8.424f, -4.202f, -8.424f, -8.971f)
                curveTo(3.0f, 7.037f, 7.038f, 3.0f, 12.0f, 3.0f)
                curveToRelative(4.378f, 0.0f, 8.031f, 3.143f, 8.833f, 7.291f)
                lineToRelative(2.943f, 2.879f)
                curveToRelative(0.052f, 0.052f, 0.096f, 0.108f, 0.146f, 0.161f)
                curveToRelative(0.049f, -0.438f, 0.078f, -0.881f, 0.078f, -1.331f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(0.449f, 0.0f, 0.891f, -0.029f, 1.328f, -0.078f)
                curveToRelative(-0.044f, -0.042f, -0.091f, -0.078f, -0.134f, -0.121f)
                curveToRelative(-0.81f, -0.81f, -1.404f, -1.777f, -1.771f, -2.83f)
                close()
                moveTo(18.0f, 8.498f)
                verticalLineToRelative(-1.498f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.433f)
                lineToRelative(3.0f, -2.935f)
                close()
            }
        }
        .build()
        return _meterDroplet!!
    }

private var _meterDroplet: ImageVector? = null
