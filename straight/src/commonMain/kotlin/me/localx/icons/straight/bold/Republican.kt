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

public val Icons.Bold.Republican: ImageVector
    get() {
        if (_republican != null) {
            return _republican!!
        }
        _republican = Builder(name = "Republican", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.98f, 17.0f)
                verticalLineToRelative(1.501f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.499f, -0.499f, 0.499f)
                curveToRelative(-0.165f, 0.0f, -0.275f, -0.076f, -0.338f, -0.14f)
                curveToRelative(-0.054f, -0.055f, -0.144f, -0.174f, -0.144f, -0.361f)
                lineTo(19.999f, 8.502f)
                curveToRelative(0.002f, -1.736f, -0.673f, -3.369f, -1.901f, -4.598f)
                curveToRelative(-1.229f, -1.231f, -2.864f, -1.909f, -4.604f, -1.909f)
                lineTo(6.5f, 1.995f)
                curveTo(2.916f, 1.995f, 0.0f, 4.911f, 0.0f, 8.495f)
                verticalLineToRelative(13.505f)
                lineTo(5.987f, 22.0f)
                lineToRelative(0.01f, -4.0f)
                horizontalLineToRelative(3.003f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.498f)
                curveToRelative(0.0f, 0.933f, 0.357f, 1.81f, 1.009f, 2.47f)
                curveToRelative(0.657f, 0.665f, 1.536f, 1.032f, 2.473f, 1.032f)
                curveToRelative(1.929f, 0.0f, 3.499f, -1.569f, 3.499f, -3.499f)
                verticalLineToRelative(-1.501f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(6.5f, 4.995f)
                horizontalLineToRelative(6.995f)
                curveToRelative(0.938f, 0.0f, 1.818f, 0.365f, 2.481f, 1.029f)
                curveToRelative(0.661f, 0.661f, 1.024f, 1.54f, 1.023f, 2.476f)
                verticalLineToRelative(4.5f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(-4.505f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(11.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(6.0f, 9.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _republican!!
    }

private var _republican: ImageVector? = null
