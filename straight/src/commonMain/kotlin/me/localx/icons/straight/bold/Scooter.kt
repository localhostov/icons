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

public val Icons.Bold.Scooter: ImageVector
    get() {
        if (_scooter != null) {
            return _scooter!!
        }
        _scooter = Builder(name = "Scooter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.695f, 0.246f, -1.326f, 0.642f, -1.835f)
                lineToRelative(-0.629f, -2.656f)
                lineToRelative(-2.792f, 3.49f)
                horizontalLineToRelative(-7.404f)
                curveToRelative(0.112f, 0.314f, 0.184f, 0.647f, 0.184f, 1.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.353f, 0.072f, -0.686f, 0.184f, -1.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(13.779f)
                lineToRelative(3.356f, -4.195f)
                lineToRelative(-2.231f, -9.42f)
                curveToRelative(-0.054f, -0.227f, -0.254f, -0.385f, -0.486f, -0.385f)
                horizontalLineToRelative(-3.418f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.418f)
                curveToRelative(1.629f, 0.0f, 3.03f, 1.107f, 3.406f, 2.693f)
                lineToRelative(3.636f, 15.354f)
                curveToRelative(1.436f, 0.223f, 2.539f, 1.455f, 2.539f, 2.954f)
                close()
            }
        }
        .build()
        return _scooter!!
    }

private var _scooter: ImageVector? = null
