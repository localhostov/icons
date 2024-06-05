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

public val Icons.Filled.PipeSmoking: ImageVector
    get() {
        if (_pipeSmoking != null) {
            return _pipeSmoking!!
        }
        _pipeSmoking = Builder(name = "PipeSmoking", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.674f, 11.955f)
                curveToRelative(0.765f, -1.043f, 2.221f, -1.288f, 3.285f, -0.551f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.074f, 0.743f, 1.351f, 2.211f, 0.623f, 3.295f)
                lineToRelative(-4.445f, 6.511f)
                curveToRelative(-1.225f, 1.748f, -3.226f, 2.789f, -5.361f, 2.789f)
                horizontalLineToRelative(-1.206f)
                curveToRelative(-2.508f, 0.0f, -4.571f, -2.024f, -4.574f, -4.532f)
                curveToRelative(-0.004f, -2.848f, 0.383f, -4.895f, 0.806f, -6.884f)
                curveToRelative(0.196f, -0.924f, 1.015f, -1.583f, 1.96f, -1.581f)
                lineToRelative(3.89f, 0.007f)
                curveToRelative(0.934f, 0.002f, 1.743f, 0.652f, 1.948f, 1.563f)
                curveToRelative(0.203f, 0.904f, 0.398f, 1.787f, 0.545f, 2.779f)
                lineToRelative(2.53f, -3.397f)
                close()
                moveTo(23.0f, 0.0f)
                curveToRelative(-1.22f, 0.0f, -2.362f, 0.6f, -3.082f, 1.642f)
                lineToRelative(-4.696f, 7.659f)
                curveToRelative(0.301f, 0.121f, 0.596f, 0.266f, 0.875f, 0.459f)
                curveToRelative(0.29f, 0.201f, 0.538f, 0.439f, 0.764f, 0.692f)
                lineToRelative(4.727f, -7.711f)
                curveToRelative(0.321f, -0.463f, 0.849f, -0.74f, 1.412f, -0.74f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _pipeSmoking!!
    }

private var _pipeSmoking: ImageVector? = null
