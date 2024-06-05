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

public val Icons.Filled.GrinBeam: ImageVector
    get() {
        if (_grinBeam != null) {
            return _grinBeam!!
        }
        _grinBeam = Builder(name = "GrinBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(5.0f, 11.0f)
                curveToRelative(0.248f, -5.285f, 5.753f, -5.282f, 6.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 11.0f)
                close()
                moveTo(17.842f, 15.542f)
                arcTo(6.827f, 6.827f, 0.0f, false, true, 12.0f, 19.0f)
                arcToRelative(6.836f, 6.836f, 0.0f, false, true, -5.848f, -3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.2f, 14.024f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 12.0f, 15.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 4.792f, -0.976f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.842f, 15.542f)
                close()
                moveTo(18.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveToRelative(0.0f, -1.892f, 1.232f, -4.0f, 3.0f, -4.0f)
                reflectiveCurveToRelative(3.0f, 2.108f, 3.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _grinBeam!!
    }

private var _grinBeam: ImageVector? = null
