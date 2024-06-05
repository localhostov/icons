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

public val Icons.Bold.P: ImageVector
    get() {
        if (_p != null) {
            return _p!!
        }
        _p = Builder(name = "P", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 24.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(2.0f, 5.5f)
                curveTo(2.0f, 2.468f, 4.467f, 0.0f, 7.5f, 0.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(9.929f, 0.353f, 9.922f, 14.65f, 0.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(5.0f, 12.0f)
                lineTo(14.5f, 12.0f)
                curveToRelative(5.935f, -0.156f, 5.931f, -8.846f, 0.0f, -9.0f)
                lineTo(7.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                close()
            }
        }
        .build()
        return _p!!
    }

private var _p: ImageVector? = null
