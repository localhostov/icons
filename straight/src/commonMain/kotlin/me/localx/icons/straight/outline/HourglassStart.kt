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

public val Icons.Outline.HourglassStart: ImageVector
    get() {
        if (_hourglassStart != null) {
            return _hourglassStart!!
        }
        _hourglassStart = Builder(name = "HourglassStart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.575f, 12.025f)
                curveToRelative(2.193f, -1.988f, 4.425f, -4.995f, 4.425f, -9.0f)
                curveTo(21.0f, 1.371f, 19.654f, 0.025f, 18.0f, 0.025f)
                lineTo(6.0f, 0.025f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 4.006f, 2.24f, 7.012f, 4.442f, 9.0f)
                curveToRelative(-2.202f, 1.988f, -4.442f, 4.995f, -4.442f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -4.004f, -2.231f, -7.012f, -4.425f, -9.0f)
                close()
                moveTo(19.0f, 22.025f)
                lineTo(5.0f, 22.025f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.774f, 2.508f, -6.551f, 4.612f, -8.216f)
                lineToRelative(0.991f, -0.784f)
                lineToRelative(-0.991f, -0.784f)
                curveToRelative(-2.104f, -1.665f, -4.612f, -4.441f, -4.612f, -8.215f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                curveToRelative(0.0f, 3.774f, -2.497f, 6.552f, -4.592f, 8.217f)
                lineToRelative(-0.984f, 0.783f)
                lineToRelative(0.984f, 0.783f)
                curveToRelative(2.095f, 1.666f, 4.592f, 4.444f, 4.592f, 8.217f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.922f, 4.025f)
                lineTo(7.08f, 4.025f)
                curveToRelative(0.506f, 3.157f, 3.298f, 5.414f, 4.934f, 6.487f)
                curveToRelative(1.62f, -1.058f, 4.407f, -3.304f, 4.908f, -6.487f)
                close()
                moveTo(12.018f, 8.043f)
                curveToRelative(-0.643f, -0.52f, -1.371f, -1.206f, -1.95f, -2.018f)
                horizontalLineToRelative(3.893f)
                curveToRelative(-0.561f, 0.801f, -1.274f, 1.481f, -1.943f, 2.018f)
                close()
            }
        }
        .build()
        return _hourglassStart!!
    }

private var _hourglassStart: ImageVector? = null
