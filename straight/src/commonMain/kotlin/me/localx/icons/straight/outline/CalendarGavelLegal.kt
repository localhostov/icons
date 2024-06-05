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

public val Icons.Outline.CalendarGavelLegal: ImageVector
    get() {
        if (_calendarGavelLegal != null) {
            return _calendarGavelLegal!!
        }
        _calendarGavelLegal = Builder(name = "CalendarGavelLegal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.183f, 16.904f)
                lineToRelative(0.537f, 0.537f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-5.312f, -5.312f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(0.537f, 0.537f)
                lineToRelative(-4.369f, 4.369f)
                lineToRelative(-0.537f, -0.537f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(5.312f, 5.312f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.537f, -0.537f)
                lineToRelative(1.523f, -1.523f)
                lineToRelative(4.225f, 4.226f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-4.225f, -4.226f)
                lineToRelative(1.432f, -1.432f)
                close()
                moveTo(13.99f, 18.45f)
                lineToRelative(4.369f, -4.369f)
                lineToRelative(1.409f, 1.409f)
                lineToRelative(-4.369f, 4.369f)
                lineToRelative(-1.409f, -1.409f)
                close()
                moveTo(21.0f, 2.0f)
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
                horizontalLineToRelative(13.883f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(2.065f)
                lineToRelative(2.0f, 2.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _calendarGavelLegal!!
    }

private var _calendarGavelLegal: ImageVector? = null
