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

public val Icons.Filled.KnifeKitchen: ImageVector
    get() {
        if (_knifeKitchen != null) {
            return _knifeKitchen!!
        }
        _knifeKitchen = Builder(name = "KnifeKitchen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.735f, 19.057f)
                curveToRelative(-2.182f, 2.191f, -5.677f, 3.795f, -9.178f, 3.934f)
                curveToRelative(-0.097f, 0.004f, -0.686f, 0.007f, -1.29f, 0.008f)
                curveToRelative(-0.818f, 0.002f, -1.429f, -0.769f, -1.229f, -1.562f)
                curveToRelative(0.28f, -1.108f, 0.854f, -2.131f, 1.674f, -2.954f)
                lineToRelative(7.297f, -7.196f)
                lineToRelative(5.233f, 5.247f)
                lineToRelative(-2.507f, 2.523f)
                moveTo(22.941f, 2.065f)
                curveToRelative(-0.688f, -0.69f, -1.532f, -1.056f, -2.443f, -1.056f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.742f, 0.0f, -1.881f, 0.256f, -3.089f, 1.468f)
                lineToRelative(-6.61f, 6.528f)
                curveToRelative(-0.393f, 0.388f, -0.397f, 1.021f, -0.009f, 1.414f)
                curveToRelative(0.041f, 0.042f, 6.108f, 5.928f, 6.108f, 5.928f)
                curveToRelative(0.278f, 0.279f, 0.646f, 0.423f, 1.02f, 0.423f)
                curveToRelative(0.258f, 0.0f, 0.519f, -0.069f, 0.753f, -0.21f)
                curveToRelative(0.573f, -0.346f, 0.826f, -1.004f, 0.628f, -1.638f)
                curveToRelative(-0.655f, -2.114f, -0.746f, -3.265f, 0.889f, -4.9f)
                lineToRelative(2.754f, -2.827f)
                curveToRelative(1.409f, -1.415f, 1.409f, -3.716f, 0.0f, -5.13f)
                close()
                moveTo(20.002f, 6.465f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _knifeKitchen!!
    }

private var _knifeKitchen: ImageVector? = null
