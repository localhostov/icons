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

public val Icons.Filled.Vihara: ImageVector
    get() {
        if (_vihara != null) {
            return _vihara!!
        }
        _vihara = Builder(name = "Vihara", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 14.0f)
                lineTo(4.0f, 14.0f)
                curveToRelative(-0.298f, 1.353f, -1.799f, 4.0f, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-2.208f, 0.0f, -3.665f, -2.547f, -4.0f, -4.0f)
                close()
                moveTo(7.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 22.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(20.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.169f, 2.786f)
                lineToRelative(-0.169f, -0.768f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                reflectiveCurveToRelative(0.0f, -2.0f, 0.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.016f)
                lineToRelative(-0.169f, 0.77f)
                curveToRelative(-0.011f, 0.052f, -1.221f, 3.214f, -3.831f, 3.214f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-2.61f, 0.0f, -3.819f, -3.162f, -3.831f, -3.214f)
                close()
            }
        }
        .build()
        return _vihara!!
    }

private var _vihara: ImageVector? = null
