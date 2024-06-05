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
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(6.481f)
                lineToRelative(-7.589f, 1.284f)
                arcToRelative(0.474f, 0.474f, 0.0f, false, false, -0.413f, 0.4f)
                arcToRelative(7.829f, 7.829f, 0.0f, false, true, -0.625f, 2.883f)
                arcTo(8.057f, 8.057f, 0.0f, false, true, 9.283f, 23.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -1.276f, 0.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.99f, -8.527f)
                arcTo(8.143f, 8.143f, 0.0f, false, true, 8.242f, 8.0f)
                close()
                moveTo(21.0f, 11.0f)
                lineTo(8.242f, 11.0f)
                arcToRelative(5.139f, 5.139f, 0.0f, false, false, -5.231f, 4.665f)
                arcToRelative(4.985f, 4.985f, 0.0f, false, false, 9.6f, 2.216f)
                arcTo(4.778f, 4.778f, 0.0f, false, false, 13.0f, 16.1f)
                arcToRelative(3.453f, 3.453f, 0.0f, false, true, 2.912f, -3.292f)
                lineTo(21.0f, 11.946f)
                close()
                moveTo(11.0f, 0.0f)
                lineTo(8.0f, 0.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.813f, 2.225f)
                lineTo(14.187f, 0.775f)
                lineTo(11.771f, 5.152f)
                lineTo(14.4f, 6.6f)
                close()
                moveTo(7.229f, 5.152f)
                lineTo(4.813f, 0.775f)
                lineTo(2.187f, 2.225f)
                lineTo(4.6f, 6.6f)
                close()
            }
        }
        .build()
        return _whistle!!
    }

private var _whistle: ImageVector? = null
