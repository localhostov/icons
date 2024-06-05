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

public val Icons.Filled.Massage: ImageVector
    get() {
        if (_massage != null) {
            return _massage!!
        }
        _massage = Builder(name = "Massage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 22.0f)
                curveTo(5.66f, 22.0f, 1.03f, 18.04f, 0.031f, 12.993f)
                curveToRelative(-0.224f, -1.134f, 0.804f, -2.162f, 1.938f, -1.938f)
                curveToRelative(5.047f, 0.999f, 9.031f, 5.604f, 9.031f, 10.944f)
                close()
                moveTo(16.995f, 11.053f)
                curveToRelative(-0.168f, -2.642f, -1.64f, -5.558f, -3.544f, -7.932f)
                curveToRelative(-0.745f, -0.929f, -2.156f, -0.929f, -2.902f, 0.0f)
                curveToRelative(-1.904f, 2.374f, -3.377f, 5.29f, -3.544f, 7.932f)
                curveToRelative(2.213f, 1.421f, 3.969f, 3.495f, 4.995f, 5.947f)
                curveToRelative(1.026f, -2.452f, 2.782f, -4.526f, 4.995f, -5.947f)
                close()
                moveTo(22.031f, 11.056f)
                curveToRelative(-5.047f, 0.999f, -9.031f, 5.604f, -9.031f, 10.944f)
                curveToRelative(5.34f, 0.0f, 9.97f, -3.96f, 10.969f, -9.007f)
                curveToRelative(0.224f, -1.134f, -0.804f, -2.162f, -1.938f, -1.938f)
                close()
            }
        }
        .build()
        return _massage!!
    }

private var _massage: ImageVector? = null
