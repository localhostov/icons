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

public val Icons.Outline.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.527f, 4.217f)
                lineTo(14.5f, 0.737f)
                arcToRelative(5.015f, 5.015f, 0.0f, false, false, -5.0f, 0.0f)
                lineTo(3.473f, 4.217f)
                arcToRelative(5.014f, 5.014f, 0.0f, false, false, -2.5f, 4.33f)
                verticalLineToRelative(6.96f)
                arcToRelative(5.016f, 5.016f, 0.0f, false, false, 2.5f, 4.331f)
                lineTo(9.5f, 23.317f)
                arcToRelative(5.012f, 5.012f, 0.0f, false, false, 5.0f, 0.0f)
                lineToRelative(6.027f, -3.479f)
                arcToRelative(5.016f, 5.016f, 0.0f, false, false, 2.5f, -4.331f)
                lineTo(23.027f, 8.547f)
                arcTo(5.014f, 5.014f, 0.0f, false, false, 20.527f, 4.217f)
                close()
                moveTo(10.5f, 2.47f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 0.0f)
                lineToRelative(6.027f, 3.479f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, true, 0.429f, 0.33f)
                lineTo(13.763f, 9.854f)
                arcToRelative(3.53f, 3.53f, 0.0f, false, true, -3.526f, 0.0f)
                lineTo(4.044f, 6.279f)
                arcToRelative(2.945f, 2.945f, 0.0f, false, true, 0.429f, -0.33f)
                close()
                moveTo(4.473f, 18.105f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.5f, -2.6f)
                lineTo(2.973f, 8.547f)
                arcToRelative(2.893f, 2.893f, 0.0f, false, true, 0.071f, -0.535f)
                lineToRelative(6.193f, 3.575f)
                arcTo(5.491f, 5.491f, 0.0f, false, false, 11.0f, 12.222f)
                verticalLineToRelative(9.569f)
                arcToRelative(2.892f, 2.892f, 0.0f, false, true, -0.5f, -0.206f)
                close()
                moveTo(21.027f, 15.505f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -1.5f, 2.6f)
                lineTo(13.5f, 21.585f)
                arcToRelative(2.892f, 2.892f, 0.0f, false, true, -0.5f, 0.206f)
                lineTo(13.0f, 12.222f)
                arcToRelative(5.491f, 5.491f, 0.0f, false, false, 1.763f, -0.635f)
                lineToRelative(6.193f, -3.575f)
                arcToRelative(2.893f, 2.893f, 0.0f, false, true, 0.071f, 0.535f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
