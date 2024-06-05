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

public val Icons.Filled.FolderMinus: ImageVector
    get() {
        if (_folderMinus != null) {
            return _folderMinus!!
        }
        _folderMinus = Builder(name = "FolderMinus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.0f)
                verticalLineToRelative(-0.974f)
                curveTo(0.0f, 3.269f, 2.243f, 1.026f, 5.0f, 1.026f)
                horizontalLineToRelative(2.528f)
                curveToRelative(0.463f, 0.0f, 0.927f, 0.109f, 1.341f, 0.316f)
                lineToRelative(3.156f, 1.578f)
                curveToRelative(0.138f, 0.069f, 0.292f, 0.105f, 0.446f, 0.105f)
                horizontalLineToRelative(6.528f)
                curveToRelative(2.405f, 0.0f, 4.418f, 1.708f, 4.892f, 3.974f)
                lineTo(0.0f, 6.999f)
                close()
                moveTo(24.0f, 9.0f)
                verticalLineToRelative(9.026f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.026f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(16.0f, 16.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.308f, 0.005f, -1.307f, 1.995f, 0.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _folderMinus!!
    }

private var _folderMinus: ImageVector? = null
