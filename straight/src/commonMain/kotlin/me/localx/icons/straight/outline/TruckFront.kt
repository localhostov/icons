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

public val Icons.Outline.TruckFront: ImageVector
    get() {
        if (_truckFront != null) {
            return _truckFront!!
        }
        _truckFront = Builder(name = "TruckFront", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(24.0f, 3.0f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(10.802f)
                curveToRelative(-0.084f, -0.193f, -0.173f, -0.384f, -0.267f, -0.572f)
                lineToRelative(-2.286f, -4.572f)
                curveToRelative(-0.512f, -1.022f, -1.54f, -1.658f, -2.684f, -1.658f)
                lineTo(7.236f, 7.0f)
                curveToRelative(-1.144f, 0.0f, -2.172f, 0.636f, -2.684f, 1.658f)
                lineToRelative(-2.286f, 4.572f)
                curveToRelative(-0.094f, 0.188f, -0.183f, 0.379f, -0.267f, 0.572f)
                lineTo(1.999f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(4.118f, 14.0f)
                lineToRelative(2.224f, -4.447f)
                curveToRelative(0.17f, -0.341f, 0.513f, -0.553f, 0.895f, -0.553f)
                horizontalLineToRelative(9.527f)
                curveToRelative(0.382f, 0.0f, 0.725f, 0.212f, 0.895f, 0.553f)
                lineToRelative(2.224f, 4.447f)
                lineTo(4.118f, 14.0f)
                close()
                moveTo(21.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(-1.403f)
                curveToRelative(0.0f, -0.875f, 0.117f, -1.751f, 0.345f, -2.597f)
                horizontalLineToRelative(1.655f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.655f)
                curveToRelative(0.227f, 0.846f, 0.345f, 1.722f, 0.345f, 2.597f)
                verticalLineToRelative(1.403f)
                close()
            }
        }
        .build()
        return _truckFront!!
    }

private var _truckFront: ImageVector? = null
