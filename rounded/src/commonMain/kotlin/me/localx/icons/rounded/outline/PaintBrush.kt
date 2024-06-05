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

public val Icons.Outline.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) {
            return _paintBrush!!
        }
        _paintBrush = Builder(name = "PaintBrush", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.1f, 0.9f)
                arcToRelative(3.139f, 3.139f, 0.0f, false, false, -4.33f, 0.0f)
                lineToRelative(-11.207f, 11.2f)
                arcToRelative(5.548f, 5.548f, 0.0f, false, false, -1.058f, -0.1f)
                arcToRelative(5.457f, 5.457f, 0.0f, false, false, -3.885f, 1.609f)
                curveToRelative(-1.352f, 1.353f, -2.306f, 4.983f, -2.589f, 6.954f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.969f, 3.437f)
                arcToRelative(3.1f, 3.1f, 0.0f, false, false, 0.439f, -0.031f)
                curveToRelative(1.971f, -0.283f, 5.6f, -1.237f, 6.954f, -2.589f)
                arcToRelative(5.494f, 5.494f, 0.0f, false, false, 1.5f, -4.941f)
                lineToRelative(11.207f, -11.209f)
                arcToRelative(3.068f, 3.068f, 0.0f, false, false, 0.0f, -4.33f)
                close()
                moveTo(8.977f, 19.966f)
                curveToRelative(-0.725f, 0.725f, -3.5f, 1.689f, -5.824f, 2.023f)
                arcToRelative(1.015f, 1.015f, 0.0f, false, true, -0.859f, -0.283f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.282f, -0.859f)
                curveToRelative(0.333f, -2.323f, 1.3f, -5.1f, 2.022f, -5.824f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 4.943f, 4.943f)
                close()
                moveTo(21.688f, 3.816f)
                lineTo(11.067f, 14.438f)
                arcToRelative(5.378f, 5.378f, 0.0f, false, false, -1.5f, -1.508f)
                lineToRelative(10.617f, -10.618f)
                arcToRelative(1.086f, 1.086f, 0.0f, false, true, 1.5f, 0.0f)
                arcToRelative(1.062f, 1.062f, 0.0f, false, true, 0.004f, 1.504f)
                close()
            }
        }
        .build()
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null
