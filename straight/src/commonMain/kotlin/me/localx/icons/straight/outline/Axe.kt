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

public val Icons.Outline.Axe: ImageVector
    get() {
        if (_axe != null) {
            return _axe!!
        }
        _axe = Builder(name = "Axe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.998f, 5.946f)
                lineToRelative(-1.06f, 0.064f)
                curveToRelative(-0.706f, 0.042f, -2.615f, -0.034f, -3.743f, -0.791f)
                lineToRelative(2.006f, -2.006f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.037f, 2.037f)
                lineTo(14.091f, 0.162f)
                lineToRelative(-5.921f, 5.921f)
                lineToRelative(3.659f, 3.674f)
                lineTo(0.049f, 21.537f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(11.744f, -11.744f)
                curveToRelative(0.749f, 1.12f, 0.838f, 3.028f, 0.802f, 3.741f)
                lineToRelative(-0.054f, 1.053f)
                horizontalLineToRelative(1.053f)
                curveToRelative(5.294f, 0.0f, 8.992f, -3.698f, 8.992f, -8.992f)
                lineToRelative(-0.002f, -1.062f)
                close()
                moveTo(15.995f, 13.946f)
                curveToRelative(-0.077f, -1.254f, -0.408f, -3.255f, -1.661f, -4.508f)
                lineToRelative(-3.339f, -3.353f)
                lineToRelative(3.093f, -3.093f)
                lineToRelative(3.336f, 3.35f)
                horizontalLineToRelative(0.001f)
                curveToRelative(1.265f, 1.267f, 3.263f, 1.59f, 4.519f, 1.661f)
                curveToRelative(-0.375f, 3.308f, -2.64f, 5.57f, -5.95f, 5.943f)
                close()
            }
        }
        .build()
        return _axe!!
    }

private var _axe: ImageVector? = null
