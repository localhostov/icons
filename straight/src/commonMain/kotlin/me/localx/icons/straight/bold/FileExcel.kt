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

public val Icons.Bold.FileExcel: ImageVector
    get() {
        if (_fileExcel != null) {
            return _fileExcel!!
        }
        _fileExcel = Builder(name = "FileExcel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.38f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(3.35f, 0.0f, 2.0f, 1.35f, 2.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 5.66f)
                lineTo(16.38f, 0.0f)
                close()
                moveTo(15.58f, 22.0f)
                horizontalLineToRelative(-2.35f)
                lineToRelative(-1.29f, -2.09f)
                lineToRelative(-1.29f, 2.09f)
                horizontalLineToRelative(-2.35f)
                lineToRelative(2.46f, -4.0f)
                lineToRelative(-2.46f, -4.0f)
                horizontalLineToRelative(2.35f)
                lineToRelative(1.29f, 2.09f)
                lineToRelative(1.29f, -2.09f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-2.46f, 4.0f)
                lineToRelative(2.46f, 4.0f)
                close()
                moveTo(5.0f, 12.0f)
                lineTo(5.0f, 3.0f)
                lineTo(14.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 12.0f)
                close()
            }
        }
        .build()
        return _fileExcel!!
    }

private var _fileExcel: ImageVector? = null
