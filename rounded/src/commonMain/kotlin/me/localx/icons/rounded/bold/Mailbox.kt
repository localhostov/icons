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

public val Icons.Bold.Mailbox: ImageVector
    get() {
        if (_mailbox != null) {
            return _mailbox!!
        }
        _mailbox = Builder(name = "Mailbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.0f)
                lineTo(6.5f, 2.0f)
                curveTo(2.916f, 2.0f, 0.0f, 4.916f, 0.0f, 8.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(20.5f, 22.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(24.0f, 8.5f)
                curveToRelative(0.0f, -3.584f, -2.916f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(3.0f, 18.5f)
                lineTo(3.0f, 8.5f)
                curveToRelative(0.122f, -4.616f, 6.879f, -4.613f, 7.0f, 0.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.5f, -0.5f, 0.5f)
                lineTo(3.5f, 19.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                close()
                moveTo(21.0f, 18.5f)
                curveToRelative(0.0f, 0.275f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7.536f)
                curveToRelative(0.023f, -0.163f, 0.036f, -0.33f, 0.036f, -0.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.034f, 1.972f, 2.966f, 1.971f, 3.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.288f, -0.376f, -2.489f, -1.025f, -3.5f)
                horizontalLineToRelative(5.525f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(7.56f, 9.44f)
                curveToRelative(0.581f, 0.554f, 0.581f, 1.565f, 0.0f, 2.12f)
                curveToRelative(-1.394f, 1.38f, -3.501f, -0.731f, -2.12f, -2.12f)
                curveToRelative(0.56f, -0.56f, 1.56f, -0.56f, 2.12f, 0.0f)
                close()
            }
        }
        .build()
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
