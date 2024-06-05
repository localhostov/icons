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

public val Icons.Filled.CarSideBolt: ImageVector
    get() {
        if (_carSideBolt != null) {
            return _carSideBolt!!
        }
        _carSideBolt = Builder(name = "CarSideBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.825f)
                lineToRelative(-3.985f, -5.715f)
                curveToRelative(-0.561f, -0.804f, -1.48f, -1.285f, -2.461f, -1.285f)
                lineTo(6.381f, 1.0f)
                curveToRelative(-1.239f, 0.0f, -2.367f, 0.778f, -2.806f, 1.937f)
                lineToRelative(-1.919f, 5.063f)
                horizontalLineToRelative(2.344f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(24.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(12.772f, 11.426f)
                lineToRelative(-1.764f, 3.534f)
                lineToRelative(-1.789f, -0.894f)
                lineToRelative(1.53f, -3.066f)
                horizontalLineToRelative(-2.134f)
                curveToRelative(-0.509f, 0.0f, -0.994f, -0.244f, -1.297f, -0.653f)
                reflectiveCurveToRelative(-0.396f, -0.943f, -0.249f, -1.43f)
                lineToRelative(2.224f, -4.161f)
                lineToRelative(1.76f, 0.95f)
                lineToRelative(-1.778f, 3.294f)
                horizontalLineToRelative(2.121f)
                curveToRelative(0.592f, 0.0f, 1.133f, 0.324f, 1.413f, 0.846f)
                curveToRelative(0.268f, 0.499f, 0.252f, 1.098f, -0.037f, 1.58f)
                close()
                moveTo(7.942f, 19.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                lineTo(7.942f, 19.0f)
                close()
                moveTo(20.942f, 19.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                horizontalLineToRelative(4.885f)
                close()
            }
        }
        .build()
        return _carSideBolt!!
    }

private var _carSideBolt: ImageVector? = null
