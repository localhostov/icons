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

public val Icons.Filled.SpainMap: ImageVector
    get() {
        if (_spainMap != null) {
            return _spainMap!!
        }
        _spainMap = Builder(name = "SpainMap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.458f, 4.291f)
                lineToRelative(3.642f, -0.167f)
                lineToRelative(1.899f, 0.875f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-2.5f, 1.5f)
                lineToRelative(-2.4f, 0.442f)
                lineToRelative(-2.033f, 3.403f)
                lineToRelative(1.384f, 1.652f)
                lineToRelative(-1.951f, 3.002f)
                lineToRelative(-1.5f, 0.5f)
                lineToRelative(-1.5f, 1.5f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-2.5f, 2.185f)
                lineToRelative(-3.5f, -3.5f)
                lineToRelative(1.0f, -3.0f)
                lineToRelative(-1.5f, -3.0f)
                lineToRelative(1.0f, -0.5f)
                verticalLineToRelative(-2.0f)
                lineToRelative(1.816f, -1.952f)
                lineToRelative(-0.816f, -1.048f)
                lineToRelative(-2.5f, 0.5f)
                lineTo(0.5f, 6.685f)
                lineTo(0.0f, 3.678f)
                lineToRelative(2.5f, -0.993f)
                lineToRelative(1.0f, -1.5f)
                lineToRelative(1.5f, 1.0f)
                lineToRelative(2.0f, 0.5f)
                lineToRelative(2.5f, 0.5f)
                reflectiveCurveToRelative(0.787f, -0.621f, 1.0f, -1.0f)
                curveToRelative(1.268f, 0.245f, 4.438f, 1.096f, 4.438f, 1.096f)
                lineToRelative(0.52f, 1.01f)
                close()
                moveTo(23.916f, 17.548f)
                lineToRelative(-3.0f, 2.5f)
                lineToRelative(-2.049f, -2.102f)
                lineToRelative(2.132f, -2.761f)
                lineToRelative(2.917f, 2.363f)
                close()
                moveTo(18.934f, 21.514f)
                lineToRelative(-0.608f, -1.343f)
                lineToRelative(-2.318f, 1.738f)
                lineToRelative(1.159f, 1.159f)
                lineToRelative(1.766f, -1.554f)
                close()
                moveTo(23.47f, 14.009f)
                lineToRelative(0.535f, -0.974f)
                lineToRelative(-1.606f, -1.703f)
                lineToRelative(-1.071f, 1.606f)
                lineToRelative(2.142f, 1.071f)
                close()
            }
        }
        .build()
        return _spainMap!!
    }

private var _spainMap: ImageVector? = null
