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

public val Icons.Bold.ChartSetTheory: ImageVector
    get() {
        if (_chartSetTheory != null) {
            return _chartSetTheory!!
        }
        _chartSetTheory = Builder(name = "ChartSetTheory", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.412f, 9.589f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, false, -14.824f, 0.0f)
                arcTo(7.5f, 7.5f, 0.0f, true, false, 12.0f, 22.486f)
                arcToRelative(7.495f, 7.495f, 0.0f, true, false, 7.412f, -12.9f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, true, 4.5f, 4.5f)
                arcToRelative(4.417f, 4.417f, 0.0f, false, true, -0.051f, 0.5f)
                arcTo(7.449f, 7.449f, 0.0f, false, false, 12.0f, 10.514f)
                arcTo(7.449f, 7.449f, 0.0f, false, false, 7.551f, 9.0f)
                arcTo(4.417f, 4.417f, 0.0f, false, true, 7.5f, 8.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 12.0f, 4.0f)
                close()
                moveTo(3.0f, 16.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 2.621f, -4.076f)
                arcToRelative(7.531f, 7.531f, 0.0f, false, false, 3.467f, 2.987f)
                arcTo(7.523f, 7.523f, 0.0f, false, false, 9.0f, 16.5f)
                arcToRelative(7.442f, 7.442f, 0.0f, false, false, 1.006f, 3.735f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 3.0f, 16.5f)
                close()
                moveTo(16.5f, 21.0f)
                arcToRelative(4.47f, 4.47f, 0.0f, false, true, -2.506f, -0.765f)
                arcTo(7.442f, 7.442f, 0.0f, false, false, 15.0f, 16.5f)
                arcToRelative(7.523f, 7.523f, 0.0f, false, false, -0.088f, -1.089f)
                arcToRelative(7.531f, 7.531f, 0.0f, false, false, 3.467f, -2.987f)
                arcTo(4.492f, 4.492f, 0.0f, false, true, 16.5f, 21.0f)
                close()
            }
        }
        .build()
        return _chartSetTheory!!
    }

private var _chartSetTheory: ImageVector? = null
