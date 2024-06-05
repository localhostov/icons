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

public val Icons.Filled.NoteSticky: ImageVector
    get() {
        if (_noteSticky != null) {
            return _noteSticky!!
        }
        _noteSticky = Builder(name = "NoteSticky", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(5.41f)
                lineToRelative(-5.41f, 5.41f)
                verticalLineToRelative(-5.41f)
                close()
                moveTo(24.0f, 3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                horizontalLineTo(21.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _noteSticky!!
    }

private var _noteSticky: ImageVector? = null
