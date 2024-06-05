package me.localx.icons.straight.bold

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

public val Icons.Bold.PenNibSlash: ImageVector
    get() {
        if (_penNibSlash != null) {
            return _penNibSlash!!
        }
        _penNibSlash = Builder(name = "PenNibSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.26f, 17.14f)
                lineToRelative(1.83f, -5.6f)
                lineToRelative(2.87f, -2.87f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.07f, 2.07f)
                lineToRelative(-4.38f, -4.38f)
                lineToRelative(2.07f, -2.07f)
                lineTo(15.34f, 0.04f)
                lineToRelative(-2.87f, 2.87f)
                lineToRelative(-5.6f, 1.83f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-4.7f, -4.7f)
                close()
                moveTo(12.86f, 5.94f)
                lineToRelative(5.2f, 5.2f)
                lineToRelative(-1.18f, 3.62f)
                lineToRelative(-7.63f, -7.63f)
                lineToRelative(3.62f, -1.18f)
                close()
                moveTo(12.94f, 17.88f)
                lineToRelative(2.5f, 2.5f)
                lineTo(0.0f, 24.0f)
                lineTo(3.62f, 8.57f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-1.44f, 6.14f)
                lineToRelative(2.34f, -2.34f)
                curveToRelative(0.05f, -0.77f, 0.54f, -1.41f, 1.21f, -1.69f)
                lineToRelative(2.6f, 2.6f)
                curveToRelative(-0.29f, 0.67f, -0.92f, 1.16f, -1.69f, 1.21f)
                lineToRelative(-2.34f, 2.34f)
                lineToRelative(6.14f, -1.44f)
                close()
            }
        }
        .build()
        return _penNibSlash!!
    }

private var _penNibSlash: ImageVector? = null
