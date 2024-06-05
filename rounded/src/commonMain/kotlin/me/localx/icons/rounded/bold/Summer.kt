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

public val Icons.Bold.Summer: ImageVector
    get() {
        if (_summer != null) {
            return _summer!!
        }
        _summer = Builder(name = "Summer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.037f)
                arcToRelative(2.995f, 2.995f, 0.0f, true, true, -4.5f, -2.584f)
                lineTo(14.5f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(4.953f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 19.0f, 16.037f)
                close()
                moveTo(24.0f, 16.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, 8.0f)
                curveToRelative(-6.738f, 0.135f, -10.571f, -8.319f, -6.0f, -13.271f)
                lineTo(10.0f, 6.037f)
                curveToRelative(0.253f, -7.931f, 11.75f, -7.926f, 12.0f, 0.0f)
                verticalLineToRelative(4.692f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 24.0f, 16.0f)
                close()
                moveTo(21.0f, 16.0f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, false, -1.541f, -3.59f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 11.33f)
                lineTo(19.0f, 6.037f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                lineTo(13.0f, 11.33f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.459f, 1.08f)
                arcTo(4.994f, 4.994f, 0.0f, true, false, 21.0f, 16.0f)
                close()
                moveTo(6.929f, 9.418f)
                arcToRelative(2.008f, 2.008f, 0.0f, false, true, 0.115f, -3.865f)
                arcTo(2.511f, 2.511f, 0.0f, false, false, 9.0f, 3.118f)
                lineTo(9.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(6.0f, 2.729f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, false, -0.8f, 0.331f)
                lineToRelative(-0.87f, -0.87f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.212f, 4.312f)
                lineToRelative(0.859f, 0.859f)
                arcTo(5.091f, 5.091f, 0.0f, false, false, 2.733f, 6.0f)
                lineTo(1.521f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(2.74f, 9.0f)
                arcToRelative(5.166f, 5.166f, 0.0f, false, false, 0.325f, 0.792f)
                lineToRelative(-0.853f, 0.854f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.121f, 2.121f)
                lineToRelative(0.848f, -0.849f)
                arcToRelative(4.927f, 4.927f, 0.0f, false, false, 0.89f, 0.375f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.858f, -2.875f)
                close()
            }
        }
        .build()
        return _summer!!
    }

private var _summer: ImageVector? = null
