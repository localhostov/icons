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

public val Icons.Filled.TruckTow: ImageVector
    get() {
        if (_truckTow != null) {
            return _truckTow!!
        }
        _truckTow = Builder(name = "TruckTow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.484f, 12.0f)
                horizontalLineToRelative(1.516f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(7.933f)
                lineTo(4.0f, 3.243f)
                verticalLineToRelative(3.257f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                lineTo(2.0f, 0.0f)
                horizontalLineToRelative(1.984f)
                lineToRelative(9.5f, 12.0f)
                close()
                moveTo(3.058f, 21.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                lineTo(3.058f, 21.0f)
                close()
                moveTo(17.058f, 21.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                horizontalLineToRelative(-4.885f)
                close()
                moveTo(17.0f, 19.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(19.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _truckTow!!
    }

private var _truckTow: ImageVector? = null
