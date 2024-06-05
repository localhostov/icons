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
                lineTo(5.003f, 24.0f)
                curveToRelative(-1.048f, 0.0f, -2.002f, -0.532f, -2.553f, -1.423f)
                curveToRelative(-0.55f, -0.891f, -0.6f, -1.982f, -0.131f, -2.919f)
                lineToRelative(3.829f, -7.658f)
                horizontalLineToRelative(11.703f)
                lineToRelative(3.829f, 7.658f)
                close()
                moveTo(22.0f, 3.0f)
                lineTo(22.0f, 15.824f)
                lineToRelative(-2.978f, -5.824f)
                lineTo(4.977f, 10.0f)
                lineToRelative(-2.977f, 5.824f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.346f, 3.346f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _rampLoading!!
    }

private var _rampLoading: ImageVector? = null
