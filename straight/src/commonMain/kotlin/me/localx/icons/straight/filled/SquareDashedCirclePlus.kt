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

public val Icons.Filled.SquareDashedCirclePlus: ImageVector
    get() {
        if (_squareDashedCirclePlus != null) {
            return _squareDashedCirclePlus!!
        }
        _squareDashedCirclePlus = Builder(name = "SquareDashedCirclePlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                lineTo(0.0f, 5.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(5.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(2.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 13.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(5.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(5.0f)
                lineTo(5.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 3.0f)
                close()
                moveTo(13.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(13.0f, 0.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(22.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.262f)
                curveToRelative(-0.165f, -0.64f, -0.262f, -1.308f, -0.262f, -2.0f)
                close()
                moveTo(20.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.692f, 0.0f, 1.36f, 0.097f, 2.0f, 0.262f)
                verticalLineToRelative(-3.262f)
                close()
            }
        }
        .build()
        return _squareDashedCirclePlus!!
    }

private var _squareDashedCirclePlus: ImageVector? = null
