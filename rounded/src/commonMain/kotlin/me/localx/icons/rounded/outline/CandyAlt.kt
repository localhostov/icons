package me.localx.icons.rounded.outline

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

public val Icons.Outline.CandyAlt: ImageVector
    get() {
        if (_candyAlt != null) {
            return _candyAlt!!
        }
        _candyAlt = Builder(name = "CandyAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.715f, 0.036f)
                curveTo(7.968f, -0.714f, 3.049f, 8.681f, 7.975f, 14.611f)
                lineTo(0.293f, 22.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                lineToRelative(7.682f, -7.682f)
                curveTo(15.068f, 20.742f, 24.107f, 16.446f, 24.0f, 9.0f)
                arcTo(9.006f, 9.006f, 0.0f, false, false, 15.715f, 0.036f)
                close()
                moveTo(15.0f, 16.0f)
                arcTo(7.009f, 7.009f, 0.0f, false, true, 8.0f, 9.0f)
                curveTo(7.786f, 1.742f, 19.233f, -1.307f, 20.0f, 7.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcToRelative(1.069f, 1.069f, 0.0f, false, true, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                curveToRelative(0.606f, 7.788f, 11.2f, 5.628f, 11.92f, -1.0f)
                arcTo(7.009f, 7.009f, 0.0f, false, true, 15.0f, 16.0f)
                close()
            }
        }
        .build()
        return _candyAlt!!
    }

private var _candyAlt: ImageVector? = null
