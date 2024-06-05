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
                moveTo(2.015f, 18.015f)
                verticalLineTo(13.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.233f, 0.285f)
                lineToRelative(4.95f, 4.95f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.414f, -1.414f)
                lineToRelative(-4.3f, -4.3f)
                horizontalLineTo(22.985f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(4.308f)
                lineToRelative(4.3f, -4.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.2f, 5.3f)
                lineToRelative(-4.95f, 4.95f)
                arcToRelative(2.491f, 2.491f, 0.0f, false, false, -0.233f, 0.284f)
                verticalLineTo(6.015f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowToLeft!!
    }

private var _arrowToLeft: ImageVector? = null
