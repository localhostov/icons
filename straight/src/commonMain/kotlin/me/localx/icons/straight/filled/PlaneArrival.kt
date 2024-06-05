package me.localx.icons.straight.filled

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
                moveTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(24.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.797f, 17.573f)
                curveToRelative(0.551f, -1.26f, -0.022f, -2.732f, -1.278f, -3.288f)
                lineTo(6.931f, 7.441f)
                lineToRelative(-1.262f, -3.229f)
                curveToRelative(-0.186f, -0.475f, -0.545f, -0.848f, -1.011f, -1.05f)
                curveToRelative(-0.627f, -0.275f, -1.335f, -0.198f, -1.887f, 0.208f)
                curveToRelative(-0.555f, 0.406f, -0.842f, 1.055f, -0.769f, 1.738f)
                lineToRelative(0.629f, 5.89f)
                lineToRelative(18.155f, 8.881f)
                lineToRelative(1.01f, -2.306f)
                close()
                moveTo(16.352f, 9.959f)
                lineToRelative(-0.975f, -6.639f)
                curveToRelative(-0.079f, -0.912f, -0.649f, -1.707f, -1.49f, -2.075f)
                lineToRelative(-2.886f, -1.245f)
                lineTo(11.001f, 7.263f)
                lineToRelative(5.351f, 2.696f)
                close()
            }
        }
        .build()
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
