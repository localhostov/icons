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

public val Icons.Filled.HeadVr: ImageVector
    get() {
        if (_headVr != null) {
            return _headVr!!
        }
        _headVr = Builder(name = "HeadVr", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                lineTo(15.5f, 13.0f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(10.025f, 9.0f)
                curveToRelative(0.254f, -2.799f, 2.611f, -5.0f, 5.475f, -5.0f)
                horizontalLineToRelative(3.942f)
                curveTo(16.993f, 1.039f, 13.302f, -0.426f, 9.453f, 0.106f)
                curveTo(4.786f, 0.748f, 1.029f, 4.414f, 0.183f, 9.0f)
                lineTo(10.025f, 9.0f)
                close()
                moveTo(15.5f, 15.0f)
                curveToRelative(-2.512f, 0.0f, -4.631f, -1.695f, -5.287f, -4.0f)
                lineTo(0.004f, 11.0f)
                curveToRelative(0.0f, 2.572f, 0.882f, 5.037f, 2.539f, 7.029f)
                curveToRelative(0.295f, 0.353f, 0.457f, 0.801f, 0.457f, 1.262f)
                verticalLineToRelative(4.709f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.247f)
                curveToRelative(1.5f, 0.0f, 2.778f, -1.121f, 2.974f, -2.606f)
                lineToRelative(0.449f, -3.394f)
                horizontalLineToRelative(-6.17f)
                close()
            }
        }
        .build()
        return _headVr!!
    }

private var _headVr: ImageVector? = null
