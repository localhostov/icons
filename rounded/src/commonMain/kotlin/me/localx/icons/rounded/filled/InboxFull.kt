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

public val Icons.Filled.InboxFull: ImageVector
    get() {
        if (_inboxFull != null) {
            return _inboxFull!!
        }
        _inboxFull = Builder(name = "InboxFull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 14.0f)
                curveToRelative(1.091f, 0.0f, 1.98f, 0.877f, 2.0f, 1.963f)
                curveToRelative(0.02f, 1.105f, 0.807f, 2.037f, 1.912f, 2.037f)
                horizontalLineToRelative(4.176f)
                curveToRelative(1.106f, 0.0f, 1.892f, -0.931f, 1.912f, -2.037f)
                curveToRelative(0.02f, -1.086f, 0.909f, -1.963f, 2.0f, -1.963f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, -1.056f, -0.091f, -2.109f, -0.272f, -3.149f)
                lineToRelative(-1.166f, -6.708f)
                curveToRelative(-0.416f, -2.395f, -2.495f, -4.143f, -4.926f, -4.143f)
                lineTo(6.364f, -0.0f)
                curveTo(3.933f, 0.0f, 1.854f, 1.748f, 1.438f, 4.143f)
                lineTo(0.272f, 10.85f)
                curveToRelative(-0.181f, 1.04f, -0.272f, 2.094f, -0.272f, 3.15f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(6.0f, 0.0f, 6.0f, 0.0f)
                close()
                moveTo(5.24f, 4.0f)
                horizontalLineToRelative(13.523f)
                curveToRelative(0.482f, 0.0f, 0.896f, 0.344f, 0.984f, 0.819f)
                curveToRelative(0.113f, 0.614f, -0.359f, 1.181f, -0.984f, 1.181f)
                lineTo(5.24f, 6.0f)
                curveToRelative(-0.625f, 0.0f, -1.097f, -0.567f, -0.983f, -1.182f)
                curveToRelative(0.088f, -0.474f, 0.501f, -0.818f, 0.983f, -0.818f)
                close()
                moveTo(4.5f, 8.0f)
                horizontalLineToRelative(14.999f)
                curveToRelative(0.482f, 0.0f, 0.896f, 0.344f, 0.984f, 0.819f)
                curveToRelative(0.113f, 0.614f, -0.359f, 1.181f, -0.984f, 1.181f)
                lineTo(4.5f, 10.0f)
                curveToRelative(-0.625f, 0.0f, -1.097f, -0.567f, -0.983f, -1.182f)
                curveToRelative(0.088f, -0.474f, 0.501f, -0.818f, 0.983f, -0.818f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _inboxFull!!
    }

private var _inboxFull: ImageVector? = null
