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

public val Icons.Bold.Tshirt: ImageVector
    get() {
        if (_tshirt != null) {
            return _tshirt!!
        }
        _tshirt = Builder(name = "Tshirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.672f, 1.206f)
                curveToRelative(-1.489f, -0.8f, -3.061f, -1.206f, -4.672f, -1.206f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.611f, 0.0f, -3.183f, 0.406f, -4.672f, 1.206f)
                curveTo(1.275f, 2.308f, 0.0f, 4.482f, 0.0f, 6.88f)
                verticalLineToRelative(6.12f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-6.12f)
                curveToRelative(0.0f, -2.397f, -1.275f, -4.572f, -3.328f, -5.674f)
                close()
                moveTo(21.0f, 10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.12f)
                curveToRelative(0.0f, -1.291f, 0.669f, -2.453f, 1.747f, -3.032f)
                curveToRelative(1.048f, -0.562f, 2.411f, -0.848f, 3.521f, -0.848f)
                curveToRelative(0.805f, 1.205f, 2.173f, 2.0f, 3.732f, 2.0f)
                reflectiveCurveToRelative(2.927f, -0.795f, 3.732f, -2.0f)
                curveToRelative(1.11f, 0.0f, 2.473f, 0.286f, 3.52f, 0.848f)
                curveToRelative(1.078f, 0.579f, 1.748f, 1.741f, 1.748f, 3.032f)
                verticalLineToRelative(3.12f)
                close()
            }
        }
        .build()
        return _tshirt!!
    }

private var _tshirt: ImageVector? = null
