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

public val Icons.Bold.CircleD: ImageVector
    get() {
        if (_circleD != null) {
            return _circleD!!
        }
        _circleD = Builder(name = "CircleD", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(11.75f, 5.75f)
                horizontalLineToRelative(-1.25f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.25f)
                curveToRelative(3.446f, 0.0f, 6.25f, -2.804f, 6.25f, -6.25f)
                reflectiveCurveToRelative(-2.804f, -6.25f, -6.25f, -6.25f)
                close()
                moveTo(11.75f, 15.25f)
                horizontalLineToRelative(-1.25f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.25f)
                curveToRelative(1.792f, 0.0f, 3.25f, 1.458f, 3.25f, 3.25f)
                reflectiveCurveToRelative(-1.458f, 3.25f, -3.25f, 3.25f)
                close()
            }
        }
        .build()
        return _circleD!!
    }

private var _circleD: ImageVector? = null
