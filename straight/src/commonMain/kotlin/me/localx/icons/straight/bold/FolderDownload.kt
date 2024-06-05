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

public val Icons.Bold.FolderDownload: ImageVector
    get() {
        if (_folderDownload != null) {
            return _folderDownload!!
        }
        _folderDownload = Builder(name = "FolderDownload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 19.0f)
                lineToRelative(-3.793f, 3.707f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                lineToRelative(-3.793f, -3.707f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(20.5f, 3.0f)
                horizontalLineTo(12.354f)
                lineTo(8.354f, 1.0f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 1.0f, 0.0f, 2.57f, 0.0f, 4.5f)
                verticalLineTo(23.0f)
                horizontalLineTo(8.718f)
                lineToRelative(-3.001f, -3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.821f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(8.821f)
                verticalLineTo(6.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _folderDownload!!
    }

private var _folderDownload: ImageVector? = null
