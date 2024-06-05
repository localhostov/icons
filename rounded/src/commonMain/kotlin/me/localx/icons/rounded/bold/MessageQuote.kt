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

public val Icons.Bold.MessageQuote: ImageVector
    get() {
        if (_messageQuote != null) {
            return _messageQuote!!
        }
        _messageQuote = Builder(name = "MessageQuote", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.24f)
                lineToRelative(3.599f, 3.03f)
                curveToRelative(0.479f, 0.426f, 1.08f, 0.636f, 1.675f, 0.636f)
                curveToRelative(0.582f, 0.0f, 1.158f, -0.202f, 1.606f, -0.601f)
                lineToRelative(3.708f, -3.065f)
                horizontalLineToRelative(1.172f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 14.5f)
                curveToRelative(0.0f, 1.379f, -1.121f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.712f)
                curveToRelative(-0.349f, 0.0f, -0.687f, 0.122f, -0.956f, 0.344f)
                lineToRelative(-3.828f, 3.167f)
                lineToRelative(-3.75f, -3.158f)
                curveToRelative(-0.27f, -0.228f, -0.612f, -0.353f, -0.966f, -0.353f)
                horizontalLineToRelative(-1.788f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(3.0f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(18.0f, 7.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.924f, -1.347f, 3.594f, -3.202f, 3.97f)
                curveToRelative(-0.101f, 0.021f, -0.2f, 0.03f, -0.3f, 0.03f)
                curveToRelative(-0.698f, 0.0f, -1.324f, -0.49f, -1.468f, -1.202f)
                curveToRelative(-0.165f, -0.812f, 0.359f, -1.604f, 1.172f, -1.768f)
                curveToRelative(0.447f, -0.091f, 0.798f, -0.544f, 0.798f, -1.03f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(11.0f, 7.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.924f, -1.347f, 3.594f, -3.202f, 3.97f)
                curveToRelative(-0.101f, 0.021f, -0.2f, 0.03f, -0.3f, 0.03f)
                curveToRelative(-0.698f, 0.0f, -1.324f, -0.49f, -1.468f, -1.202f)
                curveToRelative(-0.165f, -0.812f, 0.359f, -1.604f, 1.172f, -1.768f)
                curveToRelative(0.447f, -0.091f, 0.798f, -0.544f, 0.798f, -1.03f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _messageQuote!!
    }

private var _messageQuote: ImageVector? = null
