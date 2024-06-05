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
                moveTo(15.9f, 16.093f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 13.036f, 14.0f)
                horizontalLineTo(10.964f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 8.1f, 16.093f)
                lineToRelative(-0.672f, 2.119f)
                curveTo(7.205f, 19.31f, 6.256f, 21.814f, 8.0f, 22.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(22.0f)
                curveToRelative(1.744f, -0.188f, 0.8f, -2.688f, 0.568f, -3.789f)
                close()
                moveTo(10.964f, 16.0f)
                horizontalLineToRelative(2.072f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.953f, 0.7f)
                lineTo(14.4f, 18.0f)
                horizontalLineTo(9.6f)
                lineToRelative(0.414f, -1.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.964f, 16.0f)
                close()
                moveTo(24.0f, 9.762f)
                verticalLineToRelative(9.365f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, true, -3.748f, 4.841f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 22.994f)
                verticalLineTo(13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineTo(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(9.994f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.252f, 0.974f)
                arcTo(5.009f, 5.009f, 0.0f, false, true, 0.0f, 19.127f)
                verticalLineTo(9.762f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 2.2f, 5.618f)
                lineTo(9.2f, 0.894f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.594f, 0.0f)
                lineToRelative(7.0f, 4.724f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 24.0f, 9.762f)
                close()
            }
        }
        .build()
        return _garageCar!!
    }

private var _garageCar: ImageVector? = null
