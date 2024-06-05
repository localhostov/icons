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

public val Icons.Bold.Treadmill: ImageVector
    get() {
        if (_treadmill != null) {
            return _treadmill!!
        }
        _treadmill = Builder(name = "Treadmill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.092f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(4.435f, 9.0f)
                horizontalLineToRelative(1.342f)
                lineToRelative(-0.647f, 1.581f)
                curveToRelative(-0.523f, 1.094f, -0.176f, 2.442f, 0.861f, 3.351f)
                lineToRelative(3.102f, 2.744f)
                verticalLineToRelative(3.324f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.676f)
                lineToRelative(-3.22f, -2.849f)
                lineToRelative(0.931f, -2.27f)
                lineToRelative(1.495f, 1.794f)
                horizontalLineToRelative(3.703f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.297f)
                lineToRelative(-1.151f, -1.381f)
                curveToRelative(-0.857f, -1.029f, -2.118f, -1.619f, -3.457f, -1.619f)
                lineTo(2.642f, 5.999f)
                lineToRelative(-2.08f, 3.871f)
                lineToRelative(2.643f, 1.42f)
                lineToRelative(1.231f, -2.291f)
                close()
                moveTo(3.517f, 14.0f)
                lineTo(1.0f, 14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.092f)
                lineToRelative(0.093f, -0.225f)
                lineToRelative(-1.52f, -1.344f)
                curveToRelative(-0.48f, -0.422f, -0.857f, -0.91f, -1.147f, -1.431f)
                close()
                moveTo(16.999f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.564f)
                lineToRelative(-3.131f, 9.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(19.566f)
                lineToRelative(4.434f, -12.746f)
                verticalLineToRelative(-2.254f)
                horizontalLineToRelative(-7.0f)
                close()
            }
        }
        .build()
        return _treadmill!!
    }

private var _treadmill: ImageVector? = null
