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

public val Icons.Bold.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.77f, 6.215f)
                arcTo(2.433f, 2.433f, 0.0f, false, false, 0.0f, 8.611f)
                arcToRelative(2.474f, 2.474f, 0.0f, false, false, 0.771f, 1.71f)
                lineTo(4.0f, 13.548f)
                lineTo(4.0f, 20.0f)
                horizontalLineToRelative(6.448f)
                lineToRelative(3.265f, 3.267f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 1.706f, 0.713f)
                arcToRelative(2.438f, 2.438f, 0.0f, false, false, 0.618f, -0.08f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 1.726f, -1.689f)
                lineTo(24.0f, -0.016f)
                close()
                moveTo(3.533f, 8.856f)
                lineToRelative(13.209f, -3.7f)
                lineTo(7.0f, 14.9f)
                lineTo(7.0f, 12.326f)
                close()
                moveTo(15.133f, 20.456f)
                lineTo(11.675f, 17.0f)
                lineTo(9.1f, 17.0f)
                lineToRelative(9.734f, -9.741f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
