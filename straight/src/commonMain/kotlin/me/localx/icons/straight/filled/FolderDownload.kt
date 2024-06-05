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

public val Icons.Filled.FolderDownload: ImageVector
    get() {
        if (_folderDownload != null) {
            return _folderDownload!!
        }
        _folderDownload = Builder(name = "FolderDownload", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(8.709f, 15.706f)
                lineToRelative(2.291f, 2.291f)
                verticalLineToRelative(-6.997f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.008f)
                lineToRelative(2.291f, -2.302f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.299f, 3.299f)
                curveToRelative(-0.388f, 0.388f, -0.897f, 0.581f, -1.406f, 0.581f)
                reflectiveCurveToRelative(-1.019f, -0.193f, -1.406f, -0.58f)
                lineToRelative(-3.299f, -3.3f)
                lineToRelative(1.414f, -1.414f)
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
        return _folderDownload!!
    }

private var _folderDownload: ImageVector? = null
