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

public val Icons.Bold.MessageSlash: ImageVector
    get() {
        if (_messageSlash != null) {
            return _messageSlash!!
        }
        _messageSlash = Builder(name = "MessageSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.121f, 20.0f)
                horizontalLineToRelative(0.879f)
                lineTo(23.0f, 4.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 1.0f)
                curveToRelative(-0.404f, 0.0f, -0.801f, 0.071f, -1.175f, 0.204f)
                lineTo(2.16f, 0.039f)
                lineTo(0.039f, 2.16f)
                lineToRelative(21.801f, 21.801f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-1.84f, -1.84f)
                close()
                moveTo(19.5f, 4.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-0.879f)
                lineTo(6.121f, 4.0f)
                horizontalLineToRelative(13.379f)
                close()
                moveTo(13.951f, 18.9f)
                lineToRelative(2.13f, 2.13f)
                lineToRelative(-2.461f, 2.035f)
                curveToRelative(-0.448f, 0.399f, -1.024f, 0.601f, -1.606f, 0.601f)
                curveToRelative(-0.595f, 0.0f, -1.196f, -0.21f, -1.675f, -0.636f)
                lineToRelative(-3.598f, -3.03f)
                lineTo(1.0f, 20.0f)
                lineTo(1.0f, 5.949f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(8.051f)
                horizontalLineToRelative(3.836f)
                lineToRelative(4.167f, 3.511f)
                lineToRelative(1.947f, -1.61f)
                close()
            }
        }
        .build()
        return _messageSlash!!
    }

private var _messageSlash: ImageVector? = null
