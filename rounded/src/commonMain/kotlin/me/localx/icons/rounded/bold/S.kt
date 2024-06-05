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

public val Icons.Bold.S: ImageVector
    get() {
        if (_s != null) {
            return _s!!
        }
        _s = Builder(name = "S", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.904f, 24.0f)
                horizontalLineToRelative(-7.809f)
                curveToRelative(-3.361f, 0.0f, -6.096f, -2.734f, -6.096f, -6.096f)
                verticalLineToRelative(-0.404f)
                curveToRelative(0.034f, -1.972f, 2.966f, -1.971f, 3.0f, 0.0f)
                verticalLineToRelative(0.404f)
                curveToRelative(0.0f, 1.707f, 1.389f, 3.096f, 3.096f, 3.096f)
                horizontalLineToRelative(7.809f)
                curveToRelative(3.547f, -0.012f, 4.252f, -5.079f, 0.855f, -6.07f)
                lineToRelative(-10.35f, -2.977f)
                curveTo(-0.292f, 9.938f, 1.088f, 0.077f, 8.096f, 0.0f)
                horizontalLineToRelative(7.809f)
                curveToRelative(3.361f, 0.0f, 6.096f, 2.734f, 6.096f, 6.096f)
                verticalLineToRelative(0.404f)
                curveToRelative(-0.034f, 1.972f, -2.966f, 1.971f, -3.0f, 0.0f)
                verticalLineToRelative(-0.404f)
                curveToRelative(0.0f, -1.707f, -1.389f, -3.096f, -3.096f, -3.096f)
                horizontalLineToRelative(-7.809f)
                curveToRelative(-3.547f, 0.012f, -4.252f, 5.079f, -0.855f, 6.07f)
                lineToRelative(10.35f, 2.977f)
                curveToRelative(6.702f, 2.015f, 5.322f, 11.876f, -1.686f, 11.953f)
                close()
            }
        }
        .build()
        return _s!!
    }

private var _s: ImageVector? = null
