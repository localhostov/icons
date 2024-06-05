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

public val Icons.Filled.CalendarImage: ImageVector
    get() {
        if (_calendarImage != null) {
            return _calendarImage!!
        }
        _calendarImage = Builder(name = "CalendarImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.968f, 13.586f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(7.586f, -7.586f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(0.054f)
                lineToRelative(9.914f, -9.914f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-3.5f)
                curveTo(0.0f, 2.846f, 1.346f, 1.5f, 3.0f, 1.5f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, -0.5f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 1.5f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, -0.5f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 1.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(24.0f, 10.382f)
                verticalLineToRelative(13.118f)
                lineTo(2.882f, 23.5f)
                lineToRelative(7.086f, -7.086f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(10.032f, -10.032f)
                close()
            }
        }
        .build()
        return _calendarImage!!
    }

private var _calendarImage: ImageVector? = null
