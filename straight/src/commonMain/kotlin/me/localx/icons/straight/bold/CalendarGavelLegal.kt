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

public val Icons.Bold.CalendarGavelLegal: ImageVector
    get() {
        if (_calendarGavelLegal != null) {
            return _calendarGavelLegal!!
        }
        _calendarGavelLegal = Builder(name = "CalendarGavelLegal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.189f, 19.311f)
                lineToRelative(-1.323f, 1.323f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-5.0f, -5.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(4.677f, -4.677f)
                lineToRelative(-0.75f, -0.75f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-0.75f, -0.75f)
                lineToRelative(-1.232f, 1.232f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-4.75f, -4.75f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(1.05f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(-7.551f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(12.869f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(3.0f, 21.0f)
                close()
            }
        }
        .build()
        return _calendarGavelLegal!!
    }

private var _calendarGavelLegal: ImageVector? = null
