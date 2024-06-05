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

public val Icons.Filled.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.569f, 6.0f)
                lineToRelative(1.964f, 5.0f)
                lineTo(8.477f, 11.0f)
                lineToRelative(2.0f, -5.0f)
                close()
                moveTo(17.681f, 11.0f)
                horizontalLineToRelative(6.248f)
                arcToRelative(3.013f, 3.013f, 0.0f, false, false, -0.476f, -0.979f)
                lineTo(21.406f, 7.228f)
                arcTo(3.009f, 3.009f, 0.0f, false, false, 18.986f, 6.0f)
                lineTo(15.717f, 6.0f)
                close()
                moveTo(15.614f, 13.0f)
                lineTo(8.386f, 13.0f)
                lineTo(12.0f, 23.879f)
                close()
                moveTo(17.722f, 13.0f)
                lineTo(14.979f, 21.255f)
                lineTo(23.146f, 13.923f)
                arcTo(3.045f, 3.045f, 0.0f, false, false, 23.78f, 13.0f)
                close()
                moveTo(6.278f, 13.0f)
                lineTo(0.23f, 13.0f)
                arcToRelative(3.144f, 3.144f, 0.0f, false, false, 0.661f, 0.957f)
                lineToRelative(8.13f, 7.3f)
                close()
                moveTo(6.323f, 11.0f)
                lineTo(8.323f, 6.0f)
                lineTo(5.014f, 6.0f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, false, -2.42f, 1.228f)
                lineTo(0.547f, 10.021f)
                arcTo(3.01f, 3.01f, 0.0f, false, false, 0.072f, 11.0f)
                close()
                moveTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.844f, 1.652f)
                lineTo(18.156f, 0.578f)
                lineToRelative(-2.0f, 3.142f)
                lineToRelative(1.688f, 1.074f)
                close()
                moveTo(7.844f, 3.72f)
                lineTo(5.844f, 0.578f)
                lineTo(4.156f, 1.652f)
                lineToRelative(2.0f, 3.142f)
                close()
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
