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

public val Icons.Filled.ArrowToTop: ImageVector
    get() {
        if (_arrowToTop != null) {
            return _arrowToTop!!
        }
        _arrowToTop = Builder(name = "ArrowToTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.553f, 2.0f)
                arcToRelative(2.578f, 2.578f, 0.0f, false, false, -0.321f, 0.263f)
                lineToRelative(-4.95f, 4.95f)
                lineTo(6.7f, 8.627f)
                lineToRelative(4.3f, -4.3f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.324f)
                lineToRelative(4.3f, 4.3f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-4.95f, -4.95f)
                arcTo(2.578f, 2.578f, 0.0f, false, false, 13.447f, 2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _arrowToTop!!
    }

private var _arrowToTop: ImageVector? = null
