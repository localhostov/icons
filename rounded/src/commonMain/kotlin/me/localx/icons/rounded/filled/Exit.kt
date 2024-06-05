package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Exit: ImageVector
    get() {
        if (_exit != null) {
            return _exit!!
        }
        _exit = Builder(name = "Exit", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(487.06f, 195.669f)
                lineToRelative(-82.752f, -82.752f)
                curveToRelative(-8.475f, -8.185f, -21.98f, -7.95f, -30.165f, 0.525f)
                curveToRelative(-7.985f, 8.267f, -7.985f, 21.374f, 0.0f, 29.641f)
                lineToRelative(82.752f, 82.752f)
                curveToRelative(2.459f, 2.507f, 4.607f, 5.301f, 6.4f, 8.32f)
                curveToRelative(-0.32f, 0.0f, -0.576f, -0.171f, -0.896f, -0.171f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-334.592f, 0.683f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                curveToRelative(0.0f, 11.782f, 9.551f, 21.333f, 21.333f, 21.333f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(334.464f, -0.683f)
                curveToRelative(0.597f, 0.0f, 1.088f, -0.299f, 1.664f, -0.341f)
                curveToRelative(-1.892f, 3.609f, -4.292f, 6.928f, -7.125f, 9.856f)
                lineToRelative(-82.752f, 82.752f)
                curveToRelative(-8.475f, 8.185f, -8.71f, 21.69f, -0.525f, 30.165f)
                curveToRelative(8.185f, 8.475f, 21.69f, 8.71f, 30.165f, 0.525f)
                curveToRelative(0.178f, -0.172f, 0.353f, -0.347f, 0.525f, -0.525f)
                lineToRelative(82.752f, -82.752f)
                curveToRelative(33.313f, -33.323f, 33.313f, -87.339f, 0.0f, -120.661f)
                lineTo(487.06f, 195.669f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.374f, 469.333f)
                horizontalLineToRelative(-42.667f)
                curveToRelative(-35.346f, 0.0f, -64.0f, -28.654f, -64.0f, -64.0f)
                verticalLineTo(106.667f)
                curveToRelative(0.0f, -35.346f, 28.654f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(42.667f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                reflectiveCurveTo(161.157f, 0.0f, 149.374f, 0.0f)
                horizontalLineToRelative(-42.667f)
                curveTo(47.827f, 0.071f, 0.112f, 47.786f, 0.041f, 106.667f)
                verticalLineToRelative(298.667f)
                curveTo(0.112f, 464.214f, 47.827f, 511.93f, 106.708f, 512.0f)
                horizontalLineToRelative(42.667f)
                curveToRelative(11.782f, 0.0f, 21.333f, -9.551f, 21.333f, -21.333f)
                curveTo(170.708f, 478.885f, 161.157f, 469.333f, 149.374f, 469.333f)
                close()
            }
        }
        .build()
        return _exit!!
    }

private var _exit: ImageVector? = null
