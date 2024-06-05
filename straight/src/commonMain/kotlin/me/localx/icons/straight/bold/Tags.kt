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

public val Icons.Bold.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.072f, 8.597f)
                lineTo(13.458f, 0.03f)
                lineTo(4.831f, 1.01f)
                lineToRelative(0.338f, 2.98f)
                lineToRelative(7.195f, -0.816f)
                lineToRelative(7.59f, 7.548f)
                curveToRelative(0.055f, 0.054f, 0.055f, 0.176f, -0.037f, 0.27f)
                lineToRelative(-1.183f, 1.27f)
                lineToRelative(-7.552f, -7.505f)
                lineTo(1.679f, 6.012f)
                lineTo(0.939f, 15.266f)
                lineToRelative(7.855f, 7.807f)
                curveToRelative(0.598f, 0.598f, 1.393f, 0.927f, 2.237f, 0.927f)
                reflectiveCurveToRelative(1.641f, -0.329f, 2.255f, -0.944f)
                lineToRelative(5.788f, -5.981f)
                curveToRelative(0.475f, -0.475f, 0.779f, -1.075f, 0.885f, -1.727f)
                lineToRelative(2.115f, -2.273f)
                curveToRelative(0.597f, -0.596f, 0.925f, -1.391f, 0.925f, -2.237f)
                reflectiveCurveToRelative(-0.328f, -1.641f, -0.928f, -2.24f)
                close()
                moveTo(16.936f, 14.97f)
                lineToRelative(-5.789f, 5.982f)
                curveToRelative(-0.054f, 0.053f, -0.176f, 0.054f, -0.233f, -0.004f)
                lineToRelative(-6.873f, -6.83f)
                lineToRelative(0.435f, -5.451f)
                lineToRelative(5.639f, -0.745f)
                lineToRelative(6.84f, 6.798f)
                curveToRelative(0.055f, 0.054f, 0.055f, 0.176f, -0.018f, 0.249f)
                close()
                moveTo(8.999f, 11.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
