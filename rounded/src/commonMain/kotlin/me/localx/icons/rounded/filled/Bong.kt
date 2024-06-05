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

public val Icons.Filled.Bong: ImageVector
    get() {
        if (_bong != null) {
            return _bong!!
        }
        _bong = Builder(name = "Bong", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.894f, 9.024f)
                curveToRelative(0.187f, 0.152f, 0.41f, 0.226f, 0.633f, 0.226f)
                curveToRelative(0.29f, 0.0f, 0.577f, -0.125f, 0.774f, -0.367f)
                curveToRelative(0.351f, -0.427f, 0.287f, -1.058f, -0.14f, -1.407f)
                lineToRelative(-3.055f, -2.5f)
                curveToRelative(-0.429f, -0.35f, -1.059f, -0.287f, -1.407f, 0.141f)
                curveToRelative(-0.351f, 0.427f, -0.287f, 1.058f, 0.14f, 1.407f)
                lineToRelative(0.754f, 0.617f)
                lineToRelative(-1.426f, 1.743f)
                curveToRelative(-0.669f, -0.45f, -1.393f, -0.833f, -2.166f, -1.133f)
                lineTo(16.001f, 2.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                verticalLineToRelative(5.75f)
                curveToRelative(-4.217f, 1.639f, -7.0f, 5.668f, -7.0f, 10.25f)
                curveToRelative(0.062f, 3.19f, 2.756f, 6.0f, 6.004f, 6.0f)
                horizontalLineToRelative(9.992f)
                curveToRelative(3.248f, 0.0f, 5.942f, -2.806f, 6.004f, -6.0f)
                curveToRelative(0.0f, -3.039f, -1.23f, -5.831f, -3.286f, -7.848f)
                lineToRelative(1.427f, -1.745f)
                lineToRelative(0.753f, 0.616f)
                close()
                moveTo(20.0f, 15.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 16.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _bong!!
    }

private var _bong: ImageVector? = null
