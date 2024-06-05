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

public val Icons.Filled.Axe: ImageVector
    get() {
        if (_axe != null) {
            return _axe!!
        }
        _axe = Builder(name = "Axe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.53f, 6.77f)
                curveToRelative(-0.353f, -0.421f, -0.87f, -0.681f, -1.418f, -0.713f)
                curveToRelative(-0.759f, -0.045f, -2.074f, -0.214f, -2.927f, -0.828f)
                lineToRelative(1.521f, -1.521f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-1.542f, 1.542f)
                lineToRelative(-1.946f, -1.952f)
                curveToRelative(-0.566f, -0.569f, -1.32f, -0.882f, -2.123f, -0.883f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.801f, 0.0f, -1.554f, 0.312f, -2.121f, 0.879f)
                lineToRelative(-1.678f, 1.678f)
                curveToRelative(-1.167f, 1.167f, -1.169f, 3.068f, -0.004f, 4.239f)
                lineToRelative(3.101f, 3.11f)
                curveToRelative(0.806f, 0.807f, 1.02f, 2.363f, 1.075f, 3.218f)
                curveToRelative(0.036f, 0.545f, 0.296f, 1.059f, 0.716f, 1.409f)
                curveToRelative(0.362f, 0.302f, 0.821f, 0.466f, 1.289f, 0.466f)
                curveToRelative(0.076f, 0.0f, 0.151f, -0.004f, 0.227f, -0.013f)
                curveToRelative(4.195f, -0.482f, 7.219f, -3.504f, 7.705f, -7.698f)
                curveToRelative(0.063f, -0.545f, -0.103f, -1.099f, -0.456f, -1.52f)
                close()
                moveTo(11.649f, 11.351f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                lineTo(1.707f, 22.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(9.942f, -9.942f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _axe!!
    }

private var _axe: ImageVector? = null
