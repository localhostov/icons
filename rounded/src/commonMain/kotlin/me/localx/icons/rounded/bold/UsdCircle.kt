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

public val Icons.Bold.UsdCircle: ImageVector
    get() {
        if (_usdCircle != null) {
            return _usdCircle!!
        }
        _usdCircle = Builder(name = "UsdCircle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                curveToRelative(0.603f, 15.898f, 23.4f, 15.894f, 24.0f, 0.0f)
                curveToRelative(0.0f, -6.617f, -5.383f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                curveToRelative(0.452f, -11.923f, 17.549f, -11.92f, 18.0f, 0.0f)
                curveToRelative(0.0f, 4.963f, -4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.0f, 14.413f)
                curveToRelative(0.0f, 1.599f, -1.052f, 2.957f, -2.5f, 3.418f)
                verticalLineToRelative(0.669f)
                curveToRelative(-0.034f, 1.972f, -2.966f, 1.971f, -3.0f, 0.0f)
                verticalLineToRelative(-0.579f)
                curveToRelative(-0.955f, -0.206f, -1.799f, -0.807f, -2.299f, -1.67f)
                curveToRelative(-0.414f, -0.717f, -0.169f, -1.635f, 0.548f, -2.05f)
                curveToRelative(0.716f, -0.414f, 1.634f, -0.169f, 2.05f, 0.548f)
                curveToRelative(0.091f, 0.157f, 0.253f, 0.251f, 0.434f, 0.251f)
                horizontalLineToRelative(1.181f)
                curveToRelative(0.629f, 0.018f, 0.809f, -0.917f, 0.218f, -1.132f)
                lineToRelative(-2.376f, -0.95f)
                curveToRelative(-3.11f, -1.155f, -2.884f, -5.845f, 0.245f, -6.749f)
                verticalLineToRelative(-0.669f)
                curveToRelative(0.034f, -1.972f, 2.967f, -1.971f, 3.0f, 0.0f)
                verticalLineToRelative(0.579f)
                curveToRelative(0.955f, 0.206f, 1.799f, 0.807f, 2.299f, 1.67f)
                curveToRelative(0.414f, 0.717f, 0.169f, 1.635f, -0.548f, 2.049f)
                curveToRelative(-0.716f, 0.414f, -1.635f, 0.169f, -2.05f, -0.547f)
                curveToRelative(-0.091f, -0.157f, -0.253f, -0.251f, -0.434f, -0.251f)
                horizontalLineToRelative(-1.181f)
                curveToRelative(-0.629f, -0.018f, -0.809f, 0.917f, -0.218f, 1.132f)
                lineToRelative(2.376f, 0.95f)
                curveToRelative(1.37f, 0.548f, 2.255f, 1.855f, 2.255f, 3.331f)
                close()
            }
        }
        .build()
        return _usdCircle!!
    }

private var _usdCircle: ImageVector? = null
