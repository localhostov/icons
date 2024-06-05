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

public val Icons.Bold.CheapBill: ImageVector
    get() {
        if (_cheapBill != null) {
            return _cheapBill!!
        }
        _cheapBill = Builder(name = "CheapBill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 14.0f)
                lineTo(22.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.5f, 0.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(8.497f)
                lineToRelative(-0.009f, 5.298f)
                lineToRelative(-1.893f, -1.893f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(3.742f, 3.742f)
                curveToRelative(0.489f, 0.489f, 1.131f, 0.733f, 1.772f, 0.733f)
                curveToRelative(0.637f, 0.0f, 1.271f, -0.241f, 1.751f, -0.721f)
                lineToRelative(3.801f, -3.715f)
                lineToRelative(-2.097f, -2.146f)
                lineToRelative(-1.955f, 1.911f)
                lineToRelative(0.009f, -5.33f)
                horizontalLineToRelative(8.503f)
                close()
                moveTo(5.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 3.5f)
                close()
                moveTo(15.0f, 7.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _cheapBill!!
    }

private var _cheapBill: ImageVector? = null
