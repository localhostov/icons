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

public val Icons.Filled.FolderXmark: ImageVector
    get() {
        if (_folderXmark != null) {
            return _folderXmark!!
        }
        _folderXmark = Builder(name = "FolderXmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveTo(0.0f, 2.35f, 1.35f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 7.0f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(14.0f)
                lineTo(0.0f, 23.0f)
                lineTo(0.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(13.41f, 16.0f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.54f, 2.54f)
                lineToRelative(-2.54f, -2.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(-2.54f, 2.54f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.54f, -2.54f)
                close()
            }
        }
        .build()
        return _folderXmark!!
    }

private var _folderXmark: ImageVector? = null
