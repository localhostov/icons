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

public val Icons.Filled.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.5f, 16.0f)
                horizontalLineTo(17.464f)
                lineToRelative(-4.226f, 6.487f)
                arcTo(2.973f, 2.973f, 0.0f, false, true, 10.633f, 24.0f)
                arcToRelative(2.629f, 2.629f, 0.0f, false, true, -2.462f, -3.553f)
                lineTo(10.019f, 16.0f)
                horizontalLineTo(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.473f, -2.015f)
                lineTo(0.2f, 10.16f)
                arcToRelative(1.443f, 1.443f, 0.0f, false, true, 0.525f, -2.0f)
                arcToRelative(1.412f, 1.412f, 0.0f, false, true, 1.652f, 0.25f)
                lineTo(3.794f, 9.828f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.622f, 11.0f)
                horizontalLineTo(21.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 24.0f, 13.5f)
                close()
                moveTo(17.731f, 9.0f)
                lineToRelative(-4.5f, -7.487f)
                arcTo(2.972f, 2.972f, 0.0f, false, false, 10.629f, 0.0f)
                arcTo(2.63f, 2.63f, 0.0f, false, false, 8.167f, 3.553f)
                lineTo(10.285f, 9.0f)
                close()
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
