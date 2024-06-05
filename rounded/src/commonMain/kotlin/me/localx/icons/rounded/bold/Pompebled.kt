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

public val Icons.Bold.Pompebled: ImageVector
    get() {
        if (_pompebled != null) {
            return _pompebled!!
        }
        _pompebled = Builder(name = "Pompebled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.046f, 24.003f)
                curveToRelative(-2.963f, 0.0f, -5.509f, -0.945f, -7.307f, -2.743f)
                curveTo(0.537f, 19.059f, -0.386f, 15.731f, 0.142f, 11.891f)
                curveToRelative(0.468f, -3.403f, 2.065f, -6.753f, 4.273f, -8.961f)
                lineToRelative(1.272f, -1.272f)
                curveTo(7.894f, -0.549f, 11.485f, -0.549f, 13.691f, 1.658f)
                curveToRelative(2.06f, 2.059f, 2.26f, 4.539f, 0.598f, 7.37f)
                curveToRelative(-0.151f, 0.257f, -0.395f, 0.786f, -0.233f, 0.947f)
                curveToRelative(0.044f, 0.029f, 0.27f, 0.074f, 1.077f, -0.3f)
                curveToRelative(1.929f, -0.893f, 4.774f, -1.802f, 7.209f, 0.634f)
                curveToRelative(2.207f, 2.207f, 2.207f, 5.797f, 0.0f, 8.004f)
                lineToRelative(-1.272f, 1.272f)
                curveToRelative(-2.208f, 2.208f, -5.558f, 3.806f, -8.961f, 4.273f)
                curveToRelative(-0.706f, 0.097f, -1.395f, 0.145f, -2.063f, 0.145f)
                close()
                moveTo(9.69f, 3.001f)
                curveToRelative(-0.681f, 0.0f, -1.362f, 0.259f, -1.881f, 0.778f)
                lineToRelative(-1.272f, 1.272f)
                curveToRelative(-1.761f, 1.762f, -3.041f, 4.471f, -3.422f, 7.249f)
                curveToRelative(-0.391f, 2.846f, 0.246f, 5.339f, 1.747f, 6.84f)
                reflectiveCurveToRelative(3.998f, 2.141f, 6.84f, 1.747f)
                curveToRelative(2.777f, -0.381f, 5.487f, -1.661f, 7.249f, -3.422f)
                lineToRelative(1.272f, -1.272f)
                curveToRelative(1.037f, -1.037f, 1.037f, -2.725f, 0.0f, -3.762f)
                curveToRelative(-0.763f, -0.761f, -1.669f, -1.033f, -3.827f, -0.033f)
                curveToRelative(-0.703f, 0.326f, -2.843f, 1.318f, -4.46f, -0.3f)
                curveToRelative(-1.155f, -1.155f, -1.242f, -2.87f, -0.232f, -4.589f)
                curveToRelative(1.108f, -1.886f, 0.771f, -2.825f, -0.132f, -3.729f)
                curveToRelative(-0.519f, -0.519f, -1.2f, -0.778f, -1.881f, -0.778f)
                close()
            }
        }
        .build()
        return _pompebled!!
    }

private var _pompebled: ImageVector? = null
