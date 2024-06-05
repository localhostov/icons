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
                verticalLineToRelative(-0.904f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.904f)
                curveToRelative(0.0f, 1.707f, 1.389f, 3.096f, 3.096f, 3.096f)
                horizontalLineToRelative(7.809f)
                curveToRelative(1.707f, 0.0f, 3.096f, -1.389f, 3.096f, -3.096f)
                curveToRelative(0.0f, -1.372f, -0.921f, -2.595f, -2.24f, -2.975f)
                lineToRelative(-10.35f, -2.977f)
                curveToRelative(-2.597f, -0.747f, -4.41f, -3.155f, -4.41f, -5.857f)
                curveTo(2.0f, 2.734f, 4.734f, 0.0f, 8.096f, 0.0f)
                horizontalLineToRelative(7.809f)
                curveToRelative(3.361f, 0.0f, 6.096f, 2.734f, 6.096f, 6.096f)
                verticalLineToRelative(0.904f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.904f)
                curveToRelative(0.0f, -1.707f, -1.389f, -3.096f, -3.096f, -3.096f)
                horizontalLineToRelative(-7.809f)
                curveToRelative(-1.707f, 0.0f, -3.096f, 1.389f, -3.096f, 3.096f)
                curveToRelative(0.0f, 1.372f, 0.921f, 2.595f, 2.24f, 2.975f)
                lineToRelative(10.35f, 2.977f)
                curveToRelative(2.597f, 0.747f, 4.41f, 3.155f, 4.41f, 5.857f)
                curveToRelative(0.0f, 3.361f, -2.734f, 6.096f, -6.096f, 6.096f)
                close()
            }
        }
        .build()
        return _s!!
    }

private var _s: ImageVector? = null
