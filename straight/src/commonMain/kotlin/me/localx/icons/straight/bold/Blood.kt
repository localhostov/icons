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

public val Icons.Bold.Blood: ImageVector
    get() {
        if (_blood != null) {
            return _blood!!
        }
        _blood = Builder(name = "Blood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 9.257f)
                lineTo(1.757f, 13.754f)
                curveToRelative(-2.339f, 2.339f, -2.339f, 6.146f, 0.0f, 8.485f)
                curveToRelative(1.133f, 1.133f, 2.64f, 1.757f, 4.242f, 1.757f)
                horizontalLineToRelative(0.002f)
                curveToRelative(1.602f, 0.0f, 3.107f, -0.624f, 4.241f, -1.757f)
                curveToRelative(2.339f, -2.339f, 2.339f, -6.146f, 0.03f, -8.454f)
                lineToRelative(-4.273f, -4.528f)
                close()
                moveTo(8.122f, 20.118f)
                curveToRelative(-0.567f, 0.566f, -1.319f, 0.878f, -2.12f, 0.878f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.802f, 0.0f, -1.555f, -0.312f, -2.122f, -0.878f)
                curveToRelative(-1.169f, -1.17f, -1.169f, -3.073f, 0.03f, -4.274f)
                lineToRelative(2.091f, -2.216f)
                lineToRelative(2.122f, 2.247f)
                curveToRelative(1.169f, 1.17f, 1.169f, 3.073f, 0.0f, 4.243f)
                close()
                moveTo(22.378f, 7.694f)
                lineToRelative(-3.877f, -3.792f)
                lineToRelative(-3.889f, 3.804f)
                curveToRelative(-2.145f, 2.145f, -2.145f, 5.633f, 0.0f, 7.778f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.04f, 1.039f, 2.42f, 1.611f, 3.889f, 1.611f)
                reflectiveCurveToRelative(2.85f, -0.572f, 3.889f, -1.611f)
                curveToRelative(2.145f, -2.145f, 2.145f, -5.633f, -0.012f, -7.79f)
                close()
                moveTo(20.269f, 13.362f)
                curveToRelative(-0.944f, 0.944f, -2.592f, 0.944f, -3.536f, 0.0f)
                curveToRelative(-0.975f, -0.975f, -0.975f, -2.561f, -0.012f, -3.523f)
                lineToRelative(1.78f, -1.741f)
                lineToRelative(1.768f, 1.729f)
                curveToRelative(0.975f, 0.975f, 0.975f, 2.561f, 0.0f, 3.535f)
                close()
                moveTo(11.858f, 2.307f)
                curveToRelative(1.302f, 1.302f, 1.302f, 3.414f, 0.0f, 4.717f)
                curveToRelative(-0.651f, 0.651f, -1.505f, 0.977f, -2.358f, 0.977f)
                curveToRelative(-0.854f, 0.0f, -1.707f, -0.326f, -2.358f, -0.977f)
                curveToRelative(-1.302f, -1.302f, -1.302f, -3.414f, 0.0f, -4.717f)
                lineToRelative(2.358f, -2.307f)
                lineToRelative(2.358f, 2.307f)
                close()
            }
        }
        .build()
        return _blood!!
    }

private var _blood: ImageVector? = null
