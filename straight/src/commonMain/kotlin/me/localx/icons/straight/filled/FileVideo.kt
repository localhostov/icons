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

public val Icons.Filled.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) {
            return _fileVideo!!
        }
        _fileVideo = Builder(name = "FileVideo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(17.0f, 0.586f)
                lineTo(17.0f, 5.0f)
                horizontalLineToRelative(4.414f)
                lineTo(17.0f, 0.586f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.343f, 3.343f, 0.0f, 5.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineToRelative(-3.0f, 2.25f)
                verticalLineToRelative(-2.25f)
                lineTo(6.0f, 12.0f)
                verticalLineToRelative(8.0f)
                lineTo(15.0f, 20.0f)
                verticalLineToRelative(-2.25f)
                lineToRelative(3.0f, 2.25f)
                lineTo(18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
