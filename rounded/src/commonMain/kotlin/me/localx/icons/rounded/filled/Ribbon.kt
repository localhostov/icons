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

public val Icons.Filled.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.586f, 19.295f)
                lineToRelative(-4.09f, 4.12f)
                curveToRelative(-0.781f, 0.781f, -2.047f, 0.781f, -2.828f, 0.0f)
                lineToRelative(-1.102f, -1.102f)
                curveToRelative(-0.783f, -0.783f, -0.781f, -2.053f, 0.005f, -2.833f)
                lineToRelative(4.096f, -4.104f)
                lineToRelative(3.919f, 3.919f)
                close()
                moveTo(10.625f, 8.855f)
                lineToRelative(0.008f, -0.007f)
                curveToRelative(-0.677f, -0.562f, -1.522f, -1.497f, -2.445f, -2.421f)
                curveToRelative(-0.663f, -0.663f, -0.807f, -2.07f, -0.168f, -2.812f)
                curveToRelative(1.191f, -1.187f, 2.38f, -1.615f, 3.981f, -1.615f)
                reflectiveCurveToRelative(2.902f, 0.43f, 4.094f, 1.616f)
                curveToRelative(0.639f, 0.742f, 0.387f, 2.172f, -0.131f, 2.697f)
                curveToRelative(-1.019f, 1.03f, -1.82f, 1.985f, -2.497f, 2.546f)
                lineToRelative(3.791f, 3.767f)
                lineToRelative(0.689f, -0.689f)
                curveToRelative(1.373f, -1.373f, 2.032f, -3.173f, 2.055f, -4.937f)
                curveToRelative(0.022f, -1.743f, -0.716f, -3.439f, -2.13f, -4.737f)
                curveTo(17.038f, 1.499f, 15.154f, 0.0f, 12.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-0.005f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-3.14f, 0.008f, -5.078f, 1.502f, -5.908f, 2.263f)
                curveToRelative(-1.414f, 1.298f, -2.152f, 2.993f, -2.13f, 4.737f)
                curveToRelative(0.022f, 1.764f, 0.681f, 3.563f, 2.055f, 4.937f)
                lineToRelative(0.689f, 0.689f)
                lineToRelative(10.844f, 10.791f)
                curveToRelative(0.773f, 0.771f, 2.022f, 0.779f, 2.806f, 0.018f)
                lineToRelative(1.046f, -1.016f)
                curveToRelative(0.802f, -0.779f, 0.809f, -2.065f, 0.016f, -2.853f)
                lineToRelative(-10.792f, -10.71f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
