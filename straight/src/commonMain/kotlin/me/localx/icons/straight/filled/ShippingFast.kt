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

public val Icons.Filled.ShippingFast: ImageVector
    get() {
        if (_shippingFast != null) {
            return _shippingFast!!
        }
        _shippingFast = Builder(name = "ShippingFast", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 3.0f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(0.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(6.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(15.0f)
                lineTo(15.0f, 4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(19.5f, 23.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                horizontalLineToRelative(-4.885f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                moveToRelative(-14.0f, 0.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                lineTo(3.058f, 20.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                moveToRelative(11.5f, -5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _shippingFast!!
    }

private var _shippingFast: ImageVector? = null
