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

public val Icons.Bold.FolderUpload: ImageVector
    get() {
        if (_folderUpload != null) {
            return _folderUpload!!
        }
        _folderUpload = Builder(name = "FolderUpload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.5f)
                lineTo(24.0f, 23.0f)
                lineTo(16.0f, 23.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(12.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 23.0f)
                lineTo(0.0f, 4.5f)
                curveTo(0.0f, 2.57f, 1.57f, 1.0f, 3.5f, 1.0f)
                horizontalLineToRelative(4.854f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(8.146f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(16.5f, 15.0f)
                lineToRelative(-3.793f, -3.707f)
                curveToRelative(-0.391f, -0.391f, -1.024f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-3.793f, 3.707f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 15.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _folderUpload!!
    }

private var _folderUpload: ImageVector? = null
