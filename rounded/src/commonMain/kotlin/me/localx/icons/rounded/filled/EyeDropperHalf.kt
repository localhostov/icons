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

public val Icons.Filled.EyeDropperHalf: ImageVector
    get() {
        if (_eyeDropperHalf != null) {
            return _eyeDropperHalf!!
        }
        _eyeDropperHalf = Builder(name = "EyeDropperHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.373f, 9.917f)
                lineToRelative(4.083f, 4.083f)
                lineTo(5.289f, 14.0f)
                lineToRelative(4.084f, -4.083f)
                close()
                moveTo(3.289f, 16.0f)
                lineToRelative(-1.32f, 1.32f)
                curveToRelative(-1.042f, 1.043f, -1.227f, 2.609f, -0.586f, 3.855f)
                lineToRelative(-1.091f, 1.091f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0.0f, 1.414f)
                lineTo(0.292f, 23.68f)
                curveToRelative(0.391f, 0.391f, 1.024f, 0.391f, 1.414f, 0.0f)
                lineToRelative(1.091f, -1.091f)
                curveToRelative(0.475f, 0.245f, 0.991f, 0.382f, 1.513f, 0.382f)
                curveToRelative(0.848f, 0.0f, 1.696f, -0.323f, 2.342f, -0.968f)
                lineToRelative(6.003f, -6.003f)
                lineTo(3.289f, 16.0f)
                close()
                moveTo(23.154f, 4.891f)
                curveToRelative(0.545f, -0.543f, 0.846f, -1.267f, 0.846f, -2.037f)
                curveToRelative(0.0f, -0.77f, -0.299f, -1.494f, -0.843f, -2.038f)
                curveToRelative(-1.088f, -1.088f, -2.983f, -1.088f, -4.071f, 0.0f)
                lineToRelative(-2.479f, 2.479f)
                curveToRelative(-0.917f, 0.917f, -2.838f, 0.707f, -4.167f, -0.024f)
                curveToRelative(-0.945f, -0.521f, -2.148f, -0.34f, -2.924f, 0.437f)
                curveToRelative(-0.972f, 0.972f, -0.972f, 2.552f, 0.0f, 3.524f)
                lineToRelative(6.83f, 6.83f)
                curveToRelative(0.265f, 0.097f, 0.476f, 0.303f, 0.582f, 0.564f)
                curveToRelative(0.457f, 0.374f, 1.017f, 0.561f, 1.576f, 0.561f)
                curveToRelative(0.638f, 0.0f, 1.276f, -0.243f, 1.762f, -0.729f)
                curveToRelative(0.777f, -0.777f, 0.957f, -1.98f, 0.437f, -2.925f)
                curveToRelative(-0.731f, -1.329f, -0.941f, -3.25f, -0.024f, -4.167f)
                lineToRelative(2.476f, -2.475f)
                close()
            }
        }
        .build()
        return _eyeDropperHalf!!
    }

private var _eyeDropperHalf: ImageVector? = null
