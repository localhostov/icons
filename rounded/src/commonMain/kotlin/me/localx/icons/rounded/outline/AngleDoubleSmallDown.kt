package me.localx.icons.rounded.outline

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

public val Icons.Outline.AngleDoubleSmallDown: ImageVector
    get() {
        if (_angleDoubleSmallDown != null) {
            return _angleDoubleSmallDown!!
        }
        _angleDoubleSmallDown = Builder(name = "AngleDoubleSmallDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveToRelative(-1.049f, 0.0f, -2.036f, -0.409f, -2.778f, -1.151f)
                lineToRelative(-3.925f, -3.875f)
                curveToRelative(-0.393f, -0.388f, -0.397f, -1.021f, -0.009f, -1.414f)
                curveToRelative(0.387f, -0.394f, 1.021f, -0.396f, 1.414f, -0.009f)
                lineToRelative(3.929f, 3.88f)
                curveToRelative(0.737f, 0.737f, 2.003f, 0.733f, 2.731f, 0.004f)
                lineToRelative(3.935f, -3.884f)
                curveToRelative(0.392f, -0.388f, 1.023f, -0.385f, 1.414f, 0.009f)
                curveToRelative(0.388f, 0.393f, 0.384f, 1.026f, -0.01f, 1.414f)
                lineToRelative(-3.93f, 3.88f)
                curveToRelative(-0.736f, 0.738f, -1.723f, 1.146f, -2.772f, 1.146f)
                close()
                moveTo(12.706f, 13.673f)
                lineToRelative(5.999f, -5.964f)
                curveToRelative(0.392f, -0.389f, 0.394f, -1.022f, 0.004f, -1.414f)
                curveToRelative(-0.39f, -0.393f, -1.022f, -0.395f, -1.414f, -0.004f)
                lineToRelative(-5.294f, 5.263f)
                lineTo(6.705f, 6.291f)
                curveToRelative(-0.391f, -0.389f, -1.024f, -0.386f, -1.415f, 0.004f)
                curveToRelative(-0.389f, 0.392f, -0.387f, 1.025f, 0.004f, 1.415f)
                lineToRelative(6.001f, 5.964f)
                curveToRelative(0.195f, 0.194f, 0.45f, 0.291f, 0.705f, 0.291f)
                reflectiveCurveToRelative(0.51f, -0.097f, 0.705f, -0.291f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallDown!!
    }

private var _angleDoubleSmallDown: ImageVector? = null
