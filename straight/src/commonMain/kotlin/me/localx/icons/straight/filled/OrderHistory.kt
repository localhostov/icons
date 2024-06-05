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

public val Icons.Filled.OrderHistory: ImageVector
    get() {
        if (_orderHistory != null) {
            return _orderHistory!!
        }
        _orderHistory = Builder(name = "OrderHistory", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.239f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.239f, 5.0f, -5.0f)
                reflectiveCurveTo(21.761f, 0.0f, 19.0f, 0.0f)
                close()
                moveTo(20.293f, 7.707f)
                lineToRelative(-2.293f, -2.293f)
                lineTo(18.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.586f)
                lineToRelative(1.707f, 1.707f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(9.0f, 22.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(21.835f, 15.0f)
                lineTo(5.654f, 15.0f)
                lineToRelative(0.131f, 1.116f)
                curveToRelative(0.059f, 0.504f, 0.486f, 0.884f, 0.993f, 0.884f)
                horizontalLineToRelative(13.222f)
                verticalLineToRelative(2.0f)
                lineTo(6.778f, 19.0f)
                curveToRelative(-1.521f, 0.0f, -2.802f, -1.139f, -2.979f, -2.649f)
                lineTo(2.215f, 2.884f)
                curveToRelative(-0.059f, -0.504f, -0.486f, -0.884f, -0.993f, -0.884f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 0.0f)
                lineTo(1.222f, 0.0f)
                curveToRelative(1.521f, 0.0f, 2.802f, 1.139f, 2.979f, 2.649f)
                lineToRelative(0.041f, 0.351f)
                lineTo(12.294f, 3.0f)
                curveToRelative(-0.189f, 0.634f, -0.294f, 1.305f, -0.294f, 2.0f)
                curveToRelative(0.0f, 3.866f, 3.134f, 7.0f, 7.0f, 7.0f)
                curveToRelative(1.273f, 0.0f, 2.462f, -0.345f, 3.49f, -0.938f)
                lineToRelative(-0.655f, 3.938f)
                close()
                moveTo(19.0f, 22.0f)
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
