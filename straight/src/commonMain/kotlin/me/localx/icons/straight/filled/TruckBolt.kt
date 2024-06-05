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

public val Icons.Filled.TruckBolt: ImageVector
    get() {
        if (_truckBolt != null) {
            return _truckBolt!!
        }
        _truckBolt = Builder(name = "TruckBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.942f, 20.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                horizontalLineToRelative(4.885f)
                close()
                moveTo(17.057f, 20.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                horizontalLineToRelative(-4.885f)
                close()
                moveTo(14.999f, 4.0f)
                verticalLineToRelative(14.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 2.343f, 1.343f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(10.791f, 9.642f)
                curveToRelative(-0.244f, -0.382f, -0.659f, -0.609f, -1.112f, -0.609f)
                horizontalLineToRelative(-3.209f)
                lineToRelative(2.226f, -4.051f)
                lineToRelative(-1.753f, -0.963f)
                lineToRelative(-2.803f, 5.103f)
                curveToRelative(-0.206f, 0.412f, -0.185f, 0.893f, 0.058f, 1.284f)
                curveToRelative(0.243f, 0.393f, 0.663f, 0.627f, 1.124f, 0.627f)
                horizontalLineToRelative(3.156f)
                lineToRelative(-2.367f, 3.954f)
                lineToRelative(1.717f, 1.027f)
                lineToRelative(3.049f, -5.105f)
                curveToRelative(0.19f, -0.411f, 0.159f, -0.885f, -0.085f, -1.267f)
                close()
                moveTo(18.999f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(16.999f, 18.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _truckBolt!!
    }

private var _truckBolt: ImageVector? = null
