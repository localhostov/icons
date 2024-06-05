package me.localx.icons.straight.bold

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

public val Icons.Bold.EarthAsia: ImageVector
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
                moveTo(12.0f, 21.0f)
                curveToRelative(2.022f, 0.0f, 3.891f, -0.671f, 5.395f, -1.801f)
                lineToRelative(-1.395f, -0.199f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.5f, -0.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(0.871f, 0.522f)
                curveToRelative(0.085f, -0.495f, 0.129f, -1.004f, 0.129f, -1.522f)
                curveToRelative(0.0f, -3.996f, -2.618f, -7.391f, -6.228f, -8.563f)
                curveToRelative(-0.441f, 0.901f, -0.772f, 1.563f, -0.772f, 1.563f)
                lineToRelative(-2.0f, 0.5f)
                lineToRelative(-0.5f, 1.5f)
                lineToRelative(1.5f, 2.0f)
                lineToRelative(-1.5f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.5f, 3.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(-2.0f, -2.5f)
                lineToRelative(-2.0f, 1.5f)
                horizontalLineToRelative(-0.776f)
                curveToRelative(0.912f, 4.003f, 4.5f, 7.0f, 8.776f, 7.0f)
                close()
            }
        }
        .build()
        return _earthAsia!!
    }

private var _earthAsia: ImageVector? = null
