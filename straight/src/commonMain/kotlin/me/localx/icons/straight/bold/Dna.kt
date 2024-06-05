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

public val Icons.Bold.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(name = "Dna", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.549f, 13.221f)
                curveToRelative(-0.904f, 0.614f, -2.701f, 1.75f, -2.711f, 1.756f)
                curveToRelative(0.492f, 0.334f, 0.97f, 0.674f, 1.428f, 1.022f)
                horizontalLineToRelative(-6.536f)
                curveToRelative(1.249f, -0.95f, 2.647f, -1.833f, 4.07f, -2.732f)
                curveToRelative(4.781f, -3.019f, 10.199f, -6.441f, 10.199f, -13.268f)
                lineTo(1.0f, -0.001f)
                curveToRelative(0.0f, 5.053f, 2.97f, 8.239f, 6.451f, 10.779f)
                curveToRelative(0.904f, -0.614f, 1.811f, -1.189f, 2.681f, -1.738f)
                curveToRelative(0.01f, -0.006f, 0.02f, -0.013f, 0.03f, -0.019f)
                curveToRelative(-0.492f, -0.334f, -0.97f, -0.674f, -1.428f, -1.022f)
                horizontalLineToRelative(6.536f)
                curveToRelative(-1.249f, 0.95f, -2.647f, 1.833f, -4.07f, 2.732f)
                curveTo(6.418f, 13.751f, 1.0f, 17.173f, 1.0f, 24.0f)
                horizontalLineToRelative(22.0f)
                curveToRelative(0.0f, -5.053f, -2.97f, -8.239f, -6.451f, -10.779f)
                close()
                moveTo(4.546f, 3.0f)
                horizontalLineToRelative(14.909f)
                curveToRelative(-0.278f, 0.717f, -0.654f, 1.38f, -1.108f, 2.0f)
                lineTo(5.654f, 5.0f)
                curveToRelative(-0.454f, -0.62f, -0.831f, -1.283f, -1.109f, -2.0f)
                close()
                moveTo(4.546f, 21.0f)
                curveToRelative(0.278f, -0.717f, 0.654f, -1.38f, 1.108f, -2.0f)
                horizontalLineToRelative(12.692f)
                curveToRelative(0.454f, 0.62f, 0.831f, 1.283f, 1.109f, 2.0f)
                lineTo(4.546f, 21.0f)
                close()
            }
        }
        .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
