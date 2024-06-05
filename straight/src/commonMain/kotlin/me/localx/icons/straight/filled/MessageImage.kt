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

public val Icons.Filled.MessageImage: ImageVector
    get() {
        if (_messageImage != null) {
            return _messageImage!!
        }
        _messageImage = Builder(name = "MessageImage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 7.586f)
                lineToRelative(4.0f, 4.0f)
                lineTo(23.974f, 2.612f)
                curveToRelative(-0.191f, -1.471f, -1.451f, -2.612f, -2.974f, -2.612f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(15.586f)
                lineTo(11.0f, 7.586f)
                close()
                moveTo(5.5f, 5.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 5.414f)
                verticalLineToRelative(14.586f)
                horizontalLineToRelative(-6.853f)
                lineToRelative(-3.846f, 3.18f)
                curveToRelative(-0.362f, 0.322f, -0.825f, 0.485f, -1.292f, 0.485f)
                curveToRelative(-0.476f, 0.0f, -0.956f, -0.169f, -1.338f, -0.509f)
                lineToRelative(-3.748f, -3.156f)
                lineTo(1.414f, 20.0f)
                lineToRelative(9.586f, -9.586f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(9.0f, -9.0f)
                close()
            }
        }
        .build()
        return _messageImage!!
    }

private var _messageImage: ImageVector? = null
