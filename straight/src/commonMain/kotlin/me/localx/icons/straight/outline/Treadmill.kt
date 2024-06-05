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

public val Icons.Outline.Treadmill: ImageVector
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
                moveTo(19.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.768f)
                lineToRelative(-3.479f, 10.0f)
                horizontalLineToRelative(-7.289f)
                verticalLineToRelative(-5.571f)
                lineToRelative(-4.534f, -2.671f)
                curveToRelative(-0.411f, -0.261f, -0.576f, -0.775f, -0.391f, -1.225f)
                lineToRelative(1.859f, -4.533f)
                horizontalLineToRelative(0.16f)
                curveToRelative(0.563f, 0.0f, 1.089f, 0.242f, 1.486f, 0.674f)
                lineToRelative(-1.516f, 3.703f)
                lineToRelative(1.741f, 1.026f)
                lineToRelative(1.259f, -3.073f)
                lineToRelative(1.487f, 1.671f)
                horizontalLineToRelative(4.449f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.552f)
                lineToRelative(-2.281f, -2.562f)
                curveToRelative(-0.762f, -0.914f, -1.882f, -1.438f, -3.073f, -1.438f)
                lineTo(2.553f, 6.001f)
                lineTo(0.473f, 10.499f)
                lineToRelative(1.815f, 0.84f)
                lineToRelative(1.543f, -3.339f)
                horizontalLineToRelative(1.941f)
                lineToRelative(-1.548f, 3.773f)
                curveToRelative(-0.439f, 1.07f, -0.211f, 2.257f, 0.527f, 3.102f)
                lineToRelative(-0.911f, 2.124f)
                lineTo(0.0f, 16.999f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.159f)
                lineToRelative(1.263f, -2.948f)
                lineToRelative(2.578f, 1.519f)
                verticalLineToRelative(4.429f)
                lineTo(0.0f, 21.999f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(19.711f)
                lineToRelative(4.289f, -12.331f)
                verticalLineToRelative(-1.669f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _treadmill!!
    }

private var _treadmill: ImageVector? = null
