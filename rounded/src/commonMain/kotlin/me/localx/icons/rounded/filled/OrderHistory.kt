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
                moveTo(9.0f, 22.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                close()
                moveTo(17.0f, 20.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(24.0f, 5.0f)
                curveToRelative(0.0f, 2.761f, -2.239f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.239f, -5.0f, -5.0f)
                reflectiveCurveTo(16.239f, 0.0f, 19.0f, 0.0f)
                reflectiveCurveToRelative(5.0f, 2.239f, 5.0f, 5.0f)
                close()
                moveTo(21.0f, 7.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(-1.0f, -1.0f)
                verticalLineToRelative(-1.586f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.265f, 0.105f, 0.52f, 0.293f, 0.707f)
                lineToRelative(1.293f, 1.293f)
                curveToRelative(0.39f, 0.39f, 1.024f, 0.39f, 1.414f, 0.0f)
                close()
                moveTo(19.0f, 12.115f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                curveToRelative(0.0f, -0.737f, 0.116f, -1.447f, 0.329f, -2.115f)
                lineTo(5.242f, 3.0f)
                lineToRelative(-0.041f, -0.352f)
                curveToRelative(-0.179f, -1.51f, -1.46f, -2.648f, -2.979f, -2.648f)
                lineTo(1.0f, -0.0f)
                curveTo(0.447f, 0.0f, 0.0f, 0.448f, 0.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.222f)
                curveToRelative(0.507f, 0.0f, 0.934f, 0.38f, 0.993f, 0.883f)
                lineToRelative(1.376f, 11.702f)
                curveToRelative(0.297f, 2.517f, 2.432f, 4.416f, 4.966f, 4.416f)
                horizontalLineToRelative(9.443f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(9.557f, 17.001f)
                curveToRelative(-1.292f, 0.0f, -2.404f, -0.826f, -2.82f, -2.0f)
                horizontalLineToRelative(11.424f)
                curveToRelative(2.375f, 0.0f, 4.437f, -1.69f, 4.902f, -4.019f)
                lineToRelative(0.041f, -0.207f)
                curveToRelative(-1.155f, 0.84f, -2.57f, 1.341f, -4.104f, 1.341f)
                close()
            }
        }
        .build()
        return _orderHistory!!
    }

private var _orderHistory: ImageVector? = null
