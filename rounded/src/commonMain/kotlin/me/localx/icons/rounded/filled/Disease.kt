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

public val Icons.Filled.Disease: ImageVector
    get() {
        if (_disease != null) {
            return _disease!!
        }
        _disease = Builder(name = "Disease", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 13.293f)
                curveToRelative(0.0f, -0.455f, 1.027f, -1.62f, 1.777f, -2.471f)
                curveToRelative(1.511f, -1.714f, 3.223f, -3.656f, 3.223f, -5.823f)
                curveToRelative(0.0f, -2.003f, -1.01f, -3.019f, -3.0f, -3.019f)
                curveToRelative(-1.255f, 0.0f, -2.355f, 0.532f, -3.421f, 1.046f)
                curveToRelative(-1.034f, 0.5f, -2.012f, 0.972f, -3.097f, 0.972f)
                curveToRelative(-0.906f, 0.0f, -1.919f, -0.959f, -2.898f, -1.886f)
                curveToRelative(-1.098f, -1.039f, -2.233f, -2.114f, -3.605f, -2.114f)
                curveToRelative(-0.323f, -0.002f, -0.717f, 0.0f, -1.144f, 0.156f)
                curveToRelative(-1.25f, 0.46f, -1.546f, 1.771f, -1.688f, 2.4f)
                curveToRelative(-0.152f, 0.675f, -0.157f, 1.836f, -0.149f, 3.067f)
                lineToRelative(0.002f, 0.376f)
                curveToRelative(0.0f, 0.668f, -1.031f, 1.282f, -2.028f, 1.876f)
                curveTo(1.58f, 8.705f, 0.003f, 9.645f, 0.003f, 11.415f)
                curveTo(0.003f, 13.004f, 1.332f, 13.767f, 2.399f, 14.38f)
                curveToRelative(1.095f, 0.629f, 1.61f, 0.993f, 1.603f, 1.573f)
                curveToRelative(-0.048f, 0.311f, -0.641f, 1.279f, -0.863f, 1.643f)
                curveToRelative(-0.13f, 0.211f, -0.242f, 0.396f, -0.317f, 0.533f)
                curveToRelative(-0.374f, 0.676f, -0.612f, 1.266f, -0.751f, 1.858f)
                curveToRelative(-0.248f, 1.056f, 0.065f, 2.084f, 0.799f, 2.619f)
                curveToRelative(0.856f, 0.625f, 1.89f, 0.351f, 2.386f, 0.219f)
                curveToRelative(0.804f, -0.212f, 1.655f, -0.762f, 2.558f, -1.343f)
                curveToRelative(1.076f, -0.695f, 2.297f, -1.482f, 3.188f, -1.482f)
                curveToRelative(0.632f, 0.0f, 2.866f, 1.35f, 4.185f, 2.414f)
                curveToRelative(0.734f, 0.592f, 2.206f, 1.586f, 3.815f, 1.586f)
                curveToRelative(1.879f, 0.0f, 3.0f, -1.122f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.823f, -0.907f, -3.289f, -1.707f, -4.583f)
                curveToRelative(-0.665f, -1.075f, -1.293f, -2.089f, -1.293f, -3.124f)
                close()
                moveTo(9.5f, 17.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.5f, 10.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _disease!!
    }

private var _disease: ImageVector? = null
