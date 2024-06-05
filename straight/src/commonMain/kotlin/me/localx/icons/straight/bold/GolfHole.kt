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

public val Icons.Bold.GolfHole: ImageVector
    get() {
        if (_golfHole != null) {
            return _golfHole!!
        }
        _golfHole = Builder(name = "GolfHole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 18.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.5f, 2.005f)
                curveTo(10.5f, 0.001f, 12.252f, -0.26f, 13.125f, 0.177f)
                lineToRelative(7.875f, 5.823f)
                lineToRelative(-7.5f, 3.929f)
                verticalLineToRelative(8.071f)
                close()
                moveTo(16.0f, 10.476f)
                verticalLineToRelative(3.083f)
                curveToRelative(3.017f, 0.723f, 5.0f, 2.187f, 5.0f, 3.541f)
                curveToRelative(0.0f, 1.888f, -3.849f, 4.0f, -9.0f, 4.0f)
                reflectiveCurveToRelative(-9.0f, -2.112f, -9.0f, -4.0f)
                curveToRelative(0.0f, -1.353f, 1.983f, -2.817f, 5.0f, -3.541f)
                verticalLineToRelative(-3.083f)
                curveTo(3.248f, 11.396f, 0.0f, 13.936f, 0.0f, 17.1f)
                curveToRelative(0.0f, 3.991f, 5.159f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(12.0f, -3.009f, 12.0f, -7.0f)
                curveToRelative(0.0f, -3.164f, -3.248f, -5.704f, -8.0f, -6.624f)
                close()
            }
        }
        .build()
        return _golfHole!!
    }

private var _golfHole: ImageVector? = null
