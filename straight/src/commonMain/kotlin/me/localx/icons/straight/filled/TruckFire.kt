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

public val Icons.Filled.TruckFire: ImageVector
    get() {
        if (_truckFire != null) {
            return _truckFire!!
        }
        _truckFire = Builder(name = "TruckFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.942f, 20.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                horizontalLineToRelative(4.885f)
                close()
                moveTo(24.0f, 1.0f)
                lineTo(24.0f, 3.0f)
                lineTo(13.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                lineTo(3.0f, 3.0f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 1.0f)
                lineTo(24.0f, 1.0f)
                close()
                moveTo(7.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 3.0f)
                close()
                moveTo(11.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 3.0f)
                close()
                moveTo(0.058f, 20.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                lineTo(0.058f, 20.0f)
                close()
                moveTo(0.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                verticalLineToRelative(-4.0f)
                lineTo(0.0f, 14.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(18.5f, 4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(6.721f)
                lineToRelative(-1.316f, -3.949f)
                curveToRelative(-0.362f, -1.085f, -1.299f, -1.853f, -2.404f, -2.016f)
                verticalLineToRelative(-0.535f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(17.058f, 20.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                horizontalLineToRelative(-4.885f)
                close()
            }
        }
        .build()
        return _truckFire!!
    }

private var _truckFire: ImageVector? = null
