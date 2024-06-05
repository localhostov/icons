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

public val Icons.Bold.Dagger: ImageVector
    get() {
        if (_dagger != null) {
            return _dagger!!
        }
        _dagger = Builder(name = "Dagger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.389f, 9.268f)
                lineToRelative(-2.772f, -2.773f)
                lineToRelative(4.344f, -4.343f)
                lineTo(21.839f, 0.031f)
                lineToRelative(-4.344f, 4.343f)
                lineToRelative(-2.763f, -2.763f)
                curveToRelative(-1.039f, -1.039f, -2.42f, -1.611f, -3.89f, -1.611f)
                horizontalLineToRelative(-1.843f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.843f)
                curveToRelative(0.668f, 0.0f, 1.296f, 0.26f, 1.769f, 0.732f)
                lineToRelative(0.392f, 0.392f)
                lineToRelative(-5.749f, 5.75f)
                curveToRelative(-2.501f, 2.5f, -4.576f, 5.371f, -6.168f, 8.532f)
                lineToRelative(-0.898f, 1.785f)
                lineToRelative(-0.125f, 0.351f)
                curveToRelative(-0.21f, 0.952f, 0.076f, 1.932f, 0.766f, 2.621f)
                curveToRelative(0.54f, 0.541f, 1.26f, 0.833f, 2.004f, 0.833f)
                curveToRelative(0.204f, 0.0f, 0.411f, -0.022f, 0.617f, -0.067f)
                lineToRelative(2.137f, -1.023f)
                curveToRelative(3.159f, -1.591f, 6.029f, -3.666f, 8.531f, -6.167f)
                lineToRelative(5.749f, -5.749f)
                lineToRelative(0.402f, 0.402f)
                curveToRelative(0.466f, 0.466f, 0.732f, 1.11f, 0.732f, 1.768f)
                verticalLineToRelative(1.843f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.843f)
                curveToRelative(0.0f, -1.469f, -0.572f, -2.85f, -1.611f, -3.889f)
                close()
                moveTo(11.996f, 14.616f)
                curveToRelative(-2.275f, 2.275f, -4.887f, 4.162f, -7.76f, 5.609f)
                lineToRelative(-0.948f, 0.477f)
                lineToRelative(0.478f, -0.947f)
                curveToRelative(1.447f, -2.875f, 3.335f, -5.485f, 5.609f, -7.76f)
                lineToRelative(5.749f, -5.75f)
                lineToRelative(2.621f, 2.621f)
                lineToRelative(-5.749f, 5.749f)
                close()
            }
        }
        .build()
        return _dagger!!
    }

private var _dagger: ImageVector? = null
