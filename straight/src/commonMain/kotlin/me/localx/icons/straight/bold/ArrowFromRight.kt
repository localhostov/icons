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
                moveTo(21.0f, 5.0f)
                verticalLineToRelative(5.5f)
                horizontalLineTo(4.5f)
                lineTo(7.95f, 7.052f)
                lineTo(5.829f, 4.931f)
                lineTo(0.879f, 9.882f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.242f)
                lineToRelative(4.949f, 4.95f)
                lineTo(7.95f, 16.953f)
                lineTo(4.5f, 13.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _arrowFromRight!!
    }

private var _arrowFromRight: ImageVector? = null
