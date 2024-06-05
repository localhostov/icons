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

public val Icons.Bold.Locust: ImageVector
    get() {
        if (_locust != null) {
            return _locust!!
        }
        _locust = Builder(name = "Locust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.479f, 13.364f)
                curveToRelative(1.307f, -1.257f, 2.521f, -3.471f, 2.521f, -7.364f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 5.128f, -2.579f, 5.91f, -2.975f, 6.0f)
                horizontalLineToRelative(-1.57f)
                lineTo(10.09f, 0.0f)
                lineToRelative(-2.583f, 12.0f)
                horizontalLineToRelative(-1.856f)
                lineToRelative(1.78f, -8.073f)
                lineTo(5.077f, 0.0f)
                lineToRelative(-2.576f, 12.0f)
                lineTo(0.0f, 12.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.538f, 0.466f, 2.969f, 1.263f, 4.16f)
                lineToRelative(-1.263f, 5.575f)
                verticalLineToRelative(0.764f)
                horizontalLineToRelative(2.907f)
                lineToRelative(0.938f, -3.953f)
                curveToRelative(0.553f, 0.31f, 1.148f, 0.552f, 1.775f, 0.714f)
                lineToRelative(-0.697f, 3.239f)
                horizontalLineToRelative(3.067f)
                lineToRelative(0.633f, -3.0f)
                horizontalLineToRelative(9.188f)
                lineToRelative(1.553f, 3.0f)
                horizontalLineToRelative(3.379f)
                lineToRelative(-1.553f, -3.0f)
                horizontalLineToRelative(2.809f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.086f, -0.988f, -3.946f, -2.521f, -5.136f)
                close()
                moveTo(3.257f, 15.0f)
                horizontalLineToRelative(3.604f)
                lineToRelative(-0.608f, 2.824f)
                curveToRelative(-1.395f, -0.403f, -2.514f, -1.464f, -2.996f, -2.824f)
                close()
                moveTo(9.89f, 15.0f)
                horizontalLineToRelative(2.551f)
                lineToRelative(-1.552f, -3.0f)
                horizontalLineToRelative(-0.366f)
                lineToRelative(0.758f, -3.594f)
                lineToRelative(3.412f, 6.594f)
                horizontalLineToRelative(2.807f)
                curveToRelative(1.76f, 0.0f, 3.221f, 1.306f, 3.465f, 3.0f)
                horizontalLineToRelative(-11.708f)
                lineToRelative(0.633f, -3.0f)
                close()
            }
        }
        .build()
        return _locust!!
    }

private var _locust: ImageVector? = null
