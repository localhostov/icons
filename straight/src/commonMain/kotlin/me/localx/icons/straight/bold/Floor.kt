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

public val Icons.Bold.Floor: ImageVector
    get() {
        if (_floor != null) {
            return _floor!!
        }
        _floor = Builder(name = "Floor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.442f, 13.546f)
                lineToRelative(2.579f, 1.844f)
                lineToRelative(-12.021f, 8.594f)
                lineTo(-0.021f, 15.39f)
                lineToRelative(2.579f, -1.844f)
                lineToRelative(9.442f, 6.75f)
                lineToRelative(9.442f, -6.75f)
                close()
                moveTo(12.0f, 17.343f)
                lineTo(-0.021f, 8.75f)
                lineTo(12.0f, 0.156f)
                lineToRelative(12.021f, 8.594f)
                lineToRelative(-12.021f, 8.594f)
                close()
                moveTo(14.685f, 8.011f)
                lineToRelative(2.614f, 1.857f)
                lineToRelative(1.565f, -1.119f)
                lineToRelative(-2.601f, -1.859f)
                lineToRelative(-1.578f, 1.121f)
                close()
                moveTo(8.378f, 6.432f)
                lineToRelative(2.539f, 1.804f)
                lineToRelative(3.625f, -2.576f)
                lineToRelative(-2.542f, -1.817f)
                lineToRelative(-3.622f, 2.589f)
                close()
                moveTo(9.19f, 9.463f)
                lineToRelative(-2.533f, -1.8f)
                lineToRelative(-1.52f, 1.086f)
                lineToRelative(2.521f, 1.802f)
                lineToRelative(1.532f, -1.089f)
                close()
                moveTo(9.379f, 11.782f)
                lineToRelative(2.622f, 1.874f)
                lineToRelative(3.577f, -2.557f)
                lineToRelative(-2.619f, -1.86f)
                lineToRelative(-3.579f, 2.543f)
                close()
            }
        }
        .build()
        return _floor!!
    }

private var _floor: ImageVector? = null
