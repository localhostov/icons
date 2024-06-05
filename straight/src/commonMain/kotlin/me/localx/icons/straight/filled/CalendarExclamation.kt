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

public val Icons.Filled.CalendarExclamation: ImageVector
    get() {
        if (_calendarExclamation != null) {
            return _calendarExclamation!!
        }
        _calendarExclamation = Builder(name = "CalendarExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 2.0f)
                lineTo(8.0f, 2.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(6.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveTo(1.346f, 2.0f, 0.0f, 3.346f, 0.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 8.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(14.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                close()
                moveTo(13.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _calendarExclamation!!
    }

private var _calendarExclamation: ImageVector? = null
