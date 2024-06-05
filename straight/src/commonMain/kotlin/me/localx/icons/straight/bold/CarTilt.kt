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

public val Icons.Bold.CarTilt: ImageVector
    get() {
        if (_carTilt != null) {
            return _carTilt!!
        }
        _carTilt = Builder(name = "CarTilt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.459f, 21.0f)
                lineToRelative(4.084f, -2.688f)
                lineToRelative(-1.1f, -1.671f)
                lineToRelative(4.845f, -3.129f)
                lineToRelative(1.1f, 1.671f)
                lineToRelative(4.177f, -2.749f)
                lineToRelative(-1.1f, -1.671f)
                lineToRelative(1.67f, -1.1f)
                lineTo(21.084f, 6.545f)
                arcToRelative(12.583f, 12.583f, 0.0f, false, false, -4.027f, -3.856f)
                lineTo(13.385f, 0.493f)
                arcToRelative(3.518f, 3.518f, 0.0f, false, false, -3.72f, 0.08f)
                lineTo(3.575f, 4.521f)
                arcTo(3.519f, 3.519f, 0.0f, false, false, 2.03f, 7.906f)
                lineTo(2.6f, 12.148f)
                arcToRelative(12.567f, 12.567f, 0.0f, false, false, 1.949f, 5.223f)
                lineTo(6.6f, 20.489f)
                lineToRelative(1.67f, -1.1f)
                lineTo(9.327f, 21.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 21.0f)
                close()
                moveTo(18.144f, 7.535f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.522f, 1.522f, 0.0f, false, true, -0.435f, 2.109f)
                horizontalLineToRelative(0.0f)
                arcTo(1.523f, 1.523f, 0.0f, false, true, 15.6f, 9.209f)
                horizontalLineToRelative(0.0f)
                arcTo(1.522f, 1.522f, 0.0f, false, true, 16.035f, 7.1f)
                horizontalLineToRelative(0.0f)
                arcTo(1.522f, 1.522f, 0.0f, false, true, 18.144f, 7.535f)
                close()
                moveTo(5.0f, 7.511f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.22f, -0.484f)
                lineToRelative(6.09f, -3.948f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.532f, -0.011f)
                lineToRelative(2.587f, 1.547f)
                lineTo(5.4f, 10.5f)
                close()
                moveTo(6.612f, 15.062f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.522f, 1.522f, 0.0f, false, true, 0.435f, -2.108f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.522f, 1.522f, 0.0f, false, true, 2.109f, 0.434f)
                horizontalLineToRelative(0.0f)
                arcTo(1.523f, 1.523f, 0.0f, false, true, 8.725f, 15.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.523f, 1.523f, 0.0f, false, true, 6.616f, 15.062f)
                close()
            }
        }
        .build()
        return _carTilt!!
    }

private var _carTilt: ImageVector? = null
