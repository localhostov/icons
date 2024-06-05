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

public val Icons.Outline.PersonShelter: ImageVector
    get() {
        if (_personShelter != null) {
            return _personShelter!!
        }
        _personShelter = Builder(name = "PersonShelter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.007f)
                verticalLineToRelative(13.993f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-13.993f)
                curveToRelative(0.0f, -0.31f, -0.14f, -0.597f, -0.384f, -0.788f)
                lineTo(12.616f, 2.177f)
                curveToRelative(-0.363f, -0.284f, -0.869f, -0.284f, -1.232f, 0.0f)
                lineTo(2.384f, 9.22f)
                curveToRelative(-0.244f, 0.191f, -0.384f, 0.478f, -0.384f, 0.788f)
                verticalLineToRelative(13.993f)
                lineTo(0.0f, 24.001f)
                verticalLineToRelative(-13.993f)
                curveToRelative(0.0f, -0.929f, 0.42f, -1.791f, 1.151f, -2.363f)
                lineTo(10.151f, 0.602f)
                curveToRelative(1.088f, -0.852f, 2.609f, -0.852f, 3.697f, 0.0f)
                lineToRelative(9.0f, 7.043f)
                curveToRelative(0.731f, 0.572f, 1.151f, 1.434f, 1.151f, 2.363f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(17.0f, 14.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(15.0f, 14.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _personShelter!!
    }

private var _personShelter: ImageVector? = null
