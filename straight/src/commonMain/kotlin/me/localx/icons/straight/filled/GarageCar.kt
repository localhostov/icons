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

public val Icons.Filled.GarageCar: ImageVector
    get() {
        if (_garageCar != null) {
            return _garageCar!!
        }
        _garageCar = Builder(name = "GarageCar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.043f)
                lineTo(24.0f, 24.0f)
                lineTo(19.0f, 24.0f)
                lineTo(19.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(6.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(5.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 10.043f)
                arcTo(2.985f, 2.985f, 0.0f, false, true, 1.151f, 7.68f)
                lineToRelative(9.0f, -7.042f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, true, 3.7f, 0.0f)
                lineToRelative(9.0f, 7.043f)
                arcTo(2.981f, 2.981f, 0.0f, false, true, 24.0f, 10.043f)
                close()
                moveTo(16.766f, 18.834f)
                arcTo(5.02f, 5.02f, 0.0f, false, true, 17.0f, 20.347f)
                lineTo(17.0f, 22.0f)
                lineTo(16.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(14.0f, 24.0f)
                lineTo(14.0f, 22.0f)
                lineTo(10.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                lineTo(7.0f, 20.347f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, true, 0.234f, -1.512f)
                lineTo(8.325f, 15.4f)
                arcTo(1.993f, 1.993f, 0.0f, false, true, 10.231f, 14.0f)
                horizontalLineToRelative(3.538f)
                arcTo(1.993f, 1.993f, 0.0f, false, true, 15.675f, 15.4f)
                close()
                moveTo(10.231f, 16.0f)
                lineTo(9.6f, 18.0f)
                lineTo(14.4f, 18.0f)
                lineToRelative(-0.634f, -2.0f)
                close()
            }
        }
        .build()
        return _garageCar!!
    }

private var _garageCar: ImageVector? = null
