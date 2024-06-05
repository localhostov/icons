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

public val Icons.Filled.CalendarCall: ImageVector
    get() {
        if (_calendarCall != null) {
            return _calendarCall!!
        }
        _calendarCall = Builder(name = "CalendarCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.287f, 19.114f)
                lineToRelative(-1.775f, 1.775f)
                curveToRelative(-2.027f, -0.773f, -3.521f, -2.208f, -4.403f, -4.403f)
                lineToRelative(1.775f, -1.775f)
                lineToRelative(-2.712f, -2.712f)
                lineToRelative(-1.378f, 1.378f)
                curveToRelative(-0.54f, 0.539f, -0.795f, 1.249f, -0.795f, 1.957f)
                curveToRelative(0.0f, 3.914f, 5.032f, 8.665f, 8.665f, 8.665f)
                curveToRelative(0.708f, 0.0f, 1.418f, -0.256f, 1.957f, -0.795f)
                lineToRelative(1.378f, -1.378f)
                lineToRelative(-2.712f, -2.712f)
                horizontalLineToRelative(-0.001f)
                close()
                moveTo(0.0f, 8.0f)
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
                moveTo(15.002f, 10.0f)
                horizontalLineToRelative(8.998f)
                verticalLineToRelative(8.999f)
                lineToRelative(-8.998f, -8.999f)
                close()
                moveTo(15.273f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(13.344f)
                lineToRelative(-1.962f, 1.962f)
                curveToRelative(-0.891f, 0.89f, -1.382f, 2.087f, -1.382f, 3.373f)
                curveToRelative(0.0f, 3.097f, 2.327f, 6.549f, 5.273f, 8.665f)
                close()
            }
        }
        .build()
        return _calendarCall!!
    }

private var _calendarCall: ImageVector? = null
