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

public val Icons.Bold.CarAlt: ImageVector
    get() {
        if (_carAlt != null) {
            return _carAlt!!
        }
        _carAlt = Builder(name = "CarAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.357f, 8.0f)
                arcTo(34.789f, 34.789f, 0.0f, false, false, 19.21f, 3.245f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -2.258f, -1.54f)
                arcTo(15.235f, 15.235f, 0.0f, false, false, 12.0f, 1.0f)
                arcToRelative(19.175f, 19.175f, 0.0f, false, false, -5.479f, 0.713f)
                arcTo(4.382f, 4.382f, 0.0f, false, false, 4.29f, 3.245f)
                arcTo(23.466f, 23.466f, 0.0f, false, false, 1.464f, 8.0f)
                lineTo(0.0f, 8.0f)
                lineTo(0.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 23.0f)
                lineTo(7.0f, 20.0f)
                lineTo(17.0f, 20.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(21.0f, 20.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 8.0f)
                close()
                moveTo(5.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 17.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(64.834f, 64.834f, 0.0f, false, false, -8.8f, 0.711f)
                arcTo(23.405f, 23.405f, 0.0f, false, true, 6.671f, 5.07f)
                arcToRelative(1.394f, 1.394f, 0.0f, false, true, 0.714f, -0.484f)
                arcTo(16.164f, 16.164f, 0.0f, false, true, 12.0f, 4.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 4.115f, 0.586f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 0.714f, 0.483f)
                arcToRelative(27.139f, 27.139f, 0.0f, false, true, 3.956f, 6.64f)
                arcTo(64.92f, 64.92f, 0.0f, false, false, 12.0f, 11.0f)
                close()
                moveTo(18.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 20.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 17.0f)
                close()
            }
        }
        .build()
        return _carAlt!!
    }

private var _carAlt: ImageVector? = null
