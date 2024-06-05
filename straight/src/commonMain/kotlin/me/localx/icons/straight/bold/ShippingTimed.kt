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

public val Icons.Bold.ShippingTimed: ImageVector
    get() {
        if (_shippingTimed != null) {
            return _shippingTimed!!
        }
        _shippingTimed = Builder(name = "ShippingTimed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.307f, 11.412f)
                curveToRelative(5.009f, 2.212f, 9.836f, -2.176f, 8.452f, -7.136f)
                curveToRelative(-0.546f, -1.959f, -2.077f, -3.489f, -4.036f, -4.035f)
                curveTo(2.764f, -1.143f, -1.624f, 3.684f, 0.588f, 8.692f)
                curveToRelative(0.532f, 1.205f, 1.514f, 2.187f, 2.719f, 2.719f)
                close()
                moveTo(5.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(2.207f, 2.207f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.793f, -2.793f)
                lineTo(5.0f, 2.0f)
                close()
                moveTo(24.0f, 10.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.26f)
                curveToRelative(0.715f, 0.891f, 1.238f, 1.939f, 1.52f, 3.083f)
                curveToRelative(0.141f, 0.088f, 0.241f, 0.238f, 0.241f, 0.417f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                verticalLineToRelative(12.499f)
                lineTo(3.0f, 16.999f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-0.587f)
                curveTo(1.838f, 12.942f, 0.815f, 12.205f, 0.0f, 11.279f)
                verticalLineToRelative(2.721f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                verticalLineToRelative(5.999f)
                horizontalLineToRelative(3.058f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                horizontalLineToRelative(8.115f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                horizontalLineToRelative(3.058f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(18.5f, 8.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _shippingTimed!!
    }

private var _shippingTimed: ImageVector? = null
