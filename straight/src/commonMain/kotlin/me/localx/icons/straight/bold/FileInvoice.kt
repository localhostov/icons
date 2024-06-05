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

public val Icons.Bold.FileInvoice: ImageVector
    get() {
        if (_fileInvoice != null) {
            return _fileInvoice!!
        }
        _fileInvoice = Builder(name = "FileInvoice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.381f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 5.665f)
                lineTo(16.381f, 0.0f)
                close()
                moveTo(5.0f, 21.0f)
                lineTo(5.0f, 3.0f)
                lineTo(14.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(13.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(7.0f, 15.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(12.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _fileInvoice!!
    }

private var _fileInvoice: ImageVector? = null
