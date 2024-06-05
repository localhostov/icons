package me.localx.icons.straight.filled

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
                moveTo(1.0f, 7.0f)
                arcTo(7.008f, 7.008f, 0.0f, false, true, 8.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(7.01f, 7.01f, 0.0f, false, true, 6.713f, 5.029f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 15.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                verticalLineToRelative(3.075f)
                arcTo(7.48f, 7.48f, 0.0f, false, true, 19.752f, 19.0f)
                horizontalLineTo(2.827f)
                lineToRelative(-0.377f, -0.539f)
                arcTo(7.958f, 7.958f, 0.0f, false, true, 1.0f, 13.868f)
                verticalLineTo(10.444f)
                arcTo(3.959f, 3.959f, 0.0f, false, false, 3.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 1.0f, 7.0f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
