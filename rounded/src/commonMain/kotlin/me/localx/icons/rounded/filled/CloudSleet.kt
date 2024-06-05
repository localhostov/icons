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

public val Icons.Filled.CloudSleet: ImageVector
    get() {
        if (_cloudSleet != null) {
            return _cloudSleet!!
        }
        _cloudSleet = Builder(name = "CloudSleet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.929f, -1.372f)
                lineToRelative(2.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.858f, 0.744f)
                lineToRelative(-2.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 24.0f)
                close()
                moveTo(10.929f, 23.372f)
                lineTo(12.929f, 18.372f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.858f, -0.744f)
                lineToRelative(-2.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.557f, 1.3f)
                arcTo(1.015f, 1.015f, 0.0f, false, false, 10.0f, 24.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.929f, 23.372f)
                close()
                moveTo(6.929f, 23.372f)
                lineTo(8.929f, 18.372f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.858f, -0.744f)
                lineToRelative(-2.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.557f, 1.3f)
                arcTo(1.015f, 1.015f, 0.0f, false, false, 6.0f, 24.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.929f, 23.372f)
                close()
                moveTo(24.0f, 12.5f)
                arcTo(7.508f, 7.508f, 0.0f, false, true, 18.548f, 19.7f)
                lineToRelative(0.238f, -0.595f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 14.0f, 15.774f)
                arcToRelative(2.944f, 2.944f, 0.0f, false, false, -4.0f, 0.0f)
                arcToRelative(2.973f, 2.973f, 0.0f, false, false, -4.787f, 1.106f)
                lineTo(4.049f, 19.8f)
                arcTo(5.539f, 5.539f, 0.0f, false, true, 1.8f, 10.425f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, false, 0.345f, -0.9f)
                arcToRelative(8.153f, 8.153f, 0.0f, false, true, -0.033f, -2.89f)
                arcTo(7.945f, 7.945f, 0.0f, false, true, 8.5f, 0.133f)
                arcToRelative(8.058f, 8.058f, 0.0f, false, true, 8.734f, 4.439f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 0.743f, 0.569f)
                arcTo(7.515f, 7.515f, 0.0f, false, true, 24.0f, 12.5f)
                close()
                moveTo(16.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(13.226f, 8.0f)
                lineToRelative(0.882f, -1.539f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.734f, -1.0f)
                lineTo(11.5f, 6.989f)
                lineToRelative(-0.873f, -1.523f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.735f, 1.0f)
                lineTo(9.774f, 8.0f)
                lineTo(8.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(9.774f, 10.0f)
                lineToRelative(-0.882f, 1.539f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.735f, 1.0f)
                lineToRelative(0.873f, -1.523f)
                lineToRelative(0.874f, 1.523f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.734f, -1.0f)
                lineTo(13.226f, 10.0f)
                lineTo(15.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cloudSleet!!
    }

private var _cloudSleet: ImageVector? = null
