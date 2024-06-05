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

public val Icons.Bold.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.5f, 19.0f)
                reflectiveCurveToRelative(-2.0f, 0.0f, -2.0f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(10.488f)
                lineToRelative(-2.013f, -12.074f)
                curveToRelative(-0.281f, -1.695f, -1.733f, -2.926f, -3.452f, -2.926f)
                horizontalLineTo(5.477f)
                curveToRelative(-1.719f, 0.0f, -3.171f, 1.23f, -3.452f, 2.925f)
                lineTo(0.012f, 15.0f)
                horizontalLineToRelative(10.488f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.5f, -2.0f, 1.5f, -2.0f, 1.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.983f, 3.417f)
                curveToRelative(0.04f, -0.242f, 0.248f, -0.417f, 0.493f, -0.417f)
                horizontalLineToRelative(13.047f)
                curveToRelative(0.245f, 0.0f, 0.453f, 0.175f, 0.493f, 0.418f)
                lineToRelative(1.431f, 8.582f)
                horizontalLineTo(3.553f)
                lineToRelative(1.431f, -8.583f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
