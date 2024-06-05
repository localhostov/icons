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

public val Icons.Outline.EarthAsia: ImageVector
    get() {
        if (_earthAsia != null) {
            return _earthAsia!!
        }
        _earthAsia = Builder(name = "EarthAsia", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.0f, 16.0f)
                lineToRelative(3.0f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 14.939f)
                lineToRelative(1.061f, 1.061f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.768f, 2.475f)
                close()
                moveTo(17.0f, 6.5f)
                lineToRelative(-1.385f, -0.577f)
                lineToRelative(-1.615f, 2.577f)
                lineToRelative(1.846f, 0.769f)
                lineToRelative(1.154f, -2.769f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(2.59f, 0.0f, 4.952f, -0.989f, 6.73f, -2.61f)
                lineToRelative(-2.73f, -0.39f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.5f, -0.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.784f, 1.07f)
                curveToRelative(0.141f, -0.668f, 0.216f, -1.361f, 0.216f, -2.07f)
                curveToRelative(0.0f, -4.39f, -2.844f, -8.129f, -6.786f, -9.47f)
                curveToRelative(-0.643f, 1.328f, -1.214f, 2.47f, -1.214f, 2.47f)
                lineToRelative(-2.0f, 0.5f)
                lineToRelative(-0.5f, 1.5f)
                lineToRelative(1.5f, 2.0f)
                lineToRelative(-1.5f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.5f, 3.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(-2.0f, -2.5f)
                lineToRelative(-2.0f, 1.5f)
                horizontalLineToRelative(-1.799f)
                curveToRelative(0.929f, 4.559f, 4.97f, 8.0f, 9.799f, 8.0f)
                close()
            }
        }
        .build()
        return _earthAsia!!
    }

private var _earthAsia: ImageVector? = null
