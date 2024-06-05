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

public val Icons.Outline.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.091f, 16.0f)
                curveTo(21.661f, 15.964f, 24.0f, 12.484f, 24.0f, 9.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.764f, -3.419f)
                curveToRelative(0.136f, -0.387f, 0.254f, -0.742f, 0.333f, -1.011f)
                arcToRelative(3.887f, 3.887f, 0.0f, false, false, -0.626f, -3.458f)
                arcTo(3.979f, 3.979f, 0.0f, false, false, 17.729f, 0.0f)
                horizontalLineTo(6.271f)
                arcTo(3.979f, 3.979f, 0.0f, false, false, 3.057f, 1.612f)
                arcTo(3.887f, 3.887f, 0.0f, false, false, 2.431f, 5.07f)
                curveToRelative(0.079f, 0.269f, 0.2f, 0.624f, 0.333f, 1.011f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 9.5f)
                curveToRelative(0.0f, 2.984f, 2.339f, 6.464f, 8.909f, 6.5f)
                arcTo(5.06f, 5.06f, 0.0f, false, true, 9.0f, 16.921f)
                verticalLineTo(20.0f)
                arcToRelative(1.883f, 1.883f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineToRelative(-0.992f)
                arcTo(1.885f, 1.885f, 0.0f, false, true, 15.0f, 20.0f)
                verticalLineTo(16.92f)
                arcTo(5.058f, 5.058f, 0.0f, false, true, 15.091f, 16.0f)
                close()
                moveTo(20.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.0f, 9.5f)
                curveToRelative(0.0f, 2.034f, -1.609f, 4.2f, -6.036f, 4.47f)
                arcToRelative(4.847f, 4.847f, 0.0f, false, true, 0.762f, -0.821f)
                arcTo(15.132f, 15.132f, 0.0f, false, false, 20.453f, 7.99f)
                curveTo(20.469f, 7.991f, 20.483f, 8.0f, 20.5f, 8.0f)
                close()
                moveTo(2.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 8.0f)
                curveToRelative(0.017f, 0.0f, 0.031f, -0.009f, 0.047f, -0.01f)
                arcToRelative(15.132f, 15.132f, 0.0f, false, false, 3.727f, 5.159f)
                arcToRelative(4.847f, 4.847f, 0.0f, false, true, 0.762f, 0.821f)
                curveTo(3.609f, 13.7f, 2.0f, 11.534f, 2.0f, 9.5f)
                close()
                moveTo(10.513f, 22.0f)
                arcTo(4.08f, 4.08f, 0.0f, false, false, 11.0f, 20.0f)
                verticalLineTo(16.921f)
                arcToRelative(6.93f, 6.93f, 0.0f, false, false, -2.431f, -5.295f)
                arcTo(15.338f, 15.338f, 0.0f, false, true, 4.349f, 4.5f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.31f, -1.694f)
                arcTo(1.994f, 1.994f, 0.0f, false, true, 6.271f, 2.0f)
                horizontalLineTo(17.729f)
                arcToRelative(1.994f, 1.994f, 0.0f, false, true, 1.612f, 0.81f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.31f, 1.694f)
                arcToRelative(15.338f, 15.338f, 0.0f, false, true, -4.22f, 7.122f)
                arcTo(6.928f, 6.928f, 0.0f, false, false, 13.0f, 16.92f)
                verticalLineTo(20.0f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, 0.487f, 2.0f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
