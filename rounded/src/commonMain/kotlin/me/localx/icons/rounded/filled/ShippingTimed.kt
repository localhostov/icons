package me.localx.icons.rounded.filled

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

public val Icons.Filled.ShippingTimed: ImageVector
    get() {
        if (_shippingTimed != null) {
            return _shippingTimed!!
        }
        _shippingTimed = Builder(name = "ShippingTimed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                reflectiveCurveTo(7.757f, 0.0f, 5.0f, 0.0f)
                close()
                moveTo(5.509f, 6.923f)
                lineToRelative(-1.216f, -1.216f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.442f, -0.293f, -0.707f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.586f)
                lineToRelative(0.923f, 0.923f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0.0f)
                close()
                moveTo(19.942f, 20.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                horizontalLineToRelative(4.885f)
                close()
                moveTo(8.942f, 20.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                horizontalLineToRelative(4.885f)
                close()
                moveTo(4.0f, 18.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                verticalLineToRelative(-4.107f)
                curveToRelative(1.272f, 1.299f, 3.043f, 2.107f, 5.0f, 2.107f)
                curveToRelative(3.859f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f)
                curveToRelative(0.0f, -1.459f, -0.449f, -2.816f, -1.216f, -3.939f)
                curveToRelative(2.389f, 0.376f, 4.216f, 2.444f, 4.216f, 4.939f)
                verticalLineToRelative(12.0f)
                lineTo(4.0f, 18.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.209f, -1.791f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, 2.239f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _shippingTimed!!
    }

private var _shippingTimed: ImageVector? = null
