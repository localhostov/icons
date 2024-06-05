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

public val Icons.Bold.CompassSlash: ImageVector
    get() {
        if (_compassSlash != null) {
            return _compassSlash!!
        }
        _compassSlash = Builder(name = "CompassSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.103f, 14.427f)
                lineToRelative(1.47f, 1.47f)
                lineToRelative(-2.573f, 1.103f)
                lineToRelative(1.103f, -2.573f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                curveToRelative(0.0f, -0.808f, 0.115f, -1.597f, 0.32f, -2.356f)
                lineTo(0.96f, 7.285f)
                curveToRelative(-0.628f, 1.47f, -0.96f, 3.065f, -0.96f, 4.715f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                curveToRelative(1.645f, 0.0f, 3.239f, -0.337f, 4.71f, -0.965f)
                lineToRelative(-2.354f, -2.354f)
                curveToRelative(-0.76f, 0.205f, -1.549f, 0.319f, -2.357f, 0.319f)
                close()
                moveTo(21.48f, 19.359f)
                lineToRelative(2.481f, 2.48f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.039f, 2.161f)
                lineTo(2.16f, 0.04f)
                lineToRelative(2.481f, 2.481f)
                curveTo(6.738f, 0.887f, 9.304f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.617f, 0.0f, 12.0f, 5.383f, 12.0f, 12.0f)
                curveToRelative(0.0f, 2.704f, -0.886f, 5.264f, -2.52f, 7.359f)
                close()
                moveTo(6.784f, 4.664f)
                lineToRelative(4.7f, 4.7f)
                lineToRelative(5.515f, -2.364f)
                lineToRelative(-2.364f, 5.515f)
                lineToRelative(4.701f, 4.701f)
                curveToRelative(1.081f, -1.512f, 1.662f, -3.317f, 1.662f, -5.216f)
                curveToRelative(0.0f, -4.962f, -4.037f, -9.0f, -9.0f, -9.0f)
                curveToRelative(-1.894f, 0.0f, -3.702f, 0.583f, -5.216f, 1.664f)
                close()
            }
        }
        .build()
        return _compassSlash!!
    }

private var _compassSlash: ImageVector? = null
