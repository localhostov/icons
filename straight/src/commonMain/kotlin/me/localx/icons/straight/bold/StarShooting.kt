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

public val Icons.Bold.StarShooting: ImageVector
    get() {
        if (_starShooting != null) {
            return _starShooting!!
        }
        _starShooting = Builder(name = "StarShooting", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.478f, 15.0f)
                horizontalLineToRelative(4.522f)
                verticalLineToRelative(1.083f)
                lineToRelative(-3.309f, 2.257f)
                lineToRelative(1.377f, 4.314f)
                lineToRelative(-0.886f, 0.619f)
                lineToRelative(-3.664f, -2.533f)
                lineToRelative(-3.609f, 2.533f)
                lineToRelative(-0.853f, -0.642f)
                lineToRelative(1.279f, -4.357f)
                lineToRelative(-3.336f, -2.184f)
                verticalLineToRelative(-1.09f)
                horizontalLineToRelative(4.55f)
                lineToRelative(1.392f, -4.727f)
                horizontalLineToRelative(1.147f)
                lineToRelative(1.39f, 4.727f)
                close()
                moveTo(21.939f, -0.061f)
                lineToRelative(-10.0f, 10.0f)
                lineToRelative(2.121f, 2.121f)
                lineTo(24.061f, 2.061f)
                lineTo(21.939f, -0.061f)
                close()
                moveTo(14.06f, 4.06f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-5.0f, 5.0f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(5.0f, -5.0f)
                close()
                moveTo(14.939f, 14.939f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(5.0f, -5.0f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _starShooting!!
    }

private var _starShooting: ImageVector? = null
