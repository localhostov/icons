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

public val Icons.Bold.ArrowToTop: ImageVector
    get() {
        if (_arrowToTop != null) {
            return _arrowToTop!!
        }
        _arrowToTop = Builder(name = "ArrowToTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.265f, 3.015f)
                horizontalLineToRelative(3.0f)
                lineTo(5.194f, 7.083f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.315f, 9.205f)
                lineTo(10.5f, 6.02f)
                verticalLineToRelative(16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(6.02f)
                lineToRelative(3.185f, 3.185f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.121f, -2.122f)
                lineTo(14.738f, 3.015f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(6.265f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _arrowToTop!!
    }

private var _arrowToTop: ImageVector? = null
