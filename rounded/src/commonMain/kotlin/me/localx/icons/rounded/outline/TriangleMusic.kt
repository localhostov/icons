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

public val Icons.Outline.TriangleMusic: ImageVector
    get() {
        if (_triangleMusic != null) {
            return _triangleMusic!!
        }
        _triangleMusic = Builder(name = "TriangleMusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 13.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0.0f, -0.83f, -0.29f, -1.593f, -0.775f, -2.193f)
                lineToRelative(6.627f, -10.783f)
                curveToRelative(0.289f, -0.471f, 0.142f, -1.086f, -0.329f, -1.375f)
                curveToRelative(-0.47f, -0.29f, -1.086f, -0.144f, -1.375f, 0.328f)
                lineToRelative(-6.571f, 10.693f)
                curveToRelative(-0.339f, -0.11f, -0.701f, -0.17f, -1.077f, -0.17f)
                close()
                moveTo(12.5f, 18.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(23.3f, 17.022f)
                lineToRelative(-2.928f, -4.562f)
                curveToRelative(-0.299f, -0.465f, -0.917f, -0.6f, -1.382f, -0.302f)
                curveToRelative(-0.465f, 0.299f, -0.6f, 0.917f, -0.302f, 1.382f)
                lineToRelative(2.92f, 4.55f)
                curveToRelative(0.498f, 0.802f, 0.521f, 1.771f, 0.063f, 2.596f)
                curveToRelative(-0.458f, 0.824f, -1.294f, 1.316f, -2.237f, 1.316f)
                lineTo(4.566f, 22.002f)
                curveToRelative(-0.943f, 0.0f, -1.779f, -0.492f, -2.237f, -1.316f)
                curveToRelative(-0.458f, -0.824f, -0.435f, -1.794f, 0.055f, -2.583f)
                lineToRelative(7.772f, -12.111f)
                curveToRelative(0.412f, -0.624f, 1.097f, -0.983f, 1.843f, -0.991f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.002f, 0.0f, 0.003f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.745f, 0.008f, 1.431f, 0.368f, 1.843f, 0.991f)
                curveToRelative(0.305f, 0.461f, 0.926f, 0.587f, 1.385f, 0.284f)
                curveToRelative(0.461f, -0.305f, 0.588f, -0.925f, 0.284f, -1.386f)
                curveToRelative(-0.593f, -0.899f, -1.493f, -1.522f, -2.513f, -1.771f)
                lineTo(13.001f, 1.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(2.119f)
                curveToRelative(-1.02f, 0.249f, -1.922f, 0.874f, -2.521f, 1.781f)
                lineTo(0.692f, 17.035f)
                curveToRelative(-0.886f, 1.427f, -0.928f, 3.154f, -0.112f, 4.623f)
                curveToRelative(0.816f, 1.468f, 2.306f, 2.344f, 3.985f, 2.344f)
                horizontalLineToRelative(14.868f)
                curveToRelative(1.68f, 0.0f, 3.169f, -0.876f, 3.985f, -2.344f)
                curveToRelative(0.816f, -1.469f, 0.774f, -3.196f, -0.12f, -4.636f)
                close()
                moveTo(12.0f, 5.0f)
                reflectiveCurveToRelative(0.003f, 0.0f, 0.002f, 0.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, -0.002f, 0.0f)
                reflectiveCurveToRelative(-0.001f, 0.0f, -0.002f, 0.0f)
                curveToRelative(-0.001f, 0.0f, -0.001f, 0.0f, 0.002f, 0.0f)
                close()
            }
        }
        .build()
        return _triangleMusic!!
    }

private var _triangleMusic: ImageVector? = null
