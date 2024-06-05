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

public val Icons.Filled.FloorAlt: ImageVector
    get() {
        if (_floorAlt != null) {
            return _floorAlt!!
        }
        _floorAlt = Builder(name = "FloorAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.75f)
                verticalLineToRelative(13.25f)
                lineTo(8.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-13.883f)
                curveToRelative(1.151f, 0.329f, 2.0f, 1.378f, 2.0f, 2.633f)
                close()
                moveTo(18.0f, 4.117f)
                verticalLineToRelative(13.883f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 6.75f)
                curveToRelative(0.0f, -1.255f, -0.849f, -2.304f, -2.0f, -2.633f)
                close()
                moveTo(8.385f, 13.413f)
                lineToRelative(-2.194f, -2.195f)
                lineToRelative(-4.782f, 4.782f)
                horizontalLineToRelative(4.389f)
                lineToRelative(2.587f, -2.587f)
                close()
                moveTo(5.965f, 4.291f)
                lineTo(0.0f, 10.33f)
                verticalLineToRelative(4.25f)
                lineTo(8.127f, 6.453f)
                lineToRelative(-2.162f, -2.163f)
                close()
                moveTo(16.001f, 3.0f)
                curveToRelative(0.0f, -0.463f, -0.114f, -0.897f, -0.303f, -1.289f)
                lineTo(7.604f, 9.804f)
                lineToRelative(2.194f, 2.195f)
                lineToRelative(6.201f, -6.201f)
                verticalLineToRelative(-2.797f)
                close()
                moveTo(7.39f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(4.483f)
                lineTo(7.39f, 0.0f)
                close()
                moveTo(8.626f, 16.0f)
                horizontalLineToRelative(7.374f)
                verticalLineToRelative(-7.374f)
                lineToRelative(-7.374f, 7.374f)
                close()
                moveTo(7.37f, 2.868f)
                lineToRelative(2.171f, 2.172f)
                lineTo(14.282f, 0.299f)
                curveToRelative(-0.39f, -0.186f, -0.821f, -0.299f, -1.282f, -0.299f)
                horizontalLineToRelative(-2.798f)
                lineToRelative(-2.832f, 2.868f)
                close()
            }
        }
        .build()
        return _floorAlt!!
    }

private var _floorAlt: ImageVector? = null
