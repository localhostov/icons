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

public val Icons.Outline.Curling: ImageVector
    get() {
        if (_curling != null) {
            return _curling!!
        }
        _curling = Builder(name = "Curling", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.854f, 10.293f)
                lineTo(19.538f, 9.03f)
                arcTo(3.994f, 3.994f, 0.0f, false, false, 15.657f, 6.0f)
                horizontalLineTo(7.136f)
                lineToRelative(0.144f, -0.65f)
                arcTo(2.983f, 2.983f, 0.0f, false, true, 10.209f, 3.0f)
                horizontalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(10.209f)
                arcTo(4.973f, 4.973f, 0.0f, false, false, 5.327f, 4.916f)
                lineTo(4.131f, 10.3f)
                arcTo(6.012f, 6.012f, 0.0f, false, false, 0.0f, 16.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineTo(18.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, false, 6.0f, -6.0f)
                verticalLineTo(16.0f)
                arcTo(6.011f, 6.011f, 0.0f, false, false, 19.854f, 10.293f)
                close()
                moveTo(15.657f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.6f, 9.515f)
                lineTo(17.72f, 10.0f)
                horizontalLineTo(6.247f)
                lineToRelative(0.444f, -2.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineTo(18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineTo(2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 12.0f)
                close()
                moveTo(18.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                horizontalLineTo(22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 22.0f)
                close()
            }
        }
        .build()
        return _curling!!
    }

private var _curling: ImageVector? = null
