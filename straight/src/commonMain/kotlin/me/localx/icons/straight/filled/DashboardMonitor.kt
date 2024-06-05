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

public val Icons.Filled.DashboardMonitor: ImageVector
    get() {
        if (_dashboardMonitor != null) {
            return _dashboardMonitor!!
        }
        _dashboardMonitor = Builder(name = "DashboardMonitor", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.0f)
                lineTo(24.0f, 4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 1.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineToRelative(15.0f)
                lineTo(11.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(16.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 9.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 15.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                curveToRelative(0.0f, -2.419f, 1.718f, -4.436f, 4.0f, -4.899f)
                verticalLineToRelative(5.313f)
                lineToRelative(3.754f, 3.754f)
                curveToRelative(-0.79f, 0.523f, -1.736f, 0.832f, -2.754f, 0.832f)
                close()
                moveTo(12.168f, 12.754f)
                lineToRelative(-3.168f, -3.168f)
                lineTo(9.0f, 5.101f)
                curveToRelative(2.282f, 0.463f, 4.0f, 2.48f, 4.0f, 4.899f)
                curveToRelative(0.0f, 1.019f, -0.308f, 1.964f, -0.832f, 2.754f)
                close()
            }
        }
        .build()
        return _dashboardMonitor!!
    }

private var _dashboardMonitor: ImageVector? = null
