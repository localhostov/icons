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

public val Icons.Bold.TentArrowDownToLine: ImageVector
    get() {
        if (_tentArrowDownToLine != null) {
            return _tentArrowDownToLine!!
        }
        _tentArrowDownToLine = Builder(name = "TentArrowDownToLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.544f, 19.527f)
                lineTo(14.004f, 6.006f)
                lineTo(3.414f, 21.019f)
                lineTo(0.0f, 21.019f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(21.02f)
                curveToRelative(1.083f, 0.0f, 2.082f, -0.58f, 2.606f, -1.515f)
                curveToRelative(0.521f, -0.927f, 0.501f, -2.022f, -0.082f, -2.977f)
                close()
                moveTo(17.258f, 21.018f)
                lineToRelative(-3.258f, -4.537f)
                lineToRelative(-3.258f, 4.537f)
                horizontalLineToRelative(-3.726f)
                lineToRelative(6.979f, -9.582f)
                lineToRelative(6.938f, 9.582f)
                horizontalLineToRelative(-3.677f)
                close()
                moveTo(0.0f, 4.982f)
                horizontalLineToRelative(3.0f)
                lineTo(3.0f, -0.018f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-3.793f, 3.707f)
                curveToRelative(-0.391f, 0.391f, -1.024f, 0.391f, -1.414f, 0.0f)
                lineTo(0.0f, 4.982f)
                close()
            }
        }
        .build()
        return _tentArrowDownToLine!!
    }

private var _tentArrowDownToLine: ImageVector? = null
