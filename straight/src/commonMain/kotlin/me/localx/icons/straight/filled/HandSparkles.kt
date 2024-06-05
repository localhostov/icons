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

public val Icons.Filled.HandSparkles: ImageVector
    get() {
        if (_handSparkles != null) {
            return _handSparkles!!
        }
        _handSparkles = Builder(name = "HandSparkles", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 6.5f)
                lineToRelative(-1.667f, 0.833f)
                lineToRelative(-0.833f, 1.667f)
                lineToRelative(-0.833f, -1.667f)
                lineToRelative(-1.667f, -0.833f)
                lineToRelative(1.667f, -0.833f)
                lineToRelative(0.833f, -1.667f)
                lineToRelative(0.833f, 1.667f)
                lineToRelative(1.667f, 0.833f)
                close()
                moveTo(20.5f, 23.999f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-3.499f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(-1.166f, 2.332f)
                close()
                moveTo(24.0f, 4.499f)
                verticalLineToRelative(16.001f)
                lineToRelative(-2.333f, -1.167f)
                lineToRelative(-1.167f, -2.333f)
                lineToRelative(-1.167f, 2.333f)
                lineToRelative(-2.333f, 1.167f)
                lineToRelative(2.333f, 1.167f)
                lineToRelative(1.166f, 2.332f)
                horizontalLineToRelative(-12.5f)
                lineTo(0.646f, 16.411f)
                curveToRelative(-0.713f, -0.715f, -0.88f, -1.87f, -0.276f, -2.68f)
                curveToRelative(0.63f, -0.845f, 1.741f, -1.031f, 2.584f, -0.561f)
                curveToRelative(0.201f, 0.131f, 0.353f, 0.245f, 0.441f, 0.333f)
                lineToRelative(2.605f, 2.65f)
                lineTo(6.0f, 3.499f)
                curveToRelative(0.0f, -0.911f, 0.812f, -1.632f, 1.752f, -1.479f)
                curveToRelative(0.737f, 0.12f, 1.248f, 0.813f, 1.248f, 1.56f)
                verticalLineToRelative(8.42f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 1.499f)
                curveTo(11.0f, 0.671f, 11.672f, 0.0f, 12.5f, 0.0f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 2.499f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.5f, 16.5f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-1.0f, -2.0f)
                lineToRelative(-1.0f, 2.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(1.0f, 2.0f)
                lineToRelative(1.0f, -2.0f)
                lineToRelative(2.0f, -1.0f)
                close()
            }
        }
        .build()
        return _handSparkles!!
    }

private var _handSparkles: ImageVector? = null
