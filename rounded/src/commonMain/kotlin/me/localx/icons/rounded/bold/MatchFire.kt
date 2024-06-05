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

public val Icons.Bold.MatchFire: ImageVector
    get() {
        if (_matchFire != null) {
            return _matchFire!!
        }
        _matchFire = Builder(name = "MatchFire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.995f, 9.69f)
                curveToRelative(0.146f, -3.68f, -3.206f, -6.955f, -5.61f, -9.386f)
                curveToRelative(-0.502f, -0.507f, -1.339f, -0.359f, -1.656f, 0.28f)
                curveToRelative(-1.317f, 2.658f, -0.993f, 6.415f, -2.173f, 6.415f)
                curveToRelative(-0.555f, 0.0f, -0.875f, -0.982f, -1.055f, -1.5f)
                curveToRelative(-0.212f, -0.608f, -1.037f, -0.695f, -1.391f, -0.157f)
                curveToRelative(-0.692f, 1.051f, -1.109f, 2.872f, -1.109f, 4.114f)
                curveToRelative(0.0f, 3.585f, 2.903f, 6.492f, 6.486f, 6.5f)
                curveToRelative(3.44f, 0.007f, 6.372f, -2.83f, 6.509f, -6.267f)
                close()
                moveTo(4.866f, 13.157f)
                curveToRelative(-0.582f, -0.809f, -0.41f, -1.944f, 0.295f, -2.648f)
                lineToRelative(0.847f, -0.847f)
                curveToRelative(0.272f, -0.272f, 0.712f, -0.272f, 0.984f, 0.0f)
                lineToRelative(0.923f, 0.923f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.781f, 0.782f, 0.781f, 2.048f, 0.0f, 2.829f)
                curveToRelative(-0.859f, 0.859f, -2.305f, 0.773f, -3.047f, -0.257f)
                close()
                moveTo(23.287f, 12.085f)
                lineToRelative(-13.185f, 8.144f)
                curveToRelative(-0.865f, 1.438f, -1.922f, 2.995f, -2.657f, 3.4f)
                curveToRelative(-1.452f, 0.798f, -3.276f, 0.268f, -4.074f, -1.183f)
                curveToRelative(-0.798f, -1.452f, -0.268f, -3.276f, 1.183f, -4.074f)
                curveToRelative(0.715f, -0.393f, 2.435f, -0.601f, 3.998f, -0.711f)
                lineToRelative(13.159f, -8.128f)
                curveToRelative(0.702f, -0.433f, 1.628f, -0.218f, 2.064f, 0.488f)
                curveToRelative(0.436f, 0.705f, 0.217f, 1.629f, -0.488f, 2.064f)
                close()
            }
        }
        .build()
        return _matchFire!!
    }

private var _matchFire: ImageVector? = null
