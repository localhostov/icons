package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.FolderAdd: ImageVector
    get() {
        if (_folderAdd != null) {
            return _folderAdd!!
        }
        _folderAdd = Builder(name = "FolderAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0f, 14.0002f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(16.0002f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(19.0002f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(16.0002f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(14.0002f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(11.0002f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(14.0002f)
                    close()
                    moveTo(24.0f, 6.0002f)
                    verticalLineTo(23.0002f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(4.0002f)
                    curveTo(0.0f, 3.2046f, 0.3161f, 2.4415f, 0.8787f, 1.8789f)
                    curveTo(1.4413f, 1.3163f, 2.2043f, 1.0002f, 3.0f, 1.0002f)
                    horizontalLineTo(8.236f)
                    lineTo(12.236f, 3.0002f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 3.0002f, 22.5587f, 3.3163f, 23.1213f, 3.8789f)
                    curveTo(23.6839f, 4.4415f, 24.0f, 5.2046f, 24.0f, 6.0002f)
                    close()
                    moveTo(2.0f, 4.0002f)
                    verticalLineTo(7.0002f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(6.0002f)
                    curveTo(22.0f, 5.735f, 21.8946f, 5.4807f, 21.7071f, 5.2931f)
                    curveTo(21.5196f, 5.1056f, 21.2652f, 5.0002f, 21.0f, 5.0002f)
                    horizontalLineTo(11.764f)
                    lineTo(7.764f, 3.0002f)
                    horizontalLineTo(3.0f)
                    curveTo(2.7348f, 3.0002f, 2.4804f, 3.1056f, 2.2929f, 3.2931f)
                    curveTo(2.1054f, 3.4807f, 2.0f, 3.735f, 2.0f, 4.0002f)
                    close()
                    moveTo(22.0f, 21.0002f)
                    verticalLineTo(9.0002f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(21.0002f)
                    horizontalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _folderAdd!!
    }

private var _folderAdd: ImageVector? = null
