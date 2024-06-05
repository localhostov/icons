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

public val Icons.Outline.SkiJump: ImageVector
    get() {
        if (_skiJump != null) {
            return _skiJump!!
        }
        _skiJump = Builder(name = "SkiJump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.757f, 12.266f)
                arcToRelative(3.976f, 3.976f, 0.0f, false, true, -2.067f, 2.257f)
                lineTo(1.418f, 23.908f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.84f, -1.816f)
                lineToRelative(4.429f, -2.05f)
                curveTo(5.006f, 20.027f, 5.0f, 20.015f, 5.0f, 20.0f)
                verticalLineTo(13.266f)
                arcTo(5.957f, 5.957f, 0.0f, false, true, 6.756f, 9.024f)
                lineTo(9.78f, 6.0f)
                horizontalLineTo(2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 4.0f)
                horizontalLineToRelative(8.507f)
                arcToRelative(4.008f, 4.008f, 0.0f, false, true, 2.566f, 0.931f)
                lineToRelative(0.948f, 0.792f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.1f, 4.338f)
                lineToRelative(-3.427f, 3.427f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(3.427f, -3.428f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.017f, -1.431f)
                lineToRelative(-0.707f, -0.589f)
                lineTo(8.17f, 10.438f)
                arcTo(3.973f, 3.973f, 0.0f, false, false, 7.0f, 13.266f)
                verticalLineTo(19.12f)
                lineToRelative(13.849f, -6.411f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.963f, -2.656f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.812f, -0.846f)
                arcTo(3.975f, 3.975f, 0.0f, false, true, 23.757f, 12.266f)
                close()
                moveTo(16.5f, 4.982f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 4.982f)
                close()
            }
        }
        .build()
        return _skiJump!!
    }

private var _skiJump: ImageVector? = null
