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

public val Icons.Filled.CalendarXmark: ImageVector
    get() {
        if (_calendarXmark != null) {
            return _calendarXmark!!
        }
        _calendarXmark = Builder(name = "CalendarXmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 8.0f)
                close()
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(14.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(13.414f, 17.0f)
                lineToRelative(2.793f, -2.793f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.793f, 2.793f)
                lineToRelative(-2.793f, -2.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.793f, 2.793f)
                lineToRelative(-2.793f, 2.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.793f, -2.793f)
                lineToRelative(2.793f, 2.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.793f, -2.793f)
                close()
            }
        }
        .build()
        return _calendarXmark!!
    }

private var _calendarXmark: ImageVector? = null
