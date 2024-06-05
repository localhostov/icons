package me.localx.icons.rounded.filled

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

public val Icons.Filled.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.327f, 12.0f)
                curveToRelative(0.029f, -0.093f, 0.042f, -0.19f, 0.075f, -0.282f)
                lineTo(3.1f, 4.291f)
                arcTo(5.012f, 5.012f, 0.0f, false, true, 7.8f, 1.0f)
                horizontalLineToRelative(8.4f)
                arcToRelative(5.011f, 5.011f, 0.0f, false, true, 4.7f, 3.292f)
                lineToRelative(2.7f, 7.426f)
                curveToRelative(0.033f, 0.092f, 0.046f, 0.189f, 0.075f, 0.282f)
                close()
                moveTo(20.0f, 14.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 3.0f, 4.576f)
                verticalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineTo(20.576f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 24.0f, 16.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
