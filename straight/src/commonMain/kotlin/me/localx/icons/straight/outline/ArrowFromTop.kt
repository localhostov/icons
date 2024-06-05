package me.localx.icons.straight.outline

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

public val Icons.Outline.ArrowFromTop: ImageVector
    get() {
        if (_arrowFromTop != null) {
            return _arrowFromTop!!
        }
        _arrowFromTop = Builder(name = "ArrowFromTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(21.207f)
                lineTo(6.7f, 16.9f)
                lineTo(5.282f, 18.318f)
                lineToRelative(4.95f, 4.95f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 3.536f, 0.0f)
                lineToRelative(4.95f, -4.95f)
                lineTo(17.3f, 16.9f)
                lineToRelative(-4.3f, 4.3f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _arrowFromTop!!
    }

private var _arrowFromTop: ImageVector? = null
