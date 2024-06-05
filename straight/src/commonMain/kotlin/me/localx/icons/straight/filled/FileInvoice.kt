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

public val Icons.Filled.FileInvoice: ImageVector
    get() {
        if (_fileInvoice != null) {
            return _fileInvoice!!
        }
        _fileInvoice = Builder(name = "FileInvoice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
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
                moveTo(6.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 13.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(17.0f, 0.586f)
                lineTo(17.0f, 5.0f)
                horizontalLineToRelative(4.414f)
                lineTo(17.0f, 0.586f)
                close()
            }
        }
        .build()
        return _fileInvoice!!
    }

private var _fileInvoice: ImageVector? = null
