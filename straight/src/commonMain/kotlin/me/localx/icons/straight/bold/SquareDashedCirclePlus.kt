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

public val Icons.Bold.SquareDashedCirclePlus: ImageVector
    get() {
        if (_squareDashedCirclePlus != null) {
            return _squareDashedCirclePlus!!
        }
        _squareDashedCirclePlus = Builder(name = "SquareDashedCirclePlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.587f)
                curveToRelative(-0.927f, -0.376f, -1.938f, -0.587f, -3.0f, -0.587f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.587f)
                curveToRelative(-0.376f, -0.927f, -0.587f, -1.938f, -0.587f, -3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(0.0f, 3.5f)
                verticalLineToRelative(2.5f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                lineTo(6.0f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                close()
                moveTo(3.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(3.0f, 15.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(15.0f, 3.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                close()
                moveTo(13.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(8.0f, 3.0f)
                horizontalLineToRelative(5.0f)
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
            }
        }
        .build()
        return _squareDashedCirclePlus!!
    }

private var _squareDashedCirclePlus: ImageVector? = null
