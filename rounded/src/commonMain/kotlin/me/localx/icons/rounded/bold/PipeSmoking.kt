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

public val Icons.Bold.PipeSmoking: ImageVector
    get() {
        if (_pipeSmoking != null) {
            return _pipeSmoking!!
        }
        _pipeSmoking = Builder(name = "PipeSmoking", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 0.0f)
                curveToRelative(-1.172f, 0.0f, -2.269f, 0.575f, -2.938f, 1.545f)
                lineToRelative(-5.814f, 8.5f)
                curveToRelative(-1.173f, -0.089f, -2.363f, 0.4f, -3.125f, 1.424f)
                lineToRelative(-0.601f, 0.847f)
                curveToRelative(-0.029f, -0.117f, -0.057f, -0.23f, -0.081f, -0.338f)
                curveToRelative(-0.259f, -1.157f, -1.262f, -1.968f, -2.438f, -1.97f)
                lineToRelative(-4.191f, -0.009f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-1.162f, 0.0f, -2.188f, 0.822f, -2.439f, 1.955f)
                lineToRelative(-0.1f, 0.444f)
                curveTo(0.389f, 14.079f, -0.002f, 15.815f, 0.0f, 18.521f)
                curveToRelative(0.003f, 3.021f, 2.47f, 5.479f, 5.5f, 5.479f)
                horizontalLineToRelative(1.055f)
                curveToRelative(2.354f, 0.0f, 4.565f, -1.151f, 5.9f, -3.058f)
                lineToRelative(3.909f, -5.378f)
                curveToRelative(0.548f, -0.784f, 0.752f, -1.733f, 0.574f, -2.673f)
                curveToRelative(-0.094f, -0.498f, -0.294f, -0.954f, -0.574f, -1.357f)
                lineTo(22.034f, 3.244f)
                curveToRelative(0.105f, -0.153f, 0.279f, -0.244f, 0.466f, -0.244f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(13.922f, 13.824f)
                lineToRelative(-3.908f, 5.376f)
                curveToRelative(-0.79f, 1.127f, -2.083f, 1.8f, -3.459f, 1.8f)
                horizontalLineToRelative(-1.055f)
                curveToRelative(-1.354f, 0.0f, -2.499f, -1.136f, -2.5f, -2.48f)
                curveToRelative(-0.002f, -2.372f, 0.32f, -3.803f, 0.694f, -5.461f)
                lineToRelative(0.013f, -0.058f)
                lineToRelative(3.396f, 0.007f)
                curveToRelative(0.08f, 0.317f, 0.177f, 0.664f, 0.276f, 1.021f)
                curveToRelative(0.15f, 0.536f, 0.31f, 1.1f, 0.418f, 1.61f)
                curveToRelative(0.14f, 0.671f, 0.664f, 1.193f, 1.334f, 1.333f)
                curveToRelative(0.674f, 0.136f, 1.363f, -0.135f, 1.759f, -0.692f)
                lineToRelative(2.16f, -3.047f)
                curveToRelative(0.168f, -0.225f, 0.483f, -0.28f, 0.714f, -0.125f)
                curveToRelative(0.161f, 0.106f, 0.211f, 0.259f, 0.226f, 0.341f)
                curveToRelative(0.016f, 0.081f, 0.025f, 0.241f, -0.068f, 0.376f)
                close()
            }
        }
        .build()
        return _pipeSmoking!!
    }

private var _pipeSmoking: ImageVector? = null
