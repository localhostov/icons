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

public val Icons.Filled.ImproveUser: ImageVector
    get() {
        if (_improveUser != null) {
            return _improveUser!!
        }
        _improveUser = Builder(name = "ImproveUser", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.325f, 14.549f)
                lineToRelative(2.659f, 2.659f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.57f, -1.57f)
                verticalLineToRelative(6.948f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.948f)
                lineToRelative(-1.57f, 1.57f)
                lineTo(0.016f, 17.208f)
                lineToRelative(2.659f, -2.659f)
                curveToRelative(0.707f, -0.707f, 1.943f, -0.707f, 2.65f, 0.0f)
                close()
                moveTo(19.487f, 5.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(9.675f, 9.549f)
                lineToRelative(-2.659f, 2.659f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.57f, -1.57f)
                verticalLineToRelative(11.948f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-11.948f)
                lineToRelative(1.57f, 1.57f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.659f, -2.659f)
                curveToRelative(-0.707f, -0.707f, -1.943f, -0.707f, -2.65f, 0.0f)
                close()
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-4.561f)
                lineTo(11.237f, 0.324f)
                lineToRelative(-1.475f, 1.352f)
                lineToRelative(6.237f, 6.71f)
                verticalLineToRelative(15.614f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _improveUser!!
    }

private var _improveUser: ImageVector? = null
