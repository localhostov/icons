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

public val Icons.Bold.ToolCrop: ImageVector
    get() {
        if (_toolCrop != null) {
            return _toolCrop!!
        }
        _toolCrop = Builder(name = "ToolCrop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 8.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 15.5f, 4.0f)
                lineTo(7.0f, 4.0f)
                lineTo(7.0f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.5f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.0f, 1.5f)
                lineTo(4.0f, 4.0f)
                lineTo(1.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 0.0f, 5.5f)
                lineTo(0.0f, 5.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.5f, 7.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(8.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 8.5f, 20.0f)
                lineTo(17.0f, 20.0f)
                verticalLineToRelative(2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.0f, 22.5f)
                lineTo(20.0f, 20.0f)
                horizontalLineToRelative(2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.0f, 18.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 17.0f)
                close()
                moveTo(8.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 15.5f)
                lineTo(7.0f, 7.0f)
                horizontalLineToRelative(8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 8.5f)
                lineTo(17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _toolCrop!!
    }

private var _toolCrop: ImageVector? = null
