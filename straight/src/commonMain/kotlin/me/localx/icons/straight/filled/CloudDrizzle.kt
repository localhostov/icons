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

public val Icons.Filled.CloudDrizzle: ImageVector
    get() {
        if (_cloudDrizzle != null) {
            return _cloudDrizzle!!
        }
        _cloudDrizzle = Builder(name = "CloudDrizzle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 24.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -7.0f, 7.0f)
                lineTo(4.782f, 19.0f)
                arcTo(4.787f, 4.787f, 0.0f, false, true, 2.3f, 10.151f)
                curveTo(-0.1f, 0.412f, 13.354f, -4.2f, 17.423f, 5.021f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(10.0f, 14.0f)
                lineTo(8.0f, 14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 14.0f)
                lineTo(14.0f, 14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _cloudDrizzle!!
    }

private var _cloudDrizzle: ImageVector? = null
