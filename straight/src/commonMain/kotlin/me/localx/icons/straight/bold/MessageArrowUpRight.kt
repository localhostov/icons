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

public val Icons.Bold.MessageArrowUpRight: ImageVector
    get() {
        if (_messageArrowUpRight != null) {
            return _messageArrowUpRight!!
        }
        _messageArrowUpRight = Builder(name = "MessageArrowUpRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6.741f)
                lineToRelative(3.598f, 3.03f)
                curveToRelative(0.479f, 0.426f, 1.08f, 0.636f, 1.675f, 0.636f)
                curveToRelative(0.583f, 0.0f, 1.158f, -0.201f, 1.606f, -0.601f)
                lineToRelative(3.708f, -3.065f)
                horizontalLineToRelative(6.672f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-4.751f)
                lineToRelative(-4.246f, 3.511f)
                lineToRelative(-4.167f, -3.511f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(17.0f, 7.0f)
                verticalLineToRelative(5.5f)
                lineToRelative(-2.189f, -2.189f)
                lineToRelative(-4.175f, 4.175f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(4.175f, -4.175f)
                lineToRelative(-2.189f, -2.189f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _messageArrowUpRight!!
    }

private var _messageArrowUpRight: ImageVector? = null
