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

public val Icons.Bold.CloudRainbow: ImageVector
    get() {
        if (_cloudRainbow != null) {
            return _cloudRainbow!!
        }
        _cloudRainbow = Builder(name = "CloudRainbow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.884f, 12.8f)
                arcTo(10.447f, 10.447f, 0.0f, false, true, 24.0f, 10.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(7.461f, 7.461f, 0.0f, false, false, -5.07f, 1.989f)
                arcTo(7.179f, 7.179f, 0.0f, false, false, 16.884f, 12.8f)
                close()
                moveTo(13.035f, 9.556f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 1.98f, 2.274f)
                arcTo(12.459f, 12.459f, 0.0f, false, true, 24.0f, 8.0f)
                verticalLineTo(5.0f)
                arcTo(15.451f, 15.451f, 0.0f, false, false, 13.035f, 9.556f)
                close()
                moveTo(7.76f, 8.039f)
                curveTo(8.0f, 8.015f, 8.25f, 8.0f, 8.5f, 8.0f)
                arcToRelative(7.387f, 7.387f, 0.0f, false, true, 2.756f, 0.545f)
                arcTo(17.435f, 17.435f, 0.0f, false, true, 24.0f, 3.0f)
                verticalLineTo(0.0f)
                arcTo(20.456f, 20.456f, 0.0f, false, false, 7.76f, 8.039f)
                close()
                moveTo(18.0f, 18.75f)
                arcToRelative(5.258f, 5.258f, 0.0f, false, false, -4.37f, -5.176f)
                arcTo(5.487f, 5.487f, 0.0f, false, false, 3.005f, 15.255f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 4.5f, 24.0f)
                horizontalLineToRelative(8.25f)
                arcTo(5.256f, 5.256f, 0.0f, false, false, 18.0f, 18.75f)
                close()
                moveTo(6.0f, 18.0f)
                verticalLineTo(15.5f)
                arcToRelative(2.488f, 2.488f, 0.0f, false, true, 4.958f, -0.312f)
                lineToRelative(0.166f, 1.312f)
                horizontalLineTo(12.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, 4.5f)
                horizontalLineTo(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _cloudRainbow!!
    }

private var _cloudRainbow: ImageVector? = null
