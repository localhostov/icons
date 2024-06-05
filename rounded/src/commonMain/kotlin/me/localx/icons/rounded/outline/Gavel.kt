package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = Builder(name = "Gavel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.704f, 10.806f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-0.549f, 0.549f)
                lineTo(12.659f, 2.273f)
                lineToRelative(0.549f, -0.549f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineTo(4.794f, 7.31f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(0.581f, -0.581f)
                lineToRelative(3.827f, 3.827f)
                lineTo(0.293f, 22.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineTo(12.03f, 13.384f)
                lineToRelative(3.841f, 3.841f)
                lineToRelative(-0.58f, 0.58f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(7.0f, -7.0f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(14.616f, 13.143f)
                lineToRelative(-3.672f, -3.672f)
                lineToRelative(3.042f, -3.042f)
                lineToRelative(3.672f, 3.672f)
                curveToRelative(-0.789f, 0.789f, -2.195f, 2.195f, -3.042f, 3.042f)
                close()
                moveTo(11.245f, 3.687f)
                lineToRelative(1.327f, 1.327f)
                lineToRelative(-3.042f, 3.042f)
                lineToRelative(-1.327f, -1.327f)
                lineToRelative(3.042f, -3.042f)
                close()
                moveTo(16.031f, 14.557f)
                curveToRelative(0.849f, -0.849f, 2.254f, -2.254f, 3.042f, -3.042f)
                lineToRelative(1.254f, 1.254f)
                lineToRelative(-3.042f, 3.042f)
                lineToRelative(-1.254f, -1.254f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
