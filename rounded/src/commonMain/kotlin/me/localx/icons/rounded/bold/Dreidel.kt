package me.localx.icons.rounded.bold

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

public val Icons.Bold.Dreidel: ImageVector
    get() {
        if (_dreidel != null) {
            return _dreidel!!
        }
        _dreidel = Builder(name = "Dreidel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.561f, 0.439f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, 0.0f)
                lineToRelative(-6.8f, 6.8f)
                lineToRelative(-0.7f, -0.7f)
                arcTo(5.266f, 5.266f, 0.0f, false, false, 6.5f, 6.534f)
                lineTo(1.542f, 11.42f)
                arcTo(5.231f, 5.231f, 0.0f, false, false, 0.0f, 15.143f)
                verticalLineToRelative(3.592f)
                arcTo(5.27f, 5.27f, 0.0f, false, false, 5.265f, 24.0f)
                lineTo(8.857f, 24.0f)
                arcToRelative(5.237f, 5.237f, 0.0f, false, false, 3.731f, -1.55f)
                lineToRelative(4.87f, -4.946f)
                arcToRelative(5.268f, 5.268f, 0.0f, false, false, 0.0f, -7.444f)
                lineToRelative(-0.7f, -0.7f)
                lineToRelative(6.8f, -6.8f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 23.561f, 0.439f)
                close()
                moveTo(3.0f, 18.735f)
                lineTo(3.0f, 16.163f)
                arcTo(6.424f, 6.424f, 0.0f, false, false, 6.0f, 17.0f)
                quadToRelative(0.553f, 0.0f, 1.048f, -0.048f)
                quadTo(7.0f, 17.447f, 7.0f, 18.0f)
                arcToRelative(6.531f, 6.531f, 0.0f, false, false, 0.819f, 3.0f)
                lineTo(5.265f, 21.0f)
                arcTo(2.267f, 2.267f, 0.0f, false, true, 3.0f, 18.735f)
                close()
                moveTo(15.329f, 15.391f)
                lineTo(10.746f, 20.045f)
                arcTo(3.986f, 3.986f, 0.0f, false, true, 10.0f, 18.0f)
                arcToRelative(3.462f, 3.462f, 0.0f, false, true, 1.061f, -2.939f)
                lineToRelative(0.5f, -0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.44f, 12.438f)
                lineToRelative(-0.5f, 0.5f)
                arcTo(3.462f, 3.462f, 0.0f, false, true, 6.0f, 14.0f)
                arcToRelative(3.827f, 3.827f, 0.0f, false, true, -2.031f, -0.761f)
                lineTo(8.617f, 8.663f)
                arcToRelative(2.267f, 2.267f, 0.0f, false, true, 3.2f, 0.0f)
                lineToRelative(3.518f, 3.518f)
                arcTo(2.269f, 2.269f, 0.0f, false, true, 15.329f, 15.391f)
                close()
            }
        }
        .build()
        return _dreidel!!
    }

private var _dreidel: ImageVector? = null
