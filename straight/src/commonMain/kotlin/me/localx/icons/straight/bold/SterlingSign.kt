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

public val Icons.Bold.SterlingSign: ImageVector
    get() {
        if (_sterlingSign != null) {
            return _sterlingSign!!
        }
        _sterlingSign = Builder(name = "SterlingSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(1.68f, 0.0f, 3.0f, -1.32f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.82f)
                curveTo(5.0f, 3.67f, 8.67f, 0.0f, 13.19f, 0.0f)
                curveToRelative(4.24f, 0.0f, 7.58f, 3.15f, 7.72f, 3.28f)
                lineToRelative(-2.07f, 2.17f)
                reflectiveCurveToRelative(-2.62f, -2.45f, -5.64f, -2.45f)
                curveToRelative(-2.86f, 0.0f, -5.18f, 2.32f, -5.18f, 5.18f)
                verticalLineToRelative(2.82f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.09f, -0.29f, 2.12f, -0.81f, 3.0f)
                horizontalLineToRelative(14.8f)
                close()
            }
        }
        .build()
        return _sterlingSign!!
    }

private var _sterlingSign: ImageVector? = null
