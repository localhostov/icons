package me.localx.icons.rounded.bold

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

public val Icons.Bold.PointerLoading: ImageVector
    get() {
        if (_pointerLoading != null) {
            return _pointerLoading!!
        }
        _pointerLoading = Builder(name = "PointerLoading", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(5.5f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9.5f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 6.212f)
                verticalLineToRelative(10.788f)
                curveToRelative(0.0f, 0.605f, -0.364f, 1.151f, -0.923f, 1.385f)
                curveToRelative(-0.187f, 0.077f, -0.383f, 0.115f, -0.577f, 0.115f)
                curveToRelative(-0.388f, 0.0f, -0.769f, -0.15f, -1.056f, -0.434f)
                lineToRelative(-2.566f, -2.541f)
                lineToRelative(-2.201f, 4.282f)
                curveToRelative(-0.389f, 0.755f, -1.163f, 1.19f, -1.962f, 1.19f)
                curveToRelative(-0.328f, 0.0f, -0.66f, -0.073f, -0.972f, -0.229f)
                curveToRelative(-0.53f, -0.266f, -0.921f, -0.72f, -1.105f, -1.279f)
                curveToRelative(-0.184f, -0.559f, -0.139f, -1.156f, 0.128f, -1.681f)
                lineToRelative(2.196f, -4.331f)
                lineToRelative(-3.662f, -0.493f)
                curveToRelative(-0.594f, -0.079f, -1.084f, -0.506f, -1.245f, -1.083f)
                curveToRelative(-0.161f, -0.578f, 0.037f, -1.195f, 0.504f, -1.571f)
                lineTo(18.74f, 3.746f)
                curveToRelative(0.927f, -0.796f, 2.24f, -0.979f, 3.393f, -0.449f)
                curveToRelative(1.151f, 0.53f, 1.867f, 1.647f, 1.867f, 2.915f)
                close()
                moveTo(21.0f, 6.212f)
                curveToRelative(0.0f, -0.04f, 0.0f, -0.134f, -0.121f, -0.189f)
                curveToRelative(-0.121f, -0.055f, -0.191f, 0.006f, -0.223f, 0.031f)
                lineToRelative(-5.496f, 4.425f)
                lineToRelative(2.84f, 0.382f)
                curveToRelative(0.323f, 0.043f, 0.623f, 0.19f, 0.855f, 0.42f)
                lineToRelative(2.145f, 2.124f)
                lineTo(21.0f, 6.212f)
                close()
            }
        }
        .build()
        return _pointerLoading!!
    }

private var _pointerLoading: ImageVector? = null
