package me.localx.icons.straight.outline

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

public val Icons.Outline.TruckBolt: ImageVector
    get() {
        if (_truckBolt != null) {
            return _truckBolt!!
        }
        _truckBolt = Builder(name = "TruckBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.822f, 9.642f)
                curveToRelative(0.244f, 0.382f, 0.275f, 0.855f, 0.085f, 1.267f)
                lineToRelative(-3.049f, 5.105f)
                lineToRelative(-1.717f, -1.027f)
                lineToRelative(2.367f, -3.954f)
                horizontalLineToRelative(-3.006f)
                curveToRelative(-0.461f, 0.0f, -0.881f, -0.234f, -1.124f, -0.627f)
                curveToRelative(-0.242f, -0.392f, -0.264f, -0.872f, -0.058f, -1.284f)
                lineToRelative(2.803f, -5.103f)
                lineToRelative(1.753f, 0.963f)
                lineToRelative(-2.226f, 4.051f)
                horizontalLineToRelative(3.059f)
                curveToRelative(0.453f, 0.0f, 0.868f, 0.228f, 1.112f, 0.609f)
                close()
                moveTo(24.0f, 19.0f)
                horizontalLineToRelative(-2.041f)
                curveToRelative(0.024f, 0.165f, 0.041f, 0.331f, 0.041f, 0.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -0.169f, 0.017f, -0.335f, 0.041f, -0.5f)
                horizontalLineToRelative(-6.082f)
                curveToRelative(0.024f, 0.165f, 0.041f, 0.331f, 0.041f, 0.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -0.169f, 0.017f, -0.335f, 0.041f, -0.5f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 4.0f)
                curveTo(0.0f, 2.346f, 1.346f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(17.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(13.0f)
                lineTo(15.0f, 4.0f)
                close()
                moveTo(22.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _truckBolt!!
    }

private var _truckBolt: ImageVector? = null
