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

public val Icons.Filled.SterlingSign: ImageVector
    get() {
        if (_sterlingSign != null) {
            return _sterlingSign!!
        }
        _sterlingSign = Builder(name = "SterlingSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                curveTo(5.0f, 3.59f, 8.59f, 0.0f, 13.0f, 0.0f)
                reflectiveCurveToRelative(7.55f, 3.14f, 7.69f, 3.28f)
                lineToRelative(-1.38f, 1.45f)
                reflectiveCurveToRelative(-2.91f, -2.72f, -6.31f, -2.72f)
                reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.12f, -0.37f, 2.16f, -1.0f, 3.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _sterlingSign!!
    }

private var _sterlingSign: ImageVector? = null
