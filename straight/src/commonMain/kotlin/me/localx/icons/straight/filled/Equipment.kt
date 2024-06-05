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

public val Icons.Filled.Equipment: ImageVector
    get() {
        if (_equipment != null) {
            return _equipment!!
        }
        _equipment = Builder(name = "Equipment", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.9f)
                arcToRelative(6.014f, 6.014f, 0.0f, false, false, -4.823f, -5.883f)
                lineToRelative(-1.736f, -0.348f)
                lineToRelative(-2.079f, 3.538f)
                lineToRelative(-1.724f, -1.013f)
                lineToRelative(1.727f, -2.94f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.667f, -0.244f)
                lineToRelative(-3.024f, 1.837f)
                lineToRelative(-1.039f, -1.709f)
                lineToRelative(3.05f, -1.854f)
                lineToRelative(-0.048f, -0.484f)
                horizontalLineToRelative(-3.637f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.438f)
                lineToRelative(-0.138f, -1.424f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.681f, -2.49f)
                lineToRelative(-7.619f, 2.158f)
                verticalLineToRelative(15.756f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
                moveTo(14.0f, 22.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _equipment!!
    }

private var _equipment: ImageVector? = null
