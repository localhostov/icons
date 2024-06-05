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

public val Icons.Bold.CheckOutCalendar: ImageVector
    get() {
        if (_checkOutCalendar != null) {
            return _checkOutCalendar!!
        }
        _checkOutCalendar = Builder(name = "CheckOutCalendar", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 7.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 3.033f, -2.467f, 5.5f, -5.5f, 5.5f)
                horizontalLineTo(5.5f)
                curveToRelative(-1.342f, 0.0f, -2.634f, -0.489f, -3.638f, -1.375f)
                curveToRelative(-0.621f, -0.548f, -0.68f, -1.496f, -0.132f, -2.117f)
                curveToRelative(0.549f, -0.622f, 1.497f, -0.68f, 2.117f, -0.132f)
                curveToRelative(0.456f, 0.403f, 1.043f, 0.625f, 1.653f, 0.625f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                curveTo(0.0f, 4.467f, 2.467f, 2.0f, 5.5f, 2.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(4.999f, 17.563f)
                verticalLineToRelative(-1.563f)
                horizontalLineToRelative(5.501f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.501f)
                verticalLineToRelative(-1.563f)
                curveToRelative(0.0f, -0.863f, -1.043f, -1.295f, -1.653f, -0.685f)
                lineTo(0.283f, 13.815f)
                curveToRelative(-0.378f, 0.378f, -0.378f, 0.991f, 0.0f, 1.369f)
                lineToRelative(3.063f, 3.063f)
                curveToRelative(0.61f, 0.61f, 1.653f, 0.178f, 1.653f, -0.685f)
                close()
            }
        }
        .build()
        return _checkOutCalendar!!
    }

private var _checkOutCalendar: ImageVector? = null
