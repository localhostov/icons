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

public val Icons.Outline.LeafHeart: ImageVector
    get() {
        if (_leafHeart != null) {
            return _leafHeart!!
        }
        _leafHeart = Builder(name = "LeafHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.559f, 0.705f)
                curveToRelative(-2.052f, 1.009f, -4.144f, 1.219f, -6.098f, 1.296f)
                curveToRelative(-0.619f, 0.024f, -1.231f, 0.033f, -1.837f, 0.041f)
                curveToRelative(-3.37f, 0.048f, -6.855f, 0.097f, -9.71f, 2.953f)
                curveToRelative(-1.879f, 1.878f, -2.914f, 4.377f, -2.914f, 7.034f)
                curveToRelative(0.0f, 2.327f, 0.794f, 4.532f, 2.252f, 6.305f)
                lineTo(0.033f, 22.553f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(4.222f, -4.222f)
                curveToRelative(1.821f, 1.484f, 4.05f, 2.226f, 6.279f, 2.226f)
                curveToRelative(2.547f, 0.0f, 5.094f, -0.969f, 7.033f, -2.909f)
                curveToRelative(4.41f, -4.412f, 5.019f, -10.999f, 5.019f, -17.46f)
                lineTo(24.0f, -0.004f)
                lineToRelative(-1.441f, 0.709f)
                close()
                moveTo(17.568f, 17.649f)
                curveToRelative(-3.1f, 3.099f, -8.14f, 3.099f, -11.239f, 0.0f)
                curveToRelative(-1.502f, -1.501f, -2.328f, -3.497f, -2.328f, -5.62f)
                reflectiveCurveToRelative(0.826f, -4.119f, 2.328f, -5.62f)
                curveToRelative(2.281f, -2.282f, 5.082f, -2.321f, 8.324f, -2.367f)
                curveToRelative(0.622f, -0.009f, 1.251f, -0.018f, 1.887f, -0.043f)
                curveToRelative(1.651f, -0.064f, 3.538f, -0.231f, 5.448f, -0.894f)
                curveToRelative(-0.1f, 5.529f, -0.848f, 10.971f, -4.42f, 14.543f)
                close()
                moveTo(12.501f, 7.852f)
                curveToRelative(-0.575f, -0.533f, -1.36f, -0.852f, -2.25f, -0.852f)
                curveToRelative(-1.792f, 0.0f, -3.25f, 1.539f, -3.25f, 3.43f)
                curveToRelative(0.0f, 2.982f, 4.425f, 6.141f, 4.93f, 6.491f)
                lineToRelative(0.57f, 0.396f)
                lineToRelative(0.57f, -0.396f)
                curveToRelative(0.505f, -0.35f, 4.93f, -3.509f, 4.93f, -6.491f)
                curveToRelative(0.0f, -1.892f, -1.458f, -3.43f, -3.25f, -3.43f)
                curveToRelative(-0.89f, 0.0f, -1.675f, 0.318f, -2.25f, 0.852f)
                close()
                moveTo(16.001f, 10.431f)
                curveToRelative(0.0f, 1.239f, -1.891f, 3.186f, -3.499f, 4.428f)
                curveToRelative(-1.414f, -1.1f, -3.501f, -3.096f, -3.501f, -4.428f)
                curveToRelative(0.0f, -0.789f, 0.561f, -1.43f, 1.25f, -1.43f)
                curveToRelative(0.622f, 0.0f, 1.25f, 0.374f, 1.25f, 1.209f)
                verticalLineToRelative(0.791f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-0.791f)
                curveToRelative(0.0f, -0.835f, 0.628f, -1.209f, 1.25f, -1.209f)
                curveToRelative(0.689f, 0.0f, 1.25f, 0.642f, 1.25f, 1.43f)
                close()
            }
        }
        .build()
        return _leafHeart!!
    }

private var _leafHeart: ImageVector? = null
