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

public val Icons.Outline.Bong: ImageVector
    get() {
        if (_bong != null) {
            return _bong!!
        }
        _bong = Builder(name = "Bong", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.161f, 7.476f)
                lineToRelative(-3.055f, -2.5f)
                curveToRelative(-0.429f, -0.35f, -1.059f, -0.287f, -1.407f, 0.141f)
                curveToRelative(-0.351f, 0.427f, -0.287f, 1.058f, 0.14f, 1.407f)
                lineToRelative(0.754f, 0.617f)
                lineToRelative(-1.425f, 1.742f)
                curveToRelative(-0.669f, -0.45f, -1.394f, -0.832f, -2.167f, -1.132f)
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
                curveToRelative(0.0f, -3.04f, -1.226f, -5.836f, -3.282f, -7.853f)
                lineToRelative(1.423f, -1.739f)
                lineToRelative(0.753f, 0.616f)
                curveToRelative(0.187f, 0.152f, 0.41f, 0.226f, 0.633f, 0.226f)
                curveToRelative(0.29f, 0.0f, 0.577f, -0.125f, 0.774f, -0.367f)
                curveToRelative(0.351f, -0.427f, 0.287f, -1.058f, -0.14f, -1.407f)
                close()
                moveTo(21.0f, 18.0f)
                curveToRelative(-0.04f, 2.108f, -1.838f, 4.0f, -4.004f, 4.0f)
                lineTo(7.004f, 22.0f)
                curveToRelative(-2.166f, 0.0f, -3.964f, -1.896f, -4.004f, -4.0f)
                curveToRelative(0.0f, -0.685f, 0.076f, -1.354f, 0.221f, -2.0f)
                horizontalLineToRelative(13.779f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(3.928f, 14.0f)
                curveToRelative(1.06f, -2.148f, 2.963f, -3.83f, 5.371f, -4.587f)
                curveToRelative(0.417f, -0.131f, 0.7f, -0.517f, 0.7f, -0.954f)
                lineTo(9.999f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.459f)
                curveToRelative(0.0f, 0.437f, 0.283f, 0.823f, 0.7f, 0.954f)
                curveToRelative(3.769f, 1.184f, 6.3f, 4.635f, 6.3f, 8.587f)
                close()
            }
        }
        .build()
        return _bong!!
    }

private var _bong: ImageVector? = null
