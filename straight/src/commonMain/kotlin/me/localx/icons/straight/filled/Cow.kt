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

public val Icons.Filled.Cow: ImageVector
    get() {
        if (_cow != null) {
            return _cow!!
        }
        _cow = Builder(name = "Cow", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.974f, 3.0f)
                arcTo(4.948f, 4.948f, 0.0f, false, false, 20.0f, 0.0f)
                horizontalLineTo(18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                horizontalLineTo(4.0f)
                arcTo(4.948f, 4.948f, 0.0f, false, false, 5.026f, 3.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(4.0f)
                arcTo(6.454f, 6.454f, 0.0f, false, false, 1.691f, 7.9f)
                arcTo(50.655f, 50.655f, 0.0f, false, true, 6.146f, 4.1f)
                arcToRelative(4.954f, 4.954f, 0.0f, false, false, 2.262f, 0.845f)
                reflectiveCurveTo(5.577f, 7.077f, 4.538f, 8.0f)
                horizontalLineTo(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                arcToRelative(2.974f, 2.974f, 0.0f, false, false, -0.194f, -1.032f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.032f, 10.2f)
                horizontalLineToRelative(0.0f)
                arcTo(2.979f, 2.979f, 0.0f, false, false, 6.0f, 10.0f)
                horizontalLineTo(3.435f)
                lineToRelative(2.586f, 11.2f)
                arcTo(2.994f, 2.994f, 0.0f, false, false, 9.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, false, 2.979f, -2.8f)
                lineTo(20.565f, 10.0f)
                horizontalLineTo(18.0f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, false, -1.032f, 0.194f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.2f, 11.968f)
                horizontalLineToRelative(0.0f)
                arcTo(2.974f, 2.974f, 0.0f, false, false, 15.0f, 13.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(1.462f)
                curveToRelative(-1.039f, -0.923f, -3.87f, -3.06f, -3.87f, -3.06f)
                arcTo(4.954f, 4.954f, 0.0f, false, false, 17.854f, 4.1f)
                arcTo(50.655f, 50.655f, 0.0f, false, true, 22.309f, 7.9f)
                arcTo(6.454f, 6.454f, 0.0f, false, false, 24.0f, 4.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(15.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _cow!!
    }

private var _cow: ImageVector? = null
