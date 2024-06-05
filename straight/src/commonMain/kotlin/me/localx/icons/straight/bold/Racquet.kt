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

public val Icons.Bold.Racquet: ImageVector
    get() {
        if (_racquet != null) {
            return _racquet!!
        }
        _racquet = Builder(name = "Racquet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.777f, 2.223f)
                curveTo(18.416f, -1.139f, 12.417f, -0.608f, 8.4f, 3.4f)
                arcToRelative(11.077f, 11.077f, 0.0f, false, false, -3.378f, 8.1f)
                lineTo(5.0f, 11.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.223f, 0.0f, 2.379f, -0.561f, 2.939f)
                lineToRelative(-4.4f, 4.4f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(4.4f, -4.4f)
                curveToRelative(0.611f, -0.611f, 2.232f, -0.583f, 3.412f, -0.561f)
                curveToRelative(1.42f, 0.024f, 2.757f, -0.011f, 2.856f, -0.011f)
                arcTo(11.164f, 11.164f, 0.0f, false, false, 20.6f, 15.6f)
                curveTo(24.608f, 11.583f, 25.138f, 5.584f, 21.777f, 2.223f)
                close()
                moveTo(18.392f, 3.487f)
                lineTo(14.541f, 7.338f)
                lineTo(11.722f, 4.52f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 4.441f, -1.527f)
                arcTo(5.23f, 5.23f, 0.0f, false, true, 18.392f, 3.487f)
                close()
                moveTo(9.584f, 6.624f)
                lineToRelative(2.835f, 2.835f)
                lineTo(8.476f, 13.4f)
                arcTo(6.851f, 6.851f, 0.0f, false, true, 9.584f, 6.624f)
                close()
                moveTo(10.597f, 15.524f)
                lineTo(14.541f, 11.581f)
                lineTo(17.376f, 14.416f)
                arcTo(6.848f, 6.848f, 0.0f, false, true, 10.6f, 15.524f)
                close()
                moveTo(19.482f, 12.28f)
                lineTo(16.662f, 9.459f)
                lineTo(20.524f, 5.6f)
                arcTo(6.813f, 6.813f, 0.0f, false, true, 19.482f, 12.28f)
                close()
            }
        }
        .build()
        return _racquet!!
    }

private var _racquet: ImageVector? = null
