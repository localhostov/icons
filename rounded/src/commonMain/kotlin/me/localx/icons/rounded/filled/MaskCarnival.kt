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

public val Icons.Filled.MaskCarnival: ImageVector
    get() {
        if (_maskCarnival != null) {
            return _maskCarnival!!
        }
        _maskCarnival = Builder(name = "MaskCarnival", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.514f, 10.972f)
                arcToRelative(3.825f, 3.825f, 0.0f, false, false, -3.028f, -0.944f)
                arcToRelative(35.867f, 35.867f, 0.0f, false, false, -6.447f, 1.39f)
                curveTo(13.359f, 8.913f, 15.75f, 8.0f, 18.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                arcToRelative(6.973f, 6.973f, 0.0f, false, false, -5.0f, 2.111f)
                lineTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 4.11f)
                arcTo(6.977f, 6.977f, 0.0f, false, false, 6.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 8.0f)
                curveToRelative(2.25f, 0.0f, 4.641f, 0.913f, 4.961f, 3.418f)
                arcToRelative(35.887f, 35.887f, 0.0f, false, false, -6.447f, -1.39f)
                arcToRelative(3.831f, 3.831f, 0.0f, false, false, -3.028f, 0.944f)
                arcToRelative(4.528f, 4.528f, 0.0f, false, false, -1.469f, 3.4f)
                curveTo(0.017f, 23.062f, 4.852f, 24.0f, 6.931f, 24.0f)
                arcToRelative(5.38f, 5.38f, 0.0f, false, false, 3.09f, -1.185f)
                arcTo(3.667f, 3.667f, 0.0f, false, true, 12.0f, 21.967f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, 1.979f, 0.848f)
                arcTo(5.383f, 5.383f, 0.0f, false, false, 17.069f, 24.0f)
                curveToRelative(2.079f, 0.0f, 6.914f, -0.938f, 6.914f, -9.625f)
                arcTo(4.532f, 4.532f, 0.0f, false, false, 22.514f, 10.972f)
                close()
                moveTo(6.156f, 19.272f)
                curveToRelative(-1.268f, 0.352f, -1.746f, -0.964f, -2.135f, -3.114f)
                arcToRelative(1.167f, 1.167f, 0.0f, false, true, 1.316f, -1.423f)
                arcTo(37.247f, 37.247f, 0.0f, false, true, 11.0f, 16.6f)
                curveTo(8.7f, 16.839f, 7.364f, 18.939f, 6.156f, 19.274f)
                close()
                moveTo(19.979f, 16.16f)
                curveToRelative(-0.389f, 2.15f, -0.867f, 3.466f, -2.135f, 3.114f)
                curveTo(16.636f, 18.939f, 15.3f, 16.839f, 13.0f, 16.6f)
                arcToRelative(37.247f, 37.247f, 0.0f, false, true, 5.663f, -1.858f)
                arcTo(1.167f, 1.167f, 0.0f, false, true, 19.979f, 16.16f)
                close()
            }
        }
        .build()
        return _maskCarnival!!
    }

private var _maskCarnival: ImageVector? = null
