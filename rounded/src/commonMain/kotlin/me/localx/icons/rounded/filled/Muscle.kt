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

public val Icons.Filled.Muscle: ImageVector
    get() {
        if (_muscle != null) {
            return _muscle!!
        }
        _muscle = Builder(name = "Muscle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.071f)
                curveToRelative(0.0f, 1.174f, -0.682f, 2.232f, -1.747f, 2.727f)
                curveToRelative(-1.99f, 0.926f, -5.58f, 2.202f, -10.253f, 2.202f)
                curveToRelative(-4.905f, 0.0f, -9.169f, -2.343f, -10.794f, -3.895f)
                curveTo(0.425f, 19.358f, -0.01f, 18.328f, -0.009f, 17.246f)
                curveTo(-0.005f, 13.645f, 0.411f, 5.566f, 6.286f, 1.048f)
                curveTo(6.286f, 1.048f, 7.5f, -0.024f, 9.0f, -0.024f)
                curveToRelative(1.544f, 0.0f, 2.565f, 0.788f, 2.93f, 1.622f)
                curveToRelative(0.196f, 0.448f, -0.038f, 0.97f, -0.492f, 1.15f)
                lineToRelative(-1.419f, 0.516f)
                lineToRelative(-0.019f, 0.534f)
                curveToRelative(-0.004f, 0.375f, -0.299f, 0.682f, -0.673f, 0.702f)
                lineToRelative(-2.147f, 0.649f)
                curveToRelative(-0.551f, 1.557f, 0.477f, 6.576f, -0.861f, 10.103f)
                curveToRelative(0.525f, -0.635f, 2.855f, -3.178f, 6.181f, -3.252f)
                curveToRelative(2.102f, -0.045f, 4.123f, 1.923f, 4.169f, 1.968f)
                curveToRelative(0.196f, 0.201f, 0.456f, 0.302f, 0.716f, 0.302f)
                curveToRelative(0.252f, 0.0f, 0.503f, -0.095f, 0.697f, -0.283f)
                curveToRelative(0.396f, -0.386f, 0.404f, -1.019f, 0.02f, -1.414f)
                curveToRelative(-0.047f, -0.049f, -0.579f, -0.595f, -1.426f, -1.171f)
                curveToRelative(0.884f, -0.724f, 2.059f, -1.425f, 3.324f, -1.425f)
                curveToRelative(0.446f, 0.0f, 0.884f, 0.023f, 1.297f, 0.058f)
                curveToRelative(1.537f, 0.133f, 2.703f, 1.444f, 2.703f, 2.986f)
                verticalLineToRelative(6.05f)
                close()
            }
        }
        .build()
        return _muscle!!
    }

private var _muscle: ImageVector? = null
