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
                moveTo(24.0f, 8.154f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, -2.467f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.972f, -0.034f, -1.971f, -2.967f, 0.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                lineTo(21.0f, 8.154f)
                curveToRelative(0.0f, -0.171f, -0.018f, -0.339f, -0.051f, -0.5f)
                lineTo(3.0f, 7.654f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.972f, 0.034f, 1.971f, 2.967f, 0.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                curveTo(2.468f, 22.654f, 0.0f, 20.186f, 0.0f, 17.154f)
                lineTo(0.0f, 6.154f)
                curveTo(0.0f, 3.122f, 2.468f, 0.654f, 5.5f, 0.654f)
                horizontalLineToRelative(2.528f)
                curveToRelative(0.541f, 0.0f, 1.082f, 0.128f, 1.565f, 0.369f)
                lineToRelative(3.155f, 1.577f)
                curveToRelative(0.071f, 0.036f, 0.147f, 0.054f, 0.224f, 0.054f)
                horizontalLineToRelative(5.528f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(15.871f, 13.946f)
                lineToRelative(-3.163f, -3.163f)
                curveToRelative(-0.391f, -0.391f, -1.024f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-3.163f, 3.163f)
                curveToRelative(-0.63f, 0.63f, -0.184f, 1.707f, 0.707f, 1.707f)
                horizontalLineToRelative(1.663f)
                verticalLineToRelative(5.501f)
                curveToRelative(0.034f, 1.972f, 2.967f, 1.971f, 3.0f, 0.0f)
                verticalLineToRelative(-5.501f)
                horizontalLineToRelative(1.664f)
                curveToRelative(0.891f, 0.0f, 1.337f, -1.077f, 0.707f, -1.707f)
                close()
            }
        }
        .build()
        return _folderUpload!!
    }

private var _folderUpload: ImageVector? = null
