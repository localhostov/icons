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

public val Icons.Filled.FileUpload: ImageVector
    get() {
        if (_fileUpload != null) {
            return _fileUpload!!
        }
        _fileUpload = Builder(name = "FileUpload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(17.0f, 0.586f)
                lineToRelative(4.414f, 4.414f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(15.291f, 16.294f)
                lineToRelative(-2.291f, -2.291f)
                verticalLineToRelative(5.997f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.008f)
                lineToRelative(-2.291f, 2.302f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.298f, -3.299f)
                curveToRelative(0.775f, -0.774f, 2.038f, -0.775f, 2.812f, 0.0f)
                lineToRelative(3.299f, 3.299f)
                lineToRelative(-1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _fileUpload!!
    }

private var _fileUpload: ImageVector? = null
