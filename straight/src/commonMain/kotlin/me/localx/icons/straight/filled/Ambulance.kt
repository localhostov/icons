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

public val Icons.Filled.Ambulance: ImageVector
    get() {
        if (_ambulance != null) {
            return _ambulance!!
        }
        _ambulance = Builder(name = "Ambulance", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.761f, 11.0f)
                horizontalLineToRelative(-6.761f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.05f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, true, 3.656f, 2.375f)
                close()
                moveTo(24.0f, 15.062f)
                verticalLineToRelative(3.938f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                lineToRelative(0.757f, -3.03f)
                arcToRelative(1.281f, 1.281f, 0.0f, false, true, 2.486f, 0.0f)
                lineToRelative(0.757f, 3.03f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(9.627f)
                arcToRelative(5.952f, 5.952f, 0.0f, false, true, 0.373f, 2.062f)
                close()
                moveTo(10.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.058f, 21.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, -0.058f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, -0.058f, -0.5f)
                close()
                moveTo(17.058f, 21.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, -0.058f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                arcToRelative(2.424f, 2.424f, 0.0f, false, false, -0.058f, -0.5f)
                close()
            }
        }
        .build()
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
