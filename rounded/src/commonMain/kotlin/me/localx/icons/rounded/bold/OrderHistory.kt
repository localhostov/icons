package me.localx.icons.rounded.bold

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
                moveTo(22.335f, 13.833f)
                curveToRelative(-0.612f, 2.453f, -2.807f, 4.167f, -5.335f, 4.167f)
                lineTo(7.188f, 18.0f)
                curveToRelative(-1.747f, 0.0f, -3.239f, -1.306f, -3.469f, -3.037f)
                lineTo(2.182f, 3.434f)
                curveToRelative(-0.033f, -0.247f, -0.246f, -0.434f, -0.496f, -0.434f)
                horizontalLineToRelative(-0.187f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveTo(0.671f, 0.0f, 1.5f, 0.0f)
                horizontalLineToRelative(0.187f)
                curveToRelative(1.747f, 0.0f, 3.239f, 1.306f, 3.469f, 3.037f)
                lineToRelative(0.262f, 1.963f)
                horizontalLineToRelative(5.083f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(5.817f, 8.0f)
                lineToRelative(0.875f, 6.566f)
                curveToRelative(0.033f, 0.247f, 0.246f, 0.434f, 0.496f, 0.434f)
                horizontalLineToRelative(9.812f)
                curveToRelative(1.149f, 0.0f, 2.146f, -0.778f, 2.425f, -1.894f)
                curveToRelative(0.2f, -0.804f, 1.012f, -1.294f, 1.818f, -1.092f)
                curveToRelative(0.804f, 0.2f, 1.293f, 1.015f, 1.092f, 1.818f)
                close()
                moveTo(24.0f, 5.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.239f, -5.0f, -5.0f)
                reflectiveCurveTo(16.239f, 0.0f, 19.0f, 0.0f)
                reflectiveCurveToRelative(5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(21.0f, 5.586f)
                lineToRelative(-1.0f, -1.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.265f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineToRelative(1.293f, 1.293f)
                curveToRelative(0.391f, 0.39f, 1.024f, 0.39f, 1.414f, 0.0f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.024f, 0.0f, -1.414f)
                close()
                moveTo(7.0f, 20.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(17.0f, 20.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _orderHistory!!
    }

private var _orderHistory: ImageVector? = null
