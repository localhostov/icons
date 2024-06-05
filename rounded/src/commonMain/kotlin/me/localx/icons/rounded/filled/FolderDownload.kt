package me.localx.icons.rounded.filled

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
                moveTo(23.899f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 3.243f, 2.243f, 1.0f, 5.0f, 1.0f)
                horizontalLineToRelative(2.528f)
                curveToRelative(0.463f, 0.0f, 0.927f, 0.109f, 1.341f, 0.316f)
                lineToRelative(3.156f, 1.578f)
                curveToRelative(0.138f, 0.069f, 0.293f, 0.105f, 0.447f, 0.105f)
                horizontalLineToRelative(6.528f)
                curveToRelative(2.414f, 0.0f, 4.434f, 1.721f, 4.899f, 4.0f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(15.707f, 17.107f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-1.293f, 1.293f)
                verticalLineToRelative(-6.4f)
                curveToRelative(-0.006f, -1.308f, -1.995f, -1.307f, -2.0f, 0.0f)
                verticalLineToRelative(6.4f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.929f, -0.921f, -2.335f, 0.486f, -1.414f, 1.414f)
                lineToRelative(1.614f, 1.613f)
                curveToRelative(1.154f, 1.154f, 3.033f, 1.154f, 4.187f, 0.0f)
                lineToRelative(1.613f, -1.613f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _folderDownload!!
    }

private var _folderDownload: ImageVector? = null
