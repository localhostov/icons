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

public val Icons.Filled.CarJourney: ImageVector
    get() {
        if (_carJourney != null) {
            return _carJourney!!
        }
        _carJourney = Builder(name = "CarJourney", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(4.0f, 2.5f)
                lineToRelative(-4.0f, 2.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(12.0f, 20.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.018f)
                curveToRelative(0.012f, 0.082f, 0.018f, 0.165f, 0.018f, 0.25f)
                curveToRelative(0.0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
                reflectiveCurveToRelative(-1.75f, -0.784f, -1.75f, -1.75f)
                curveToRelative(0.0f, -0.085f, 0.006f, -0.168f, 0.018f, -0.25f)
                horizontalLineToRelative(-2.036f)
                curveToRelative(0.012f, 0.082f, 0.018f, 0.165f, 0.018f, 0.25f)
                curveToRelative(0.0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
                reflectiveCurveToRelative(-1.75f, -0.784f, -1.75f, -1.75f)
                curveToRelative(0.0f, -0.085f, 0.006f, -0.168f, 0.018f, -0.25f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.197f)
                curveToRelative(0.838f, 0.0f, 1.615f, 0.416f, 2.08f, 1.113f)
                lineToRelative(1.924f, 2.887f)
                horizontalLineToRelative(0.798f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(2.0f, 19.0f)
                horizontalLineToRelative(5.298f)
                lineToRelative(-1.185f, -1.777f)
                curveToRelative(-0.093f, -0.14f, -0.249f, -0.223f, -0.416f, -0.223f)
                horizontalLineToRelative(-3.197f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _carJourney!!
    }

private var _carJourney: ImageVector? = null
