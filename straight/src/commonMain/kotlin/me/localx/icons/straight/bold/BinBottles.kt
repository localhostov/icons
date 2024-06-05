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

public val Icons.Bold.BinBottles: ImageVector
    get() {
        if (_binBottles != null) {
            return _binBottles!!
        }
        _binBottles = Builder(name = "BinBottles", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.987f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(23.949f, 9.0f)
                lineToRelative(-1.917f, 12.05f)
                curveToRelative(-0.272f, 1.71f, -1.726f, 2.95f, -3.457f, 2.95f)
                lineTo(5.424f, 24.0f)
                curveToRelative(-1.731f, 0.0f, -3.185f, -1.24f, -3.457f, -2.95f)
                lineTo(0.05f, 9.0f)
                horizontalLineToRelative(1.95f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.953f, 1.258f, -3.602f, 3.0f, -4.224f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                lineTo(11.0f, 3.276f)
                curveToRelative(1.742f, 0.621f, 3.0f, 2.271f, 3.0f, 4.224f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1.698f)
                curveToRelative(-0.391f, -1.619f, -1.394f, -3.027f, -2.802f, -3.933f)
                lineTo(13.0f, 0.0f)
                horizontalLineToRelative(5.0f)
                lineTo(18.0f, 3.051f)
                curveToRelative(2.244f, 0.252f, 4.0f, 2.139f, 4.0f, 4.449f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.95f)
                close()
                moveTo(4.999f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(20.434f, 12.0f)
                lineTo(3.565f, 12.0f)
                lineToRelative(1.365f, 8.579f)
                curveToRelative(0.039f, 0.244f, 0.247f, 0.421f, 0.494f, 0.421f)
                horizontalLineToRelative(13.152f)
                curveToRelative(0.247f, 0.0f, 0.455f, -0.177f, 0.494f, -0.421f)
                lineToRelative(1.365f, -8.579f)
                close()
                moveTo(15.986f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _binBottles!!
    }

private var _binBottles: ImageVector? = null
