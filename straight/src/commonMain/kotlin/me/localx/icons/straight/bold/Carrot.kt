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

public val Icons.Bold.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.061f, 2.061f)
                lineTo(21.939f, -0.061f)
                lineTo(19.0f, 2.879f)
                lineTo(19.0f, 0.0f)
                lineTo(16.0f, 0.0f)
                lineTo(16.0f, 3.055f)
                curveToRelative(-1.79f, -1.226f, -3.907f, -1.761f, -6.139f, 0.47f)
                curveToRelative(-2.435f, 2.436f, -7.508f, 14.722f, -8.5f, 17.16f)
                lineTo(0.02f, 23.98f)
                lineToRelative(3.3f, -1.341f)
                curveToRelative(2.439f, -0.992f, 14.724f, -6.064f, 17.16f, -8.5f)
                curveToRelative(2.231f, -2.231f, 1.7f, -4.348f, 0.469f, -6.139f)
                lineTo(24.0f, 8.0f)
                lineTo(24.0f, 5.0f)
                lineTo(21.121f, 5.0f)
                close()
                moveTo(18.354f, 12.018f)
                arcToRelative(10.251f, 10.251f, 0.0f, false, true, -1.923f, 1.292f)
                lineToRelative(-2.37f, -2.371f)
                lineToRelative(-2.122f, 2.122f)
                lineToRelative(1.707f, 1.706f)
                curveToRelative(-2.431f, 1.2f, -5.408f, 2.535f, -8.1f, 3.689f)
                curveTo(6.007f, 17.373f, 6.5f, 16.245f, 7.0f, 15.124f)
                lineToRelative(0.936f, 0.937f)
                lineToRelative(2.122f, -2.122f)
                lineTo(8.337f, 12.216f)
                curveToRelative(0.672f, -1.428f, 1.326f, -2.75f, 1.912f, -3.846f)
                lineToRelative(1.69f, 1.691f)
                lineToRelative(2.122f, -2.122f)
                lineTo(11.883f, 5.761f)
                curveToRelative(1.553f, -1.593f, 2.246f, -0.474f, 4.627f, 1.729f)
                curveTo(19.382f, 10.363f, 19.424f, 10.948f, 18.354f, 12.018f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
