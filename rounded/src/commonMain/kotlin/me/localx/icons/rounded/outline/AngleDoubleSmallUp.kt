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

public val Icons.Outline.AngleDoubleSmallUp: ImageVector
    get() {
        if (_angleDoubleSmallUp != null) {
            return _angleDoubleSmallUp!!
        }
        _angleDoubleSmallUp = Builder(name = "AngleDoubleSmallUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                curveToRelative(-0.257f, 0.0f, -0.514f, -0.099f, -0.709f, -0.295f)
                curveToRelative(-0.39f, -0.392f, -0.388f, -1.025f, 0.004f, -1.415f)
                lineToRelative(6.001f, -5.964f)
                curveToRelative(0.391f, -0.388f, 1.02f, -0.387f, 1.41f, 0.0f)
                lineToRelative(5.999f, 5.964f)
                curveToRelative(0.392f, 0.389f, 0.394f, 1.022f, 0.004f, 1.414f)
                curveToRelative(-0.389f, 0.393f, -1.021f, 0.395f, -1.414f, 0.004f)
                lineToRelative(-5.294f, -5.263f)
                lineToRelative(-5.296f, 5.264f)
                curveToRelative(-0.195f, 0.194f, -0.45f, 0.291f, -0.705f, 0.291f)
                close()
                moveTo(18.712f, 11.44f)
                curveToRelative(0.388f, -0.393f, 0.384f, -1.026f, -0.01f, -1.414f)
                lineToRelative(-3.925f, -3.875f)
                curveToRelative(-0.741f, -0.742f, -1.728f, -1.151f, -2.777f, -1.151f)
                reflectiveCurveToRelative(-2.036f, 0.409f, -2.772f, 1.146f)
                lineToRelative(-3.93f, 3.88f)
                curveToRelative(-0.394f, 0.388f, -0.397f, 1.021f, -0.01f, 1.414f)
                curveToRelative(0.39f, 0.394f, 1.021f, 0.396f, 1.414f, 0.009f)
                lineToRelative(3.935f, -3.884f)
                curveToRelative(0.729f, -0.729f, 1.993f, -0.733f, 2.731f, 0.004f)
                lineToRelative(3.93f, 3.88f)
                curveToRelative(0.194f, 0.192f, 0.448f, 0.289f, 0.702f, 0.289f)
                curveToRelative(0.258f, 0.0f, 0.516f, -0.099f, 0.712f, -0.297f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallUp!!
    }

private var _angleDoubleSmallUp: ImageVector? = null
