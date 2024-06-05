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

public val Icons.Filled.HouseLeave: ImageVector
    get() {
        if (_houseLeave != null) {
            return _houseLeave!!
        }
        _houseLeave = Builder(name = "HouseLeave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.758f, 5.0f)
                curveToRelative(-0.076f, 0.044f, -5.758f, 3.922f, -5.758f, 3.922f)
                verticalLineToRelative(8.078f)
                lineTo(0.0f, 17.0f)
                lineTo(0.0f, 7.463f)
                curveToRelative(0.0f, -0.974f, 0.44f, -1.876f, 1.207f, -2.475f)
                lineTo(7.043f, 0.42f)
                curveToRelative(0.803f, -0.628f, 1.947f, -0.546f, 2.913f, 0.21f)
                lineToRelative(3.072f, 2.375f)
                curveToRelative(0.082f, 0.732f, 0.339f, 1.411f, 0.729f, 1.994f)
                close()
                moveTo(6.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.5f, 0.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveTo(18.881f, 0.0f, 17.5f, 0.0f)
                close()
                moveTo(10.0f, 9.972f)
                verticalLineToRelative(5.028f)
                reflectiveCurveToRelative(2.0f, 0.0f, 2.0f, 0.0f)
                verticalLineToRelative(-3.972f)
                reflectiveCurveToRelative(2.0f, -1.38f, 2.0f, -1.38f)
                verticalLineToRelative(3.759f)
                curveToRelative(0.0f, 0.978f, 0.479f, 1.897f, 1.28f, 2.458f)
                lineToRelative(4.743f, 3.168f)
                lineToRelative(-0.023f, 4.962f)
                lineToRelative(2.0f, 0.01f)
                lineToRelative(0.028f, -6.038f)
                lineToRelative(-3.028f, -2.022f)
                lineToRelative(0.017f, -3.812f)
                lineToRelative(3.796f, 2.475f)
                lineToRelative(1.092f, -1.676f)
                lineToRelative(-3.166f, -2.063f)
                lineToRelative(-1.239f, -2.868f)
                curveToRelative(-0.367f, -1.178f, -1.596f, -2.0f, -2.5f, -2.0f)
                curveToRelative(-1.5f, 0.0f, -2.452f, 0.865f, -2.452f, 0.865f)
                lineToRelative(-4.548f, 3.107f)
                close()
                moveTo(14.661f, 17.644f)
                lineToRelative(-2.559f, 6.356f)
                horizontalLineToRelative(2.162f)
                reflectiveCurveToRelative(2.074f, -5.174f, 2.074f, -5.174f)
                curveToRelative(0.0f, 0.0f, -1.624f, -1.144f, -1.677f, -1.182f)
                close()
            }
        }
        .build()
        return _houseLeave!!
    }

private var _houseLeave: ImageVector? = null
