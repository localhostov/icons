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

public val Icons.Outline.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                horizontalLineTo(16.461f)
                arcTo(5.905f, 5.905f, 0.0f, false, false, 10.8f, 0.117f)
                arcTo(5.757f, 5.757f, 0.0f, false, false, 7.589f, 2.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 7.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(7.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 2.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(12.868f)
                lineToRelative(0.964f, -1.445f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.664f, -1.11f)
                lineTo(10.465f, 7.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
                moveTo(22.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 4.0f)
                horizontalLineTo(6.393f)
                arcTo(6.482f, 6.482f, 0.0f, false, false, 6.0f, 6.215f)
                arcTo(2.788f, 2.788f, 0.0f, false, false, 8.785f, 9.0f)
                horizontalLineToRelative(6.43f)
                arcTo(2.762f, 2.762f, 0.0f, false, false, 18.0f, 6.353f)
                arcTo(7.568f, 7.568f, 0.0f, false, false, 17.656f, 4.0f)
                horizontalLineTo(19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
