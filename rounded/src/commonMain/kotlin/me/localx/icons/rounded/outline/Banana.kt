package me.localx.icons.rounded.outline

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

public val Icons.Outline.Banana: ImageVector
    get() {
        if (_banana != null) {
            return _banana!!
        }
        _banana = Builder(name = "Banana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.892f, 15.043f)
                curveToRelative(-0.867f, -1.651f, -2.51f, -3.144f, -4.127f, -3.865f)
                curveTo(19.73f, 3.576f, 18.397f, 0.019f, 15.571f, 0.009f)
                horizontalLineToRelative(-0.013f)
                curveTo(12.427f, 0.009f, 11.244f, 4.127f, 10.667f, 8.388f)
                curveToRelative(-0.32f, -0.107f, -0.669f, -0.2f, -1.101f, -0.273f)
                curveToRelative(-1.893f, -0.32f, -3.805f, 0.035f, -5.446f, 1.001f)
                curveToRelative(-0.358f, 0.211f, -0.504f, 0.656f, -0.38f, 1.052f)
                lineToRelative(0.012f, 0.037f)
                curveToRelative(0.138f, 0.44f, 0.584f, 0.715f, 1.037f, 0.633f)
                curveToRelative(2.628f, -0.477f, 4.033f, 0.033f, 5.286f, 1.396f)
                curveToRelative(-0.494f, 1.613f, -1.669f, 3.907f, -4.471f, 5.31f)
                curveToRelative(-2.745f, 1.182f, -3.813f, 3.107f, -3.976f, 3.428f)
                lineToRelative(-0.611f, -0.01f)
                horizontalLineToRelative(-0.017f)
                curveTo(0.455f, 20.961f, 0.009f, 21.398f, 0.0f, 21.944f)
                curveToRelative(-0.009f, 0.553f, 0.432f, 1.008f, 0.983f, 1.017f)
                lineToRelative(0.614f, 0.01f)
                curveToRelative(0.46f, 1.027f, 2.477f, 1.029f, 3.402f, 1.029f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(4.429f, 0.0f, 7.512f, -1.196f, 9.661f, -2.795f)
                curveToRelative(0.271f, -0.201f, 0.414f, -0.542f, 0.38f, -0.877f)
                curveToRelative(0.0f, -0.009f, -0.002f, -0.018f, -0.003f, -0.027f)
                curveToRelative(-0.076f, -0.756f, -0.943f, -1.175f, -1.549f, -0.718f)
                curveToRelative(-2.127f, 1.601f, -4.961f, 2.417f, -8.488f, 2.418f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-0.764f, 0.0f, -1.229f, -0.049f, -1.5f, -0.096f)
                verticalLineToRelative(-0.184f)
                curveToRelative(0.269f, -0.433f, 1.114f, -1.574f, 2.947f, -2.365f)
                curveToRelative(2.823f, -1.411f, 4.312f, -3.54f, 5.1f, -5.354f)
                curveToRelative(2.471f, 0.432f, 5.062f, 1.075f, 5.517f, 6.459f)
                curveToRelative(0.033f, 0.391f, 0.296f, 0.725f, 0.674f, 0.83f)
                curveToRelative(0.438f, 0.122f, 0.914f, -0.088f, 1.089f, -0.508f)
                curveToRelative(0.815f, -1.966f, 1.043f, -4.05f, 0.531f, -5.871f)
                curveToRelative(0.922f, 0.153f, 2.146f, 0.747f, 3.181f, 1.376f)
                curveToRelative(0.307f, 0.186f, 0.691f, 0.198f, 0.994f, 0.005f)
                lineToRelative(0.039f, -0.025f)
                curveToRelative(0.41f, -0.261f, 0.546f, -0.795f, 0.32f, -1.225f)
                close()
                moveTo(14.999f, 12.087f)
                curveToRelative(-0.606f, -0.038f, -2.267f, -0.532f, -2.471f, -2.466f)
                curveToRelative(0.729f, -6.25f, 2.037f, -7.612f, 3.031f, -7.612f)
                horizontalLineToRelative(0.004f)
                curveToRelative(0.985f, 0.004f, 2.125f, 2.341f, 2.198f, 8.797f)
                curveToRelative(-0.207f, 0.386f, -0.885f, 1.282f, -2.762f, 1.282f)
                close()
            }
        }
        .build()
        return _banana!!
    }

private var _banana: ImageVector? = null
