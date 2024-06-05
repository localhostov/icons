package me.localx.icons.rounded.bold

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

public val Icons.Bold.Flute: ImageVector
    get() {
        if (_flute != null) {
            return _flute!!
        }
        _flute = Builder(name = "Flute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.47f, 2.022f)
                lineToRelative(-1.493f, -1.493f)
                curveToRelative(-0.613f, -0.613f, -1.583f, -0.709f, -2.286f, -0.203f)
                curveToRelative(-0.787f, 0.567f, -1.325f, 1.54f, -3.506f, 1.635f)
                curveToRelative(-0.858f, 0.002f, -1.664f, 0.338f, -2.268f, 0.947f)
                lineTo(1.172f, 15.736f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.097f, 0.0f, 5.657f)
                lineToRelative(1.436f, 1.436f)
                curveToRelative(0.778f, 0.778f, 1.802f, 1.168f, 2.826f, 1.168f)
                reflectiveCurveToRelative(2.047f, -0.388f, 2.829f, -1.166f)
                lineToRelative(12.779f, -12.819f)
                curveToRelative(0.704f, -0.706f, 0.996f, -1.66f, 0.904f, -2.583f)
                curveToRelative(0.0f, -1.648f, 1.203f, -2.341f, 1.763f, -3.173f)
                curveToRelative(0.47f, -0.699f, 0.356f, -1.638f, -0.239f, -2.233f)
                close()
                moveTo(18.918f, 7.893f)
                lineToRelative(-12.775f, 12.815f)
                curveToRelative(-0.391f, 0.389f, -1.025f, 0.388f, -1.414f, 0.0f)
                lineToRelative(-1.436f, -1.436f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.024f, 0.004f, -1.418f)
                lineToRelative(12.749f, -12.833f)
                curveToRelative(0.05f, -0.049f, 0.106f, -0.06f, 0.146f, -0.06f)
                curveToRelative(0.04f, 0.0f, 0.097f, 0.011f, 0.146f, 0.06f)
                lineToRelative(2.58f, 2.581f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.08f, 0.081f, 0.08f, 0.21f, 0.0f, 0.291f)
                close()
                moveTo(15.5f, 10.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(12.5f, 13.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(9.5f, 16.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _flute!!
    }

private var _flute: ImageVector? = null
