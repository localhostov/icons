package me.localx.icons.straight.bold

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
                moveToRelative(4.962f, 19.058f)
                curveToRelative(0.032f, 1.69f, 0.669f, 3.316f, 1.558f, 4.942f)
                curveToRelative(-2.797f, -0.746f, -4.691f, -3.98f, -4.455f, -6.727f)
                curveToRelative(0.199f, -1.726f, 1.523f, -3.192f, 2.686f, -4.062f)
                curveToRelative(1.206f, -0.897f, 3.058f, -1.712f, 3.058f, -1.712f)
                lineToRelative(1.398f, 2.946f)
                curveToRelative(-1.868f, 1.021f, -4.244f, 2.035f, -4.244f, 4.611f)
                close()
                moveTo(22.999f, 18.916f)
                curveToRelative(-0.028f, -1.544f, -0.83f, -3.199f, -2.386f, -4.922f)
                curveToRelative(-1.4f, -1.55f, -2.829f, -4.668f, -3.871f, -6.944f)
                lineToRelative(-0.42f, -0.912f)
                curveToRelative(-1.068f, -2.3f, -1.322f, -2.846f, -1.322f, -6.138f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 3.786f, 0.358f, 4.726f, 1.601f, 7.401f)
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
                curveToRelative(1.953f, 1.107f, 6.331f, 1.187f, 6.331f, 1.187f)
                curveToRelative(0.011f, 0.0f, 0.5f, -0.018f, 0.5f, -0.018f)
                curveToRelative(1.978f, -0.087f, 3.474f, -0.688f, 4.442f, -1.804f)
                curveToRelative(1.125f, -1.297f, 1.098f, -2.796f, 1.057f, -3.263f)
                close()
            }
        }
        .build()
        return _nose!!
    }

private var _nose: ImageVector? = null
