package me.localx.icons.straight.outline

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
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(9.0f, 11.0f)
                curveToRelative(0.0f, -1.054f, -0.68f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                lineTo(5.0f, 11.0f)
                curveTo(5.0f, 9.108f, 6.232f, 7.0f, 8.0f, 7.0f)
                reflectiveCurveTo(11.0f, 9.108f, 11.0f, 11.0f)
                close()
                moveTo(19.0f, 11.0f)
                lineTo(17.0f, 11.0f)
                curveToRelative(0.0f, -1.054f, -0.68f, -2.0f, -1.0f, -2.0f)
                reflectiveCurveToRelative(-1.0f, 0.946f, -1.0f, 2.0f)
                lineTo(13.0f, 11.0f)
                curveToRelative(0.0f, -1.892f, 1.232f, -4.0f, 3.0f, -4.0f)
                reflectiveCurveTo(19.0f, 9.108f, 19.0f, 11.0f)
                close()
                moveTo(15.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.5f, 12.0f)
                lineTo(11.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(12.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(11.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.0f, 17.5f)
                arcToRelative(2.471f, 2.471f, 0.0f, false, false, -0.513f, -1.5f)
                arcTo(2.471f, 2.471f, 0.0f, false, false, 15.0f, 14.5f)
                close()
            }
        }
        .build()
        return _kissBeam!!
    }

private var _kissBeam: ImageVector? = null
