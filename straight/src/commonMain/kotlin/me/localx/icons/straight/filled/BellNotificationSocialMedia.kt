package me.localx.icons.straight.filled

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
                moveTo(20.74f, 8.988f)
                curveToRelative(-0.08f, 0.003f, -0.159f, 0.012f, -0.24f, 0.012f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                curveToRelative(0.0f, -0.904f, 0.223f, -1.756f, 0.612f, -2.509f)
                curveToRelative(-1.182f, -0.635f, -2.526f, -0.991f, -3.936f, -0.991f)
                curveTo(7.775f, 0.0f, 4.398f, 2.709f, 3.552f, 6.516f)
                lineToRelative(-2.35f, 7.597f)
                curveToRelative(-0.597f, 1.93f, 0.846f, 3.886f, 2.866f, 3.886f)
                horizontalLineToRelative(15.656f)
                curveToRelative(2.08f, 0.0f, 3.529f, -2.065f, 2.821f, -4.021f)
                lineToRelative(-1.806f, -4.992f)
                close()
            }
        }
        .build()
        return _bellNotificationSocialMedia!!
    }

private var _bellNotificationSocialMedia: ImageVector? = null
