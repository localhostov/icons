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

public val Icons.Filled.EarthAsia: ImageVector
    get() {
        if (_earthAsia != null) {
            return _earthAsia!!
        }
        _earthAsia = Builder(name = "EarthAsia", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.0f, 6.5f)
                lineToRelative(-1.154f, 2.769f)
                lineToRelative(-1.846f, -0.769f)
                lineToRelative(1.615f, -2.577f)
                lineToRelative(1.385f, 0.577f)
                close()
                moveTo(10.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.0f, 0.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(8.0f, 15.0f)
                lineToRelative(-2.0f, -2.5f)
                lineToRelative(-2.0f, 1.5f)
                horizontalLineToRelative(-1.799f)
                curveToRelative(-0.132f, -0.646f, -0.201f, -1.315f, -0.201f, -2.0f)
                curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                curveToRelative(1.124f, 0.0f, 2.205f, 0.187f, 3.214f, 0.53f)
                curveToRelative(-0.643f, 1.328f, -1.214f, 2.47f, -1.214f, 2.47f)
                lineToRelative(-2.0f, 0.5f)
                lineToRelative(-0.5f, 1.5f)
                lineToRelative(1.5f, 2.0f)
                lineToRelative(-1.5f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(0.5f, 3.0f)
                lineToRelative(-2.0f, 1.0f)
                close()
                moveTo(12.061f, 16.0f)
                lineToRelative(-1.061f, -1.061f)
                lineToRelative(1.768f, -2.475f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.121f, 2.121f)
                close()
                moveTo(18.73f, 19.39f)
                lineToRelative(-2.73f, -0.39f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.5f, -0.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.784f, 1.07f)
                curveToRelative(-0.441f, 2.086f, -1.533f, 3.934f, -3.054f, 5.32f)
                close()
            }
        }
        .build()
        return _earthAsia!!
    }

private var _earthAsia: ImageVector? = null
