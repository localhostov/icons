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

public val Icons.Outline.Settings: ImageVector
    get() {
        if (_settings != null) {
            return _settings!!
        }
        _settings = Builder(name = "Settings", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 20.487f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.849f, -1.646f)
                lineTo(3.107f, 20.6f)
                lineToRelative(-3.0f, -5.2f)
                lineTo(3.15f, 13.645f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, 0.0f, -3.29f)
                lineTo(0.107f, 8.6f)
                lineToRelative(3.0f, -5.2f)
                lineTo(6.151f, 5.159f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 9.0f, 3.513f)
                lineTo(9.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 3.513f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 2.849f, 1.646f)
                lineTo(20.893f, 3.4f)
                lineToRelative(3.0f, 5.2f)
                lineTo(20.85f, 10.355f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, 0.0f, 3.29f)
                lineTo(23.893f, 15.4f)
                lineToRelative(-3.0f, 5.2f)
                lineToRelative(-3.044f, -1.758f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 15.0f, 20.487f)
                close()
                moveTo(11.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 18.973f)
                lineToRelative(0.751f, -0.194f)
                arcTo(6.984f, 6.984f, 0.0f, false, false, 16.994f, 16.9f)
                lineToRelative(0.543f, -0.553f)
                lineToRelative(2.623f, 1.515f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(-2.62f, -1.513f)
                lineToRelative(0.206f, -0.746f)
                arcToRelative(7.048f, 7.048f, 0.0f, false, false, 0.0f, -3.75f)
                lineToRelative(-0.206f, -0.746f)
                lineToRelative(2.62f, -1.513f)
                lineToRelative(-1.0f, -1.732f)
                lineTo(17.537f, 7.649f)
                lineTo(16.994f, 7.1f)
                arcToRelative(6.984f, 6.984f, 0.0f, false, false, -3.243f, -1.875f)
                lineTo(13.0f, 5.027f)
                lineTo(13.0f, 2.0f)
                lineTo(11.0f, 2.0f)
                lineTo(11.0f, 5.027f)
                lineToRelative(-0.751f, 0.194f)
                arcTo(6.984f, 6.984f, 0.0f, false, false, 7.006f, 7.1f)
                lineToRelative(-0.543f, 0.553f)
                lineTo(3.84f, 6.134f)
                lineToRelative(-1.0f, 1.732f)
                lineTo(5.46f, 9.379f)
                lineToRelative(-0.206f, 0.746f)
                arcToRelative(7.048f, 7.048f, 0.0f, false, false, 0.0f, 3.75f)
                lineToRelative(0.206f, 0.746f)
                lineTo(2.84f, 16.134f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(2.623f, -1.515f)
                lineToRelative(0.543f, 0.553f)
                arcToRelative(6.984f, 6.984f, 0.0f, false, false, 3.243f, 1.875f)
                lineToRelative(0.751f, 0.194f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, -4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _settings!!
    }

private var _settings: ImageVector? = null
