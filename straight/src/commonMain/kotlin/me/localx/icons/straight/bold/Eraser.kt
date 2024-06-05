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

public val Icons.Bold.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.975f, 12.632f)
                curveToRelative(0.661f, -0.661f, 1.025f, -1.54f, 1.025f, -2.475f)
                reflectiveCurveToRelative(-0.364f, -1.814f, -1.025f, -2.475f)
                lineToRelative(-5.656f, -5.657f)
                curveToRelative(-1.364f, -1.364f, -3.584f, -1.366f, -4.95f, 0.0f)
                lineTo(1.055f, 13.339f)
                curveToRelative(-1.365f, 1.365f, -1.365f, 3.585f, 0.0f, 4.95f)
                lineToRelative(4.712f, 4.711f)
                horizontalLineToRelative(18.233f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.394f)
                lineToRelative(7.368f, -7.368f)
                close()
                moveTo(14.489f, 4.146f)
                curveToRelative(0.194f, -0.194f, 0.512f, -0.196f, 0.708f, 0.0f)
                lineToRelative(5.656f, 5.657f)
                curveToRelative(0.128f, 0.127f, 0.146f, 0.276f, 0.146f, 0.353f)
                curveToRelative(0.0f, 0.078f, -0.02f, 0.227f, -0.146f, 0.354f)
                lineToRelative(-4.861f, 4.861f)
                lineToRelative(-6.364f, -6.364f)
                lineToRelative(4.861f, -4.861f)
                close()
                moveTo(7.009f, 20.0f)
                lineToRelative(-3.833f, -3.833f)
                curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0.0f, -0.708f)
                lineToRelative(4.332f, -4.332f)
                lineToRelative(6.364f, 6.364f)
                lineToRelative(-2.507f, 2.507f)
                horizontalLineToRelative(-4.355f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
