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

public val Icons.Bold.Crow: ImageVector
    get() {
        if (_crow != null) {
            return _crow!!
        }
        _crow = Builder(name = "Crow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.91f, 10.024f)
                lineToRelative(0.033f, -2.024f)
                horizontalLineToRelative(3.057f)
                curveToRelative(0.0f, -1.892f, -1.085f, -2.934f, -2.0f, -3.476f)
                curveToRelative(0.0f, -0.008f, 0.0f, -0.016f, 0.0f, -0.024f)
                curveToRelative(0.0f, -1.414f, -0.645f, -2.718f, -1.77f, -3.577f)
                curveToRelative(-1.125f, -0.86f, -2.571f, -1.136f, -3.966f, -0.756f)
                curveToRelative(-1.303f, 0.355f, -2.393f, 1.325f, -2.914f, 2.594f)
                curveToRelative(-0.151f, 0.368f, -0.255f, 0.748f, -0.309f, 1.131f)
                curveToRelative(-0.163f, 1.168f, -0.57f, 2.097f, -1.212f, 2.76f)
                lineTo(-0.015f, 21.367f)
                lineToRelative(2.338f, 1.881f)
                lineToRelative(1.808f, -2.248f)
                horizontalLineToRelative(3.692f)
                lineToRelative(1.5f, 3.0f)
                horizontalLineToRelative(3.354f)
                lineToRelative(-1.532f, -3.064f)
                curveToRelative(0.512f, -0.057f, 1.015f, -0.151f, 1.506f, -0.28f)
                lineToRelative(1.672f, 3.343f)
                horizontalLineToRelative(3.354f)
                lineToRelative(-2.253f, -4.507f)
                curveToRelative(3.25f, -1.928f, 5.486f, -5.496f, 5.486f, -9.469f)
                close()
                moveTo(10.0f, 18.0f)
                horizontalLineToRelative(-3.456f)
                lineToRelative(2.42f, -3.008f)
                curveToRelative(3.328f, -0.172f, 5.975f, -2.985f, 5.975f, -6.429f)
                lineToRelative(0.034f, -1.125f)
                curveToRelative(0.527f, -0.899f, 0.876f, -1.946f, 1.041f, -3.129f)
                curveToRelative(0.019f, -0.133f, 0.057f, -0.271f, 0.113f, -0.408f)
                curveToRelative(0.167f, -0.407f, 0.522f, -0.729f, 0.926f, -0.839f)
                curveToRelative(0.664f, -0.18f, 1.135f, 0.076f, 1.356f, 0.245f)
                curveToRelative(0.375f, 0.287f, 0.591f, 0.722f, 0.591f, 1.193f)
                curveToRelative(0.0f, 0.579f, -0.328f, 0.951f, -0.523f, 1.122f)
                lineToRelative(-0.502f, 0.438f)
                lineToRelative(-0.064f, 3.939f)
                curveToRelative(0.0f, 4.337f, -3.623f, 8.0f, -7.91f, 8.0f)
                close()
            }
        }
        .build()
        return _crow!!
    }

private var _crow: ImageVector? = null
