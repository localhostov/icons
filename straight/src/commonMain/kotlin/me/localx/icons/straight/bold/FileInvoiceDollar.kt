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

public val Icons.Bold.FileInvoiceDollar: ImageVector
    get() {
        if (_fileInvoiceDollar != null) {
            return _fileInvoiceDollar!!
        }
        _fileInvoiceDollar = Builder(name = "FileInvoiceDollar", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                lineTo(14.0f, 15.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(5.0f, 13.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                lineTo(5.0f, 10.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(10.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.582f, -1.056f, -2.923f, -2.5f, -3.354f)
                verticalLineToRelative(-1.146f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.146f)
                curveToRelative(-1.444f, 0.431f, -2.5f, 1.772f, -2.5f, 3.354f)
                curveToRelative(0.0f, 1.528f, 0.917f, 2.882f, 2.336f, 3.45f)
                lineToRelative(2.214f, 0.886f)
                curveToRelative(0.273f, 0.109f, 0.45f, 0.37f, 0.45f, 0.665f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.582f, 1.056f, 2.923f, 2.5f, 3.354f)
                verticalLineToRelative(1.146f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.146f)
                curveToRelative(1.444f, -0.431f, 2.5f, -1.772f, 2.5f, -3.354f)
                curveToRelative(0.0f, -1.528f, -0.917f, -2.882f, -2.336f, -3.45f)
                lineToRelative(-2.214f, -0.886f)
                curveToRelative(-0.273f, -0.109f, -0.45f, -0.37f, -0.45f, -0.665f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(14.213f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.0f)
                lineTo(12.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.335f)
                lineTo(14.382f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(16.348f, 24.0f)
                curveToRelative(-1.021f, -0.717f, -1.785f, -1.771f, -2.135f, -3.0f)
                close()
            }
        }
        .build()
        return _fileInvoiceDollar!!
    }

private var _fileInvoiceDollar: ImageVector? = null
