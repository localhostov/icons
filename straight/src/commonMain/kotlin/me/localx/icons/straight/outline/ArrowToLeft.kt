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

public val Icons.Outline.ArrowToLeft: ImageVector
    get() {
        if (_arrowToLeft != null) {
            return _arrowToLeft!!
        }
        _arrowToLeft = Builder(name = "ArrowToLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.0f)
                horizontalLineTo(4.324f)
                lineToRelative(4.3f, -4.3f)
                lineTo(7.213f, 5.282f)
                lineToRelative(-4.95f, 4.95f)
                arcTo(2.578f, 2.578f, 0.0f, false, false, 2.0f, 10.553f)
                verticalLineTo(5.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.447f)
                arcToRelative(2.578f, 2.578f, 0.0f, false, false, 0.263f, 0.321f)
                lineToRelative(4.95f, 4.95f)
                lineTo(8.627f, 17.3f)
                lineTo(4.324f, 13.0f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _arrowToLeft!!
    }

private var _arrowToLeft: ImageVector? = null
