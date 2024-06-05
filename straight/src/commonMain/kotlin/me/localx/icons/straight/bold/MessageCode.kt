package me.localx.icons.straight.bold

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

public val Icons.Bold.MessageCode: ImageVector
    get() {
        if (_messageCode != null) {
            return _messageCode!!
        }
        _messageCode = Builder(name = "MessageCode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.271f, 8.238f)
                curveToRelative(0.969f, 0.969f, 0.97f, 2.548f, 0.001f, 3.519f)
                lineToRelative(-3.3f, 3.299f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(2.937f, -2.937f)
                lineToRelative(-2.937f, -2.938f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(3.299f, 3.299f)
                close()
                moveTo(9.027f, 4.939f)
                lineToRelative(-3.299f, 3.299f)
                curveToRelative(-0.969f, 0.969f, -0.97f, 2.548f, 0.0f, 3.52f)
                lineToRelative(3.299f, 3.298f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-2.937f, -2.937f)
                lineToRelative(2.937f, -2.938f)
                lineToRelative(-2.121f, -2.121f)
                close()
                moveTo(23.999f, 3.5f)
                lineTo(23.999f, 20.0f)
                horizontalLineToRelative(-6.671f)
                lineToRelative(-3.708f, 3.066f)
                curveToRelative(-0.449f, 0.398f, -1.025f, 0.6f, -1.607f, 0.6f)
                curveToRelative(-0.594f, 0.0f, -1.194f, -0.21f, -1.672f, -0.634f)
                lineToRelative(-3.6f, -3.032f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.5f)
                curveTo(0.0f, 1.57f, 1.57f, 0.0f, 3.5f, 0.0f)
                lineTo(20.5f, 0.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20.999f, 3.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                lineTo(7.836f, 17.0f)
                lineToRelative(4.167f, 3.512f)
                lineToRelative(4.245f, -3.512f)
                horizontalLineToRelative(4.751f)
                lineTo(20.999f, 3.5f)
                close()
            }
        }
        .build()
        return _messageCode!!
    }

private var _messageCode: ImageVector? = null
