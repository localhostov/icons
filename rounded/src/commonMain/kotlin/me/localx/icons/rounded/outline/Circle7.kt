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

public val Icons.Outline.Circle7: ImageVector
    get() {
        if (_circle7 != null) {
            return _circle7!!
        }
        _circle7 = Builder(name = "Circle7", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                reflectiveCurveTo(17.514f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.868f, 17.497f)
                lineToRelative(4.921f, -8.603f)
                curveToRelative(0.312f, -0.625f, 0.279f, -1.352f, -0.088f, -1.946f)
                curveToRelative(-0.367f, -0.594f, -1.003f, -0.948f, -1.701f, -0.948f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                lineToRelative(5.026f, -0.05f)
                lineToRelative(-4.895f, 8.553f)
                curveToRelative(-0.274f, 0.479f, -0.108f, 1.091f, 0.372f, 1.365f)
                curveToRelative(0.157f, 0.09f, 0.327f, 0.132f, 0.496f, 0.132f)
                curveToRelative(0.347f, 0.0f, 0.684f, -0.181f, 0.869f, -0.503f)
                close()
            }
        }
        .build()
        return _circle7!!
    }

private var _circle7: ImageVector? = null
