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

public val Icons.Bold.BellNotificationSocialMedia: ImageVector
    get() {
        if (_bellNotificationSocialMedia != null) {
            return _bellNotificationSocialMedia!!
        }
        _bellNotificationSocialMedia = Builder(name = "BellNotificationSocialMedia", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.63f, 16.862f)
                lineToRelative(-2.03f, -7.973f)
                curveToRelative(-0.356f, 0.073f, -0.723f, 0.111f, -1.1f, 0.111f)
                curveToRelative(-0.733f, 0.0f, -1.431f, -0.147f, -2.072f, -0.408f)
                lineToRelative(2.14f, 8.408f)
                lineTo(3.419f, 17.0f)
                lineToRelative(2.291f, -8.955f)
                curveToRelative(0.66f, -2.971f, 3.247f, -5.045f, 6.29f, -5.045f)
                curveToRelative(1.076f, 0.0f, 2.105f, 0.27f, 3.013f, 0.748f)
                curveToRelative(-0.004f, -0.083f, -0.013f, -0.164f, -0.013f, -0.248f)
                curveToRelative(0.0f, -0.993f, 0.269f, -1.923f, 0.731f, -2.729f)
                curveToRelative(-1.154f, -0.498f, -2.419f, -0.771f, -3.731f, -0.771f)
                curveTo(7.54f, 0.0f, 3.75f, 3.041f, 2.793f, 7.348f)
                lineTo(0.321f, 17.011f)
                curveToRelative(-0.153f, 0.702f, 0.035f, 1.47f, 0.503f, 2.053f)
                curveToRelative(0.478f, 0.596f, 1.188f, 0.937f, 1.951f, 0.937f)
                horizontalLineToRelative(4.142f)
                curveToRelative(0.563f, 2.293f, 2.617f, 4.0f, 5.084f, 4.0f)
                reflectiveCurveToRelative(4.521f, -1.707f, 5.084f, -4.0f)
                horizontalLineToRelative(4.128f)
                curveToRelative(0.789f, 0.0f, 1.515f, -0.36f, 1.99f, -0.986f)
                curveToRelative(0.407f, -0.535f, 0.562f, -1.193f, 0.472f, -1.846f)
                curveToRelative(-0.004f, -0.101f, -0.019f, -0.204f, -0.045f, -0.306f)
                close()
                moveTo(17.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _bellNotificationSocialMedia!!
    }

private var _bellNotificationSocialMedia: ImageVector? = null
