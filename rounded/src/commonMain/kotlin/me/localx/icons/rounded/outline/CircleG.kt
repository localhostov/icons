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

public val Icons.Outline.CircleG: ImageVector
    get() {
        if (_circleG != null) {
            return _circleG!!
        }
        _circleG = Builder(name = "CircleG", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.039f, 0.019f)
                curveTo(5.422f, 0.019f, 0.039f, 5.402f, 0.039f, 12.019f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.384f, 12.0f, -12.0f)
                reflectiveCurveTo(18.655f, 0.019f, 12.039f, 0.019f)
                close()
                moveTo(12.039f, 22.019f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.524f, 2.019f, 12.039f, 2.019f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(16.67f, 12.888f)
                curveToRelative(0.376f, 0.531f, 0.471f, 1.184f, 0.258f, 1.789f)
                curveToRelative(-0.72f, 2.048f, -2.822f, 3.592f, -4.889f, 3.592f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                curveToRelative(1.434f, 0.0f, 2.8f, 0.617f, 3.75f, 1.693f)
                curveToRelative(0.365f, 0.414f, 0.326f, 1.046f, -0.088f, 1.412f)
                curveToRelative(-0.414f, 0.365f, -1.047f, 0.326f, -1.412f, -0.088f)
                curveToRelative(-0.57f, -0.646f, -1.39f, -1.016f, -2.25f, -1.016f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.218f, 0.0f, 2.565f, -1.012f, 3.002f, -2.255f)
                lineToRelative(-2.002f, 0.005f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.953f)
                curveToRelative(0.665f, 0.0f, 1.292f, 0.325f, 1.678f, 0.869f)
                close()
            }
        }
        .build()
        return _circleG!!
    }

private var _circleG: ImageVector? = null
