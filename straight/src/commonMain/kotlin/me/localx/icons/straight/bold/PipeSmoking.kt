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

public val Icons.Bold.PipeSmoking: ImageVector
    get() {
        if (_pipeSmoking != null) {
            return _pipeSmoking!!
        }
        _pipeSmoking = Builder(name = "PipeSmoking", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.624f, 0.0f)
                curveToRelative(-1.149f, 0.0f, -2.226f, 0.564f, -2.878f, 1.509f)
                lineToRelative(-6.151f, 8.895f)
                curveToRelative(-1.15f, -0.747f, -2.689f, -0.427f, -3.41f, 0.663f)
                lineToRelative(-0.017f, 0.022f)
                lineToRelative(-0.224f, -1.076f)
                lineToRelative(-8.664f, -0.016f)
                reflectiveCurveToRelative(-0.424f, 2.007f, -0.512f, 2.396f)
                curveTo(0.372f, 14.151f, -0.002f, 15.812f, 0.0f, 18.521f)
                curveToRelative(0.003f, 3.021f, 2.47f, 5.479f, 5.5f, 5.479f)
                horizontalLineToRelative(1.397f)
                curveToRelative(2.354f, 0.0f, 4.565f, -1.151f, 5.938f, -3.111f)
                lineToRelative(3.749f, -5.66f)
                curveToRelative(0.368f, -0.557f, 0.498f, -1.224f, 0.365f, -1.878f)
                curveToRelative(-0.108f, -0.528f, -0.375f, -0.996f, -0.798f, -1.37f)
                lineTo(22.214f, 3.215f)
                curveToRelative(0.093f, -0.135f, 0.246f, -0.215f, 0.41f, -0.215f)
                horizontalLineToRelative(1.376f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-1.376f)
                close()
                moveTo(10.356f, 19.2f)
                curveToRelative(-0.79f, 1.127f, -2.083f, 1.8f, -3.459f, 1.8f)
                horizontalLineToRelative(-1.397f)
                curveToRelative(-1.377f, 0.0f, -2.499f, -1.113f, -2.5f, -2.48f)
                curveToRelative(-0.002f, -2.375f, 0.321f, -3.808f, 0.695f, -5.466f)
                curveToRelative(0.004f, -0.018f, 0.008f, -0.034f, 0.012f, -0.052f)
                lineToRelative(3.794f, 0.008f)
                curveToRelative(0.127f, 0.63f, 0.223f, 1.161f, 0.348f, 2.005f)
                lineToRelative(0.538f, 3.637f)
                lineToRelative(3.981f, -5.488f)
                lineToRelative(1.426f, 0.847f)
                lineToRelative(-3.438f, 5.19f)
                close()
            }
        }
        .build()
        return _pipeSmoking!!
    }

private var _pipeSmoking: ImageVector? = null
