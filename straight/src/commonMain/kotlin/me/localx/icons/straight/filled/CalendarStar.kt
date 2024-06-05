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

public val Icons.Filled.CalendarStar: ImageVector
    get() {
        if (_calendarStar != null) {
            return _calendarStar!!
        }
        _calendarStar = Builder(name = "CalendarStar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.0f)
                lineTo(0.0f, 11.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(7.438f, 15.496f)
                horizontalLineToRelative(3.102f)
                lineToRelative(0.889f, -3.101f)
                horizontalLineToRelative(1.167f)
                lineToRelative(0.944f, 3.101f)
                horizontalLineToRelative(3.086f)
                lineToRelative(0.226f, 0.835f)
                lineToRelative(-2.407f, 1.783f)
                lineToRelative(0.917f, 2.819f)
                lineToRelative(-0.883f, 0.603f)
                lineToRelative(-2.438f, -1.653f)
                lineToRelative(-2.459f, 1.666f)
                lineToRelative(-0.818f, -0.632f)
                lineToRelative(0.87f, -2.833f)
                lineToRelative(-2.359f, -1.714f)
                lineToRelative(0.162f, -0.873f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(-4.0f)
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
                close()
            }
        }
        .build()
        return _calendarStar!!
    }

private var _calendarStar: ImageVector? = null
