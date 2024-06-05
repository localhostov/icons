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

public val Icons.Filled.GolfHole: ImageVector
    get() {
        if (_golfHole != null) {
            return _golfHole!!
        }
        _golfHole = Builder(name = "GolfHole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.42f, -5.159f, 6.0f, -12.0f, 6.0f)
                reflectiveCurveTo(0.0f, 21.42f, 0.0f, 18.0f)
                curveToRelative(0.0f, -2.897f, 3.709f, -5.183f, 9.0f, -5.816f)
                verticalLineToRelative(7.816f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-7.819f)
                curveToRelative(5.291f, 0.634f, 9.0f, 2.921f, 9.0f, 5.819f)
                close()
                moveTo(13.0f, 18.0f)
                verticalLineToRelative(-6.395f)
                lineToRelative(9.493f, -4.972f)
                lineTo(13.606f, 0.113f)
                curveToRelative(-0.544f, -0.199f, -1.251f, -0.136f, -1.735f, 0.165f)
                curveToRelative(-0.397f, 0.246f, -0.871f, 0.768f, -0.871f, 1.858f)
                verticalLineToRelative(15.864f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _golfHole!!
    }

private var _golfHole: ImageVector? = null
