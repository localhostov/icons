package me.localx.icons.rounded.bold

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

public val Icons.Bold.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.492f, 20.809f)
                arcTo(4.137f, 4.137f, 0.0f, false, true, 8.038f, 20.0f)
                lineTo(1.7f, 15.352f)
                arcToRelative(4.156f, 4.156f, 0.0f, false, true, 0.0f, -6.7f)
                lineTo(8.037f, 4.0f)
                arcToRelative(4.16f, 4.16f, 0.0f, false, true, 6.436f, 2.135f)
                lineTo(17.386f, 4.0f)
                arcTo(4.156f, 4.156f, 0.0f, false, true, 24.0f, 7.352f)
                verticalLineToRelative(9.3f)
                arcTo(4.156f, 4.156f, 0.0f, false, true, 17.386f, 20.0f)
                lineToRelative(-2.913f, -2.135f)
                arcToRelative(4.175f, 4.175f, 0.0f, false, true, -3.981f, 2.944f)
                close()
                moveTo(10.482f, 6.189f)
                arcToRelative(1.121f, 1.121f, 0.0f, false, false, -0.671f, 0.229f)
                lineTo(3.473f, 11.067f)
                arcToRelative(1.157f, 1.157f, 0.0f, false, false, 0.0f, 1.866f)
                lineToRelative(6.339f, 4.649f)
                arcToRelative(1.157f, 1.157f, 0.0f, false, false, 1.84f, -0.934f)
                lineTo(11.652f, 15.037f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.387f, -1.21f)
                lineToRelative(5.12f, 3.755f)
                arcTo(1.158f, 1.158f, 0.0f, false, false, 21.0f, 16.648f)
                verticalLineToRelative(-9.3f)
                arcToRelative(1.158f, 1.158f, 0.0f, false, false, -1.841f, -0.934f)
                lineToRelative(-5.12f, 3.755f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.387f, -1.21f)
                lineTo(11.652f, 7.352f)
                arcToRelative(1.129f, 1.129f, 0.0f, false, false, -0.633f, -1.032f)
                arcTo(1.218f, 1.218f, 0.0f, false, false, 10.482f, 6.189f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
