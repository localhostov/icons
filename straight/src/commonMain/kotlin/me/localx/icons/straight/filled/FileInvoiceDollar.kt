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

public val Icons.Filled.FileInvoiceDollar: ImageVector
    get() {
        if (_fileInvoiceDollar != null) {
            return _fileInvoiceDollar!!
        }
        _fileInvoiceDollar = Builder(name = "FileInvoiceDollar", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(15.0f, 0.586f)
                lineToRelative(4.414f, 4.414f)
                close()
                moveTo(14.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(3.0f)
                lineTo(14.0f, 18.0f)
                close()
                moveTo(16.023f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.343f, 1.343f, 0.0f, 3.0f, 0.0f)
                lineTo(13.0f, 0.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.417f)
                curveToRelative(-0.792f, 0.347f, -1.468f, 0.901f, -1.982f, 1.583f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(7.0f)
                lineTo(14.0f, 20.0f)
                curveToRelative(0.0f, 1.64f, 0.801f, 3.088f, 2.023f, 4.0f)
                close()
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(21.685f, 17.267f)
                lineToRelative(-3.041f, -0.507f)
                curveToRelative(-0.373f, -0.062f, -0.644f, -0.382f, -0.644f, -0.76f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.36f, 0.974f, 2.51f, 2.315f, 2.733f)
                lineToRelative(3.041f, 0.507f)
                curveToRelative(0.373f, 0.062f, 0.644f, 0.382f, 0.644f, 0.76f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.36f, -0.974f, -2.51f, -2.315f, -2.733f)
                close()
            }
        }
        .build()
        return _fileInvoiceDollar!!
    }

private var _fileInvoiceDollar: ImageVector? = null
