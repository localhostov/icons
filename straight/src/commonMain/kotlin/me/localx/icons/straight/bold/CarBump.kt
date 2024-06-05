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

public val Icons.Bold.CarBump: ImageVector
    get() {
        if (_carBump != null) {
            return _carBump!!
        }
        _carBump = Builder(name = "CarBump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(14.0f, 24.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.0f)
                close()
                moveTo(8.745f, 18.389f)
                lineToRelative(0.731f, 1.861f)
                lineTo(4.822f, 22.078f)
                lineToRelative(-0.731f, -1.862f)
                lineToRelative(-1.862f, 0.732f)
                lineTo(0.865f, 17.473f)
                arcToRelative(12.575f, 12.575f, 0.0f, false, true, -0.83f, -5.513f)
                lineTo(0.358f, 7.693f)
                arcTo(3.518f, 3.518f, 0.0f, false, true, 2.568f, 4.7f)
                lineTo(11.4f, 1.23f)
                arcToRelative(3.52f, 3.52f, 0.0f, false, true, 3.657f, 0.689f)
                lineTo(18.2f, 4.826f)
                arcToRelative(12.587f, 12.587f, 0.0f, false, true, 3.144f, 4.6f)
                lineToRelative(1.365f, 3.475f)
                lineToRelative(-1.862f, 0.731f)
                lineToRelative(0.731f, 1.862f)
                lineToRelative(-4.654f, 1.828f)
                lineToRelative(-0.731f, -1.862f)
                close()
                moveTo(16.325f, 8.965f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.848f, 1.945f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.945f, 0.848f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.847f, -1.945f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.325f, 8.965f)
                close()
                moveTo(3.125f, 10.928f)
                lineTo(15.235f, 6.171f)
                lineToRelative(-2.214f, -2.05f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, false, -0.523f, -0.1f)
                lineTo(3.665f, 7.492f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.316f, 0.428f)
                close()
                moveTo(6.172f, 14.566f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.944f, -0.848f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.848f, 1.944f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.944f, 0.848f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.169f, 14.566f)
                close()
            }
        }
        .build()
        return _carBump!!
    }

private var _carBump: ImageVector? = null
