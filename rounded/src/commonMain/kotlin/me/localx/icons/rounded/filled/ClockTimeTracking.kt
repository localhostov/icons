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

public val Icons.Filled.ClockTimeTracking: ImageVector
    get() {
        if (_clockTimeTracking != null) {
            return _clockTimeTracking!!
        }
        _clockTimeTracking = Builder(name = "ClockTimeTracking", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, -1.343f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 1.791f, 1.791f, 0.0f, 4.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(18.586f, 20.086f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.442f, -0.293f, -0.707f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.586f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0.0f, 1.414f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0.0f)
                close()
                moveTo(1.0f, 9.576f)
                verticalLineToRelative(9.424f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(6.721f)
                curveToRelative(-1.665f, -1.466f, -2.721f, -3.607f, -2.721f, -6.0f)
                curveToRelative(0.0f, -4.418f, 3.582f, -8.0f, 8.0f, -8.0f)
                lineTo(3.0f, 10.0f)
                curveToRelative(-0.712f, 0.0f, -1.386f, -0.154f, -2.0f, -0.424f)
                close()
            }
        }
        .build()
        return _clockTimeTracking!!
    }

private var _clockTimeTracking: ImageVector? = null
