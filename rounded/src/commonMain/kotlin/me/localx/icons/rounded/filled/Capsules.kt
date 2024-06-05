package me.localx.icons.rounded.filled

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

public val Icons.Filled.Capsules: ImageVector
    get() {
        if (_capsules != null) {
            return _capsules!!
        }
        _capsules = Builder(name = "Capsules", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 11.0f)
                verticalLineToRelative(-5.0f)
                curveTo(0.0f, 2.692f, 2.692f, 0.0f, 6.0f, 0.0f)
                reflectiveCurveToRelative(6.0f, 2.692f, 6.0f, 6.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 11.0f)
                close()
                moveTo(0.0f, 13.0f)
                verticalLineToRelative(5.0f)
                curveTo(0.0f, 21.308f, 2.692f, 24.0f, 6.0f, 24.0f)
                reflectiveCurveToRelative(6.0f, -2.692f, 6.0f, -6.0f)
                verticalLineToRelative(-5.0f)
                lineTo(0.0f, 13.0f)
                close()
                moveTo(14.0f, 6.0f)
                verticalLineToRelative(5.886f)
                lineToRelative(5.923f, -3.162f)
                lineToRelative(-2.398f, -4.492f)
                curveToRelative(-1.08f, -2.023f, -3.143f, -3.188f, -5.287f, -3.228f)
                curveToRelative(1.1f, 1.37f, 1.762f, 3.106f, 1.762f, 4.996f)
                close()
                moveTo(23.281f, 15.013f)
                lineToRelative(-2.398f, -4.492f)
                lineToRelative(-6.883f, 3.674f)
                verticalLineToRelative(3.805f)
                curveToRelative(0.0f, 1.325f, -0.329f, 2.572f, -0.901f, 3.674f)
                curveToRelative(1.797f, 2.277f, 5.023f, 3.02f, 7.67f, 1.607f)
                curveToRelative(2.972f, -1.587f, 4.099f, -5.296f, 2.513f, -8.268f)
                close()
            }
        }
        .build()
        return _capsules!!
    }

private var _capsules: ImageVector? = null
