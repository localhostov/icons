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

public val Icons.Filled.FileExport: ImageVector
    get() {
        if (_fileExport != null) {
            return _fileExport!!
        }
        _fileExport = Builder(name = "FileExport", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.41f, 5.0f)
                horizontalLineToRelative(-4.41f)
                lineTo(15.0f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(23.41f, 14.59f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.3f, 2.29f)
                lineTo(13.0f, 14.99f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.77f, -0.77f, 0.77f, -2.04f, 0.0f, -2.81f)
                close()
                moveTo(10.99f, 19.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.59f)
                lineToRelative(4.41f, -4.41f)
                verticalLineToRelative(-1.59f)
                horizontalLineToRelative(-7.0f)
                lineTo(12.99f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.34f, 0.0f, 0.0f, 1.34f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                verticalLineToRelative(-0.59f)
                lineToRelative(-4.41f, -4.41f)
                horizontalLineToRelative(-4.59f)
                close()
            }
        }
        .build()
        return _fileExport!!
    }

private var _fileExport: ImageVector? = null
