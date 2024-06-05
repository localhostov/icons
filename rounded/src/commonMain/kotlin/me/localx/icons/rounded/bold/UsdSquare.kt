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

public val Icons.Bold.UsdSquare: ImageVector
    get() {
        if (_usdSquare != null) {
            return _usdSquare!!
        }
        _usdSquare = Builder(name = "UsdSquare", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.467f, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.033f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(13.0f)
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
        return _usdSquare!!
    }

private var _usdSquare: ImageVector? = null
