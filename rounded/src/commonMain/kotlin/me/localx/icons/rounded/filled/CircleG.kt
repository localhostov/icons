package me.localx.icons.rounded.filled

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

public val Icons.Filled.CircleG: ImageVector
    get() {
        if (_circleG != null) {
            return _circleG!!
        }
        _circleG = Builder(name = "CircleG", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(16.889f, 14.659f)
                curveToRelative(-0.72f, 2.047f, -2.822f, 3.591f, -4.889f, 3.591f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                curveToRelative(1.434f, 0.0f, 2.8f, 0.617f, 3.75f, 1.693f)
                curveToRelative(0.365f, 0.414f, 0.326f, 1.046f, -0.088f, 1.412f)
                curveToRelative(-0.414f, 0.365f, -1.046f, 0.326f, -1.412f, -0.088f)
                curveToRelative(-0.57f, -0.646f, -1.39f, -1.016f, -2.25f, -1.016f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.218f, 0.0f, 2.565f, -1.012f, 3.002f, -2.255f)
                lineToRelative(-2.002f, 0.005f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.954f)
                curveToRelative(0.665f, 0.0f, 1.292f, 0.325f, 1.678f, 0.87f)
                curveToRelative(0.377f, 0.532f, 0.471f, 1.184f, 0.258f, 1.79f)
                close()
            }
        }
        .build()
        return _circleG!!
    }

private var _circleG: ImageVector? = null
