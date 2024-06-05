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

public val Icons.Outline.Mistletoe: ImageVector
    get() {
        if (_mistletoe != null) {
            return _mistletoe!!
        }
        _mistletoe = Builder(name = "Mistletoe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.632f, 10.652f)
                curveToRelative(1.394f, -0.626f, 2.368f, -2.027f, 2.368f, -3.652f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-1.345f, 0.0f, -2.537f, 0.667f, -3.262f, 1.688f)
                curveTo(10.224f, 2.05f, 7.089f, 0.0f, 1.0f, 0.0f)
                curveTo(0.448f, 0.0f, 0.0f, 0.448f, 0.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                curveToRelative(3.833f, 0.0f, 6.217f, 0.835f, 7.689f, 2.06f)
                curveToRelative(-0.224f, -0.039f, -0.454f, -0.06f, -0.689f, -0.06f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.445f, 0.771f, 2.714f, 1.923f, 3.417f)
                curveTo(2.967f, 13.135f, 0.0f, 15.884f, 0.0f, 20.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -4.918f, 2.787f, -7.751f, 3.997f, -8.75f)
                curveToRelative(1.2f, 1.0f, 4.003f, 3.86f, 4.003f, 8.75f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -4.794f, -4.024f, -7.733f, -7.368f, -9.348f)
                close()
                moveTo(15.0f, 5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(8.0f, 6.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(6.0f, 20.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                curveToRelative(0.0f, -3.727f, 3.377f, -6.151f, 6.252f, -7.54f)
                curveToRelative(-1.189f, 1.767f, -2.252f, 4.263f, -2.252f, 7.54f)
                close()
                moveTo(20.0f, 22.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                curveToRelative(0.0f, -3.277f, -1.063f, -5.773f, -2.252f, -7.54f)
                curveToRelative(2.875f, 1.389f, 6.252f, 3.813f, 6.252f, 7.54f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _mistletoe!!
    }

private var _mistletoe: ImageVector? = null
