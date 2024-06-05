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

public val Icons.Filled.EarthAmericas: ImageVector
    get() {
        if (_earthAmericas != null) {
            return _earthAmericas!!
        }
        _earthAmericas = Builder(name = "EarthAmericas", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.369f, 0.0f, -0.025f, 5.383f, -0.025f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.603f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-2.096f, -2.203f)
                curveToRelative(1.595f, -3.42f, 5.072f, -5.797f, 9.096f, -5.797f)
                curveToRelative(0.207f, 0.0f, 0.412f, 0.007f, 0.616f, 0.02f)
                curveToRelative(-0.878f, 1.333f, -1.616f, 2.48f, -1.616f, 2.48f)
                lineToRelative(1.5f, 2.5f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(4.0f, 2.5f)
                lineToRelative(-3.0f, 6.5f)
                close()
                moveTo(19.0f, 12.0f)
                lineToRelative(-1.0f, -4.0f)
                lineToRelative(2.401f, -1.386f)
                curveToRelative(0.996f, 1.555f, 1.573f, 3.404f, 1.573f, 5.386f)
                curveToRelative(0.0f, 0.484f, -0.035f, 0.96f, -0.102f, 1.426f)
                lineToRelative(-2.872f, -1.426f)
                close()
            }
        }
        .build()
        return _earthAmericas!!
    }

private var _earthAmericas: ImageVector? = null
