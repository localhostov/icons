package me.localx.icons.straight.outline

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

public val Icons.Outline.OrderHistory: ImageVector
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
                moveTo(5.419f, 13.0f)
                lineToRelative(-0.941f, -8.0f)
                horizontalLineToRelative(5.591f)
                curveToRelative(0.087f, -0.699f, 0.262f, -1.369f, 0.518f, -2.0f)
                lineTo(4.242f, 3.0f)
                lineToRelative(-0.041f, -0.351f)
                curveToRelative(-0.178f, -1.511f, -1.459f, -2.649f, -2.979f, -2.649f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 2.0f)
                lineTo(1.222f, 2.0f)
                curveToRelative(0.507f, 0.0f, 0.934f, 0.38f, 0.993f, 0.884f)
                lineToRelative(1.584f, 13.467f)
                curveToRelative(0.178f, 1.511f, 1.459f, 2.649f, 2.979f, 2.649f)
                horizontalLineToRelative(13.222f)
                verticalLineToRelative(-2.0f)
                lineTo(6.778f, 17.0f)
                curveToRelative(-0.507f, 0.0f, -0.934f, -0.38f, -0.993f, -0.884f)
                lineToRelative(-0.131f, -1.116f)
                lineTo(21.835f, 15.0f)
                lineToRelative(0.363f, -2.0f)
                lineTo(5.419f, 13.0f)
                close()
                moveTo(24.0f, 6.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveTo(14.691f, 0.0f, 18.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                close()
                moveTo(22.0f, 6.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.414f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.707f, -1.707f)
                lineTo(19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _orderHistory!!
    }

private var _orderHistory: ImageVector? = null
