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

public val Icons.Filled.CalendarGavelLegal: ImageVector
    get() {
        if (_calendarGavelLegal != null) {
            return _calendarGavelLegal!!
        }
        _calendarGavelLegal = Builder(name = "CalendarGavelLegal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.562f, 23.976f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-4.512f, -4.513f)
                lineToRelative(1.432f, -1.432f)
                lineToRelative(0.824f, 0.824f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-5.312f, -5.312f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(0.87f, 0.87f)
                lineToRelative(-4.369f, 4.369f)
                lineToRelative(-0.87f, -0.87f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(5.312f, 5.312f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.824f, -0.824f)
                lineToRelative(1.523f, -1.523f)
                lineToRelative(4.512f, 4.513f)
                close()
                moveTo(24.0f, 5.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 8.0f)
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
                close()
                moveTo(13.883f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(15.71f)
                lineToRelative(-7.913f, 7.913f)
                lineToRelative(6.087f, 6.087f)
                close()
            }
        }
        .build()
        return _calendarGavelLegal!!
    }

private var _calendarGavelLegal: ImageVector? = null
