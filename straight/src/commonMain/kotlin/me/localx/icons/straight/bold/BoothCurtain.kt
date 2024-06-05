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

public val Icons.Bold.BoothCurtain: ImageVector
    get() {
        if (_boothCurtain != null) {
            return _boothCurtain!!
        }
        _boothCurtain = Builder(name = "BoothCurtain", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.5f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-12.639f)
                curveToRelative(1.703f, 2.249f, 3.843f, 3.626f, 5.644f, 4.452f)
                curveToRelative(-1.423f, 1.552f, -2.859f, 3.761f, -3.137f, 6.538f)
                lineToRelative(-0.165f, 1.649f)
                horizontalLineToRelative(8.657f)
                lineTo(23.999f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 3.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(8.0f)
                lineTo(3.0f, 11.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(13.08f, 3.0f)
                horizontalLineToRelative(2.014f)
                curveToRelative(0.43f, 3.343f, 2.251f, 5.608f, 3.906f, 7.015f)
                verticalLineToRelative(-4.632f)
                curveToRelative(-0.384f, -0.685f, -0.68f, -1.483f, -0.848f, -2.383f)
                horizontalLineToRelative(2.348f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(10.084f)
                curveToRelative(-2.611f, -0.88f, -7.326f, -3.467f, -7.92f, -10.584f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-2.129f)
                curveToRelative(0.48f, -1.333f, 1.314f, -2.454f, 2.129f, -3.312f)
                verticalLineToRelative(3.312f)
                close()
                moveTo(5.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _boothCurtain!!
    }

private var _boothCurtain: ImageVector? = null
