package me.localx.icons.straight.outline

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

public val Icons.Outline.GarageCar: ImageVector
    get() {
        if (_garageCar != null) {
            return _garageCar!!
        }
        _garageCar = Builder(name = "GarageCar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.849f, 7.681f)
                lineToRelative(-9.0f, -7.043f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, false, -3.7f, 0.0f)
                lineToRelative(-9.0f, 7.042f)
                arcTo(2.985f, 2.985f, 0.0f, false, false, 0.0f, 10.043f)
                lineTo(0.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(17.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(18.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                lineTo(24.0f, 10.043f)
                arcTo(2.981f, 2.981f, 0.0f, false, false, 22.849f, 7.681f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(20.0f, 22.0f)
                lineTo(20.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(7.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 10.043f)
                arcToRelative(0.994f, 0.994f, 0.0f, false, true, 0.384f, -0.788f)
                lineToRelative(9.0f, -7.043f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.232f, 0.0f)
                lineToRelative(9.0f, 7.044f)
                arcToRelative(0.991f, 0.991f, 0.0f, false, true, 0.384f, 0.787f)
                close()
                moveTo(15.675f, 15.4f)
                arcTo(1.993f, 1.993f, 0.0f, false, false, 13.769f, 14.0f)
                lineTo(10.231f, 14.0f)
                arcTo(1.993f, 1.993f, 0.0f, false, false, 8.325f, 15.4f)
                lineToRelative(-1.091f, 3.44f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 7.0f, 20.347f)
                lineTo(7.0f, 22.0f)
                lineTo(8.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 20.347f)
                arcToRelative(5.02f, 5.02f, 0.0f, false, false, -0.234f, -1.513f)
                close()
                moveTo(13.769f, 16.0f)
                lineToRelative(0.634f, 2.0f)
                lineTo(9.6f, 18.0f)
                lineToRelative(0.634f, -2.0f)
                close()
            }
        }
        .build()
        return _garageCar!!
    }

private var _garageCar: ImageVector? = null
