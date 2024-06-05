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

public val Icons.Bold.Coconut: ImageVector
    get() {
        if (_coconut != null) {
            return _coconut!!
        }
        _coconut = Builder(name = "Coconut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.716f, 12.715f)
                curveToRelative(-1.516f, 1.516f, -3.334f, 2.594f, -4.987f, 2.959f)
                curveToRelative(-1.068f, 0.234f, -1.968f, 0.141f, -2.354f, -0.246f)
                curveToRelative(-0.815f, -0.816f, -0.405f, -4.223f, 2.713f, -7.341f)
                curveToRelative(1.516f, -1.516f, 3.334f, -2.594f, 4.987f, -2.959f)
                curveToRelative(0.389f, -0.085f, 0.755f, -0.127f, 1.082f, -0.127f)
                curveToRelative(0.572f, 0.0f, 1.026f, 0.127f, 1.272f, 0.374f)
                curveToRelative(0.815f, 0.816f, 0.405f, 4.223f, -2.713f, 7.341f)
                close()
                moveTo(20.46f, 20.46f)
                curveToRelative(-2.356f, 2.356f, -5.451f, 3.534f, -8.547f, 3.534f)
                reflectiveCurveToRelative(-6.189f, -1.178f, -8.546f, -3.534f)
                curveToRelative(0.0f, 0.0f, -1.404f, -1.372f, -1.528f, -1.496f)
                curveTo(-1.441f, 15.683f, -0.25f, 9.353f, 4.552f, 4.552f)
                curveTo(6.756f, 2.348f, 9.399f, 0.819f, 11.997f, 0.246f)
                curveToRelative(2.838f, -0.626f, 5.313f, -0.061f, 6.967f, 1.593f)
                curveToRelative(0.122f, 0.122f, 1.496f, 1.529f, 1.496f, 1.529f)
                curveToRelative(4.712f, 4.712f, 4.712f, 12.38f, 0.0f, 17.092f)
                close()
                moveTo(8.159f, 17.627f)
                curveToRelative(2.046f, -0.451f, 4.166f, -1.693f, 5.971f, -3.498f)
                curveToRelative(3.491f, -3.491f, 4.733f, -8.148f, 2.713f, -10.17f)
                curveToRelative(-0.747f, -0.747f, -1.762f, -0.96f, -2.676f, -0.96f)
                curveToRelative(-0.579f, 0.0f, -1.118f, 0.085f, -1.523f, 0.175f)
                curveToRelative(-2.046f, 0.451f, -4.166f, 1.693f, -5.971f, 3.498f)
                curveToRelative(-3.491f, 3.491f, -4.733f, 8.148f, -2.713f, 10.17f)
                curveToRelative(1.221f, 1.22f, 3.155f, 1.017f, 4.199f, 0.785f)
                close()
                moveTo(20.522f, 9.012f)
                curveToRelative(-0.583f, 2.436f, -2.036f, 5.003f, -4.272f, 7.238f)
                curveToRelative(-2.153f, 2.152f, -4.724f, 3.661f, -7.263f, 4.264f)
                curveToRelative(3.173f, 1.073f, 6.826f, 0.348f, 9.351f, -2.176f)
                curveToRelative(2.518f, -2.518f, 3.245f, -6.159f, 2.184f, -9.326f)
                close()
            }
        }
        .build()
        return _coconut!!
    }

private var _coconut: ImageVector? = null
