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

public val Icons.Bold.Sandwich: ImageVector
    get() {
        if (_sandwich != null) {
            return _sandwich!!
        }
        _sandwich = Builder(name = "Sandwich", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 24.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                lineTo(22.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 24.0f, 22.0f)
                close()
                moveTo(0.0f, 8.678f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 2.1f, 5.472f)
                lineTo(13.581f, 0.449f)
                arcToRelative(5.289f, 5.289f, 0.0f, false, true, 6.17f, 1.411f)
                lineToRelative(3.093f, 3.607f)
                horizontalLineToRelative(0.0f)
                arcTo(4.808f, 4.808f, 0.0f, false, true, 24.0f, 8.592f)
                arcTo(3.412f, 3.412f, 0.0f, false, true, 20.591f, 12.0f)
                lineTo(3.323f, 12.0f)
                arcTo(3.326f, 3.326f, 0.0f, false, true, 0.0f, 8.678f)
                close()
                moveTo(3.0f, 8.678f)
                arcTo(0.323f, 0.323f, 0.0f, false, false, 3.323f, 9.0f)
                lineTo(20.591f, 9.0f)
                arcTo(0.41f, 0.41f, 0.0f, false, false, 21.0f, 8.592f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.435f, -1.174f)
                lineTo(17.474f, 3.811f)
                arcTo(2.311f, 2.311f, 0.0f, false, false, 15.719f, 3.0f)
                arcToRelative(2.335f, 2.335f, 0.0f, false, false, -0.935f, 0.2f)
                lineTo(3.3f, 8.22f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.0f, 8.678f)
                close()
                moveTo(23.407f, 15.311f)
                lineTo(23.407f, 15.311f)
                reflectiveCurveToRelative(-0.539f, -0.411f, -0.77f, -0.6f)
                arcToRelative(3.312f, 3.312f, 0.0f, false, false, -4.1f, 0.0f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -1.63f, 0.0f)
                arcToRelative(3.312f, 3.312f, 0.0f, false, false, -4.1f, 0.0f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -1.629f, 0.0f)
                arcToRelative(3.314f, 3.314f, 0.0f, false, false, -4.1f, 0.0f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -1.629f, 0.0f)
                arcToRelative(3.312f, 3.312f, 0.0f, false, false, -4.1f, 0.0f)
                curveToRelative(-0.228f, 0.183f, -0.765f, 0.592f, -0.767f, 0.594f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(1.494f, 1.494f, 0.0f, true, false, 1.814f, 2.375f)
                lineToRelative(0.0f, 0.0f)
                reflectiveCurveToRelative(0.577f, -0.44f, 0.819f, -0.635f)
                arcToRelative(0.308f, 0.308f, 0.0f, false, true, 0.358f, 0.0f)
                arcToRelative(4.384f, 4.384f, 0.0f, false, false, 5.37f, 0.0f)
                arcToRelative(0.306f, 0.306f, 0.0f, false, true, 0.357f, 0.0f)
                arcToRelative(4.362f, 4.362f, 0.0f, false, false, 5.371f, 0.0f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, true, 0.356f, 0.0f)
                arcTo(4.32f, 4.32f, 0.0f, false, false, 17.728f, 18.0f)
                arcToRelative(4.267f, 4.267f, 0.0f, false, false, 2.684f, -0.943f)
                arcToRelative(0.311f, 0.311f, 0.0f, false, true, 0.356f, 0.0f)
                curveToRelative(0.245f, 0.2f, 0.822f, 0.637f, 0.822f, 0.637f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(1.494f, 1.494f, 0.0f, true, false, 1.814f, -2.375f)
                close()
            }
        }
        .build()
        return _sandwich!!
    }

private var _sandwich: ImageVector? = null
