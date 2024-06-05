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

public val Icons.Outline.CalendarArrowUp: ImageVector
    get() {
        if (_calendarArrowUp != null) {
            return _calendarArrowUp!!
        }
        _calendarArrowUp = Builder(name = "CalendarArrowUp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.0f, 4.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 22.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(12.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(13.405f, 12.58f)
                lineToRelative(3.094f, 3.094f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.085f, -2.085f)
                verticalLineToRelative(4.997f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.008f)
                lineToRelative(-2.075f, 2.086f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.083f, -3.083f)
                curveToRelative(0.775f, -0.775f, 2.036f, -0.772f, 2.812f, 0.0f)
                close()
            }
        }
        .build()
        return _calendarArrowUp!!
    }

private var _calendarArrowUp: ImageVector? = null
