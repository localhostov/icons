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

public val Icons.Outline.Tomato: ImageVector
    get() {
        if (_tomato != null) {
            return _tomato!!
        }
        _tomato = Builder(name = "Tomato", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7f, 5.091f)
                arcTo(4.614f, 4.614f, 0.0f, false, false, 18.0f, 2.0f)
                horizontalLineTo(16.0f)
                arcToRelative(3.322f, 3.322f, 0.0f, false, true, -3.0f, 2.909f)
                verticalLineTo(0.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.909f)
                arcTo(3.322f, 3.322f, 0.0f, false, true, 8.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcTo(4.614f, 4.614f, 0.0f, false, false, 7.3f, 5.091f)
                arcTo(8.861f, 8.861f, 0.0f, false, false, 0.0f, 14.0f)
                curveToRelative(0.0f, 4.721f, 3.635f, 10.0f, 8.5f, 10.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(4.865f, 0.0f, 8.5f, -5.279f, 8.5f, -10.0f)
                arcTo(8.861f, 8.861f, 0.0f, false, false, 16.7f, 5.091f)
                close()
                moveTo(15.5f, 22.0f)
                horizontalLineToRelative(-7.0f)
                curveTo(4.839f, 22.0f, 2.0f, 17.7f, 2.0f, 14.0f)
                arcTo(6.772f, 6.772f, 0.0f, false, true, 8.5f, 7.0f)
                arcToRelative(6.035f, 6.035f, 0.0f, false, true, 1.543f, 0.2f)
                arcTo(6.678f, 6.678f, 0.0f, false, true, 6.757f, 9.03f)
                lineToRelative(0.486f, 1.94f)
                arcTo(8.622f, 8.622f, 0.0f, false, false, 12.0f, 8.013f)
                arcToRelative(8.627f, 8.627f, 0.0f, false, false, 4.758f, 2.957f)
                lineToRelative(0.484f, -1.94f)
                arcTo(6.678f, 6.678f, 0.0f, false, true, 13.956f, 7.2f)
                arcTo(6.043f, 6.043f, 0.0f, false, true, 15.5f, 7.0f)
                arcTo(6.772f, 6.772f, 0.0f, false, true, 22.0f, 14.0f)
                curveTo(22.0f, 17.7f, 19.161f, 22.0f, 15.5f, 22.0f)
                close()
            }
        }
        .build()
        return _tomato!!
    }

private var _tomato: ImageVector? = null
