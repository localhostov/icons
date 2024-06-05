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

public val Icons.Filled.IslandTropical: ImageVector
    get() {
        if (_islandTropical != null) {
            return _islandTropical!!
        }
        _islandTropical = Builder(name = "IslandTropical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                reflectiveCurveToRelative(5.455f, -4.0f, 12.0f, -4.0f)
                reflectiveCurveToRelative(12.0f, 4.0f, 12.0f, 4.0f)
                lineTo(0.0f, 24.0f)
                close()
                moveTo(12.0f, 0.002f)
                reflectiveCurveToRelative(1.483f, 3.596f, 4.796f, 5.809f)
                reflectiveCurveToRelative(7.204f, 2.203f, 7.204f, 2.203f)
                curveToRelative(0.0f, 0.0f, -1.114f, -3.907f, -4.428f, -6.119f)
                curveTo(16.258f, -0.317f, 12.0f, 0.002f, 12.0f, 0.002f)
                curveTo(12.0f, 0.002f, 7.786f, -0.141f, 4.472f, 2.071f)
                curveTo(1.158f, 4.284f, 0.0f, 8.014f, 0.0f, 8.014f)
                curveTo(0.0f, 8.014f, 3.89f, 8.023f, 7.204f, 5.811f)
                reflectiveCurveTo(12.0f, 0.002f, 12.0f, 0.002f)
                moveToRelative(0.0f, 3.902f)
                curveToRelative(-0.884f, 1.19f, -2.101f, 2.512f, -3.686f, 3.57f)
                curveToRelative(-0.427f, 0.285f, -0.862f, 0.535f, -1.298f, 0.76f)
                curveToRelative(-0.081f, 2.041f, 0.747f, 3.766f, 0.747f, 3.766f)
                curveToRelative(0.0f, 0.0f, 3.169f, -1.424f, 4.201f, -4.213f)
                curveToRelative(0.522f, -1.41f, 0.397f, -2.898f, 0.146f, -4.025f)
                curveToRelative(-0.038f, 0.051f, -0.072f, 0.086f, -0.111f, 0.142f)
                close()
                moveTo(11.568f, 18.015f)
                curveToRelative(0.145f, -0.003f, 0.286f, -0.016f, 0.432f, -0.016f)
                curveToRelative(1.599f, 0.0f, 3.127f, 0.219f, 4.546f, 0.551f)
                curveToRelative(0.41f, -2.351f, 0.776f, -5.983f, -0.008f, -9.315f)
                curveToRelative(-0.121f, -0.512f, -0.247f, -0.996f, -0.376f, -1.465f)
                curveToRelative(-0.159f, -0.097f, -0.319f, -0.192f, -0.477f, -0.297f)
                curveToRelative(-0.512f, -0.342f, -0.972f, -0.716f, -1.408f, -1.099f)
                curveToRelative(-0.061f, 0.74f, -0.195f, 1.452f, -0.437f, 2.107f)
                curveToRelative(-0.134f, 0.361f, -0.296f, 0.698f, -0.473f, 1.02f)
                curveToRelative(0.0f, 0.078f, 0.003f, 0.157f, 0.003f, 0.233f)
                curveToRelative(0.0f, 3.037f, -0.937f, 6.095f, -1.803f, 8.281f)
                close()
            }
        }
        .build()
        return _islandTropical!!
    }

private var _islandTropical: ImageVector? = null
