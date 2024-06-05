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

public val Icons.Filled.ShieldSecurityRisk: ImageVector
    get() {
        if (_shieldSecurityRisk != null) {
            return _shieldSecurityRisk!!
        }
        _shieldSecurityRisk = Builder(name = "ShieldSecurityRisk", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.308f, 0.0f, -6.0f, 2.692f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.692f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.692f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.692f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(11.93f, 23.202f)
                curveToRelative(-0.888f, 0.427f, -1.517f, 0.644f, -1.613f, 0.676f)
                lineToRelative(-0.368f, 0.122f)
                lineToRelative(-0.354f, -0.157f)
                curveToRelative(-0.392f, -0.173f, -9.594f, -4.328f, -9.594f, -11.852f)
                verticalLineToRelative(-6.51f)
                curveToRelative(0.0f, -1.293f, 0.828f, -2.441f, 2.056f, -2.848f)
                lineTo(10.0f, 0.0f)
                lineToRelative(7.944f, 2.634f)
                curveToRelative(1.227f, 0.407f, 2.056f, 1.555f, 2.056f, 2.848f)
                verticalLineToRelative(4.781f)
                curveToRelative(-0.64f, -0.165f, -1.308f, -0.262f, -2.0f, -0.262f)
                curveToRelative(-4.418f, 0.0f, -8.0f, 3.582f, -8.0f, 8.0f)
                curveToRelative(0.0f, 1.988f, 0.729f, 3.803f, 1.93f, 5.202f)
                close()
            }
        }
        .build()
        return _shieldSecurityRisk!!
    }

private var _shieldSecurityRisk: ImageVector? = null
