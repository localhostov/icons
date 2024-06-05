package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveToRelative(17.5f, 0.0f)
                lineTo(6.5f, 0.0f)
                curveTo(4.019f, 0.0f, 2.0f, 2.019f, 2.0f, 4.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(3.997f)
                lineToRelative(-0.009f, 5.336f)
                lineToRelative(-1.439f, -1.409f)
                curveToRelative(-0.592f, -0.579f, -1.542f, -0.569f, -2.121f, 0.023f)
                curveToRelative(-0.58f, 0.592f, -0.569f, 1.542f, 0.022f, 2.121f)
                lineToRelative(3.266f, 3.196f)
                curveToRelative(0.489f, 0.49f, 1.133f, 0.733f, 1.773f, 0.733f)
                curveToRelative(0.636f, 0.0f, 1.268f, -0.24f, 1.745f, -0.717f)
                lineToRelative(3.309f, -3.207f)
                curveToRelative(0.595f, -0.577f, 0.61f, -1.526f, 0.033f, -2.121f)
                curveToRelative(-0.578f, -0.595f, -1.526f, -0.61f, -2.121f, -0.033f)
                lineToRelative(-1.467f, 1.422f)
                lineToRelative(0.009f, -5.345f)
                horizontalLineToRelative(4.003f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(19.0f, 9.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                lineTo(6.5f, 11.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(5.0f)
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
