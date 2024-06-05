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

public val Icons.Bold.OrderHistory: ImageVector
    get() {
        if (_orderHistory != null) {
            return _orderHistory!!
        }
        _orderHistory = Builder(name = "OrderHistory", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                curveToRelative(2.761f, 0.0f, 5.0f, -2.239f, 5.0f, -5.0f)
                reflectiveCurveTo(21.761f, 0.0f, 19.0f, 0.0f)
                reflectiveCurveToRelative(-5.0f, 2.239f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.239f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(18.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.707f, 1.707f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.293f, -2.293f)
                lineTo(18.0f, 2.0f)
                close()
                moveTo(19.0f, 22.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(22.244f, 11.2f)
                lineToRelative(-1.873f, 6.8f)
                lineTo(7.405f, 18.0f)
                curveToRelative(-1.748f, 0.0f, -3.239f, -1.306f, -3.47f, -3.039f)
                lineTo(2.398f, 3.434f)
                curveToRelative(-0.032f, -0.247f, -0.246f, -0.434f, -0.496f, -0.434f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 0.0f)
                lineTo(1.902f, 0.0f)
                curveToRelative(1.747f, 0.0f, 3.238f, 1.306f, 3.47f, 3.037f)
                lineToRelative(0.262f, 1.963f)
                horizontalLineToRelative(6.366f)
                curveToRelative(0.0f, 1.075f, 0.25f, 2.09f, 0.683f, 3.0f)
                lineTo(6.034f, 8.0f)
                lineToRelative(0.876f, 6.566f)
                curveToRelative(0.032f, 0.248f, 0.245f, 0.434f, 0.495f, 0.434f)
                horizontalLineToRelative(10.685f)
                lineToRelative(0.823f, -3.004f)
                curveToRelative(0.029f, 0.0f, 0.058f, 0.004f, 0.087f, 0.004f)
                curveToRelative(1.172f, 0.0f, 2.274f, -0.292f, 3.244f, -0.8f)
                close()
                moveTo(9.0f, 22.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _orderHistory!!
    }

private var _orderHistory: ImageVector? = null
