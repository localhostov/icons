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

public val Icons.Outline.PipeSmoking: ImageVector
    get() {
        if (_pipeSmoking != null) {
            return _pipeSmoking!!
        }
        _pipeSmoking = Builder(name = "PipeSmoking", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.624f, 0.0f)
                curveToRelative(-0.985f, 0.0f, -1.907f, 0.483f, -2.467f, 1.294f)
                lineToRelative(-6.88f, 9.948f)
                curveToRelative(-0.413f, -0.225f, -0.885f, -0.296f, -1.353f, -0.202f)
                curveToRelative(-0.523f, 0.106f, -0.974f, 0.411f, -1.237f, 0.812f)
                lineToRelative(-1.137f, 1.532f)
                curveToRelative(-0.028f, -0.124f, -0.056f, -0.248f, -0.084f, -0.374f)
                curveToRelative(-0.088f, -0.39f, -0.43f, -1.997f, -0.43f, -1.997f)
                lineToRelative(-7.851f, -0.016f)
                reflectiveCurveToRelative(-0.342f, 1.614f, -0.431f, 2.006f)
                curveTo(0.366f, 14.733f, -0.002f, 16.367f, 0.0f, 19.021f)
                curveToRelative(0.003f, 2.745f, 2.245f, 4.979f, 5.0f, 4.979f)
                horizontalLineToRelative(1.055f)
                curveToRelative(2.191f, 0.0f, 4.25f, -1.071f, 5.51f, -2.871f)
                lineToRelative(4.095f, -5.921f)
                curveToRelative(0.295f, -0.444f, 0.398f, -0.979f, 0.292f, -1.502f)
                curveToRelative(-0.106f, -0.524f, -0.411f, -0.975f, -0.855f, -1.27f)
                lineToRelative(-0.146f, -0.097f)
                lineTo(21.803f, 2.431f)
                curveToRelative(0.186f, -0.27f, 0.493f, -0.431f, 0.821f, -0.431f)
                horizontalLineToRelative(1.376f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-1.376f)
                close()
                moveTo(9.923f, 19.986f)
                curveToRelative(-0.883f, 1.261f, -2.329f, 2.014f, -3.868f, 2.014f)
                horizontalLineToRelative(-1.055f)
                curveToRelative(-1.652f, 0.0f, -2.999f, -1.337f, -3.0f, -2.98f)
                curveToRelative(-0.002f, -2.431f, 0.327f, -3.888f, 0.707f, -5.576f)
                curveToRelative(0.033f, -0.146f, 0.066f, -0.293f, 0.1f, -0.441f)
                lineToRelative(4.61f, 0.008f)
                curveToRelative(0.032f, 0.148f, 0.065f, 0.295f, 0.099f, 0.441f)
                curveToRelative(0.188f, 0.832f, 0.364f, 1.618f, 0.495f, 2.501f)
                lineToRelative(0.354f, 2.389f)
                lineToRelative(3.959f, -5.341f)
                lineToRelative(1.68f, 1.088f)
                lineToRelative(-4.08f, 5.898f)
                close()
            }
        }
        .build()
        return _pipeSmoking!!
    }

private var _pipeSmoking: ImageVector? = null
