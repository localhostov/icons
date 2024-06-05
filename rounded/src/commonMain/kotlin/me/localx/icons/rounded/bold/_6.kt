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

public val Icons.Bold._6: ImageVector
    get() {
        if (__6 != null) {
            return __6!!
        }
        __6 = Builder(name = "_6", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.771f, 10.513f)
                curveToRelative(-1.484f, -1.562f, -3.541f, -2.478f, -5.641f, -2.512f)
                curveToRelative(-1.862f, -0.011f, -3.647f, 0.576f, -5.09f, 1.721f)
                curveToRelative(0.391f, -3.771f, 3.587f, -6.721f, 7.46f, -6.721f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                curveTo(8.71f, 0.0f, 4.0f, 4.71f, 4.0f, 10.5f)
                curveToRelative(0.0f, 0.0f, 0.004f, 5.631f, 0.013f, 5.695f)
                curveToRelative(0.229f, 4.169f, 3.567f, 7.623f, 7.637f, 7.797f)
                curveToRelative(0.118f, 0.005f, 0.236f, 0.008f, 0.354f, 0.008f)
                curveToRelative(2.022f, 0.0f, 3.938f, -0.748f, 5.429f, -2.127f)
                curveToRelative(1.578f, -1.46f, 2.488f, -3.445f, 2.563f, -5.59f)
                curveToRelative(0.073f, -2.103f, -0.737f, -4.206f, -2.224f, -5.77f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-2.761f, 0.0f, -5.0f, -2.239f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.239f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.239f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.239f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return __6!!
    }

private var __6: ImageVector? = null
