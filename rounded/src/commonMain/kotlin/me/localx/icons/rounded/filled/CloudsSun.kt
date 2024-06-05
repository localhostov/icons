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

public val Icons.Filled.CloudsSun: ImageVector
    get() {
        if (_cloudsSun != null) {
            return _cloudsSun!!
        }
        _cloudsSun = Builder(name = "CloudsSun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.558f, 14.82f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.595f, 0.066f, -0.927f, -0.192f, -1.0f, -0.379f)
                arcToRelative(5.548f, 5.548f, 0.0f, false, false, -10.524f, 0.794f)
                arcToRelative(5.312f, 5.312f, 0.0f, false, false, -0.039f, 2.441f)
                arcToRelative(3.285f, 3.285f, 0.0f, false, false, 0.424f, 6.188f)
                arcToRelative(3.458f, 3.458f, 0.0f, false, false, 0.781f, 0.113f)
                curveToRelative(1.441f, 0.037f, 7.851f, 0.028f, 9.236f, 0.0f)
                arcToRelative(4.948f, 4.948f, 0.0f, false, false, 0.992f, -0.123f)
                arcToRelative(4.618f, 4.618f, 0.0f, false, false, 3.453f, -3.445f)
                arcTo(4.671f, 4.671f, 0.0f, false, false, 16.558f, 14.82f)
                close()
                moveTo(1.081f, 18.311f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.966f, -0.745f)
                arcToRelative(3.285f, 3.285f, 0.0f, false, true, 1.874f, -3.891f)
                arcToRelative(5.312f, 5.312f, 0.0f, false, true, 0.039f, -2.441f)
                arcTo(5.534f, 5.534f, 0.0f, false, true, 9.634f, 7.465f)
                curveToRelative(0.971f, 0.521f, 0.829f, 1.631f, -0.35f, 1.617f)
                arcToRelative(7.578f, 7.578f, 0.0f, false, false, -6.2f, 5.678f)
                arcToRelative(6.875f, 6.875f, 0.0f, false, false, -0.2f, 1.97f)
                arcTo(2.6f, 2.6f, 0.0f, false, false, 2.0f, 17.6f)
                curveTo(1.558f, 18.365f, 1.107f, 18.311f, 1.081f, 18.311f)
                close()
                moveTo(23.0f, 9.0f)
                horizontalLineTo(20.419f)
                curveToRelative(-0.013f, -0.108f, -0.028f, -0.211f, -0.048f, -0.31f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 20.047f, 7.6f)
                lineToRelative(2.225f, -1.313f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.017f, -1.722f)
                lineToRelative(-2.24f, 1.323f)
                arcToRelative(6.679f, 6.679f, 0.0f, false, false, -0.943f, -0.914f)
                lineToRelative(1.3f, -2.262f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.732f, -1.0f)
                lineTo(16.34f, 3.97f)
                arcTo(6.737f, 6.737f, 0.0f, false, false, 15.0f, 3.6f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(3.564f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.229f, 5.229f, 0.0f, false, false, -1.3f, 0.344f)
                lineToRelative(-1.415f, -2.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.6f, 2.786f)
                lineToRelative(1.769f, 2.822f)
                arcTo(3.066f, 3.066f, 0.0f, false, true, 12.1f, 9.219f)
                arcToRelative(7.564f, 7.564f, 0.0f, false, true, 4.912f, 3.652f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, true, 2.982f, 1.683f)
                lineToRelative(1.317f, 0.814f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.733f)
                lineToRelative(-2.274f, -1.312f)
                arcTo(8.686f, 8.686f, 0.0f, false, false, 20.348f, 11.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cloudsSun!!
    }

private var _cloudsSun: ImageVector? = null
