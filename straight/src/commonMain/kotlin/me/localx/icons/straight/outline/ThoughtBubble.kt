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

public val Icons.Outline.ThoughtBubble: ImageVector
    get() {
        if (_thoughtBubble != null) {
            return _thoughtBubble!!
        }
        _thoughtBubble = Builder(name = "ThoughtBubble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(6.0f, 17.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(24.0f, 10.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                curveToRelative(-0.733f, 0.0f, -1.456f, -0.141f, -2.155f, -0.42f)
                curveToRelative(-1.078f, 0.921f, -2.419f, 1.42f, -3.845f, 1.42f)
                curveToRelative(-2.166f, 0.0f, -4.137f, -1.158f, -5.198f, -3.003f)
                curveToRelative(-3.217f, -0.105f, -5.802f, -2.755f, -5.802f, -5.997f)
                curveTo(1.0f, 4.691f, 3.691f, 2.0f, 7.0f, 2.0f)
                curveToRelative(0.553f, 0.0f, 1.096f, 0.075f, 1.62f, 0.223f)
                curveToRelative(1.228f, -1.403f, 3.001f, -2.223f, 4.88f, -2.223f)
                curveToRelative(2.728f, 0.0f, 5.146f, 1.71f, 6.084f, 4.228f)
                curveToRelative(2.593f, 0.703f, 4.416f, 3.039f, 4.416f, 5.772f)
                close()
                moveTo(22.0f, 10.0f)
                curveToRelative(0.0f, -1.96f, -1.41f, -3.614f, -3.354f, -3.932f)
                lineToRelative(-0.639f, -0.104f)
                lineToRelative(-0.167f, -0.626f)
                curveToRelative(-0.522f, -1.965f, -2.308f, -3.338f, -4.341f, -3.338f)
                curveToRelative(-1.479f, 0.0f, -2.864f, 0.736f, -3.707f, 1.97f)
                lineToRelative(-0.464f, 0.68f)
                lineToRelative(-0.757f, -0.325f)
                curveToRelative(-0.499f, -0.215f, -1.028f, -0.324f, -1.572f, -0.324f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.037f, 0.0f, 1.038f, -0.094f, 1.038f, -0.094f)
                lineToRelative(0.282f, 0.661f)
                curveToRelative(0.63f, 1.478f, 2.074f, 2.433f, 3.68f, 2.433f)
                curveToRelative(1.108f, 0.0f, 2.143f, -0.459f, 2.91f, -1.292f)
                lineToRelative(0.525f, -0.57f)
                lineToRelative(0.684f, 0.367f)
                curveToRelative(0.611f, 0.328f, 1.244f, 0.495f, 1.881f, 0.495f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _thoughtBubble!!
    }

private var _thoughtBubble: ImageVector? = null
