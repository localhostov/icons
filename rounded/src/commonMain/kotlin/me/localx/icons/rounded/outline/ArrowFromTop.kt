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
                moveTo(17.278f, 17.129f)
                lineTo(13.0f, 21.407f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(21.421f)
                lineTo(6.707f, 17.129f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, 1.414f)
                lineToRelative(4.579f, 4.578f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.242f, 0.0f)
                lineToRelative(4.578f, -4.578f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _arrowFromTop!!
    }

private var _arrowFromTop: ImageVector? = null
