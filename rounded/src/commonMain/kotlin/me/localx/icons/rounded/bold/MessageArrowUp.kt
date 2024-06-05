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

public val Icons.Bold.MessageArrowUp: ImageVector
    get() {
        if (_messageArrowUp != null) {
            return _messageArrowUp!!
        }
        _messageArrowUp = Builder(name = "MessageArrowUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.467f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.241f)
                lineToRelative(3.598f, 3.03f)
                curveToRelative(0.479f, 0.426f, 1.08f, 0.636f, 1.675f, 0.636f)
                curveToRelative(0.583f, 0.0f, 1.158f, -0.201f, 1.606f, -0.601f)
                lineToRelative(3.708f, -3.065f)
                horizontalLineToRelative(1.172f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 14.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.711f)
                curveToRelative(-0.349f, 0.0f, -0.687f, 0.122f, -0.956f, 0.344f)
                lineToRelative(-3.83f, 3.167f)
                lineToRelative(-3.749f, -3.158f)
                curveToRelative(-0.271f, -0.228f, -0.613f, -0.353f, -0.966f, -0.353f)
                horizontalLineToRelative(-1.789f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                lineTo(2.999f, 5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(15.87f, 8.293f)
                curveToRelative(0.63f, 0.63f, 0.184f, 1.707f, -0.707f, 1.707f)
                horizontalLineToRelative(-1.663f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1.663f)
                curveToRelative(-0.891f, 0.0f, -1.337f, -1.077f, -0.707f, -1.707f)
                lineToRelative(3.163f, -3.163f)
                curveToRelative(0.391f, -0.391f, 1.024f, -0.391f, 1.414f, 0.0f)
                lineToRelative(3.163f, 3.163f)
                close()
            }
        }
        .build()
        return _messageArrowUp!!
    }

private var _messageArrowUp: ImageVector? = null
