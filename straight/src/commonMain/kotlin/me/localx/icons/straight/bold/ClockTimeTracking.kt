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

public val Icons.Bold.ClockTimeTracking: ImageVector
    get() {
        if (_clockTimeTracking != null) {
            return _clockTimeTracking!!
        }
        _clockTimeTracking = Builder(name = "ClockTimeTracking", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(11.721f)
                curveToRelative(-0.926f, -0.815f, -1.663f, -1.838f, -2.134f, -3.0f)
                horizontalLineToRelative(-6.587f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.262f)
                curveToRelative(1.112f, 0.287f, 2.131f, 0.801f, 3.0f, 1.498f)
                verticalLineToRelative(-2.76f)
                horizontalLineToRelative(1.0f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                lineTo(3.0f, 6.0f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.793f, 21.207f)
                lineToRelative(-2.793f, -2.793f)
                verticalLineToRelative(-4.414f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(2.207f, 2.207f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _clockTimeTracking!!
    }

private var _clockTimeTracking: ImageVector? = null
