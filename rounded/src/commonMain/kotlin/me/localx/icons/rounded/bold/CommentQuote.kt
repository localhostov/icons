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

public val Icons.Bold.CommentQuote: ImageVector
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
                curveToRelative(0.0f, 1.924f, -1.347f, 3.594f, -3.202f, 3.97f)
                curveToRelative(-0.101f, 0.021f, -0.201f, 0.03f, -0.3f, 0.03f)
                curveToRelative(-0.699f, 0.0f, -1.324f, -0.49f, -1.469f, -1.202f)
                curveToRelative(-0.165f, -0.812f, 0.36f, -1.604f, 1.172f, -1.768f)
                curveToRelative(0.448f, -0.091f, 0.798f, -0.544f, 0.798f, -1.03f)
                horizontalLineToRelative(-0.5f)
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
                horizontalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.486f, -0.351f, 0.939f, -0.798f, 1.03f)
                curveToRelative(-0.812f, 0.164f, -1.337f, 0.956f, -1.172f, 1.768f)
                curveToRelative(0.144f, 0.712f, 0.77f, 1.202f, 1.468f, 1.202f)
                curveToRelative(0.1f, 0.0f, 0.199f, -0.01f, 0.3f, -0.03f)
                curveToRelative(1.855f, -0.376f, 3.202f, -2.046f, 3.202f, -3.97f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 12.324f)
                verticalLineToRelative(6.357f)
                curveToRelative(0.0f, 2.933f, -2.386f, 5.318f, -5.318f, 5.318f)
                horizontalLineToRelative(-5.647f)
                curveTo(6.061f, 24.0f, 0.47f, 19.208f, 0.029f, 12.853f)
                curveTo(-0.211f, 9.378f, 1.056f, 5.977f, 3.508f, 3.521f)
                curveTo(5.961f, 1.066f, 9.365f, -0.219f, 12.835f, 0.029f)
                curveToRelative(6.261f, 0.424f, 11.165f, 5.825f, 11.165f, 12.295f)
                close()
                moveTo(21.0f, 12.324f)
                curveToRelative(0.0f, -4.898f, -3.676f, -8.984f, -8.368f, -9.303f)
                curveToRelative(-0.206f, -0.014f, -0.412f, -0.021f, -0.617f, -0.021f)
                curveToRelative(-2.392f, 0.0f, -4.689f, 0.943f, -6.383f, 2.64f)
                curveToRelative(-1.839f, 1.842f, -2.79f, 4.395f, -2.609f, 7.005f)
                curveToRelative(0.335f, 4.841f, 4.546f, 8.354f, 10.012f, 8.354f)
                horizontalLineToRelative(5.647f)
                curveToRelative(1.278f, 0.0f, 2.318f, -1.04f, 2.318f, -2.318f)
                verticalLineToRelative(-6.357f)
                close()
            }
        }
        .build()
        return _commentQuote!!
    }

private var _commentQuote: ImageVector? = null
