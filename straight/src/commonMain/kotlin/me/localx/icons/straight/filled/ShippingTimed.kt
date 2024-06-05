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
                moveTo(6.216f, 7.63f)
                lineToRelative(-2.216f, -2.216f)
                verticalLineToRelative(-3.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.63f, 1.63f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(15.0f, 4.0f)
                verticalLineToRelative(14.0f)
                lineTo(0.0f, 18.0f)
                verticalLineToRelative(-8.106f)
                curveToRelative(1.271f, 1.298f, 3.04f, 2.106f, 5.0f, 2.106f)
                curveToRelative(3.866f, 0.0f, 7.0f, -3.134f, 7.0f, -7.0f)
                curveToRelative(0.0f, -1.488f, -0.468f, -2.866f, -1.26f, -4.0f)
                horizontalLineToRelative(1.26f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(21.942f, 20.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                horizontalLineToRelative(4.885f)
                close()
                moveTo(7.942f, 20.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                horizontalLineToRelative(4.885f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _shippingTimed!!
    }

private var _shippingTimed: ImageVector? = null
