package me.localx.icons.straight.outline

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

public val Icons.Outline.FileInvoice: ImageVector
    get() {
        if (_fileInvoice != null) {
            return _fileInvoice!!
        }
        _fileInvoice = Builder(name = "FileInvoice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.414f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 7.586f)
                lineTo(14.414f, 0.0f)
                close()
                moveTo(15.0f, 3.414f)
                lineToRelative(3.586f, 3.586f)
                horizontalLineToRelative(-3.586f)
                lineTo(15.0f, 3.414f)
                close()
                moveTo(20.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(13.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(6.0f, 20.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-7.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(8.0f, 15.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _fileInvoice!!
    }

private var _fileInvoice: ImageVector? = null
