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

public val Icons.Bold.ReplyAll: ImageVector
    get() {
        if (_replyAll != null) {
            return _replyAll!!
        }
        _replyAll = Builder(name = "ReplyAll", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(11.5f)
                curveToRelative(0.0f, -0.275f, -0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(11.539f)
                lineToRelative(5.509f, 5.927f)
                lineToRelative(-2.197f, 2.043f)
                lineToRelative(-7.126f, -7.669f)
                curveToRelative(-0.976f, -0.976f, -0.976f, -2.626f, 0.038f, -3.64f)
                lineTo(14.817f, 0.062f)
                lineToRelative(2.198f, 2.041f)
                lineToRelative(-5.476f, 5.896f)
                horizontalLineToRelative(8.961f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(10.016f, 2.104f)
                lineTo(7.817f, 0.062f)
                lineTo(0.762f, 7.661f)
                curveToRelative(-1.013f, 1.014f, -1.013f, 2.664f, -0.038f, 3.64f)
                lineToRelative(7.126f, 7.669f)
                lineToRelative(2.197f, -2.043f)
                lineTo(3.146f, 9.501f)
                lineTo(10.016f, 2.104f)
                close()
            }
        }
        .build()
        return _replyAll!!
    }

private var _replyAll: ImageVector? = null
