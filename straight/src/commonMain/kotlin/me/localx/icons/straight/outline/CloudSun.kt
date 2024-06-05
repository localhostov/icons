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

public val Icons.Outline.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.692f, 14.038f)
                lineTo(1.01f, 17.391f)
                lineTo(0.0f, 15.662f)
                lineToRelative(3.942f, -2.295f)
                arcTo(6.428f, 6.428f, 0.0f, false, true, 3.584f, 12.0f)
                lineTo(-1.0f, 12.0f)
                lineTo(-1.0f, 10.0f)
                lineTo(3.585f, 10.0f)
                arcToRelative(6.476f, 6.476f, 0.0f, false, true, 0.369f, -1.371f)
                lineTo(0.0f, 6.326f)
                lineTo(1.0f, 4.6f)
                lineTo(4.961f, 6.9f)
                arcToRelative(6.614f, 6.614f, 0.0f, false, true, 0.964f, -0.958f)
                lineToRelative(-2.3f, -3.951f)
                lineTo(5.355f, 0.986f)
                lineToRelative(2.3f, 3.958f)
                arcTo(6.482f, 6.482f, 0.0f, false, true, 9.0f, 4.585f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 4.586f)
                arcToRelative(6.456f, 6.456f, 0.0f, false, true, 1.359f, 0.356f)
                lineToRelative(2.3f, -3.955f)
                lineToRelative(1.729f, 1.0f)
                lineTo(14.083f, 5.956f)
                arcToRelative(6.536f, 6.536f, 0.0f, false, true, 0.959f, 0.952f)
                lineTo(19.012f, 4.6f)
                lineToRelative(1.006f, 1.729f)
                lineTo(16.043f, 8.64f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 0.294f, 0.912f)
                arcToRelative(7.52f, 7.52f, 0.0f, false, false, -2.295f, -0.532f)
                arcTo(4.512f, 4.512f, 0.0f, false, false, 10.0f, 6.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.5f, 7.32f)
                close()
                moveTo(23.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(9.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.987f, -7.877f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 10.4f, -2.106f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 23.0f, 19.0f)
                close()
                moveTo(21.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-0.963f)
                lineToRelative(-0.235f, -0.667f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 10.0f, 16.5f)
                curveToRelative(0.0f, 0.133f, 0.008f, 0.264f, 0.021f, 0.394f)
                lineTo(10.141f, 18.0f)
                lineTo(9.027f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 9.0f, 22.0f)
                horizontalLineToRelative(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 19.0f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
