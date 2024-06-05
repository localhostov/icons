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

public val Icons.Bold.BroadcastTower: ImageVector
    get() {
        if (_broadcastTower != null) {
            return _broadcastTower!!
        }
        _broadcastTower = Builder(name = "BroadcastTower", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.994f, 9.075f)
                curveToRelative(0.0f, 1.108f, -0.607f, 2.064f, -1.5f, 2.584f)
                verticalLineToRelative(12.341f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-12.341f)
                curveToRelative(-0.893f, -0.52f, -1.5f, -1.476f, -1.5f, -2.584f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
                moveTo(6.691f, 3.772f)
                curveToRelative(-2.924f, 2.924f, -2.924f, 7.682f, 0.0f, 10.606f)
                lineToRelative(2.121f, -2.121f)
                curveToRelative(-1.754f, -1.755f, -1.754f, -4.609f, 0.0f, -6.364f)
                lineToRelative(-2.121f, -2.121f)
                close()
                moveTo(17.297f, 3.772f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(1.754f, 1.755f, 1.754f, 4.609f, 0.0f, 6.364f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(2.924f, -2.924f, 2.924f, -7.682f, 0.0f, -10.606f)
                close()
                moveTo(5.63f, 2.711f)
                lineTo(3.509f, 0.59f)
                curveTo(-1.17f, 5.269f, -1.17f, 12.882f, 3.509f, 17.56f)
                lineToRelative(2.121f, -2.121f)
                curveToRelative(-3.509f, -3.509f, -3.509f, -9.219f, 0.0f, -12.728f)
                close()
                moveTo(20.479f, 0.59f)
                lineToRelative(-2.121f, 2.121f)
                curveToRelative(3.509f, 3.509f, 3.509f, 9.219f, 0.0f, 12.728f)
                lineToRelative(2.121f, 2.121f)
                curveToRelative(4.679f, -4.679f, 4.679f, -12.292f, 0.0f, -16.97f)
                close()
            }
        }
        .build()
        return _broadcastTower!!
    }

private var _broadcastTower: ImageVector? = null
