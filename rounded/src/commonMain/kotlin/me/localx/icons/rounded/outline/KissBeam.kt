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

public val Icons.Outline.KissBeam: ImageVector
    get() {
        if (_kissBeam != null) {
            return _kissBeam!!
        }
        _kissBeam = Builder(name = "KissBeam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.5f, -1.248f, 21.5f, -1.244f, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(9.0f, 10.0f)
                curveToRelative(0.0f, -1.054f, -0.68f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveTo(5.0f, 8.108f, 6.232f, 6.0f, 8.0f, 6.0f)
                reflectiveCurveToRelative(3.0f, 2.108f, 3.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 10.0f)
                close()
                moveTo(19.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveToRelative(0.0f, -1.054f, -0.68f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                curveTo(13.248f, 4.715f, 18.753f, 4.718f, 19.0f, 10.0f)
                close()
                moveTo(15.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 12.0f)
                lineTo(10.769f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(12.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(12.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(10.769f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(12.5f, 20.0f)
                arcToRelative(2.507f, 2.507f, 0.0f, false, false, 1.987f, -4.0f)
                arcTo(2.471f, 2.471f, 0.0f, false, false, 15.0f, 14.5f)
                close()
            }
        }
        .build()
        return _kissBeam!!
    }

private var _kissBeam: ImageVector? = null
