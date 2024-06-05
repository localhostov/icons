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

public val Icons.Bold.TemperatureFrigid: ImageVector
    get() {
        if (_temperatureFrigid != null) {
            return _temperatureFrigid!!
        }
        _temperatureFrigid = Builder(name = "TemperatureFrigid", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.037f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -4.5f, -2.6f)
                verticalLineToRelative(-5.4f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.4f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 16.037f)
                close()
                moveTo(24.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 16.0f)
                arcToRelative(7.907f, 7.907f, 0.0f, false, true, 2.0f, -5.271f)
                lineTo(10.0f, 6.037f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(4.692f)
                arcTo(7.907f, 7.907f, 0.0f, false, true, 24.0f, 16.0f)
                close()
                moveTo(21.0f, 16.0f)
                arcToRelative(4.952f, 4.952f, 0.0f, false, false, -1.541f, -3.59f)
                lineTo(19.0f, 11.968f)
                lineTo(19.0f, 6.037f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                verticalLineToRelative(5.931f)
                lineToRelative(-0.459f, 0.442f)
                arcTo(4.952f, 4.952f, 0.0f, false, false, 11.0f, 16.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                close()
                moveTo(8.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                lineTo(5.0f, 3.911f)
                lineTo(1.607f, 1.966f)
                lineTo(0.115f, 4.568f)
                lineTo(3.484f, 6.5f)
                lineTo(0.115f, 8.432f)
                lineToRelative(1.492f, 2.6f)
                lineTo(5.0f, 9.089f)
                lineTo(5.0f, 13.0f)
                lineTo(6.473f, 13.0f)
                arcTo(9.942f, 9.942f, 0.0f, false, true, 8.0f, 10.055f)
                close()
            }
        }
        .build()
        return _temperatureFrigid!!
    }

private var _temperatureFrigid: ImageVector? = null
