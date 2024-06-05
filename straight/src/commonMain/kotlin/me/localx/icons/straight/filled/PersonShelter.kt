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

public val Icons.Filled.PersonShelter: ImageVector
    get() {
        if (_personShelter != null) {
            return _personShelter!!
        }
        _personShelter = Builder(name = "PersonShelter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 19.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 10.008f)
                verticalLineToRelative(13.992f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-13.992f)
                curveToRelative(0.0f, -0.923f, 0.425f, -1.794f, 1.151f, -2.363f)
                lineTo(10.151f, 0.602f)
                curveToRelative(1.086f, -0.85f, 2.611f, -0.85f, 3.697f, 0.0f)
                lineToRelative(9.0f, 7.043f)
                curveToRelative(0.727f, 0.569f, 1.151f, 1.44f, 1.151f, 2.363f)
                close()
                moveTo(14.5f, 5.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                close()
                moveTo(14.5f, 12.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _personShelter!!
    }

private var _personShelter: ImageVector? = null
