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

public val Icons.Outline.ManHead: ImageVector
    get() {
        if (_manHead != null) {
            return _manHead!!
        }
        _manHead = Builder(name = "ManHead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 16.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 13.0f)
                close()
                moveTo(21.851f, 8.274f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.226f, 7.9f)
                lineTo(1.5f, 12.0f)
                lineTo(3.0f, 12.0f)
                arcToRelative(12.12f, 12.12f, 0.0f, false, false, 5.184f, -1.2f)
                arcTo(1.477f, 1.477f, 0.0f, false, false, 8.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.634f, -1.487f)
                arcToRelative(16.772f, 16.772f, 0.0f, false, false, 5.287f, -5.249f)
                arcTo(5.949f, 5.949f, 0.0f, false, false, 13.028f, 4.1f)
                curveTo(11.49f, 6.379f, 8.217f, 9.563f, 3.893f, 9.959f)
                lineTo(4.188f, 8.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.766f, 0.86f)
                lineToRelative(0.078f, 0.745f)
                lineToRelative(0.738f, 0.133f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 13.0f)
                curveToRelative(-0.086f, 0.0f, -1.087f, -0.175f, -1.087f, -0.175f)
                lineToRelative(-0.282f, 0.8f)
                curveTo(18.215f, 16.221f, 15.13f, 19.0f, 12.0f, 19.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-3.026f, 0.0f, -6.023f, -2.619f, -7.041f, -5.153f)
                arcTo(13.535f, 13.535f, 0.0f, false, true, 3.0f, 14.0f)
                lineTo(2.88f, 14.0f)
                curveToRelative(0.062f, 0.181f, 0.106f, 0.3f, 0.12f, 0.339f)
                arcToRelative(10.894f, 10.894f, 0.0f, false, false, 5.0f, 5.6f)
                lineTo(8.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 20.732f)
                arcTo(7.929f, 7.929f, 0.0f, false, false, 12.0f, 21.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.959f, 7.959f, 0.0f, false, false, 2.0f, -0.264f)
                lineTo(14.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 19.954f)
                arcToRelative(11.037f, 11.037f, 0.0f, false, false, 4.732f, -4.962f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.119f, -6.718f)
                close()
            }
        }
        .build()
        return _manHead!!
    }

private var _manHead: ImageVector? = null
