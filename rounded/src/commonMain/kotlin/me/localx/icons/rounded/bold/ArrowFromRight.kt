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

public val Icons.Bold.ArrowFromRight: ImageVector
    get() {
        if (_arrowFromRight != null) {
            return _arrowFromRight!!
        }
        _arrowFromRight = Builder(name = "ArrowFromRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.858f, 14.09f)
                lineToRelative(4.731f, 4.731f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.71f, 16.7f)
                lineTo(4.462f, 13.516f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(6.28f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(4.236f)
                horizontalLineTo(4.525f)
                lineTo(7.71f, 7.331f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.589f, 5.209f)
                lineTo(0.857f, 9.941f)
                arcTo(2.938f, 2.938f, 0.0f, false, false, 0.858f, 14.09f)
                close()
            }
        }
        .build()
        return _arrowFromRight!!
    }

private var _arrowFromRight: ImageVector? = null
