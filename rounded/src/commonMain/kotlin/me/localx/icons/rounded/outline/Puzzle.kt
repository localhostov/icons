package me.localx.icons.rounded.outline

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

public val Icons.Outline.Puzzle: ImageVector
    get() {
        if (_puzzle != null) {
            return _puzzle!!
        }
        _puzzle = Builder(name = "Puzzle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.0f)
                lineTo(11.431f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.957f, -1.291f)
                arcTo(11.2f, 11.2f, 0.0f, false, false, 11.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 0.526f, 2.709f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.569f, 24.0f)
                lineTo(5.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(0.0f, 11.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 6.0f)
                horizontalLineToRelative(0.272f)
                arcTo(9.929f, 9.929f, 0.0f, false, true, 5.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(9.929f, 9.929f, 0.0f, false, true, -0.272f, 2.0f)
                lineTo(13.0f, 6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 4.773f)
                arcToRelative(10.01f, 10.01f, 0.0f, false, true, 2.0f, -0.273f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                arcToRelative(10.02f, 10.02f, 0.0f, false, true, -2.0f, -0.272f)
                lineTo(18.0f, 19.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 13.0f, 24.0f)
                close()
                moveTo(12.728f, 22.0f)
                lineTo(13.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(16.0f, 16.931f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.291f, -0.957f)
                arcTo(11.224f, 11.224f, 0.0f, false, false, 20.0f, 16.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                arcToRelative(11.224f, 11.224f, 0.0f, false, false, -2.709f, 0.526f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 12.069f)
                lineTo(16.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(11.431f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.957f, -1.291f)
                arcTo(11.2f, 11.2f, 0.0f, false, false, 11.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 4.0f)
                arcToRelative(11.2f, 11.2f, 0.0f, false, false, 0.526f, 2.709f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.569f, 8.0f)
                lineTo(5.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                horizontalLineToRelative(0.272f)
                arcTo(9.929f, 9.929f, 0.0f, false, true, 5.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcTo(9.929f, 9.929f, 0.0f, false, true, 12.728f, 22.0f)
                close()
            }
        }
        .build()
        return _puzzle!!
    }

private var _puzzle: ImageVector? = null
