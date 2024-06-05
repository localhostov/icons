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

public val Icons.Filled.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 24.0f)
                horizontalLineTo(9.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, -0.987f, -7.877f)
                curveToRelative(0.331f, -5.5f, 7.95f, -7.04f, 10.4f, -2.106f)
                curveTo(24.7f, 14.659f, 24.348f, 23.862f, 18.0f, 24.0f)
                close()
                moveTo(13.5f, 9.0f)
                arcToRelative(7.522f, 7.522f, 0.0f, false, true, 2.835f, 0.56f)
                lineToRelative(0.0f, -0.008f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -0.294f, -0.912f)
                lineToRelative(3.975f, -2.314f)
                lineTo(19.012f, 4.6f)
                lineToRelative(-3.97f, 2.311f)
                arcToRelative(6.536f, 6.536f, 0.0f, false, false, -0.959f, -0.952f)
                lineToRelative(2.305f, -3.964f)
                lineToRelative(-1.729f, -1.0f)
                lineToRelative(-2.3f, 3.955f)
                arcTo(6.456f, 6.456f, 0.0f, false, false, 11.0f, 4.586f)
                verticalLineTo(0.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.585f)
                arcToRelative(6.482f, 6.482f, 0.0f, false, false, -1.343f, 0.359f)
                lineTo(5.355f, 0.986f)
                lineTo(3.627f, 1.992f)
                lineToRelative(2.3f, 3.951f)
                arcToRelative(6.614f, 6.614f, 0.0f, false, false, -0.964f, 0.958f)
                lineTo(1.0f, 4.6f)
                lineTo(0.0f, 6.326f)
                lineToRelative(3.956f, 2.3f)
                arcTo(6.476f, 6.476f, 0.0f, false, false, 3.585f, 10.0f)
                horizontalLineTo(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.584f)
                arcToRelative(6.428f, 6.428f, 0.0f, false, false, 0.362f, 1.367f)
                lineTo(0.0f, 15.662f)
                lineTo(1.01f, 17.391f)
                lineToRelative(5.37f, -3.168f)
                arcTo(7.508f, 7.508f, 0.0f, false, true, 13.5f, 9.0f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
