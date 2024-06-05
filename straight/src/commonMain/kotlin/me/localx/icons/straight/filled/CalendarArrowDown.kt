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

public val Icons.Filled.CalendarArrowDown: ImageVector
    get() {
        if (_calendarArrowDown != null) {
            return _calendarArrowDown!!
        }
        _calendarArrowDown = Builder(name = "CalendarArrowDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(16.476f, 17.438f)
                lineToRelative(-1.393f, -1.436f)
                lineToRelative(-2.083f, 2.02f)
                verticalLineToRelative(-5.023f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.025f)
                lineToRelative(-2.08f, -2.022f)
                lineToRelative(-1.395f, 1.434f)
                lineToRelative(3.069f, 2.983f)
                curveToRelative(0.389f, 0.388f, 0.899f, 0.581f, 1.409f, 0.581f)
                curveToRelative(0.506f, 0.0f, 1.011f, -0.191f, 1.392f, -0.571f)
                lineToRelative(3.08f, -2.991f)
                close()
            }
        }
        .build()
        return _calendarArrowDown!!
    }

private var _calendarArrowDown: ImageVector? = null
