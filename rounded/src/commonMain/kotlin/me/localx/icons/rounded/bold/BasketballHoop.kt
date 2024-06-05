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

public val Icons.Bold.BasketballHoop: ImageVector
    get() {
        if (_basketballHoop != null) {
            return _basketballHoop!!
        }
        _basketballHoop = Builder(name = "BasketballHoop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 5.5f)
                lineTo(0.0f, 13.0f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, 5.5f, 5.5f)
                horizontalLineToRelative(0.136f)
                lineTo(6.0f, 20.627f)
                lineTo(6.0f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(9.0f, 22.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(13.5f, 22.0f)
                lineTo(15.0f, 22.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(18.0f, 20.775f)
                lineToRelative(0.0f, -0.028f)
                lineToRelative(0.374f, -2.247f)
                lineTo(18.5f, 18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 13.0f)
                lineTo(24.0f, 5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 18.5f, 0.0f)
                close()
                moveTo(16.0f, 14.5f)
                lineTo(15.255f, 19.0f)
                lineTo(8.765f, 19.0f)
                lineTo(8.0f, 14.562f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.5f, 14.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.494f, 0.494f, 0.0f, false, true, 0.374f, 0.168f)
                arcTo(0.472f, 0.472f, 0.0f, false, true, 16.005f, 14.5f)
                close()
                moveTo(21.0f, 13.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.117f, 2.471f)
                lineToRelative(0.091f, -0.548f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.5f, 11.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.463f, 4.0f)
                lineToRelative(0.08f, 0.47f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 13.0f)
                lineTo(3.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 5.5f)
                close()
                moveTo(18.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.5f, 5.0f)
                horizontalLineToRelative(5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.0f, 8.5f)
                close()
            }
        }
        .build()
        return _basketballHoop!!
    }

private var _basketballHoop: ImageVector? = null
