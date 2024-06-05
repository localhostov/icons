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

public val Icons.Filled.EnvelopePlus: ImageVector
    get() {
        if (_envelopePlus != null) {
            return _envelopePlus!!
        }
        _envelopePlus = Builder(name = "EnvelopePlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                lineTo(24.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                verticalLineToRelative(4.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 4.0f)
                close()
                moveTo(12.0f, 15.422f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.122f, -0.876f)
                lineTo(16.969f, 11.7f)
                arcTo(6.991f, 6.991f, 0.0f, false, true, 12.294f, 3.0f)
                lineTo(3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.219f, 4.886f)
                lineToRelative(9.659f, 9.66f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.422f)
                close()
                moveTo(15.536f, 15.96f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, true, -7.072f, 0.0f)
                lineTo(0.0f, 7.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 9.894f)
                arcToRelative(6.972f, 6.972f, 0.0f, false, true, -4.478f, 2.08f)
                close()
            }
        }
        .build()
        return _envelopePlus!!
    }

private var _envelopePlus: ImageVector? = null
