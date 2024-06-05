package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.CalendarLinesPen: ImageVector
    get() {
        if (_calendarLinesPen != null) {
            return _calendarLinesPen!!
        }
        _calendarLinesPen = Builder(name = "CalendarLinesPen", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 4.243f, 2.243f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(10.0f, 22.545f)
                curveToRelative(0.0f, -0.892f, 0.187f, -1.753f, 0.535f, -2.545f)
                lineTo(6.0f, 20.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.0f, 0.0f, 4.022f, 0.0f, 5.92f, 0.001f)
                lineToRelative(2.001f, -2.001f)
                lineTo(6.0f, 16.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                lineTo(15.922f, 14.0f)
                lineToRelative(2.741f, -2.741f)
                curveToRelative(0.812f, -0.812f, 1.891f, -1.259f, 3.039f, -1.259f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.455f)
                close()
                moveTo(20.077f, 12.673f)
                curveToRelative(0.897f, -0.897f, 2.353f, -0.897f, 3.25f, 0.0f)
                curveToRelative(0.897f, 0.897f, 0.897f, 2.353f, 0.0f, 3.25f)
                lineToRelative(-6.807f, 6.807f)
                curveToRelative(-0.813f, 0.813f, -1.915f, 1.27f, -3.065f, 1.27f)
                horizontalLineToRelative(-1.455f)
                verticalLineToRelative(-1.455f)
                curveToRelative(0.0f, -1.15f, 0.457f, -2.252f, 1.27f, -3.065f)
                lineToRelative(6.807f, -6.807f)
                close()
            }
        }
        .build()
        return _calendarLinesPen!!
    }

private var _calendarLinesPen: ImageVector? = null
