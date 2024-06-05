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
                horizontalLineToRelative(-3.831f)
                curveToRelative(-0.98f, 0.0f, -1.913f, 0.367f, -2.653f, 1.0f)
                horizontalLineToRelative(-1.988f)
                curveToRelative(-0.74f, -0.633f, -1.673f, -1.0f, -2.653f, -1.0f)
                horizontalLineToRelative(-3.831f)
                curveToRelative(1.617f, -2.41f, 4.365f, -4.0f, 7.478f, -4.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.86f, 0.0f, -8.823f, -3.875f, -8.985f, -8.697f)
                curveToRelative(0.598f, 0.435f, 1.325f, 0.697f, 2.109f, 0.697f)
                horizontalLineToRelative(2.115f)
                curveToRelative(1.387f, 0.0f, 2.615f, -0.798f, 3.214f, -2.0f)
                horizontalLineToRelative(3.094f)
                curveToRelative(0.599f, 1.202f, 1.827f, 2.0f, 3.214f, 2.0f)
                horizontalLineToRelative(2.115f)
                curveToRelative(0.784f, 0.0f, 1.511f, -0.262f, 2.109f, -0.697f)
                curveToRelative(-0.162f, 4.822f, -4.125f, 8.697f, -8.985f, 8.697f)
                close()
                moveTo(17.234f, 14.394f)
                curveToRelative(0.611f, 0.559f, 0.653f, 1.508f, 0.094f, 2.119f)
                curveToRelative(-2.276f, 2.487f, -4.856f, 2.487f, -5.828f, 2.487f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.78f, 0.0f, 2.231f, 0.0f, 3.615f, -1.513f)
                curveToRelative(0.558f, -0.61f, 1.507f, -0.653f, 2.119f, -0.094f)
                close()
            }
        }
        .build()
        return _faceSunglassesAlt!!
    }

private var _faceSunglassesAlt: ImageVector? = null
