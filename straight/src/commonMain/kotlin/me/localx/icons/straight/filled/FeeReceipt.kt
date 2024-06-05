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

public val Icons.Filled.FeeReceipt: ImageVector
    get() {
        if (_feeReceipt != null) {
            return _feeReceipt!!
        }
        _feeReceipt = Builder(name = "FeeReceipt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(20.927f)
                lineToRelative(3.63f, -2.204f)
                lineToRelative(2.704f, 1.881f)
                lineToRelative(2.667f, -1.854f)
                lineToRelative(2.666f, 1.855f)
                lineToRelative(2.704f, -1.88f)
                lineToRelative(3.63f, 2.209f)
                lineTo(21.001f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(9.5f, 6.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.801f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.6f)
                lineTo(6.0f, 5.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(14.0f, 6.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.801f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3.5f)
                lineTo(10.5f, 5.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(18.5f, 6.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.801f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3.5f)
                lineTo(15.0f, 5.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1.6f)
                close()
            }
        }
        .build()
        return _feeReceipt!!
    }

private var _feeReceipt: ImageVector? = null
