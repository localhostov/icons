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

public val Icons.Filled.TriangleMusic: ImageVector
    get() {
        if (_triangleMusic != null) {
            return _triangleMusic!!
        }
        _triangleMusic = Builder(name = "TriangleMusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.419f, 21.658f)
                curveToRelative(-0.816f, 1.468f, -2.306f, 2.344f, -3.985f, 2.344f)
                lineTo(4.566f, 24.002f)
                curveToRelative(-1.68f, 0.0f, -3.169f, -0.876f, -3.985f, -2.344f)
                curveToRelative(-0.816f, -1.469f, -0.774f, -3.196f, 0.112f, -4.623f)
                lineToRelative(7.787f, -12.135f)
                curveToRelative(0.599f, -0.907f, 1.5f, -1.532f, 2.521f, -1.781f)
                lineTo(11.001f, 1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.119f)
                curveToRelative(1.02f, 0.248f, 1.92f, 0.872f, 2.513f, 1.771f)
                curveToRelative(0.304f, 0.461f, 0.177f, 1.081f, -0.284f, 1.386f)
                curveToRelative(-0.459f, 0.303f, -1.08f, 0.177f, -1.385f, -0.284f)
                curveToRelative(-0.412f, -0.624f, -1.074f, -0.984f, -1.82f, -0.992f)
                curveToRelative(-0.008f, 0.0f, -0.016f, 0.0f, -0.025f, 0.0f)
                reflectiveCurveToRelative(-0.016f, 0.0f, -0.025f, 0.0f)
                curveToRelative(-0.746f, 0.008f, -1.408f, 0.368f, -1.82f, 0.992f)
                lineToRelative(-7.772f, 12.111f)
                curveToRelative(-0.49f, 0.789f, -0.514f, 1.759f, -0.055f, 2.583f)
                curveToRelative(0.458f, 0.824f, 1.294f, 1.316f, 2.237f, 1.316f)
                horizontalLineToRelative(14.868f)
                curveToRelative(0.943f, 0.0f, 1.779f, -0.492f, 2.237f, -1.316f)
                curveToRelative(0.458f, -0.824f, 0.435f, -1.794f, -0.063f, -2.596f)
                lineToRelative(-2.92f, -4.55f)
                curveToRelative(-0.298f, -0.465f, -0.163f, -1.083f, 0.302f, -1.382f)
                curveToRelative(0.464f, -0.298f, 1.083f, -0.163f, 1.382f, 0.302f)
                lineToRelative(2.928f, 4.562f)
                curveToRelative(0.894f, 1.439f, 0.936f, 3.167f, 0.12f, 4.636f)
                close()
                moveTo(13.576f, 13.169f)
                lineToRelative(6.571f, -10.693f)
                curveToRelative(0.289f, -0.472f, 0.906f, -0.618f, 1.375f, -0.328f)
                curveToRelative(0.471f, 0.289f, 0.618f, 0.904f, 0.329f, 1.375f)
                lineToRelative(-6.627f, 10.783f)
                curveToRelative(0.484f, 0.601f, 0.775f, 1.364f, 0.775f, 2.193f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.375f, 0.0f, 0.737f, 0.06f, 1.077f, 0.17f)
                close()
            }
        }
        .build()
        return _triangleMusic!!
    }

private var _triangleMusic: ImageVector? = null
