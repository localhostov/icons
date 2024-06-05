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

public val Icons.Filled.MeetingAlt: ImageVector
    get() {
        if (_meetingAlt != null) {
            return _meetingAlt!!
        }
        _meetingAlt = Builder(name = "MeetingAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.988f, 9.116f)
                curveToRelative(0.292f, 0.259f, 0.658f, 0.387f, 1.021f, 0.387f)
                curveToRelative(0.354f, 0.0f, 0.705f, -0.123f, 0.977f, -0.365f)
                lineToRelative(1.375f, -1.138f)
                horizontalLineToRelative(2.688f)
                lineTo(17.049f, 2.048f)
                curveToRelative(0.0f, -1.129f, -0.918f, -2.048f, -2.048f, -2.048f)
                horizontalLineToRelative(-5.905f)
                curveToRelative(-1.129f, 0.0f, -2.047f, 0.918f, -2.047f, 2.048f)
                verticalLineToRelative(5.952f)
                horizontalLineToRelative(2.592f)
                lineToRelative(1.348f, 1.116f)
                close()
                moveTo(21.5f, 9.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(2.5f, 9.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(0.0f, 5.119f, 0.0f, 6.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(0.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.5f, 10.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.0f, 12.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(19.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _meetingAlt!!
    }

private var _meetingAlt: ImageVector? = null
