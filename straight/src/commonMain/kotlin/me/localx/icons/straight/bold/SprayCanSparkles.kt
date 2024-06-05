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

public val Icons.Bold.SprayCanSparkles: ImageVector
    get() {
        if (_sprayCanSparkles != null) {
            return _sprayCanSparkles!!
        }
        _sprayCanSparkles = Builder(name = "SprayCanSparkles", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.5f, 7.0f)
                horizontalLineToRelative(-0.5f)
                lineTo(12.0f, 2.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(14.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(12.0f, 15.5f)
                curveToRelative(0.0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.567f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
                close()
                moveTo(19.0f, 2.5f)
                lineToRelative(-1.667f, 0.833f)
                lineToRelative(-0.833f, 1.667f)
                lineToRelative(-0.833f, -1.667f)
                lineToRelative(-1.667f, -0.833f)
                lineToRelative(1.667f, -0.833f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(0.833f, 1.667f)
                lineToRelative(1.667f, 0.833f)
                close()
                moveTo(19.0f, 5.5f)
                lineToRelative(1.667f, -0.833f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(0.833f, 1.667f)
                lineToRelative(1.667f, 0.833f)
                lineToRelative(-1.667f, 0.833f)
                lineToRelative(-0.833f, 1.667f)
                lineToRelative(-0.833f, -1.667f)
                lineToRelative(-1.667f, -0.833f)
                close()
                moveTo(21.333f, 10.667f)
                lineToRelative(1.667f, 0.833f)
                lineToRelative(-1.667f, 0.833f)
                lineToRelative(-0.833f, 1.667f)
                lineToRelative(-0.833f, -1.667f)
                lineToRelative(-1.667f, -0.833f)
                lineToRelative(1.667f, -0.833f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(0.833f, 1.667f)
                close()
            }
        }
        .build()
        return _sprayCanSparkles!!
    }

private var _sprayCanSparkles: ImageVector? = null
