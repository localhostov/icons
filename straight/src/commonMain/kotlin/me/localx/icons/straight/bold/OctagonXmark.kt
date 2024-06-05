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

public val Icons.Bold.OctagonXmark: ImageVector
    get() {
        if (_octagonXmark != null) {
            return _octagonXmark!!
        }
        _octagonXmark = Builder(name = "OctagonXmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.975f, 6.004f)
                lineToRelative(-4.979f, -4.979f)
                curveToRelative(-0.661f, -0.661f, -1.54f, -1.025f, -2.475f, -1.025f)
                horizontalLineToRelative(-7.042f)
                curveToRelative(-0.935f, 0.0f, -1.813f, 0.364f, -2.475f, 1.025f)
                lineTo(1.025f, 6.004f)
                curveToRelative(-0.661f, 0.661f, -1.025f, 1.54f, -1.025f, 2.475f)
                verticalLineToRelative(7.042f)
                curveToRelative(0.0f, 0.935f, 0.364f, 1.813f, 1.025f, 2.475f)
                lineToRelative(4.979f, 4.979f)
                curveToRelative(0.661f, 0.661f, 1.54f, 1.025f, 2.475f, 1.025f)
                horizontalLineToRelative(7.042f)
                curveToRelative(0.935f, 0.0f, 1.813f, -0.364f, 2.475f, -1.025f)
                lineToRelative(4.979f, -4.979f)
                curveToRelative(0.661f, -0.661f, 1.025f, -1.54f, 1.025f, -2.475f)
                verticalLineToRelative(-7.042f)
                curveToRelative(0.0f, -0.935f, -0.364f, -1.813f, -1.025f, -2.475f)
                close()
                moveTo(21.0f, 15.521f)
                curveToRelative(0.0f, 0.131f, -0.054f, 0.26f, -0.146f, 0.354f)
                lineToRelative(-4.979f, 4.979f)
                curveToRelative(-0.094f, 0.093f, -0.222f, 0.146f, -0.354f, 0.146f)
                horizontalLineToRelative(-7.042f)
                curveToRelative(-0.131f, 0.0f, -0.26f, -0.053f, -0.354f, -0.146f)
                lineToRelative(-4.979f, -4.979f)
                curveToRelative(-0.093f, -0.093f, -0.146f, -0.222f, -0.146f, -0.354f)
                verticalLineToRelative(-7.042f)
                curveToRelative(0.0f, -0.131f, 0.053f, -0.26f, 0.146f, -0.354f)
                lineToRelative(4.979f, -4.979f)
                curveToRelative(0.093f, -0.093f, 0.222f, -0.146f, 0.354f, -0.146f)
                horizontalLineToRelative(7.042f)
                curveToRelative(0.132f, 0.0f, 0.26f, 0.053f, 0.354f, 0.146f)
                lineToRelative(4.979f, 4.979f)
                curveToRelative(0.093f, 0.093f, 0.146f, 0.222f, 0.146f, 0.354f)
                verticalLineToRelative(7.042f)
                close()
                moveTo(16.596f, 9.525f)
                lineToRelative(-2.475f, 2.475f)
                lineToRelative(2.475f, 2.475f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-2.475f, -2.475f)
                lineToRelative(-2.475f, 2.475f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(2.475f, -2.475f)
                lineToRelative(-2.475f, -2.475f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.475f, 2.475f)
                lineToRelative(2.475f, -2.475f)
                lineToRelative(2.121f, 2.121f)
                close()
            }
        }
        .build()
        return _octagonXmark!!
    }

private var _octagonXmark: ImageVector? = null
