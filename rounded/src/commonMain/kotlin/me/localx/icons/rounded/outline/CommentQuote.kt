package me.localx.icons.rounded.outline

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

public val Icons.Outline.CommentQuote: ImageVector
    get() {
        if (_commentQuote != null) {
            return _commentQuote!!
        }
        _commentQuote = Builder(name = "CommentQuote", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(16.5f, 8.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 12.34f)
                verticalLineToRelative(6.66f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-5.917f)
                curveTo(6.082f, 24.0f, 0.47f, 19.208f, 0.03f, 12.854f)
                curveTo(-0.211f, 9.378f, 1.057f, 5.977f, 3.509f, 3.521f)
                curveTo(5.96f, 1.066f, 9.364f, -0.202f, 12.836f, 0.028f)
                curveToRelative(6.26f, 0.426f, 11.164f, 5.833f, 11.164f, 12.312f)
                close()
                moveTo(22.0f, 12.34f)
                curveToRelative(0.0f, -5.431f, -4.085f, -9.962f, -9.299f, -10.315f)
                curveToRelative(-0.229f, -0.016f, -0.458f, -0.023f, -0.685f, -0.023f)
                curveToRelative(-2.657f, 0.0f, -5.209f, 1.049f, -7.092f, 2.934f)
                curveToRelative(-2.043f, 2.046f, -3.1f, 4.882f, -2.899f, 7.781f)
                curveToRelative(0.373f, 5.38f, 5.023f, 9.284f, 11.058f, 9.284f)
                horizontalLineToRelative(5.917f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.66f)
                close()
            }
        }
        .build()
        return _commentQuote!!
    }

private var _commentQuote: ImageVector? = null
