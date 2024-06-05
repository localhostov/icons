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

public val Icons.Bold.NoteSticky: ImageVector
    get() {
        if (_noteSticky != null) {
            return _noteSticky!!
        }
        _noteSticky = Builder(name = "NoteSticky", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 0.0f)
                horizontalLineTo(4.5f)
                curveTo(2.02f, 0.0f, 0.0f, 2.02f, 0.0f, 4.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(11.65f)
                curveToRelative(1.42f, 0.0f, 2.76f, -0.55f, 3.76f, -1.56f)
                lineToRelative(2.54f, -2.54f)
                curveToRelative(1.0f, -1.0f, 1.56f, -2.34f, 1.56f, -3.76f)
                verticalLineTo(4.5f)
                curveToRelative(0.0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(3.0f, 19.5f)
                verticalLineTo(4.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _noteSticky!!
    }

private var _noteSticky: ImageVector? = null
