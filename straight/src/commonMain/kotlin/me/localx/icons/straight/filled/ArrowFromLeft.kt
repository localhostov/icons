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

public val Icons.Filled.ArrowFromLeft: ImageVector
    get() {
        if (_arrowFromLeft != null) {
            return _arrowFromLeft!!
        }
        _arrowFromLeft = Builder(name = "ArrowFromLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.268f, 10.232f)
                lineToRelative(-4.95f, -4.949f)
                lineTo(16.9f, 6.7f)
                lineToRelative(4.3f, 4.3f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.207f)
                lineToRelative(-4.3f, 4.3f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(4.95f, -4.949f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -3.536f)
                close()
            }
        }
        .build()
        return _arrowFromLeft!!
    }

private var _arrowFromLeft: ImageVector? = null
