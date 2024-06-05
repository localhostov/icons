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

public val Icons.Bold.Tomato: ImageVector
    get() {
        if (_tomato != null) {
            return _tomato!!
        }
        _tomato = Builder(name = "Tomato", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.974f, 5.166f)
                arcTo(5.705f, 5.705f, 0.0f, false, false, 18.0f, 2.0f)
                horizontalLineTo(15.0f)
                arcToRelative(2.889f, 2.889f, 0.0f, false, true, -1.5f, 2.382f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(4.383f)
                arcTo(2.892f, 2.892f, 0.0f, false, true, 9.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcTo(5.719f, 5.719f, 0.0f, false, false, 7.008f, 5.169f)
                arcTo(8.952f, 8.952f, 0.0f, false, false, 0.0f, 14.029f)
                curveTo(0.0f, 18.736f, 3.7f, 24.0f, 8.659f, 24.0f)
                horizontalLineToRelative(6.682f)
                curveTo(20.3f, 24.0f, 24.0f, 18.736f, 24.0f, 14.029f)
                arcTo(8.951f, 8.951f, 0.0f, false, false, 16.974f, 5.166f)
                close()
                moveTo(15.341f, 21.0f)
                horizontalLineTo(8.659f)
                curveTo(5.472f, 21.0f, 3.0f, 17.253f, 3.0f, 14.029f)
                arcTo(5.86f, 5.86f, 0.0f, false, true, 8.659f, 8.0f)
                curveToRelative(0.164f, 0.0f, 0.325f, 0.016f, 0.486f, 0.031f)
                arcTo(4.869f, 4.869f, 0.0f, false, true, 7.136f, 9.045f)
                lineToRelative(0.728f, 2.91f)
                arcTo(7.643f, 7.643f, 0.0f, false, false, 12.0f, 9.425f)
                arcToRelative(7.634f, 7.634f, 0.0f, false, false, 4.135f, 2.53f)
                lineToRelative(0.726f, -2.91f)
                arcToRelative(4.922f, 4.922f, 0.0f, false, true, -2.022f, -1.014f)
                curveToRelative(0.166f, -0.015f, 0.331f, -0.031f, 0.5f, -0.031f)
                arcTo(5.86f, 5.86f, 0.0f, false, true, 21.0f, 14.029f)
                curveTo(21.0f, 17.253f, 18.528f, 21.0f, 15.341f, 21.0f)
                close()
            }
        }
        .build()
        return _tomato!!
    }

private var _tomato: ImageVector? = null
