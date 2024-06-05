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

public val Icons.Bold.CarJourney: ImageVector
    get() {
        if (_carJourney != null) {
            return _carJourney!!
        }
        _carJourney = Builder(name = "CarJourney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.5f, 19.0f)
                horizontalLineToRelative(-0.919f)
                lineToRelative(-1.917f, -3.455f)
                curveToRelative(-0.529f, -0.953f, -1.533f, -1.545f, -2.623f, -1.545f)
                horizontalLineToRelative(-3.541f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1.018f)
                curveToRelative(-0.012f, 0.082f, -0.018f, 0.165f, -0.018f, 0.25f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.784f, 1.75f, -1.75f)
                curveToRelative(0.0f, -0.085f, -0.006f, -0.168f, -0.018f, -0.25f)
                horizontalLineToRelative(3.036f)
                curveToRelative(-0.012f, 0.082f, -0.018f, 0.165f, -0.018f, 0.25f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.784f, 1.75f, -1.75f)
                curveToRelative(0.0f, -0.085f, -0.006f, -0.168f, -0.018f, -0.25f)
                horizontalLineToRelative(2.018f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(3.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.041f)
                lineToRelative(1.109f, 2.0f)
                lineTo(3.0f, 19.0f)
                close()
                moveTo(20.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(4.0f, 2.5f)
                lineToRelative(-4.0f, 2.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(24.0f, 17.5f)
                curveToRelative(0.0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.485f, 0.0f, 4.5f, 2.015f, 4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _carJourney!!
    }

private var _carJourney: ImageVector? = null
