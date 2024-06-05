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

public val Icons.Bold.FaceSunglasses: ImageVector
    get() {
        if (_faceSunglasses != null) {
            return _faceSunglasses!!
        }
        _faceSunglasses = Builder(name = "FaceSunglasses", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(3.114f, 0.0f, 5.862f, 1.59f, 7.478f, 4.0f)
                horizontalLineToRelative(-3.831f)
                curveToRelative(-0.98f, 0.0f, -1.913f, 0.367f, -2.653f, 1.0f)
                horizontalLineToRelative(-1.988f)
                curveToRelative(-0.74f, -0.633f, -1.673f, -1.0f, -2.653f, -1.0f)
                horizontalLineToRelative(-3.831f)
                curveToRelative(1.617f, -2.41f, 4.365f, -4.0f, 7.478f, -4.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.861f, 0.0f, -8.823f, -3.875f, -8.985f, -8.697f)
                curveToRelative(0.598f, 0.435f, 1.325f, 0.697f, 2.109f, 0.697f)
                horizontalLineToRelative(2.115f)
                curveToRelative(1.387f, 0.0f, 2.615f, -0.798f, 3.214f, -2.0f)
                horizontalLineToRelative(3.094f)
                curveToRelative(0.599f, 1.202f, 1.827f, 2.0f, 3.214f, 2.0f)
                horizontalLineToRelative(2.115f)
                curveToRelative(0.784f, 0.0f, 1.511f, -0.262f, 2.109f, -0.697f)
                curveToRelative(-0.162f, 4.821f, -4.124f, 8.697f, -8.985f, 8.697f)
                close()
                moveTo(16.742f, 15.66f)
                curveToRelative(0.465f, 0.686f, 0.284f, 1.619f, -0.401f, 2.083f)
                curveToRelative(-1.182f, 0.799f, -2.764f, 1.257f, -4.341f, 1.257f)
                reflectiveCurveToRelative(-3.159f, -0.458f, -4.341f, -1.257f)
                curveToRelative(-0.686f, -0.464f, -0.866f, -1.397f, -0.401f, -2.083f)
                curveToRelative(0.465f, -0.687f, 1.399f, -0.864f, 2.083f, -0.402f)
                curveToRelative(1.373f, 0.931f, 3.945f, 0.931f, 5.318f, 0.0f)
                curveToRelative(0.686f, -0.464f, 1.618f, -0.285f, 2.083f, 0.402f)
                close()
            }
        }
        .build()
        return _faceSunglasses!!
    }

private var _faceSunglasses: ImageVector? = null
