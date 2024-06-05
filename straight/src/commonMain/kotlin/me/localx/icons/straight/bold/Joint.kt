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

public val Icons.Bold.Joint: ImageVector
    get() {
        if (_joint != null) {
            return _joint!!
        }
        _joint = Builder(name = "Joint", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.678f, 18.709f)
                lineToRelative(-0.678f, 0.517f)
                verticalLineToRelative(1.624f)
                lineToRelative(0.682f, 0.444f)
                curveToRelative(0.17f, 0.11f, 4.206f, 2.707f, 8.282f, 2.707f)
                horizontalLineToRelative(15.036f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-15.036f)
                curveToRelative(-4.103f, 0.0f, -8.117f, 2.599f, -8.286f, 2.709f)
                close()
                moveTo(4.697f, 19.998f)
                curveToRelative(1.224f, -0.515f, 2.769f, -0.998f, 4.267f, -0.998f)
                horizontalLineToRelative(1.915f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(-3.915f)
                curveToRelative(-1.491f, 0.0f, -3.04f, -0.485f, -4.267f, -1.002f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-3.879f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(5.879f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 4.856f)
                verticalLineToRelative(-2.856f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.856f)
                curveToRelative(0.0f, 0.873f, 0.465f, 1.695f, 1.214f, 2.144f)
                lineToRelative(1.602f, 0.961f)
                curveToRelative(1.347f, 0.809f, 2.185f, 2.287f, 2.185f, 3.858f)
                verticalLineToRelative(2.18f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.18f)
                curveToRelative(0.0f, -0.524f, -0.279f, -1.017f, -0.729f, -1.286f)
                lineToRelative(-1.602f, -0.961f)
                curveToRelative(-1.647f, -0.988f, -2.67f, -2.795f, -2.67f, -4.716f)
                close()
                moveTo(24.0f, 10.264f)
                verticalLineToRelative(1.735f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.735f)
                curveToRelative(0.0f, -0.873f, -0.465f, -1.694f, -1.214f, -2.144f)
                lineToRelative(-2.086f, -1.252f)
                curveToRelative(-1.048f, -0.629f, -1.699f, -1.779f, -1.699f, -3.001f)
                lineTo(16.001f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.868f)
                curveToRelative(0.0f, 0.175f, 0.093f, 0.339f, 0.243f, 0.429f)
                lineToRelative(2.086f, 1.252f)
                curveToRelative(1.647f, 0.988f, 2.671f, 2.795f, 2.671f, 4.716f)
                close()
            }
        }
        .build()
        return _joint!!
    }

private var _joint: ImageVector? = null
