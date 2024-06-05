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

public val Icons.Filled.ChartConnected: ImageVector
    get() {
        if (_chartConnected != null) {
            return _chartConnected!!
        }
        _chartConnected = Builder(name = "ChartConnected", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.984f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.957f, -4.0f)
                arcTo(9.05f, 9.05f, 0.0f, false, false, 16.0f, 3.949f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.99f, 0.0f)
                arcTo(9.05f, 9.05f, 0.0f, false, false, 3.957f, 7.988f)
                arcToRelative(3.995f, 3.995f, 0.0f, false, false, -0.016f, 7.989f)
                arcToRelative(9.044f, 9.044f, 0.0f, false, false, 4.064f, 4.074f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.99f, 0.0f)
                arcToRelative(9.044f, 9.044f, 0.0f, false, false, 4.064f, -4.074f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 11.984f)
                close()
                moveTo(15.478f, 18.061f)
                arcToRelative(3.965f, 3.965f, 0.0f, false, false, -6.956f, 0.0f)
                arcToRelative(7.062f, 7.062f, 0.0f, false, true, -2.59f, -2.6f)
                arcToRelative(3.966f, 3.966f, 0.0f, false, false, 0.015f, -6.957f)
                arcToRelative(7.052f, 7.052f, 0.0f, false, true, 2.575f, -2.57f)
                arcToRelative(3.965f, 3.965f, 0.0f, false, false, 6.956f, 0.0f)
                arcToRelative(7.052f, 7.052f, 0.0f, false, true, 2.575f, 2.57f)
                arcToRelative(3.966f, 3.966f, 0.0f, false, false, 0.015f, 6.957f)
                arcTo(7.062f, 7.062f, 0.0f, false, true, 15.478f, 18.061f)
                close()
            }
        }
        .build()
        return _chartConnected!!
    }

private var _chartConnected: ImageVector? = null
