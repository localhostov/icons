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

public val Icons.Bold.Whistle: ImageVector
    get() {
        if (_whistle != null) {
            return _whistle!!
        }
        _whistle = Builder(name = "Whistle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 13.0f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(0.947f)
                curveToRelative(0.0f, 1.226f, -0.791f, 2.669f, -3.008f, 3.044f)
                lineToRelative(-5.005f, 0.846f)
                arcToRelative(7.608f, 7.608f, 0.0f, false, true, -0.614f, 3.209f)
                arcTo(8.057f, 8.057f, 0.0f, false, true, 9.283f, 23.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -1.276f, 0.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.99f, -8.527f)
                arcTo(8.143f, 8.143f, 0.0f, false, true, 8.242f, 8.0f)
                lineTo(21.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 24.0f, 11.0f)
                close()
                moveTo(21.0f, 11.0f)
                lineTo(8.242f, 11.0f)
                arcToRelative(5.139f, 5.139f, 0.0f, false, false, -5.231f, 4.665f)
                arcToRelative(4.985f, 4.985f, 0.0f, false, false, 9.6f, 2.216f)
                arcTo(4.741f, 4.741f, 0.0f, false, false, 13.0f, 15.9f)
                arcToRelative(2.975f, 2.975f, 0.0f, false, true, 2.488f, -3.022f)
                lineToRelative(5.005f, -0.845f)
                arcTo(1.585f, 1.585f, 0.0f, false, false, 21.0f, 11.875f)
                close()
                moveTo(9.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 4.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 6.0f)
                close()
                moveTo(12.668f, 6.748f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.08f, -0.416f)
                lineToRelative(2.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.5f, -1.664f)
                lineToRelative(-2.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.668f, 6.748f)
                close()
                moveTo(4.255f, 6.337f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.49f, -1.674f)
                lineToRelative(-2.016f, -3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.238f, 3.337f)
                close()
            }
        }
        .build()
        return _whistle!!
    }

private var _whistle: ImageVector? = null
