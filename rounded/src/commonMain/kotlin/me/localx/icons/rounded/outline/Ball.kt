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

public val Icons.Outline.Ball: ImageVector
    get() {
        if (_ball != null) {
            return _ball!!
        }
        _ball = Builder(name = "Ball", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 24.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 17.0f)
                close()
                moveTo(20.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 22.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 22.0f)
                close()
                moveTo(23.947f, 2.438f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.435f, -1.114f)
                lineTo(7.785f, 17.539f)
                arcTo(0.96f, 0.96f, 0.0f, true, true, 6.15f, 16.532f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -5.108f, -3.147f)
                arcTo(6.959f, 6.959f, 0.0f, false, false, 6.949f, 24.0f)
                arcToRelative(7.045f, 7.045f, 0.0f, false, false, 1.626f, -0.191f)
                arcToRelative(6.886f, 6.886f, 0.0f, false, false, 4.3f, -3.091f)
                lineTo(23.485f, 4.681f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 23.947f, 2.438f)
                close()
                moveTo(11.19f, 19.638f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, true, -8.446f, -5.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.7f, 1.049f)
                arcTo(2.96f, 2.96f, 0.0f, false, false, 9.47f, 18.616f)
                lineToRelative(4.779f, -7.223f)
                lineToRelative(1.667f, 1.1f)
                close()
                moveTo(21.827f, 3.562f)
                lineToRelative(-0.007f, 0.011f)
                lineToRelative(-4.8f, 7.255f)
                lineToRelative(-1.667f, -1.1f)
                lineToRelative(4.821f, -7.287f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.654f, 1.124f)
                close()
            }
        }
        .build()
        return _ball!!
    }

private var _ball: ImageVector? = null
