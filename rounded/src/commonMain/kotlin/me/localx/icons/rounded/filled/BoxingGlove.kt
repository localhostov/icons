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

public val Icons.Filled.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) {
            return _boxingGlove!!
        }
        _boxingGlove = Builder(name = "BoxingGlove", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 7.077f)
                arcTo(7.009f, 7.009f, 0.0f, false, true, 8.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(7.01f, 7.01f, 0.0f, false, true, 6.713f, 5.029f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 15.0f, 10.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(10.17f)
                arcTo(3.114f, 3.114f, 0.0f, false, true, 19.839f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 23.0f, 10.0f)
                verticalLineToRelative(3.075f)
                arcTo(7.48f, 7.48f, 0.0f, false, true, 19.752f, 19.0f)
                horizontalLineTo(2.827f)
                lineToRelative(-0.377f, -0.539f)
                arcTo(7.992f, 7.992f, 0.0f, false, true, 1.0f, 13.869f)
                verticalLineTo(10.444f)
                arcTo(3.959f, 3.959f, 0.0f, false, false, 3.0f, 11.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(3.0f)
                arcTo(1.983f, 1.983f, 0.0f, false, true, 1.0f, 7.077f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
