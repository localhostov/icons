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
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -4.5f, -2.584f)
                lineTo(14.5f, 8.036f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.417f)
                arcTo(2.987f, 2.987f, 0.0f, false, true, 19.0f, 16.037f)
                close()
                moveTo(24.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 16.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 2.0f, -5.271f)
                lineTo(10.0f, 6.036f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(4.693f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 24.0f, 16.0f)
                close()
                moveTo(21.0f, 16.0f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, false, -1.541f, -3.59f)
                lineTo(19.0f, 11.968f)
                lineTo(19.0f, 6.036f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                verticalLineToRelative(5.932f)
                lineToRelative(-0.46f, 0.443f)
                arcTo(4.948f, 4.948f, 0.0f, false, false, 11.0f, 16.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                close()
                moveTo(10.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 2.7f)
                arcToRelative(5.925f, 5.925f, 0.0f, false, false, -1.531f, 0.651f)
                lineTo(3.55f, 1.429f)
                lineTo(1.429f, 3.55f)
                lineTo(3.341f, 5.462f)
                arcTo(5.935f, 5.935f, 0.0f, false, false, 2.711f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.7f, 10.0f)
                arcToRelative(6.024f, 6.024f, 0.0f, false, false, 0.638f, 1.541f)
                lineTo(1.428f, 13.45f)
                lineTo(3.55f, 15.571f)
                lineToRelative(3.182f, -3.182f)
                arcTo(9.983f, 9.983f, 0.0f, false, true, 8.0f, 10.019f)
                lineTo(8.0f, 6.037f)
                arcTo(7.957f, 7.957f, 0.0f, false, true, 10.0f, 0.763f)
                close()
            }
        }
        .build()
        return _summer!!
    }

private var _summer: ImageVector? = null
