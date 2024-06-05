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

public val Icons.Bold.Nose: ImageVector
    get() {
        if (_nose != null) {
            return _nose!!
        }
        _nose = Builder(name = "Nose", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.532f, 13.027f)
                curveToRelative(0.371f, 0.782f, 0.081f, 1.722f, -0.673f, 2.148f)
                curveToRelative(-1.496f, 0.846f, -2.898f, 1.904f, -2.898f, 3.883f)
                curveToRelative(0.024f, 1.271f, 0.774f, 2.996f, 1.332f, 4.221f)
                curveToRelative(0.203f, 0.446f, -0.283f, 0.902f, -0.702f, 0.648f)
                curveToRelative(-2.055f, -1.243f, -3.724f, -4.363f, -3.527f, -6.654f)
                curveToRelative(0.199f, -1.726f, 1.523f, -3.192f, 2.686f, -4.062f)
                curveToRelative(0.454f, -0.338f, 1.001f, -0.664f, 1.505f, -0.94f)
                curveToRelative(0.83f, -0.453f, 1.872f, -0.099f, 2.277f, 0.755f)
                close()
                moveTo(22.999f, 18.916f)
                curveToRelative(-0.028f, -1.544f, -0.83f, -3.199f, -2.386f, -4.922f)
                curveToRelative(-1.4f, -1.55f, -2.829f, -4.668f, -3.871f, -6.944f)
                lineToRelative(-0.42f, -0.912f)
                curveToRelative(-0.942f, -2.03f, -1.218f, -2.704f, -1.297f, -4.698f)
                curveToRelative(-0.034f, -0.827f, -0.72f, -1.483f, -1.559f, -1.438f)
                curveToRelative(-0.828f, 0.033f, -1.472f, 0.731f, -1.439f, 1.56f)
                curveToRelative(0.104f, 2.573f, 0.558f, 3.65f, 1.575f, 5.841f)
                lineToRelative(0.413f, 0.897f)
                curveToRelative(1.124f, 2.454f, 2.663f, 5.814f, 4.373f, 7.707f)
                curveToRelative(1.041f, 1.151f, 1.613f, 2.215f, 1.613f, 2.994f)
                curveToRelative(0.0f, 0.006f, 0.052f, 0.778f, -0.325f, 1.213f)
                curveToRelative(-0.404f, 0.466f, -1.219f, 0.722f, -2.336f, 0.768f)
                curveToRelative(-1.029f, -0.049f, -1.622f, -0.524f, -2.475f, -1.245f)
                curveToRelative(-0.489f, -0.414f, -1.043f, -0.883f, -1.729f, -1.271f)
                curveToRelative(-1.214f, -0.688f, -2.154f, -0.534f, -2.729f, -0.282f)
                curveToRelative(-0.691f, 0.301f, -1.028f, 0.824f, -1.115f, 0.978f)
                curveToRelative(-0.086f, 0.152f, -0.362f, 0.71f, -0.266f, 1.458f)
                curveToRelative(0.08f, 0.622f, 0.43f, 1.508f, 1.643f, 2.195f)
                curveToRelative(1.949f, 1.105f, 3.992f, 1.181f, 6.318f, 1.187f)
                curveToRelative(0.004f, 0.0f, 0.513f, 0.0f, 0.783f, 0.0f)
                curveToRelative(1.846f, -0.128f, 3.248f, -0.756f, 4.172f, -1.821f)
                curveToRelative(1.125f, -1.297f, 1.098f, -2.796f, 1.057f, -3.263f)
                close()
                moveTo(20.0f, 19.0f)
                curveToRelative(-0.01f, -0.07f, 0.0f, 0.071f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _nose!!
    }

private var _nose: ImageVector? = null
