package me.localx.icons.straight.outline

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

public val Icons.Outline.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.994f, 10.185f)
                curveToRelative(-0.044f, -0.667f, -0.346f, -1.275f, -0.836f, -1.703f)
                lineToRelative(-6.882f, -6.229f)
                curveTo(12.217f, -1.299f, 8.074f, 0.12f, 6.448f, 1.367f)
                lineToRelative(-0.958f, 0.735f)
                lineToRelative(5.76f, 5.137f)
                lineTo(0.074f, 20.018f)
                lineToRelative(4.518f, 3.949f)
                lineTo(15.727f, 11.233f)
                lineToRelative(2.811f, 2.507f)
                curveToRelative(0.459f, 0.401f, 1.037f, 0.618f, 1.642f, 0.618f)
                curveToRelative(0.057f, 0.0f, 0.113f, -0.002f, 0.171f, -0.006f)
                curveToRelative(0.666f, -0.045f, 1.275f, -0.346f, 1.715f, -0.849f)
                lineToRelative(1.316f, -1.506f)
                curveToRelative(0.439f, -0.503f, 0.657f, -1.146f, 0.612f, -1.812f)
                close()
                moveTo(14.947f, 3.746f)
                lineToRelative(4.286f, 3.88f)
                lineToRelative(-1.992f, 2.277f)
                lineTo(8.781f, 2.357f)
                curveToRelative(1.308f, -0.509f, 3.617f, -0.84f, 6.166f, 1.389f)
                close()
                moveTo(4.402f, 21.145f)
                lineToRelative(-1.506f, -1.316f)
                lineTo(12.743f, 8.571f)
                lineToRelative(1.492f, 1.331f)
                lineTo(4.402f, 21.145f)
                close()
                moveTo(21.876f, 10.681f)
                lineToRelative(-1.316f, 1.506f)
                curveToRelative(-0.118f, 0.135f, -0.266f, 0.164f, -0.343f, 0.169f)
                curveToRelative(-0.076f, 0.008f, -0.228f, -0.005f, -0.354f, -0.115f)
                lineToRelative(-1.128f, -1.006f)
                lineToRelative(1.982f, -2.266f)
                lineToRelative(1.112f, 1.007f)
                curveToRelative(0.136f, 0.118f, 0.165f, 0.266f, 0.17f, 0.343f)
                curveToRelative(0.005f, 0.076f, -0.004f, 0.227f, -0.123f, 0.362f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
