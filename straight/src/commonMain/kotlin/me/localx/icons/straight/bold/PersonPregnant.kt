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

public val Icons.Bold.PersonPregnant: ImageVector
    get() {
        if (_personPregnant != null) {
            return _personPregnant!!
        }
        _personPregnant = Builder(name = "PersonPregnant", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(19.0f, 15.0f)
                curveToRelative(0.0f, 1.795f, -0.971f, 4.667f, -1.082f, 4.988f)
                lineToRelative(-0.348f, 1.012f)
                horizontalLineToRelative(-2.57f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.199f)
                lineToRelative(1.492f, -11.934f)
                curveToRelative(0.218f, -1.748f, 1.711f, -3.066f, 3.473f, -3.066f)
                horizontalLineToRelative(1.469f)
                curveToRelative(1.762f, 0.0f, 3.255f, 1.318f, 3.473f, 3.066f)
                lineToRelative(0.081f, 0.642f)
                curveToRelative(1.954f, 1.023f, 3.212f, 3.045f, 3.212f, 5.292f)
                close()
                moveTo(16.0f, 15.0f)
                curveToRelative(0.0f, -1.284f, -0.83f, -2.421f, -2.065f, -2.83f)
                lineToRelative(-0.898f, -0.297f)
                lineToRelative(-0.306f, -2.434f)
                curveToRelative(-0.031f, -0.25f, -0.244f, -0.438f, -0.496f, -0.438f)
                horizontalLineToRelative(-1.469f)
                curveToRelative(-0.252f, 0.0f, -0.465f, 0.188f, -0.496f, 0.438f)
                lineToRelative(-0.267f, 2.136f)
                lineToRelative(3.168f, 1.584f)
                lineToRelative(-1.342f, 2.684f)
                lineToRelative(-2.221f, -1.111f)
                lineToRelative(-0.409f, 3.269f)
                horizontalLineToRelative(6.201f)
                curveToRelative(0.3f, -1.03f, 0.6f, -2.288f, 0.6f, -3.0f)
                close()
            }
        }
        .build()
        return _personPregnant!!
    }

private var _personPregnant: ImageVector? = null
