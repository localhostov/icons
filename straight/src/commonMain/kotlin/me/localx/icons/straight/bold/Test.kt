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

public val Icons.Bold.Test: ImageVector
    get() {
        if (_test != null) {
            return _test!!
        }
        _test = Builder(name = "Test", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.134f)
                arcToRelative(8.95f, 8.95f, 0.0f, false, true, 0.8f, -3.706f)
                lineToRelative(0.676f, -1.492f)
                arcToRelative(2.71f, 2.71f, 0.0f, false, true, 2.524f, -1.668f)
                arcToRelative(2.737f, 2.737f, 0.0f, false, true, 2.553f, 1.729f)
                lineToRelative(0.648f, 1.43f)
                arcToRelative(8.944f, 8.944f, 0.0f, false, true, 0.8f, 3.707f)
                verticalLineToRelative(2.134f)
                close()
                moveTo(9.0f, 16.894f)
                lineTo(8.32f, 16.2f)
                lineTo(6.179f, 18.3f)
                lineTo(7.056f, 19.194f)
                arcToRelative(2.747f, 2.747f, 0.0f, false, false, 3.893f, 0.0f)
                lineToRelative(1.866f, -1.883f)
                lineToRelative(-2.13f, -2.112f)
                close()
                moveTo(22.0f, 6.742f)
                verticalLineToRelative(17.258f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(-20.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                horizontalLineToRelative(9.758f)
                arcToRelative(4.527f, 4.527f, 0.0f, false, true, 3.181f, 1.318f)
                lineToRelative(2.243f, 2.243f)
                arcToRelative(4.527f, 4.527f, 0.0f, false, true, 1.318f, 3.181f)
                close()
                moveTo(19.0f, 21.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
            }
        }
        .build()
        return _test!!
    }

private var _test: ImageVector? = null
