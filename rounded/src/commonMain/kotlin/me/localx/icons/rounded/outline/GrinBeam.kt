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

public val Icons.Outline.GrinBeam: ImageVector
    get() {
        if (_grinBeam != null) {
            return _grinBeam!!
        }
        _grinBeam = Builder(name = "GrinBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                curveTo(5.0f, 9.108f, 6.232f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveToRelative(3.0f, 2.108f, 3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 12.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(-1.768f, 0.0f, -3.0f, 2.108f, -3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, 0.679f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveTo(19.0f, 9.108f, 17.768f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                curveTo(-3.9f, 23.4f, -3.893f, 0.6f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 12.0f, 2.0f)
                curveToRelative(-13.248f, 0.5f, -13.245f, 19.5f, 0.0f, 20.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 22.0f, 12.0f)
                close()
                moveTo(16.789f, 14.024f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 7.2f, 14.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.052f, 1.518f)
                arcTo(6.836f, 6.836f, 0.0f, false, false, 12.0f, 19.0f)
                arcToRelative(6.827f, 6.827f, 0.0f, false, false, 5.842f, -3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.789f, 14.024f)
                close()
            }
        }
        .build()
        return _grinBeam!!
    }

private var _grinBeam: ImageVector? = null
