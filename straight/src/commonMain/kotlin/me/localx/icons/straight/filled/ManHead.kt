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

public val Icons.Filled.ManHead: ImageVector
    get() {
        if (_manHead != null) {
            return _manHead!!
        }
        _manHead = Builder(name = "ManHead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.993f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.993f, 11.5f)
                close()
                moveTo(23.993f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.15f, -3.226f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.219f, 7.9f)
                lineTo(1.5f, 12.0f)
                reflectiveCurveToRelative(1.606f, 0.0f, 1.778f, -0.013f)
                arcToRelative(12.19f, 12.19f, 0.0f, false, false, 4.9f, -1.191f)
                arcToRelative(1.484f, 1.484f, 0.0f, false, false, -0.183f, 0.7f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 9.62f, 10.013f)
                curveToRelative(0.025f, -0.016f, 0.052f, -0.03f, 0.077f, -0.045f)
                arcTo(16.228f, 16.228f, 0.0f, false, false, 16.114f, 3.14f)
                arcToRelative(7.966f, 7.966f, 0.0f, false, true, 3.833f, 6.009f)
                lineToRelative(0.078f, 0.746f)
                lineToRelative(0.738f, 0.133f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.23f, 1.472f)
                lineTo(22.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 13.0f)
                arcToRelative(1.606f, 1.606f, 0.0f, false, true, -0.252f, -0.027f)
                lineToRelative(-0.835f, -0.148f)
                lineToRelative(-0.282f, 0.8f)
                curveTo(18.215f, 16.221f, 15.13f, 19.0f, 12.0f, 19.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-3.026f, 0.0f, -6.023f, -2.619f, -7.041f, -5.153f)
                arcTo(13.535f, 13.535f, 0.0f, false, true, 3.0f, 14.0f)
                lineTo(2.88f, 14.0f)
                curveToRelative(0.062f, 0.181f, 0.106f, 0.3f, 0.12f, 0.339f)
                arcToRelative(10.894f, 10.894f, 0.0f, false, false, 5.0f, 5.6f)
                lineTo(8.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 19.954f)
                arcToRelative(11.037f, 11.037f, 0.0f, false, false, 4.732f, -4.962f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 11.5f)
                close()
            }
        }
        .build()
        return _manHead!!
    }

private var _manHead: ImageVector? = null
