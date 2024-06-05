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

public val Icons.Outline.NoteSticky: ImageVector
    get() {
        if (_noteSticky != null) {
            return _noteSticky!!
        }
        _noteSticky = Builder(name = "NoteSticky", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.24f, 0.0f, 0.0f, 2.24f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(11.34f)
                curveToRelative(1.34f, 0.0f, 2.59f, -0.52f, 3.54f, -1.46f)
                lineToRelative(2.66f, -2.66f)
                curveToRelative(0.94f, -0.94f, 1.46f, -2.2f, 1.46f, -3.54f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(5.0f, 22.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                lineTo(22.0f, 15.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 22.0f)
                close()
                moveTo(18.46f, 21.12f)
                curveToRelative(-0.4f, 0.4f, -0.91f, 0.68f, -1.46f, 0.8f)
                verticalLineToRelative(-3.93f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.93f)
                curveToRelative(-0.12f, 0.55f, -0.4f, 1.06f, -0.8f, 1.46f)
                lineToRelative(-2.66f, 2.66f)
                close()
            }
        }
        .build()
        return _noteSticky!!
    }

private var _noteSticky: ImageVector? = null
