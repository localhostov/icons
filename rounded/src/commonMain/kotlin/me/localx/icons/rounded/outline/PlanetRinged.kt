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

public val Icons.Outline.PlanetRinged: ImageVector
    get() {
        if (_planetRinged != null) {
            return _planetRinged!!
        }
        _planetRinged = Builder(name = "PlanetRinged", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.36f, 0.639f)
                curveToRelative(-1.303f, -1.304f, -3.927f, -0.626f, -7.799f, 2.017f)
                curveToRelative(-1.107f, -0.423f, -2.308f, -0.656f, -3.562f, -0.656f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 1.254f, 0.233f, 2.454f, 0.656f, 3.561f)
                curveTo(0.012f, 19.433f, -0.667f, 22.056f, 0.64f, 23.361f)
                curveToRelative(0.424f, 0.425f, 0.993f, 0.637f, 1.703f, 0.637f)
                curveToRelative(1.153f, 0.0f, 2.679f, -0.559f, 4.562f, -1.675f)
                curveToRelative(0.496f, -0.294f, 1.009f, -0.622f, 1.533f, -0.979f)
                curveToRelative(1.107f, 0.423f, 2.308f, 0.656f, 3.562f, 0.656f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -1.261f, -0.235f, -2.469f, -0.664f, -3.581f)
                curveToRelative(2.168f, -3.166f, 3.514f, -6.289f, 2.024f, -7.78f)
                close()
                moveTo(21.946f, 2.053f)
                curveToRelative(0.319f, 0.319f, -0.142f, 1.917f, -1.665f, 4.347f)
                curveToRelative(-0.717f, -1.057f, -1.63f, -1.969f, -2.687f, -2.685f)
                curveToRelative(3.02f, -1.899f, 4.233f, -1.782f, 4.352f, -1.662f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(3.044f, 0.0f, 5.696f, 1.709f, 7.048f, 4.217f)
                curveToRelative(-1.236f, 1.699f, -2.89f, 3.667f, -5.027f, 5.804f)
                curveToRelative(-1.944f, 1.944f, -3.937f, 3.669f, -5.799f, 5.029f)
                curveToRelative(-2.511f, -1.351f, -4.221f, -4.004f, -4.221f, -7.049f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                close()
                moveTo(5.886f, 20.602f)
                curveToRelative(-2.689f, 1.593f, -3.735f, 1.441f, -3.832f, 1.344f)
                curveToRelative(-0.122f, -0.122f, -0.235f, -1.337f, 1.661f, -4.352f)
                curveToRelative(0.717f, 1.059f, 1.632f, 1.974f, 2.691f, 2.691f)
                curveToRelative(-0.175f, 0.11f, -0.349f, 0.216f, -0.52f, 0.317f)
                close()
                moveTo(20.0f, 12.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-0.522f, 0.0f, -1.033f, -0.051f, -1.527f, -0.147f)
                curveToRelative(1.627f, -1.271f, 3.315f, -2.771f, 4.962f, -4.418f)
                curveToRelative(1.312f, -1.312f, 2.935f, -3.095f, 4.413f, -4.989f)
                curveToRelative(0.099f, 0.503f, 0.152f, 1.022f, 0.152f, 1.554f)
                close()
            }
        }
        .build()
        return _planetRinged!!
    }

private var _planetRinged: ImageVector? = null
