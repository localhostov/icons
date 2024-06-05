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

public val Icons.Filled.BellNotificationSocialMedia: ImageVector
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
                moveToRelative(16.899f, 20.0f)
                curveToRelative(-0.465f, 2.279f, -2.485f, 4.0f, -4.899f, 4.0f)
                reflectiveCurveToRelative(-4.435f, -1.721f, -4.899f, -4.0f)
                horizontalLineToRelative(9.799f)
                close()
                moveTo(20.5f, 7.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(20.923f, 8.988f)
                curveToRelative(-0.083f, 0.003f, -0.164f, 0.012f, -0.248f, 0.012f)
                curveToRelative(-3.133f, 0.0f, -5.681f, -2.467f, -5.681f, -5.5f)
                curveToRelative(0.0f, -0.904f, 0.231f, -1.756f, 0.632f, -2.509f)
                curveToRelative(-1.221f, -0.635f, -2.609f, -0.991f, -4.066f, -0.991f)
                curveTo(7.531f, 0.0f, 4.043f, 2.709f, 3.169f, 6.516f)
                lineToRelative(-1.978f, 6.191f)
                curveToRelative(-0.84f, 2.628f, 1.19f, 5.293f, 4.032f, 5.293f)
                horizontalLineToRelative(13.053f)
                curveToRelative(2.926f, 0.0f, 4.964f, -2.812f, 3.968f, -5.475f)
                lineToRelative(-1.322f, -3.537f)
                close()
            }
        }
        .build()
        return _bellNotificationSocialMedia!!
    }

private var _bellNotificationSocialMedia: ImageVector? = null
