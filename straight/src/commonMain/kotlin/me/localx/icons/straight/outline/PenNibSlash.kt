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

public val Icons.Outline.PenNibSlash: ImageVector
    get() {
        if (_penNibSlash != null) {
            return _penNibSlash!!
        }
        _penNibSlash = Builder(name = "PenNibSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.71f, 17.29f)
                lineToRelative(2.15f, -5.74f)
                lineToRelative(3.08f, -3.08f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.52f, 2.52f)
                lineToRelative(-5.59f, -5.59f)
                lineToRelative(2.52f, -2.52f)
                lineTo(15.52f, 0.06f)
                lineToRelative(-3.08f, 3.08f)
                lineToRelative(-5.74f, 2.15f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-5.25f, -5.25f)
                close()
                moveTo(12.75f, 5.16f)
                lineToRelative(6.09f, 6.09f)
                lineToRelative(-1.68f, 4.49f)
                lineTo(8.26f, 6.85f)
                lineToRelative(4.49f, -1.68f)
                close()
                moveTo(14.35f, 18.59f)
                lineToRelative(1.66f, 1.66f)
                lineTo(-0.01f, 24.01f)
                lineTo(3.74f, 7.98f)
                lineToRelative(1.66f, 1.66f)
                lineToRelative(-2.3f, 9.84f)
                lineToRelative(3.97f, -3.97f)
                curveToRelative(-0.04f, -0.16f, -0.07f, -0.33f, -0.07f, -0.51f)
                curveToRelative(0.0f, -1.03f, 0.78f, -1.87f, 1.78f, -1.98f)
                lineToRelative(2.2f, 2.2f)
                curveToRelative(-0.11f, 1.0f, -0.95f, 1.78f, -1.98f, 1.78f)
                curveToRelative(-0.18f, 0.0f, -0.35f, -0.03f, -0.51f, -0.07f)
                lineToRelative(-3.97f, 3.97f)
                lineToRelative(9.84f, -2.3f)
                close()
            }
        }
        .build()
        return _penNibSlash!!
    }

private var _penNibSlash: ImageVector? = null
