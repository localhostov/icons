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

public val Icons.Bold.FireHydrant: ImageVector
    get() {
        if (_fireHydrant != null) {
            return _fireHydrant!!
        }
        _fireHydrant = Builder(name = "FireHydrant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 13.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(18.0f, 15.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -2.791f, 1.915f, -5.143f, 4.5f, -5.81f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.69f)
                curveToRelative(2.585f, 0.668f, 4.5f, 3.019f, 4.5f, 5.81f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(9.042f, 7.0f)
                horizontalLineToRelative(5.915f)
                curveToRelative(-0.239f, -1.417f, -1.474f, -2.5f, -2.958f, -2.5f)
                reflectiveCurveToRelative(-2.719f, 1.083f, -2.958f, 2.5f)
                close()
                moveTo(15.0f, 21.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _fireHydrant!!
    }

private var _fireHydrant: ImageVector? = null
