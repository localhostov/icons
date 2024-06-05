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

public val Icons.Bold.FaceSunglassesAlt: ImageVector
    get() {
        if (_faceSunglassesAlt != null) {
            return _faceSunglassesAlt!!
        }
        _faceSunglassesAlt = Builder(name = "FaceSunglassesAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(3.113f, 0.0f, 5.862f, 1.59f, 7.478f, 4.0f)
                horizontalLineToRelative(-5.685f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-1.64f)
                lineToRelative(-1.0f, -1.0f)
                horizontalLineToRelative(-5.632f)
                curveToRelative(1.617f, -2.41f, 4.365f, -4.0f, 7.478f, -4.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                curveToRelative(0.0f, -0.14f, 0.015f, -0.276f, 0.021f, -0.415f)
                curveToRelative(0.403f, 0.843f, 1.257f, 1.415f, 2.224f, 1.415f)
                horizontalLineToRelative(3.155f)
                curveToRelative(1.14f, 0.0f, 2.129f, -0.772f, 2.406f, -1.878f)
                lineToRelative(0.03f, -0.122f)
                horizontalLineToRelative(2.272f)
                lineToRelative(0.031f, 0.122f)
                curveToRelative(0.277f, 1.105f, 1.267f, 1.878f, 2.406f, 1.878f)
                horizontalLineToRelative(3.155f)
                curveToRelative(1.005f, 0.0f, 1.892f, -0.614f, 2.273f, -1.513f)
                curveToRelative(0.01f, 0.171f, 0.026f, 0.34f, 0.026f, 0.513f)
                curveToRelative(0.0f, 4.963f, -4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(15.752f, 13.668f)
                lineToRelative(2.496f, 1.664f)
                curveToRelative(-1.623f, 2.434f, -4.061f, 3.668f, -7.248f, 3.668f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.875f, 0.0f, 3.197f, 0.0f, 4.752f, -2.332f)
                close()
            }
        }
        .build()
        return _faceSunglassesAlt!!
    }

private var _faceSunglassesAlt: ImageVector? = null
