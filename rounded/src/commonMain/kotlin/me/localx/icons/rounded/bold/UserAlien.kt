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

public val Icons.Bold.UserAlien: ImageVector
    get() {
        if (_userAlien != null) {
            return _userAlien!!
        }
        _userAlien = Builder(name = "UserAlien", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.005f, 9.288f)
                curveToRelative(0.029f, 0.41f, -0.306f, 0.746f, -0.717f, 0.717f)
                curveToRelative(-0.539f, -0.038f, -1.255f, -0.173f, -1.681f, -0.599f)
                curveToRelative(-0.426f, -0.426f, -0.561f, -1.142f, -0.599f, -1.681f)
                curveToRelative(-0.029f, -0.41f, 0.306f, -0.746f, 0.717f, -0.717f)
                curveToRelative(0.539f, 0.038f, 1.255f, 0.173f, 1.681f, 0.599f)
                curveToRelative(0.426f, 0.426f, 0.561f, 1.142f, 0.599f, 1.681f)
                close()
                moveTo(15.272f, 7.013f)
                curveToRelative(-0.535f, 0.038f, -1.243f, 0.173f, -1.665f, 0.594f)
                curveToRelative(-0.422f, 0.422f, -0.557f, 1.13f, -0.594f, 1.665f)
                curveToRelative(-0.029f, 0.409f, 0.306f, 0.744f, 0.715f, 0.715f)
                curveToRelative(0.535f, -0.038f, 1.243f, -0.173f, 1.665f, -0.594f)
                curveToRelative(0.422f, -0.422f, 0.557f, -1.13f, 0.594f, -1.665f)
                curveToRelative(0.029f, -0.409f, -0.306f, -0.744f, -0.715f, -0.715f)
                close()
                moveTo(19.498f, 24.0f)
                curveToRelative(-0.783f, 0.0f, -1.442f, -0.608f, -1.495f, -1.401f)
                curveToRelative(-0.118f, -1.79f, -1.059f, -3.444f, -2.508f, -4.482f)
                curveToRelative(-0.141f, 0.169f, -0.278f, 0.329f, -0.411f, 0.477f)
                curveToRelative(-0.814f, 0.906f, -1.909f, 1.406f, -3.083f, 1.406f)
                reflectiveCurveToRelative(-2.269f, -0.5f, -3.084f, -1.406f)
                curveToRelative(-0.133f, -0.148f, -0.27f, -0.307f, -0.411f, -0.477f)
                curveToRelative(-1.449f, 1.038f, -2.39f, 2.692f, -2.508f, 4.482f)
                curveToRelative(-0.053f, 0.793f, -0.712f, 1.401f, -1.495f, 1.401f)
                curveToRelative(-1.002f, 0.0f, -1.553f, -0.771f, -1.499f, -1.599f)
                curveToRelative(0.177f, -2.683f, 1.582f, -5.16f, 3.747f, -6.717f)
                curveToRelative(-1.451f, -2.3f, -2.75f, -5.186f, -2.75f, -7.684f)
                curveTo(4.0f, 3.589f, 7.589f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(8.0f, 3.589f, 8.0f, 8.0f)
                curveToRelative(0.0f, 2.498f, -1.299f, 5.383f, -2.751f, 7.684f)
                curveToRelative(2.166f, 1.557f, 3.571f, 4.034f, 3.748f, 6.718f)
                curveToRelative(0.054f, 0.827f, -0.497f, 1.599f, -1.499f, 1.599f)
                close()
                moveTo(17.0f, 8.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 2.74f, 2.426f, 6.672f, 4.147f, 8.588f)
                curveToRelative(0.479f, 0.531f, 1.228f, 0.531f, 1.704f, 0.0f)
                curveToRelative(1.723f, -1.916f, 4.148f, -5.848f, 4.148f, -8.588f)
                close()
            }
        }
        .build()
        return _userAlien!!
    }

private var _userAlien: ImageVector? = null
