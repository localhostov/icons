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

public val Icons.Outline.LaughBeam: ImageVector
    get() {
        if (_laughBeam != null) {
            return _laughBeam!!
        }
        _laughBeam = Builder(name = "LaughBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveTo(5.0f, 9.108f, 6.232f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveToRelative(3.0f, 2.108f, 3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, -0.679f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveTo(7.0f, 9.946f, 7.0f, 11.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveToRelative(-1.768f, 0.0f, -3.0f, 2.108f, -3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, 0.679f, -2.0f, 1.0f, -2.0f)
                reflectiveCurveToRelative(1.0f, 0.946f, 1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                curveTo(19.0f, 9.108f, 17.768f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(15.99f, 14.0f)
                lineTo(8.009f, 14.0f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, -0.955f, 1.3f)
                arcToRelative(5.178f, 5.178f, 0.0f, false, false, 9.9f, -0.007f)
                arcTo(0.994f, 0.994f, 0.0f, false, false, 15.99f, 14.0f)
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
            }
        }
        .build()
        return _laughBeam!!
    }

private var _laughBeam: ImageVector? = null
