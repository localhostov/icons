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

public val Icons.Filled.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) {
            return _planeArrival!!
        }
        _planeArrival = Builder(name = "PlaneArrival", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.557f, 19.0f)
                curveToRelative(-0.357f, 0.0f, -0.714f, -0.08f, -1.048f, -0.239f)
                lineTo(5.664f, 12.442f)
                curveToRelative(-1.874f, -0.894f, -3.167f, -2.72f, -3.386f, -4.772f)
                lineToRelative(-0.267f, -2.495f)
                curveToRelative(-0.059f, -0.546f, 0.111f, -1.099f, 0.465f, -1.517f)
                curveToRelative(0.331f, -0.392f, 0.788f, -0.625f, 1.285f, -0.655f)
                curveToRelative(0.827f, -0.047f, 1.606f, 0.435f, 1.909f, 1.208f)
                lineToRelative(1.26f, 3.223f)
                lineToRelative(13.577f, 6.815f)
                curveToRelative(1.259f, 0.554f, 1.835f, 2.03f, 1.283f, 3.291f)
                curveToRelative(-0.268f, 0.611f, -0.759f, 1.074f, -1.383f, 1.307f)
                curveToRelative(-0.277f, 0.103f, -0.564f, 0.154f, -0.851f, 0.154f)
                close()
                moveTo(24.0f, 23.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(1.0f, 22.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                lineTo(23.0f, 24.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(16.614f, 10.057f)
                lineToRelative(-1.201f, -6.529f)
                curveToRelative(-0.082f, -0.912f, -0.655f, -1.704f, -1.498f, -2.069f)
                lineToRelative(-0.793f, -0.338f)
                curveToRelative(-0.466f, -0.198f, -0.995f, -0.149f, -1.419f, 0.13f)
                curveToRelative(-0.421f, 0.28f, -0.672f, 0.75f, -0.67f, 1.253f)
                lineTo(11.033f, 7.255f)
                lineToRelative(5.581f, 2.801f)
                close()
            }
        }
        .build()
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
