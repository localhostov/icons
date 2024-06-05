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

public val Icons.Filled.HandBackFist: ImageVector
    get() {
        if (_handBackFist != null) {
            return _handBackFist!!
        }
        _handBackFist = Builder(name = "HandBackFist", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.997f, 0.0f)
                curveToRelative(-1.103f, 0.002f, -1.997f, 0.896f, -1.997f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.084f)
                lineToRelative(-3.121f, 3.552f)
                curveToRelative(-0.567f, 0.567f, -0.879f, 1.32f, -0.879f, 2.122f)
                reflectiveCurveToRelative(0.312f, 1.555f, 0.853f, 2.095f)
                lineToRelative(5.147f, 5.148f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-6.808f)
                lineToRelative(1.428f, -3.569f)
                curveToRelative(0.378f, -0.945f, 0.572f, -1.954f, 0.572f, -2.971f)
                verticalLineTo(2.808f)
                reflectiveCurveTo(9.753f, -0.001f, 8.997f, 0.0f)
                close()
            }
        }
        .build()
        return _handBackFist!!
    }

private var _handBackFist: ImageVector? = null
