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

public val Icons.Bold.CartShoppingFast: ImageVector
    get() {
        if (_cartShoppingFast != null) {
            return _cartShoppingFast!!
        }
        _cartShoppingFast = Builder(name = "CartShoppingFast", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 22.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                close()
                moveTo(18.0f, 20.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(23.97f, 5.0f)
                lineToRelative(-3.6f, 13.0f)
                lineTo(9.41f, 18.0f)
                curveToRelative(-1.75f, 0.0f, -3.24f, -1.31f, -3.47f, -3.04f)
                lineTo(4.4f, 3.43f)
                curveToRelative(-0.03f, -0.25f, -0.25f, -0.43f, -0.5f, -0.43f)
                horizontalLineToRelative(-1.9f)
                lineTo(2.0f, 0.0f)
                horizontalLineToRelative(1.9f)
                curveToRelative(1.75f, 0.0f, 3.24f, 1.31f, 3.47f, 3.04f)
                lineToRelative(0.26f, 1.96f)
                lineTo(23.97f, 5.0f)
                close()
                moveTo(20.03f, 8.0f)
                lineTo(8.03f, 8.0f)
                lineToRelative(0.88f, 6.57f)
                curveToRelative(0.03f, 0.25f, 0.25f, 0.43f, 0.5f, 0.43f)
                horizontalLineToRelative(8.68f)
                lineToRelative(1.94f, -7.0f)
                close()
                moveTo(2.59f, 5.0f)
                lineTo(0.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.99f, 8.0f)
                lineToRelative(-0.4f, -3.0f)
                close()
                moveTo(3.92f, 15.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.18f, 18.0f)
                curveToRelative(-0.64f, -0.77f, -1.08f, -1.72f, -1.23f, -2.77f)
                lineToRelative(-0.03f, -0.23f)
                close()
                moveTo(3.25f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.66f, 13.0f)
                lineToRelative(-0.4f, -3.0f)
                close()
            }
        }
        .build()
        return _cartShoppingFast!!
    }

private var _cartShoppingFast: ImageVector? = null
