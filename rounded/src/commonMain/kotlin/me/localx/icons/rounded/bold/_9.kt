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

public val Icons.Bold._9: ImageVector
    get() {
        if (__9 != null) {
            return __9!!
        }
        __9 = Builder(name = "_9", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.987f, 7.805f)
                curveTo(19.758f, 3.636f, 16.42f, 0.182f, 12.351f, 0.008f)
                curveToRelative(-2.154f, -0.099f, -4.205f, 0.66f, -5.782f, 2.119f)
                curveToRelative(-1.578f, 1.46f, -2.488f, 3.445f, -2.563f, 5.591f)
                curveToRelative(-0.073f, 2.103f, 0.737f, 4.206f, 2.225f, 5.771f)
                curveToRelative(1.484f, 1.562f, 3.54f, 2.478f, 5.64f, 2.512f)
                curveToRelative(1.904f, 0.015f, 3.648f, -0.577f, 5.091f, -1.721f)
                curveToRelative(-0.391f, 3.771f, -3.587f, 6.721f, -7.46f, 6.721f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(5.79f, 0.0f, 10.5f, -4.71f, 10.5f, -10.5f)
                curveToRelative(0.0f, 0.0f, -0.004f, -5.631f, -0.013f, -5.695f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.239f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.239f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.239f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return __9!!
    }

private var __9: ImageVector? = null
