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

public val Icons.Filled.FamilyDress: ImageVector
    get() {
        if (_familyDress != null) {
            return _familyDress!!
        }
        _familyDress = Builder(name = "FamilyDress", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(18.0f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(23.133f, 20.0f)
                lineToRelative(-1.422f, -11.372f)
                curveToRelative(-0.187f, -1.498f, -1.467f, -2.628f, -2.977f, -2.628f)
                horizontalLineToRelative(-1.469f)
                curveToRelative(-0.337f, 0.0f, -0.663f, 0.057f, -0.968f, 0.161f)
                curveToRelative(0.0f, 0.0f, -0.017f, 0.004f, -0.021f, 0.005f)
                curveToRelative(0.132f, 0.424f, 0.224f, 0.866f, 0.224f, 1.334f)
                curveToRelative(0.0f, 0.874f, -0.257f, 1.681f, -0.69f, 2.368f)
                curveToRelative(1.321f, 0.901f, 2.19f, 2.416f, 2.19f, 4.132f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.133f)
                close()
                moveTo(8.5f, 2.5f)
                curveTo(8.5f, 1.119f, 7.381f, 0.0f, 6.0f, 0.0f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                close()
                moveTo(3.0f, 20.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                reflectiveCurveToRelative(1.0f, 0.0f, 1.0f, 0.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.716f, 0.87f, -3.231f, 2.19f, -4.132f)
                curveToRelative(-0.433f, -0.687f, -0.69f, -1.495f, -0.69f, -2.368f)
                curveToRelative(0.0f, -0.468f, 0.092f, -0.91f, 0.224f, -1.334f)
                curveToRelative(-0.004f, 0.0f, -0.021f, -0.005f, -0.021f, -0.005f)
                curveToRelative(-0.305f, -0.104f, -0.631f, -0.161f, -0.968f, -0.161f)
                horizontalLineToRelative(-1.469f)
                curveToRelative(-1.51f, 0.0f, -2.79f, 1.13f, -2.977f, 2.628f)
                lineToRelative(-1.422f, 11.372f)
                horizontalLineToRelative(2.133f)
                close()
            }
        }
        .build()
        return _familyDress!!
    }

private var _familyDress: ImageVector? = null
