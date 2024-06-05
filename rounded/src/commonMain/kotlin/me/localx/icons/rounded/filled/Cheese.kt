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

public val Icons.Filled.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.507f)
                arcTo(5.951f, 5.951f, 0.0f, false, false, 23.8f, 10.0f)
                lineTo(2.673f, 10.0f)
                arcTo(1.977f, 1.977f, 0.0f, false, false, 0.884f, 11.13f)
                curveTo(-0.647f, 14.839f, -0.531f, 23.92f, 4.833f, 24.0f)
                horizontalLineToRelative(2.93f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.412f, -1.01f)
                arcToRelative(3.014f, 3.014f, 0.0f, false, true, 5.65f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.237f, 24.0f)
                lineTo(18.8f, 24.0f)
                arcTo(5.048f, 5.048f, 0.0f, false, false, 24.0f, 19.0f)
                close()
                moveTo(7.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 17.0f)
                close()
                moveTo(18.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 19.0f)
                close()
                moveTo(22.853f, 8.0f)
                lineTo(2.673f, 8.0f)
                arcToRelative(4.031f, 4.031f, 0.0f, false, false, -0.53f, 0.039f)
                arcTo(20.209f, 20.209f, 0.0f, false, true, 8.043f, 0.96f)
                arcTo(4.961f, 4.961f, 0.0f, false, true, 13.751f, 0.848f)
                lineToRelative(4.2f, 3.132f)
                lineTo(21.589f, 6.7f)
                arcTo(5.968f, 5.968f, 0.0f, false, true, 22.853f, 8.0f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
