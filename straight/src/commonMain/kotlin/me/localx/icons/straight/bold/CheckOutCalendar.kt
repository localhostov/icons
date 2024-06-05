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
                moveToRelative(24.0f, 5.0f)
                verticalLineToRelative(19.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-5.349f)
                lineToRelative(2.716f, 2.349f)
                horizontalLineToRelative(18.284f)
                verticalLineToRelative(-11.0f)
                horizontalLineTo(2.679f)
                lineToRelative(-2.679f, 2.336f)
                verticalLineToRelative(-7.336f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(0.371f, 14.667f)
                curveToRelative(-0.494f, 0.443f, -0.494f, 1.217f, 0.0f, 1.66f)
                lineToRelative(3.65f, 3.157f)
                verticalLineToRelative(-2.484f)
                horizontalLineToRelative(6.979f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-6.979f)
                verticalLineToRelative(-2.516f)
                lineTo(0.371f, 14.667f)
                close()
            }
        }
        .build()
        return _checkOutCalendar!!
    }

private var _checkOutCalendar: ImageVector? = null
