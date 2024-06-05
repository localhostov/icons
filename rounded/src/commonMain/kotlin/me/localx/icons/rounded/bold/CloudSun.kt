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

public val Icons.Bold.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.359f, 14.5f)
                lineToRelative(-0.235f, -0.054f)
                arcToRelative(5.788f, 5.788f, 0.0f, false, false, -6.153f, -3.383f)
                arcToRelative(5.689f, 5.689f, 0.0f, false, false, -4.792f, 5.5f)
                arcToRelative(4.087f, 4.087f, 0.0f, false, false, 0.038f, 0.607f)
                arcToRelative(3.535f, 3.535f, 0.0f, false, false, 0.456f, 6.71f)
                arcToRelative(3.911f, 3.911f, 0.0f, false, false, 0.889f, 0.121f)
                horizontalLineToRelative(8.617f)
                arcToRelative(5.116f, 5.116f, 0.0f, false, false, 1.033f, -0.125f)
                arcToRelative(4.818f, 4.818f, 0.0f, false, false, 0.147f, -9.377f)
                close()
                moveTo(20.943f, 19.617f)
                arcToRelative(1.843f, 1.843f, 0.0f, false, true, -1.384f, 1.332f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -0.408f, 0.053f)
                lineTo(10.605f, 21.002f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, -0.187f, -0.026f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, -0.4f, -0.381f)
                curveToRelative(-0.088f, -0.326f, 0.251f, -0.634f, 0.518f, -0.723f)
                arcTo(2.594f, 2.594f, 0.0f, false, false, 12.224f, 17.0f)
                arcToRelative(2.114f, 2.114f, 0.0f, false, true, -0.045f, -0.378f)
                arcToRelative(2.677f, 2.677f, 0.0f, false, true, 0.079f, -0.6f)
                arcToRelative(2.605f, 2.605f, 0.0f, false, true, 2.136f, -1.994f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 2.986f, 1.626f)
                verticalLineToRelative(0.0f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 19.6f, 17.4f)
                arcTo(1.834f, 1.834f, 0.0f, false, true, 20.943f, 19.615f)
                close()
                moveTo(7.378f, 13.742f)
                lineTo(4.9f, 16.217f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.782f, 14.1f)
                lineToRelative(1.547f, -1.548f)
                arcTo(5.93f, 5.93f, 0.0f, false, true, 3.693f, 11.0f)
                lineTo(1.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                lineTo(3.7f, 8.0f)
                arcToRelative(5.986f, 5.986f, 0.0f, false, true, 0.64f, -1.542f)
                lineTo(2.782f, 4.9f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.9f, 2.783f)
                lineTo(6.458f, 4.337f)
                arcTo(5.986f, 5.986f, 0.0f, false, true, 8.0f, 3.7f)
                lineTo(8.0f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(11.0f, 3.7f)
                arcToRelative(5.935f, 5.935f, 0.0f, false, true, 1.546f, 0.636f)
                lineTo(14.1f, 2.783f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.218f, 4.9f)
                lineTo(14.659f, 6.462f)
                curveToRelative(0.072f, 0.124f, 0.153f, 0.241f, 0.217f, 0.371f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.688f, 1.334f)
                curveToRelative(-2.25f, -4.032f, -7.909f, 0.035f, -4.809f, 3.455f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.378f, 13.742f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
