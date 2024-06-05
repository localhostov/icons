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

public val Icons.Filled.PenNibSlash: ImageVector
    get() {
        if (_penNibSlash != null) {
            return _penNibSlash!!
        }
        _penNibSlash = Builder(name = "PenNibSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.21f, 2.79f)
                lineToRelative(2.79f, -2.79f)
                lineToRelative(8.0f, 8.0f)
                lineToRelative(-2.79f, 2.79f)
                lineTo(13.21f, 2.79f)
                close()
                moveTo(20.36f, 12.77f)
                lineTo(11.23f, 3.64f)
                lineToRelative(-4.52f, 1.65f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineTo(22.54f, 23.96f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-5.25f, -5.25f)
                lineToRelative(1.65f, -4.52f)
                close()
                moveTo(9.0f, 17.0f)
                curveToRelative(-0.18f, 0.0f, -0.35f, -0.03f, -0.51f, -0.07f)
                lineTo(1.42f, 24.0f)
                lineToRelative(14.6f, -3.74f)
                lineToRelative(-5.04f, -5.04f)
                curveToRelative(-0.11f, 1.0f, -0.95f, 1.78f, -1.98f, 1.78f)
                close()
                moveTo(7.07f, 15.51f)
                curveToRelative(-0.04f, -0.16f, -0.07f, -0.33f, -0.07f, -0.51f)
                curveToRelative(0.0f, -1.03f, 0.78f, -1.87f, 1.78f, -1.98f)
                lineTo(3.74f, 7.98f)
                lineTo(0.0f, 22.58f)
                lineToRelative(7.07f, -7.07f)
                close()
            }
        }
        .build()
        return _penNibSlash!!
    }

private var _penNibSlash: ImageVector? = null
