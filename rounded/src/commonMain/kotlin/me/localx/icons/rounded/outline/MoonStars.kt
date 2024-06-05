package me.localx.icons.rounded.outline

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

public val Icons.Outline.MoonStars: ImageVector
    get() {
        if (_moonStars != null) {
            return _moonStars!!
        }
        _moonStars = Builder(name = "MoonStars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.009f, 24.0f)
                arcTo(12.067f, 12.067f, 0.0f, false, true, 0.075f, 10.725f)
                arcTo(12.121f, 12.121f, 0.0f, false, true, 10.1f, 0.152f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, 5.03f, 0.206f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.8f, 1.8f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, true, -0.7f, 2.425f)
                curveToRelative(-4.559f, 4.168f, -4.165f, 10.645f, 0.807f, 14.412f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.7f, 4.319f)
                arcTo(13.875f, 13.875f, 0.0f, false, true, 12.009f, 24.0f)
                close()
                moveTo(12.083f, 2.0f)
                arcToRelative(10.776f, 10.776f, 0.0f, false, false, -1.675f, 0.127f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, -8.344f, 8.8f)
                arcTo(9.928f, 9.928f, 0.0f, false, false, 4.581f, 18.7f)
                arcToRelative(10.473f, 10.473f, 0.0f, false, false, 11.093f, 2.734f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.138f, -0.856f)
                horizontalLineToRelative(0.0f)
                curveTo(9.883f, 16.1f, 9.417f, 8.087f, 14.865f, 3.124f)
                arcToRelative(0.459f, 0.459f, 0.0f, false, false, 0.127f, -0.465f)
                arcToRelative(0.491f, 0.491f, 0.0f, false, false, -0.356f, -0.362f)
                arcTo(10.68f, 10.68f, 0.0f, false, false, 12.083f, 2.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.97f, -0.757f)
                lineToRelative(-0.358f, -1.43f)
                lineTo(17.74f, 9.428f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.035f, -1.94f)
                lineToRelative(1.4f, -0.325f)
                lineToRelative(0.351f, -1.406f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.94f, 0.0f)
                lineToRelative(0.355f, 1.418f)
                lineToRelative(1.418f, 0.355f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.94f)
                lineToRelative(-1.418f, 0.355f)
                lineToRelative(-0.355f, 1.418f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.5f, 12.0f)
                close()
                moveTo(16.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 14.0f)
                close()
                moveTo(22.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 18.0f)
                close()
            }
        }
        .build()
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
