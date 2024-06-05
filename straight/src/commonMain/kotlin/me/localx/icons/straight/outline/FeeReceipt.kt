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

public val Icons.Outline.FeeReceipt: ImageVector
    get() {
        if (_feeReceipt != null) {
            return _feeReceipt!!
        }
        _feeReceipt = Builder(name = "FeeReceipt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.934f)
                lineToRelative(-3.63f, -2.209f)
                lineToRelative(-2.704f, 1.88f)
                lineToRelative(-2.666f, -1.855f)
                lineToRelative(-2.667f, 1.854f)
                lineToRelative(-2.704f, -1.881f)
                lineToRelative(-3.63f, 2.204f)
                lineTo(2.999f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                lineTo(6.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(17.372f)
                lineToRelative(1.704f, -1.034f)
                lineToRelative(2.629f, 1.83f)
                lineToRelative(2.667f, -1.854f)
                lineToRelative(2.667f, 1.855f)
                lineToRelative(2.631f, -1.829f)
                lineToRelative(1.702f, 1.035f)
                verticalLineToRelative(-5.375f)
                close()
                moveTo(12.0f, 6.6f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.801f)
                horizontalLineToRelative(1.9f)
                close()
                moveTo(16.5f, 6.6f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.4f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.801f)
                horizontalLineToRelative(1.9f)
                close()
                moveTo(17.5f, 13.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.4f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.9f)
                verticalLineToRelative(-1.801f)
                horizontalLineToRelative(1.9f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _feeReceipt!!
    }

private var _feeReceipt: ImageVector? = null
