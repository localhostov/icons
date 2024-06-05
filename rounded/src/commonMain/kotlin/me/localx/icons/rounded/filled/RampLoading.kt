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

public val Icons.Filled.RampLoading: ImageVector
    get() {
        if (_rampLoading != null) {
            return _rampLoading!!
        }
        _rampLoading = Builder(name = "RampLoading", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.681f, 19.658f)
                curveToRelative(0.469f, 0.937f, 0.419f, 2.028f, -0.131f, 2.919f)
                curveToRelative(-0.551f, 0.891f, -1.505f, 1.423f, -2.553f, 1.423f)
                horizontalLineTo(5.003f)
                curveToRelative(-1.048f, 0.0f, -2.002f, -0.532f, -2.553f, -1.423f)
                curveToRelative(-0.55f, -0.891f, -0.6f, -1.982f, -0.131f, -2.919f)
                lineToRelative(2.724f, -5.447f)
                curveToRelative(0.682f, -1.364f, 2.053f, -2.211f, 3.578f, -2.211f)
                horizontalLineToRelative(6.758f)
                curveToRelative(1.525f, 0.0f, 2.896f, 0.847f, 3.578f, 2.211f)
                lineToRelative(2.724f, 5.447f)
                close()
                moveTo(3.256f, 13.316f)
                curveToRelative(1.022f, -2.045f, 3.079f, -3.316f, 5.367f, -3.316f)
                horizontalLineToRelative(6.758f)
                curveToRelative(2.288f, 0.0f, 4.345f, 1.271f, 5.367f, 3.317f)
                lineToRelative(1.252f, 2.503f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineTo(7.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineTo(15.828f)
                lineToRelative(1.256f, -2.512f)
                close()
            }
        }
        .build()
        return _rampLoading!!
    }

private var _rampLoading: ImageVector? = null
