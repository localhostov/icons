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

public val Icons.Filled.FolderUpload: ImageVector
    get() {
        if (_folderUpload != null) {
            return _folderUpload!!
        }
        _folderUpload = Builder(name = "FolderUpload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 23.0f)
                lineTo(24.0f, 23.0f)
                lineTo(24.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(10.594f, 11.581f)
                curveToRelative(0.775f, -0.775f, 2.038f, -0.774f, 2.812f, 0.0f)
                lineToRelative(3.299f, 3.3f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.291f, -2.291f)
                verticalLineToRelative(6.997f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.008f)
                lineToRelative(-2.291f, 2.302f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.298f, -3.299f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(1.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveTo(0.0f, 2.346f, 1.346f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(5.236f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(8.764f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _folderUpload!!
    }

private var _folderUpload: ImageVector? = null
