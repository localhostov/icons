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

public val Icons.Bold.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) {
            return _folderMinus!!
        }
        _folderMinus = Builder(name = "FolderMinus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 13.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.972f, -0.034f, -1.971f, -2.966f, 0.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 8.5f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 3.032f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 23.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                lineTo(0.0f, 6.5f)
                curveTo(0.0f, 3.468f, 2.468f, 1.0f, 5.5f, 1.0f)
                horizontalLineToRelative(2.528f)
                curveToRelative(0.54f, 0.0f, 1.081f, 0.128f, 1.564f, 0.369f)
                lineToRelative(3.156f, 1.578f)
                curveToRelative(0.068f, 0.034f, 0.146f, 0.053f, 0.223f, 0.053f)
                horizontalLineToRelative(5.528f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(21.0f, 8.5f)
                curveToRelative(0.0f, -0.171f, -0.017f, -0.338f, -0.05f, -0.5f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                lineTo(21.0f, 8.5f)
                close()
            }
        }
        .build()
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
