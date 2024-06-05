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

public val Icons.Outline.GpsNavigation: ImageVector
    get() {
        if (_gpsNavigation != null) {
            return _gpsNavigation!!
        }
        _gpsNavigation = Builder(name = "GpsNavigation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 13.0f)
                horizontalLineToRelative(-1.551f)
                curveToRelative(-0.474f, 4.992f, -4.457f, 8.975f, -9.449f, 9.449f)
                verticalLineToRelative(1.551f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.551f)
                curveToRelative(-4.992f, -0.474f, -8.975f, -4.457f, -9.449f, -9.449f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.552f)
                curveToRelative(0.391f, -4.105f, 3.156f, -7.521f, 6.903f, -8.871f)
                lineToRelative(-2.012f, 3.453f)
                curveToRelative(-1.561f, 1.354f, -2.627f, 3.262f, -2.882f, 5.418f)
                horizontalLineToRelative(2.438f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.436f)
                curveToRelative(0.458f, 3.888f, 3.548f, 6.977f, 7.436f, 7.436f)
                verticalLineToRelative(-2.436f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.436f)
                curveToRelative(3.888f, -0.458f, 6.977f, -3.548f, 7.436f, -7.436f)
                horizontalLineToRelative(-2.436f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.438f)
                curveToRelative(-0.253f, -2.132f, -1.298f, -4.022f, -2.832f, -5.373f)
                lineToRelative(-2.047f, -3.493f)
                curveToRelative(3.74f, 1.354f, 6.498f, 4.767f, 6.889f, 8.866f)
                horizontalLineToRelative(1.552f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 0.052f)
                lineToRelative(4.831f, 8.769f)
                curveToRelative(0.181f, 0.348f, 0.224f, 0.725f, 0.13f, 1.083f)
                curveToRelative(-0.095f, 0.369f, -0.326f, 0.681f, -0.649f, 0.877f)
                curveToRelative(-0.416f, 0.253f, -0.926f, 0.267f, -1.38f, 0.04f)
                lineToRelative(-2.927f, -1.085f)
                lineToRelative(-2.955f, 1.122f)
                curveToRelative(-0.193f, 0.095f, -0.405f, 0.143f, -0.618f, 0.143f)
                curveToRelative(-0.136f, 0.0f, -0.273f, -0.02f, -0.406f, -0.061f)
                curveToRelative(-0.373f, -0.115f, -0.674f, -0.37f, -0.852f, -0.719f)
                curveToRelative(-0.218f, -0.424f, -0.218f, -0.933f, 0.002f, -1.357f)
                lineTo(12.0f, 0.052f)
                close()
                moveTo(9.662f, 8.485f)
                lineToRelative(2.334f, -0.886f)
                lineToRelative(2.36f, 0.875f)
                lineToRelative(-2.352f, -4.268f)
                lineToRelative(-2.343f, 4.278f)
                close()
            }
        }
        .build()
        return _gpsNavigation!!
    }

private var _gpsNavigation: ImageVector? = null
