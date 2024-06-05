package me.localx.icons.rounded.filled

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
                moveTo(19.0f, 18.0f)
                horizontalLineToRelative(4.54f)
                curveToRelative(-0.35f, 0.91f, -0.88f, 1.75f, -1.59f, 2.46f)
                lineToRelative(-1.48f, 1.48f)
                curveToRelative(-0.71f, 0.71f, -1.55f, 1.24f, -2.46f, 1.59f)
                verticalLineToRelative(-4.54f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                close()
                moveTo(24.0f, 5.0f)
                lineTo(24.0f, 15.51f)
                curveToRelative(0.0f, 0.16f, -0.01f, 0.32f, -0.02f, 0.49f)
                horizontalLineToRelative(-4.98f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(4.98f)
                curveToRelative(-0.16f, 0.01f, -0.32f, 0.02f, -0.49f, 0.02f)
                lineTo(5.0f, 24.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.24f, 2.24f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _noteSticky!!
    }

private var _noteSticky: ImageVector? = null
