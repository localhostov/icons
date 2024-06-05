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

public val Icons.Filled.Duck: ImageVector
    get() {
        if (_duck != null) {
            return _duck!!
        }
        _duck = Builder(name = "Duck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 17.0f)
                curveToRelative(-1.028f, 0.0f, -2.693f, 0.96f, -3.985f, 1.891f)
                curveToRelative(0.983f, 0.509f, 2.465f, 1.109f, 3.985f, 1.109f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.673f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(20.615f, 10.974f)
                curveToRelative(-1.382f, 1.297f, -3.195f, 2.026f, -5.113f, 2.026f)
                curveToRelative(-0.527f, 0.0f, -1.062f, -0.054f, -1.596f, -0.166f)
                curveToRelative(-1.674f, -0.349f, -3.151f, -1.304f, -4.213f, -2.602f)
                curveToRelative(-1.475f, 1.472f, -3.265f, 2.768f, -4.227f, 2.768f)
                curveToRelative(-0.428f, 0.0f, -1.021f, -1.092f, -1.306f, -1.617f)
                curveToRelative(-0.094f, -0.174f, -0.182f, -0.336f, -0.265f, -0.475f)
                curveToRelative(-0.374f, -0.634f, -1.095f, -0.983f, -1.818f, -0.894f)
                curveToRelative(-0.733f, 0.091f, -1.319f, 0.587f, -1.528f, 1.295f)
                curveTo(0.177f, 12.574f, -0.023f, 14.947f, 0.003f, 16.025f)
                curveToRelative(0.117f, 4.696f, 3.673f, 7.975f, 8.646f, 7.975f)
                horizontalLineToRelative(6.944f)
                curveToRelative(3.591f, 0.0f, 7.406f, -2.559f, 7.406f, -7.3f)
                curveToRelative(0.0f, -2.108f, -1.252f, -4.256f, -2.384f, -5.726f)
                close()
                moveTo(16.956f, 19.063f)
                curveToRelative(-0.285f, 1.814f, -2.002f, 3.008f, -3.836f, 2.929f)
                curveToRelative(-2.222f, -0.097f, -4.161f, -1.018f, -5.428f, -1.802f)
                curveToRelative(-0.854f, -0.528f, -0.932f, -1.732f, -0.152f, -2.364f)
                curveToRelative(1.477f, -1.196f, 3.873f, -2.826f, 5.96f, -2.826f)
                curveToRelative(2.114f, 0.0f, 3.797f, 1.885f, 3.456f, 4.063f)
                close()
                moveTo(24.0f, 6.25f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.451f, -0.28f, 0.855f, -0.702f, 1.013f)
                lineToRelative(-3.152f, 1.182f)
                curveToRelative(-1.169f, 1.84f, -3.4f, 2.938f, -5.831f, 2.431f)
                curveToRelative(-2.078f, -0.434f, -3.758f, -2.114f, -4.191f, -4.192f)
                curveToRelative(-0.741f, -3.555f, 1.952f, -6.684f, 5.376f, -6.684f)
                curveToRelative(2.635f, 0.0f, 4.837f, 1.853f, 5.374f, 4.328f)
                lineToRelative(2.423f, 0.909f)
                curveToRelative(0.422f, 0.158f, 0.702f, 0.562f, 0.702f, 1.013f)
                close()
            }
        }
        .build()
        return _duck!!
    }

private var _duck: ImageVector? = null
