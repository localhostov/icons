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

public val Icons.Filled.Bacon: ImageVector
    get() {
        if (_bacon != null) {
            return _bacon!!
        }
        _bacon = Builder(name = "Bacon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.28f, 16.46f)
                arcToRelative(3.115f, 3.115f, 0.0f, false, false, -2.657f, 2.661f)
                arcToRelative(2.166f, 2.166f, 0.0f, false, true, -0.11f, 0.438f)
                lineTo(0.781f, 17.827f)
                arcToRelative(2.669f, 2.669f, 0.0f, false, true, -0.636f, -2.749f)
                arcToRelative(2.489f, 2.489f, 0.0f, false, true, 2.008f, -1.7f)
                arcToRelative(2.265f, 2.265f, 0.0f, false, false, 1.351f, -0.65f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, false, 0.644f, -1.311f)
                arcToRelative(3.114f, 3.114f, 0.0f, false, true, 2.657f, -2.66f)
                arcTo(2.262f, 2.262f, 0.0f, false, false, 8.759f, 6.8f)
                arcTo(3.115f, 3.115f, 0.0f, false, true, 11.418f, 4.14f)
                arcTo(2.263f, 2.263f, 0.0f, false, false, 13.37f, 2.186f)
                arcTo(2.507f, 2.507f, 0.0f, false, true, 15.075f, 0.133f)
                arcTo(2.669f, 2.669f, 0.0f, false, true, 17.822f, 0.77f)
                horizontalLineToRelative(0.0f)
                lineToRelative(1.736f, 1.738f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -0.445f, 0.1f)
                arcToRelative(3.116f, 3.116f, 0.0f, false, false, -2.658f, 2.661f)
                arcTo(2.262f, 2.262f, 0.0f, false, true, 14.5f, 7.229f)
                arcTo(3.116f, 3.116f, 0.0f, false, false, 11.845f, 9.89f)
                arcToRelative(2.265f, 2.265f, 0.0f, false, true, -1.953f, 1.955f)
                arcToRelative(3.114f, 3.114f, 0.0f, false, false, -2.658f, 2.66f)
                arcTo(2.262f, 2.262f, 0.0f, false, true, 5.28f, 16.46f)
                close()
                moveTo(21.053f, 4.0f)
                arcToRelative(4.377f, 4.377f, 0.0f, false, true, -1.685f, 0.594f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.928f, 0.93f)
                arcToRelative(4.267f, 4.267f, 0.0f, false, true, -3.683f, 3.686f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.929f, 0.93f)
                arcToRelative(4.267f, 4.267f, 0.0f, false, true, -3.682f, 3.686f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.929f, 0.93f)
                arcToRelative(4.262f, 4.262f, 0.0f, false, true, -3.683f, 3.685f)
                arcToRelative(1.107f, 1.107f, 0.0f, false, false, -0.921f, 0.885f)
                arcToRelative(4.751f, 4.751f, 0.0f, false, true, -0.586f, 1.744f)
                lineToRelative(2.919f, 2.918f)
                lineToRelative(0.623f, -1.228f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, 1.229f, -1.3f)
                lineToRelative(0.281f, -0.095f)
                arcTo(4.734f, 4.734f, 0.0f, false, false, 11.066f, 20.3f)
                arcToRelative(4.223f, 4.223f, 0.0f, false, false, 1.213f, -2.47f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, 0.928f, -0.931f)
                arcToRelative(4.267f, 4.267f, 0.0f, false, false, 3.684f, -3.686f)
                arcToRelative(1.116f, 1.116f, 0.0f, false, true, 0.928f, -0.93f)
                arcToRelative(4.208f, 4.208f, 0.0f, false, false, 2.469f, -1.215f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, false, 1.147f, -2.2f)
                arcToRelative(3.094f, 3.094f, 0.0f, false, true, 1.3f, -1.287f)
                lineTo(24.0f, 6.958f)
                close()
            }
        }
        .build()
        return _bacon!!
    }

private var _bacon: ImageVector? = null
