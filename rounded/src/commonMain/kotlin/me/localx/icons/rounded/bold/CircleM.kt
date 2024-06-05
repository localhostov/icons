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

public val Icons.Bold.CircleM: ImageVector
    get() {
        if (_circleM != null) {
            return _circleM!!
        }
        _circleM = Builder(name = "CircleM", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
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
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(18.0f, 8.651f)
                verticalLineToRelative(7.599f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-4.899f)
                lineToRelative(-1.706f, 2.911f)
                curveToRelative(-0.269f, 0.459f, -0.762f, 0.741f, -1.294f, 0.741f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(-0.535f, -0.002f, -1.028f, -0.289f, -1.294f, -0.752f)
                lineToRelative(-1.7f, -2.954f)
                verticalLineToRelative(4.953f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-7.443f)
                curveToRelative(0.0f, -1.241f, 0.723f, -2.246f, 1.799f, -2.5f)
                curveToRelative(1.009f, -0.236f, 2.031f, 0.289f, 2.542f, 1.312f)
                lineToRelative(1.669f, 2.898f)
                lineToRelative(1.695f, -2.892f)
                curveToRelative(0.496f, -0.999f, 1.566f, -1.564f, 2.605f, -1.318f)
                curveToRelative(1.01f, 0.238f, 1.688f, 1.181f, 1.688f, 2.345f)
                close()
            }
        }
        .build()
        return _circleM!!
    }

private var _circleM: ImageVector? = null
