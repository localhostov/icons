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

public val Icons.Filled.CartShoppingFast: ImageVector
    get() {
        if (_cartShoppingFast != null) {
            return _cartShoppingFast!!
        }
        _cartShoppingFast = Builder(name = "CartShoppingFast", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.69f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.45f, 5.0f)
                lineToRelative(0.24f, 2.0f)
                close()
                moveTo(0.0f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.63f, 15.0f)
                lineToRelative(-0.24f, -2.0f)
                lineTo(0.0f, 13.0f)
                close()
                moveTo(3.92f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.16f, 11.0f)
                lineToRelative(-0.24f, -2.0f)
                close()
                moveTo(21.59f, 15.0f)
                lineTo(8.65f, 15.0f)
                lineToRelative(0.13f, 1.12f)
                curveToRelative(0.06f, 0.5f, 0.49f, 0.88f, 0.99f, 0.88f)
                horizontalLineToRelative(11.22f)
                verticalLineToRelative(2.0f)
                lineTo(9.78f, 19.0f)
                curveToRelative(-1.52f, 0.0f, -2.8f, -1.14f, -2.98f, -2.65f)
                lineTo(5.21f, 2.88f)
                curveToRelative(-0.06f, -0.5f, -0.49f, -0.88f, -0.99f, -0.88f)
                lineTo(2.0f, 2.0f)
                lineTo(2.0f, 0.0f)
                horizontalLineToRelative(2.22f)
                curveToRelative(1.52f, 0.0f, 2.8f, 1.14f, 2.98f, 2.65f)
                lineToRelative(0.04f, 0.35f)
                lineTo(23.99f, 3.0f)
                lineToRelative(-2.4f, 12.0f)
                close()
                moveTo(9.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(18.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _cartShoppingFast!!
    }

private var _cartShoppingFast: ImageVector? = null
