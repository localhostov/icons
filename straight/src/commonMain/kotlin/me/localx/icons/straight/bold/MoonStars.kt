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

public val Icons.Bold.MoonStars: ImageVector
    get() {
        if (_moonStars != null) {
            return _moonStars!!
        }
        _moonStars = Builder(name = "MoonStars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.968f, 8.532f)
                lineTo(19.3f, 7.365f)
                lineToRelative(1.167f, -2.333f)
                lineToRelative(1.167f, 2.333f)
                lineToRelative(2.333f, 1.167f)
                lineTo(21.635f, 9.7f)
                lineToRelative(-1.167f, 2.333f)
                lineTo(19.3f, 9.7f)
                close()
                moveTo(22.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 24.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 16.0f)
                close()
                moveTo(17.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 19.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 12.0f)
                close()
                moveTo(18.759f, 21.894f)
                lineTo(20.959f, 20.385f)
                lineTo(18.527f, 19.285f)
                curveTo(15.776f, 18.048f, 13.0f, 15.159f, 13.0f, 11.5f)
                curveToRelative(0.0f, -3.419f, 2.59f, -6.111f, 4.808f, -7.378f)
                lineTo(20.122f, 2.8f)
                lineToRelative(-2.33f, -1.293f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.967f, 20.386f)
                close()
                moveTo(13.968f, 3.219f)
                arcTo(11.2f, 11.2f, 0.0f, false, false, 10.0f, 11.5f)
                arcToRelative(11.523f, 11.523f, 0.0f, false, false, 4.816f, 9.041f)
                arcTo(8.857f, 8.857f, 0.0f, false, true, 12.0f, 21.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 3.0f)
                arcTo(8.834f, 8.834f, 0.0f, false, true, 13.968f, 3.219f)
                close()
            }
        }
        .build()
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
