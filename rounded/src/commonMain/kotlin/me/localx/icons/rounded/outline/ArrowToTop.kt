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

public val Icons.Outline.ArrowToTop: ImageVector
    get() {
        if (_arrowToTop != null) {
            return _arrowToTop!!
        }
        _arrowToTop = Builder(name = "ArrowToTop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.031f)
                horizontalLineToRelative(4.517f)
                arcToRelative(2.492f, 2.492f, 0.0f, false, false, -0.285f, 0.232f)
                lineToRelative(-4.95f, 4.95f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.7f, 8.627f)
                lineToRelative(4.3f, -4.3f)
                verticalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(4.324f)
                lineToRelative(4.3f, 4.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, -1.414f)
                lineToRelative(-4.95f, -4.95f)
                arcToRelative(2.492f, 2.492f, 0.0f, false, false, -0.285f, -0.232f)
                horizontalLineTo(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _arrowToTop!!
    }

private var _arrowToTop: ImageVector? = null
