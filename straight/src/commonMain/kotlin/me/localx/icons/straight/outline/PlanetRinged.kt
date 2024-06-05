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
                curveToRelative(-1.601f, -1.602f, -5.027f, 0.126f, -7.798f, 2.017f)
                curveToRelative(-1.107f, -0.424f, -2.308f, -0.656f, -3.562f, -0.656f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 1.254f, 0.233f, 2.455f, 0.656f, 3.562f)
                curveToRelative(-1.891f, 2.772f, -3.618f, 6.197f, -2.017f, 7.798f)
                curveToRelative(0.424f, 0.425f, 0.993f, 0.637f, 1.703f, 0.637f)
                curveToRelative(1.153f, 0.0f, 2.679f, -0.559f, 4.562f, -1.675f)
                curveToRelative(0.496f, -0.294f, 1.009f, -0.622f, 1.533f, -0.979f)
                curveToRelative(1.107f, 0.423f, 2.308f, 0.656f, 3.562f, 0.656f)
                curveToRelative(5.514f, 0.0f, 10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -1.261f, -0.235f, -2.469f, -0.664f, -3.581f)
                curveToRelative(2.168f, -3.166f, 3.514f, -6.289f, 2.024f, -7.78f)
                close()
                moveTo(21.946f, 2.053f)
                curveToRelative(0.096f, 0.096f, 0.246f, 1.146f, -1.345f, 3.833f)
                curveToRelative(-0.101f, 0.171f, -0.207f, 0.344f, -0.317f, 0.519f)
                curveToRelative(-0.717f, -1.059f, -1.632f, -1.974f, -2.692f, -2.691f)
                curveToRelative(3.011f, -1.895f, 4.228f, -1.785f, 4.353f, -1.661f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(3.045f, 0.0f, 5.698f, 1.71f, 7.049f, 4.221f)
                curveToRelative(-1.36f, 1.862f, -3.084f, 3.855f, -5.029f, 5.8f)
                curveToRelative(-1.944f, 1.944f, -3.937f, 3.669f, -5.799f, 5.029f)
                curveToRelative(-2.511f, -1.351f, -4.221f, -4.004f, -4.221f, -7.049f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                close()
                moveTo(5.886f, 20.602f)
                curveToRelative(-2.686f, 1.591f, -3.735f, 1.439f, -3.832f, 1.345f)
                curveToRelative(-0.124f, -0.124f, -0.233f, -1.344f, 1.661f, -4.353f)
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
