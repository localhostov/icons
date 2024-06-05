package me.localx.icons.rounded.filled

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

public val Icons.Filled.AppleCore: ImageVector
    get() {
        if (_appleCore != null) {
            return _appleCore!!
        }
        _appleCore = Builder(name = "AppleCore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.335f, 21.177f)
                curveToRelative(0.589f, 0.66f, 0.371f, 1.703f, -0.432f, 2.075f)
                curveToRelative(-1.04f, 0.481f, -2.187f, 0.748f, -3.392f, 0.748f)
                curveToRelative(-0.964f, 0.0f, -1.619f, -0.331f, -2.145f, -0.596f)
                curveToRelative(-0.464f, -0.234f, -0.8f, -0.404f, -1.355f, -0.404f)
                curveToRelative(-0.473f, 0.0f, -0.799f, 0.161f, -1.25f, 0.385f)
                curveToRelative(-0.553f, 0.274f, -1.242f, 0.615f, -2.25f, 0.615f)
                curveToRelative(-1.205f, 0.0f, -2.352f, -0.267f, -3.392f, -0.748f)
                curveToRelative(-0.803f, -0.372f, -1.021f, -1.415f, -0.432f, -2.075f)
                curveToRelative(1.44f, -1.613f, 2.324f, -3.787f, 2.324f, -6.177f)
                curveToRelative(0.0f, -2.365f, -0.871f, -4.545f, -2.289f, -6.164f)
                curveToRelative(-0.593f, -0.678f, -0.366f, -1.742f, 0.455f, -2.114f)
                curveToRelative(1.024f, -0.465f, 2.151f, -0.722f, 3.334f, -0.722f)
                horizontalLineToRelative(2.449f)
                curveToRelative(-0.272f, -2.835f, -1.608f, -4.269f, -1.666f, -4.329f)
                curveToRelative(-0.38f, -0.396f, -0.372f, -1.028f, 0.022f, -1.412f)
                curveToRelative(0.395f, -0.382f, 1.021f, -0.378f, 1.406f, 0.012f)
                curveToRelative(0.061f, 0.061f, 1.17f, 1.226f, 1.821f, 3.432f)
                curveToRelative(0.263f, -0.707f, 0.653f, -1.416f, 1.236f, -2.0f)
                curveTo(14.924f, 0.56f, 16.548f, 0.152f, 17.695f, 0.009f)
                curveToRelative(0.757f, -0.094f, 1.401f, 0.55f, 1.307f, 1.307f)
                curveToRelative(-0.142f, 1.147f, -0.551f, 2.771f, -1.695f, 3.915f)
                curveToRelative(-1.279f, 1.279f, -3.155f, 1.637f, -4.296f, 1.733f)
                verticalLineToRelative(1.035f)
                curveToRelative(0.0f, 0.544f, 0.436f, 0.983f, 0.978f, 0.995f)
                curveToRelative(1.003f, -0.092f, 2.572f, -0.491f, 4.053f, -1.601f)
                curveToRelative(0.286f, -0.214f, 0.626f, -0.354f, 0.97f, -0.354f)
                curveToRelative(0.758f, 0.008f, 1.152f, 0.927f, 0.62f, 1.466f)
                curveToRelative(-1.614f, 1.639f, -2.62f, 3.944f, -2.62f, 6.493f)
                curveToRelative(0.0f, 2.389f, 0.884f, 4.564f, 2.324f, 6.177f)
                close()
            }
        }
        .build()
        return _appleCore!!
    }

private var _appleCore: ImageVector? = null
