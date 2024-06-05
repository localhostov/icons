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

public val Icons.Outline.Books: ImageVector
    get() {
        if (_books != null) {
            return _books!!
        }
        _books = Builder(name = "Books", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.98f, 21.566f)
                lineTo(16.756f, 1.967f)
                curveToRelative(-0.276f, -0.752f, -0.828f, -1.352f, -1.556f, -1.688f)
                curveToRelative(-0.727f, -0.338f, -1.542f, -0.371f, -2.294f, -0.094f)
                lineToRelative(-0.939f, 0.345f)
                curveToRelative(-0.283f, 0.104f, -0.544f, 0.246f, -0.778f, 0.423f)
                curveToRelative(-0.548f, -0.585f, -1.326f, -0.952f, -2.189f, -0.952f)
                lineTo(3.0f, 0.001f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(12.0f, 24.0f)
                lineTo(12.0f, 9.305f)
                lineToRelative(5.408f, 14.672f)
                lineToRelative(6.572f, -2.41f)
                close()
                moveTo(18.593f, 21.412f)
                lineToRelative(-0.965f, -2.619f)
                lineToRelative(2.816f, -1.033f)
                lineToRelative(0.965f, 2.619f)
                lineToRelative(-2.816f, 1.033f)
                close()
                moveTo(16.936f, 16.917f)
                lineToRelative(-3.489f, -9.466f)
                lineToRelative(2.816f, -1.034f)
                lineToRelative(3.489f, 9.466f)
                lineToRelative(-2.816f, 1.033f)
                close()
                moveTo(12.093f, 2.925f)
                curveToRelative(0.112f, -0.242f, 0.312f, -0.427f, 0.563f, -0.519f)
                lineToRelative(0.939f, -0.345f)
                curveToRelative(0.112f, -0.041f, 0.229f, -0.062f, 0.345f, -0.062f)
                curveToRelative(0.143f, 0.0f, 0.285f, 0.031f, 0.419f, 0.093f)
                curveToRelative(0.243f, 0.112f, 0.427f, 0.312f, 0.52f, 0.564f)
                lineToRelative(0.694f, 1.884f)
                lineToRelative(-2.816f, 1.034f)
                lineToRelative(-0.695f, -1.885f)
                curveToRelative(-0.092f, -0.251f, -0.081f, -0.522f, 0.031f, -0.765f)
                close()
                moveTo(10.0f, 3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(5.0f, 17.0f)
                lineTo(2.0f, 17.0f)
                lineTo(2.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 5.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(2.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(7.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _books!!
    }

private var _books: ImageVector? = null
