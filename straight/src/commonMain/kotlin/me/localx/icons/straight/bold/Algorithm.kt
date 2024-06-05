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

public val Icons.Bold.Algorithm: ImageVector
    get() {
        if (_algorithm != null) {
            return _algorithm!!
        }
        _algorithm = Builder(name = "Algorithm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 8.5f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.343f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(19.0f, 15.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.235f, 18.0f)
                curveToRelative(-0.074f, -0.083f, -0.153f, -0.161f, -0.235f, -0.235f)
                lineTo(5.0f, 5.235f)
                curveToRelative(0.083f, -0.074f, 0.161f, -0.153f, 0.235f, -0.235f)
                horizontalLineToRelative(13.529f)
                curveToRelative(0.549f, 0.614f, 1.347f, 1.0f, 2.235f, 1.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.306f, 0.0f, -2.417f, 0.835f, -2.829f, 2.0f)
                lineTo(5.829f, 2.0f)
                curveToRelative(-0.412f, -1.165f, -1.523f, -2.0f, -2.829f, -2.0f)
                curveTo(1.343f, 0.0f, 0.0f, 1.343f, 0.0f, 3.0f)
                curveToRelative(0.0f, 1.306f, 0.835f, 2.417f, 2.0f, 2.829f)
                verticalLineToRelative(11.343f)
                curveToRelative(-1.165f, 0.412f, -2.0f, 1.523f, -2.0f, 2.829f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                curveToRelative(1.306f, 0.0f, 2.417f, -0.835f, 2.829f, -2.0f)
                horizontalLineToRelative(13.171f)
                verticalLineToRelative(3.0f)
                lineToRelative(4.207f, -3.793f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(-4.207f, -3.793f)
                close()
            }
        }
        .build()
        return _algorithm!!
    }

private var _algorithm: ImageVector? = null
