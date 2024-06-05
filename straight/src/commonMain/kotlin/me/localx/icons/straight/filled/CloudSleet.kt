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

public val Icons.Filled.CloudSleet: ImageVector
    get() {
        if (_cloudSleet != null) {
            return _cloudSleet!!
        }
        _cloudSleet = Builder(name = "CloudSleet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.975f, 24.0f)
                lineToRelative(-1.846f, -0.772f)
                lineToRelative(2.348f, -5.615f)
                lineToRelative(1.845f, 0.772f)
                close()
                moveTo(13.053f, 18.385f)
                lineTo(11.208f, 17.613f)
                lineTo(8.86f, 23.229f)
                lineTo(10.705f, 24.0f)
                close()
                moveTo(8.765f, 18.385f)
                lineTo(6.92f, 17.614f)
                lineTo(4.571f, 23.229f)
                lineTo(6.416f, 24.0f)
                close()
                moveTo(24.0f, 12.5f)
                arcToRelative(7.507f, 7.507f, 0.0f, false, true, -4.936f, 7.042f)
                lineToRelative(0.412f, -0.966f)
                arcTo(1.851f, 1.851f, 0.0f, false, false, 17.773f, 16.0f)
                lineTo(6.759f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.845f, 1.228f)
                lineTo(3.859f, 19.75f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.537f, 5.537f, 0.0f, false, true, -1.593f, -9.7f)
                curveTo(-0.043f, 0.307f, 13.533f, -4.116f, 17.44f, 5.059f)
                arcTo(7.461f, 7.461f, 0.0f, false, true, 24.0f, 12.5f)
                close()
                moveTo(16.0f, 9.0f)
                lineTo(13.726f, 9.0f)
                lineToRelative(1.13f, -1.973f)
                lineToRelative(-1.734f, -1.0f)
                lineTo(12.0f, 7.989f)
                lineTo(10.878f, 6.032f)
                lineToRelative(-1.735f, 1.0f)
                lineTo(10.274f, 9.0f)
                lineTo(8.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.274f)
                lineTo(9.143f, 12.973f)
                lineToRelative(1.735f, 0.995f)
                lineTo(12.0f, 12.011f)
                lineToRelative(1.122f, 1.957f)
                lineToRelative(1.734f, -0.995f)
                lineTo(13.726f, 11.0f)
                lineTo(16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _cloudSleet!!
    }

private var _cloudSleet: ImageVector? = null
