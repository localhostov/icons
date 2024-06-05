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

public val Icons.Bold.Function: ImageVector
    get() {
        if (_function != null) {
            return _function!!
        }
        _function = Builder(name = "Function", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.895f, 13.0f)
                horizontalLineToRelative(-2.022f)
                lineToRelative(-1.019f, 7.136f)
                curveToRelative(-0.315f, 2.203f, -2.23f, 3.864f, -4.455f, 3.864f)
                horizontalLineToRelative(-2.398f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.398f)
                curveToRelative(0.742f, 0.0f, 1.38f, -0.554f, 1.485f, -1.288f)
                lineToRelative(0.959f, -6.712f)
                horizontalLineToRelative(-2.519f)
                lineToRelative(0.429f, -3.0f)
                horizontalLineToRelative(2.519f)
                lineToRelative(0.876f, -6.136f)
                curveToRelative(0.315f, -2.203f, 2.23f, -3.864f, 4.455f, -3.864f)
                horizontalLineToRelative(2.398f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.398f)
                curveToRelative(-0.742f, 0.0f, -1.38f, 0.554f, -1.485f, 1.288f)
                lineToRelative(-0.816f, 5.712f)
                horizontalLineToRelative(2.022f)
                lineToRelative(-0.429f, 3.0f)
                close()
                moveTo(22.616f, 15.0f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(-1.208f, 1.822f)
                lineToRelative(-1.208f, -1.822f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(3.008f, 4.538f)
                lineToRelative(-2.958f, 4.462f)
                horizontalLineToRelative(3.6f)
                lineToRelative(1.158f, -1.747f)
                lineToRelative(1.158f, 1.747f)
                horizontalLineToRelative(3.6f)
                lineToRelative(-2.958f, -4.462f)
                lineToRelative(3.008f, -4.538f)
                close()
            }
        }
        .build()
        return _function!!
    }

private var _function: ImageVector? = null
