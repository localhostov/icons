package me.localx.icons.straight.outline

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

public val Icons.Outline.GolfHole: ImageVector
    get() {
        if (_golfHole != null) {
            return _golfHole!!
        }
        _golfHole = Builder(name = "GolfHole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.605f)
                lineToRelative(9.493f, -4.972f)
                lineTo(13.606f, 0.113f)
                curveToRelative(-0.544f, -0.199f, -1.251f, -0.136f, -1.735f, 0.165f)
                curveToRelative(-0.397f, 0.246f, -0.871f, 0.768f, -0.871f, 1.858f)
                lineTo(11.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.395f)
                close()
                moveTo(13.0f, 2.101f)
                lineToRelative(5.737f, 4.242f)
                lineToRelative(-5.737f, 3.004f)
                lineTo(13.0f, 2.101f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.42f, -5.159f, 6.0f, -12.0f, 6.0f)
                reflectiveCurveTo(0.0f, 21.42f, 0.0f, 18.0f)
                curveToRelative(0.0f, -2.898f, 3.709f, -5.185f, 9.0f, -5.819f)
                verticalLineToRelative(2.013f)
                curveToRelative(-4.239f, 0.562f, -7.0f, 2.255f, -7.0f, 3.806f)
                curveToRelative(0.0f, 1.892f, 4.106f, 4.0f, 10.0f, 4.0f)
                reflectiveCurveToRelative(10.0f, -2.108f, 10.0f, -4.0f)
                curveToRelative(0.0f, -1.551f, -2.761f, -3.244f, -7.0f, -3.806f)
                verticalLineToRelative(-2.013f)
                curveToRelative(5.291f, 0.634f, 9.0f, 2.921f, 9.0f, 5.819f)
                close()
            }
        }
        .build()
        return _golfHole!!
    }

private var _golfHole: ImageVector? = null
