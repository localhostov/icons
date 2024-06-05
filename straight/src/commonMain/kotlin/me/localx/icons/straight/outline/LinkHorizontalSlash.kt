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

public val Icons.Outline.LinkHorizontalSlash: ImageVector
    get() {
        if (_linkHorizontalSlash != null) {
            return _linkHorizontalSlash!!
        }
        _linkHorizontalSlash = Builder(name = "LinkHorizontalSlash", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.5f)
                curveToRelative(0.0f, -2.721f, -1.683f, -5.054f, -4.061f, -6.021f)
                curveToRelative(-0.08f, 0.692f, -0.247f, 1.355f, -0.484f, 1.987f)
                curveToRelative(1.5f, 0.731f, 2.545f, 2.256f, 2.545f, 4.034f)
                curveToRelative(0.0f, 1.351f, -0.599f, 2.611f, -1.625f, 3.461f)
                lineToRelative(-5.148f, -5.148f)
                curveToRelative(1.674f, -1.176f, 2.773f, -3.117f, 2.773f, -5.313f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                lineTo(6.5f, 2.0f)
                curveToRelative(-0.88f, 0.0f, -1.757f, 0.181f, -2.561f, 0.525f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineTo(22.543f, 23.957f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.163f, -2.163f)
                curveToRelative(1.395f, -1.226f, 2.206f, -2.991f, 2.206f, -4.88f)
                close()
                moveTo(6.5f, 4.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                curveToRelative(0.0f, 1.636f, -0.891f, 3.083f, -2.207f, 3.879f)
                lineToRelative(-1.411f, -1.411f)
                curveToRelative(0.958f, -0.164f, 1.467f, -0.955f, 1.589f, -1.968f)
                horizontalLineToRelative(-1.471f)
                curveToRelative(-0.633f, 0.0f, -1.243f, 0.094f, -1.821f, 0.265f)
                lineTo(5.52f, 4.106f)
                curveToRelative(0.318f, -0.07f, 0.645f, -0.106f, 0.98f, -0.106f)
                close()
                moveTo(4.545f, 12.534f)
                curveToRelative(-0.236f, 0.631f, -0.404f, 1.295f, -0.484f, 1.987f)
                curveTo(1.683f, 13.554f, 0.0f, 11.221f, 0.0f, 8.5f)
                curveToRelative(0.0f, -1.204f, 0.33f, -2.349f, 0.921f, -3.337f)
                lineToRelative(1.48f, 1.48f)
                curveToRelative(-0.258f, 0.572f, -0.401f, 1.202f, -0.401f, 1.857f)
                curveToRelative(0.0f, 1.778f, 1.045f, 3.304f, 2.545f, 4.034f)
                close()
                moveTo(15.758f, 20.0f)
                lineToRelative(1.983f, 1.983f)
                curveToRelative(-0.081f, 0.003f, -0.16f, 0.017f, -0.24f, 0.017f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-3.584f, 0.0f, -6.5f, -2.916f, -6.5f, -6.5f)
                curveToRelative(0.0f, -1.476f, 0.507f, -2.827f, 1.34f, -3.918f)
                lineToRelative(1.429f, 1.429f)
                curveToRelative(-0.479f, 0.718f, -0.769f, 1.57f, -0.769f, 2.489f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(3.258f)
                close()
            }
        }
        .build()
        return _linkHorizontalSlash!!
    }

private var _linkHorizontalSlash: ImageVector? = null
