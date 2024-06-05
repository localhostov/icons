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

public val Icons.Filled.Treadmill: ImageVector
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
                lineToRelative(-2.709f, -1.596f)
                lineToRelative(2.154f, -5.198f)
                lineToRelative(2.106f, 2.366f)
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
                curveToRelative(-0.553f, 1.349f, -0.061f, 2.894f, 1.199f, 3.69f)
                lineToRelative(3.577f, 2.107f)
                verticalLineToRelative(4.429f)
                lineTo(0.0f, 21.999f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(19.711f)
                lineToRelative(4.289f, -12.331f)
                verticalLineToRelative(-1.669f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(5.628f, 17.905f)
                lineToRelative(-1.22f, -0.719f)
                curveToRelative(-0.176f, -0.111f, -0.33f, -0.243f, -0.488f, -0.371f)
                lineToRelative(-0.079f, 0.184f)
                lineTo(0.0f, 16.999f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.159f)
                lineToRelative(0.469f, -1.095f)
                close()
            }
        }
        .build()
        return _treadmill!!
    }

private var _treadmill: ImageVector? = null
