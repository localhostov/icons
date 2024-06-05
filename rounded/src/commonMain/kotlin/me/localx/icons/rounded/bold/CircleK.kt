package me.localx.icons.rounded.bold

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

public val Icons.Bold.CircleK: ImageVector
    get() {
        if (_circleK != null) {
            return _circleK!!
        }
        _circleK = Builder(name = "CircleK", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.508f, 15.683f)
                curveToRelative(0.451f, 0.694f, 0.254f, 1.624f, -0.44f, 2.075f)
                curveToRelative(-0.252f, 0.164f, -0.536f, 0.242f, -0.816f, 0.242f)
                curveToRelative(-0.49f, 0.0f, -0.972f, -0.24f, -1.259f, -0.683f)
                lineToRelative(-2.806f, -4.317f)
                horizontalLineToRelative(-1.186f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(7.001f, 7.5f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1.286f)
                lineToRelative(2.8f, -3.446f)
                curveToRelative(0.521f, -0.643f, 1.466f, -0.742f, 2.11f, -0.218f)
                curveToRelative(0.643f, 0.522f, 0.74f, 1.467f, 0.218f, 2.11f)
                lineToRelative(-2.562f, 3.152f)
                lineToRelative(2.655f, 4.084f)
                close()
            }
        }
        .build()
        return _circleK!!
    }

private var _circleK: ImageVector? = null
