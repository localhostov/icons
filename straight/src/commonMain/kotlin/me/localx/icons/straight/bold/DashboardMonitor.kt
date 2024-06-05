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

public val Icons.Bold.DashboardMonitor: ImageVector
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
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(10.5f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 3.5f)
                close()
                moveTo(13.0f, 9.5f)
                curveToRelative(0.0f, 0.741f, -0.215f, 1.425f, -0.566f, 2.02f)
                lineToRelative(-2.434f, -2.434f)
                verticalLineToRelative(-3.445f)
                curveToRelative(1.722f, 0.446f, 3.0f, 1.997f, 3.0f, 3.859f)
                close()
                moveTo(8.0f, 9.914f)
                lineToRelative(3.02f, 3.02f)
                curveToRelative(-0.595f, 0.351f, -1.28f, 0.566f, -2.02f, 0.566f)
                curveToRelative(-2.209f, 0.0f, -4.0f, -1.791f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.862f, 1.278f, -3.413f, 3.0f, -3.859f)
                verticalLineToRelative(4.273f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _dashboardMonitor!!
    }

private var _dashboardMonitor: ImageVector? = null
