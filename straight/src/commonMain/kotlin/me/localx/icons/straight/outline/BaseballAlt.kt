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

public val Icons.Outline.BaseballAlt: ImageVector
    get() {
        if (_baseballAlt != null) {
            return _baseballAlt!!
        }
        _baseballAlt = Builder(name = "BaseballAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.712f, 7.5f)
                arcTo(4.4f, 4.4f, 0.0f, false, false, 19.6f, 0.0f)
                arcTo(4.363f, 4.363f, 0.0f, false, false, 16.5f, 1.288f)
                lineTo(13.82f, 3.964f)
                arcTo(33.868f, 33.868f, 0.0f, false, false, 8.952f, 10.11f)
                arcToRelative(21.946f, 21.946f, 0.0f, false, true, -2.647f, 3.44f)
                lineToRelative(-4.17f, 4.171f)
                lineToRelative(-0.678f, -0.678f)
                lineTo(0.043f, 18.457f)
                lineToRelative(5.5f, 5.5f)
                lineToRelative(1.414f, -1.414f)
                lineTo(6.318f, 21.9f)
                lineToRelative(4.094f, -4.093f)
                arcTo(26.185f, 26.185f, 0.0f, false, true, 14.1f, 14.975f)
                arcToRelative(33.73f, 33.73f, 0.0f, false, false, 5.793f, -4.65f)
                close()
                moveTo(4.9f, 20.49f)
                lineTo(3.549f, 19.135f)
                lineToRelative(4.17f, -4.171f)
                curveToRelative(0.16f, -0.159f, 0.344f, -0.36f, 0.539f, -0.581f)
                lineToRelative(1.405f, 1.405f)
                curveToRelative(-0.265f, 0.229f, -0.5f, 0.438f, -0.665f, 0.608f)
                close()
                moveTo(13.024f, 13.29f)
                curveToRelative(-0.591f, 0.375f, -1.212f, 0.81f, -1.794f, 1.246f)
                lineTo(9.521f, 12.819f)
                curveToRelative(0.395f, -0.531f, 0.787f, -1.1f, 1.133f, -1.658f)
                arcToRelative(31.86f, 31.86f, 0.0f, false, true, 4.58f, -5.783f)
                lineTo(17.911f, 2.7f)
                arcToRelative(2.451f, 2.451f, 0.0f, false, true, 3.387f, 0.0f)
                arcToRelative(2.394f, 2.394f, 0.0f, false, true, 0.0f, 3.387f)
                lineTo(18.477f, 8.911f)
                arcTo(31.737f, 31.737f, 0.0f, false, true, 13.028f, 13.285f)
                close()
                moveTo(20.5f, 16.979f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 3.5f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 16.979f)
                close()
                moveTo(20.5f, 21.979f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, -1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 21.979f)
                close()
            }
        }
        .build()
        return _baseballAlt!!
    }

private var _baseballAlt: ImageVector? = null
