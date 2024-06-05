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

public val Icons.Filled.TruckArrowLeft: ImageVector
    get() {
        if (_truckArrowLeft != null) {
            return _truckArrowLeft!!
        }
        _truckArrowLeft = Builder(name = "TruckArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.942f, 20.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                horizontalLineToRelative(4.885f)
                close()
                moveTo(3.057f, 20.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                lineTo(3.058f, 20.0f)
                close()
                moveTo(12.0f, 1.0f)
                lineTo(3.0f, 1.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineToRelative(5.64f)
                curveToRelative(0.07f, -0.386f, 0.253f, -0.756f, 0.551f, -1.054f)
                lineToRelative(3.518f, -3.518f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.518f, 2.518f)
                horizontalLineToRelative(8.035f)
                verticalLineToRelative(2.0f)
                lineTo(2.965f, 11.0f)
                lineToRelative(2.518f, 2.518f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.518f, -3.518f)
                curveToRelative(-0.298f, -0.298f, -0.481f, -0.668f, -0.551f, -1.054f)
                verticalLineToRelative(7.64f)
                horizontalLineToRelative(15.0f)
                lineTo(15.0f, 4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _truckArrowLeft!!
    }

private var _truckArrowLeft: ImageVector? = null
