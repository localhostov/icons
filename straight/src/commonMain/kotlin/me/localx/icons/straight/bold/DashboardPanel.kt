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

public val Icons.Bold.DashboardPanel: ImageVector
    get() {
        if (_dashboardPanel != null) {
            return _dashboardPanel!!
        }
        _dashboardPanel = Builder(name = "DashboardPanel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 2.0f)
                lineTo(3.5f, 2.0f)
                curveTo(1.57f, 2.0f, 0.0f, 3.57f, 0.0f, 5.5f)
                lineTo(0.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 19.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 5.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(15.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 13.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(13.5f, 12.5f)
                curveToRelative(0.0f, 0.88f, -0.262f, 1.694f, -0.699f, 2.387f)
                lineToRelative(-2.801f, -2.801f)
                verticalLineToRelative(-3.966f)
                curveToRelative(2.002f, 0.456f, 3.5f, 2.239f, 3.5f, 4.38f)
                close()
                moveTo(8.0f, 12.914f)
                lineToRelative(3.387f, 3.387f)
                curveToRelative(-0.693f, 0.436f, -1.508f, 0.699f, -2.387f, 0.699f)
                curveToRelative(-2.485f, 0.0f, -4.5f, -2.015f, -4.5f, -4.5f)
                curveToRelative(0.0f, -2.14f, 1.498f, -3.924f, 3.5f, -4.38f)
                verticalLineToRelative(4.794f)
                close()
            }
        }
        .build()
        return _dashboardPanel!!
    }

private var _dashboardPanel: ImageVector? = null
