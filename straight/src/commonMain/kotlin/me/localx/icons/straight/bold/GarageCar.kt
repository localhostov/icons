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

public val Icons.Bold.GarageCar: ImageVector
    get() {
        if (_garageCar != null) {
            return _garageCar!!
        }
        _garageCar = Builder(name = "GarageCar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(10.0f, 24.0f)
                close()
                moveTo(10.231f, 16.0f)
                lineTo(9.5f, 19.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-0.731f, -3.0f)
                close()
                moveTo(24.0f, 10.132f)
                lineTo(24.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 20.347f)
                arcToRelative(5.02f, 5.02f, 0.0f, false, false, -0.234f, -1.513f)
                lineTo(15.675f, 15.4f)
                arcTo(1.993f, 1.993f, 0.0f, false, false, 13.769f, 14.0f)
                lineTo(10.231f, 14.0f)
                arcTo(1.993f, 1.993f, 0.0f, false, false, 8.325f, 15.4f)
                lineToRelative(-1.091f, 3.44f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 7.0f, 20.347f)
                lineTo(7.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 10.132f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 1.307f, 7.447f)
                lineTo(9.9f, 0.724f)
                arcToRelative(3.409f, 3.409f, 0.0f, false, true, 4.2f, 0.0f)
                lineToRelative(8.592f, 6.723f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 24.0f, 10.132f)
                close()
                moveTo(21.0f, 10.132f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, false, -0.158f, -0.323f)
                lineToRelative(-8.59f, -6.722f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, false, -0.506f, 0.0f)
                lineTo(3.157f, 9.81f)
                arcTo(0.414f, 0.414f, 0.0f, false, false, 3.0f, 10.132f)
                lineTo(3.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                lineTo(5.0f, 12.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.5f, 10.0f)
                horizontalLineToRelative(9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.0f, 12.5f)
                lineTo(19.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _garageCar!!
    }

private var _garageCar: ImageVector? = null
