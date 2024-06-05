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

public val Icons.Outline.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.034f, 21.42f)
                curveToRelative(-0.725f, 1.567f, -2.308f, 2.58f, -4.034f, 2.58f)
                curveToRelative(-2.3f, 0.0f, -4.198f, -1.757f, -4.42f, -4.0f)
                horizontalLineToRelative(-1.529f)
                curveToRelative(-1.541f, 0.0f, -2.976f, -0.689f, -3.939f, -1.891f)
                curveToRelative(-0.962f, -1.199f, -1.324f, -2.75f, -0.991f, -4.254f)
                lineToRelative(1.323f, -5.106f)
                curveToRelative(0.139f, -0.534f, 0.683f, -0.855f, 1.219f, -0.717f)
                curveToRelative(0.535f, 0.138f, 0.855f, 0.684f, 0.717f, 1.219f)
                lineToRelative(-1.314f, 5.071f)
                curveToRelative(-0.193f, 0.875f, 0.025f, 1.812f, 0.607f, 2.536f)
                curveToRelative(0.582f, 0.726f, 1.449f, 1.142f, 2.379f, 1.142f)
                horizontalLineToRelative(6.949f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.401f)
                curveToRelative(0.209f, 1.136f, 1.206f, 2.0f, 2.401f, 2.0f)
                curveToRelative(0.949f, 0.0f, 1.82f, -0.557f, 2.219f, -1.42f)
                curveToRelative(0.232f, -0.501f, 0.829f, -0.718f, 1.327f, -0.488f)
                curveToRelative(0.501f, 0.232f, 0.72f, 0.826f, 0.488f, 1.328f)
                close()
                moveTo(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineTo(0.293f, 1.707f)
                curveTo(-0.098f, 1.316f, -0.098f, 0.684f, 0.293f, 0.293f)
                reflectiveCurveTo(1.316f, -0.098f, 1.707f, 0.293f)
                lineToRelative(3.065f, 3.065f)
                curveTo(6.543f, 1.239f, 9.178f, 0.0f, 12.0f, 0.0f)
                curveToRelative(4.218f, 0.0f, 7.953f, 2.838f, 9.082f, 6.902f)
                lineToRelative(1.737f, 6.714f)
                curveToRelative(0.42f, 1.515f, 0.112f, 3.121f, -0.849f, 4.388f)
                curveToRelative(-0.375f, 0.493f, -0.824f, 0.903f, -1.329f, 1.222f)
                lineToRelative(3.066f, 3.066f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(6.194f, 4.78f)
                lineToRelative(12.971f, 12.971f)
                curveToRelative(0.474f, -0.205f, 0.888f, -0.529f, 1.211f, -0.954f)
                curveToRelative(0.581f, -0.766f, 0.768f, -1.736f, 0.511f, -2.662f)
                lineToRelative(-1.736f, -6.714f)
                curveToRelative(-0.885f, -3.184f, -3.827f, -5.42f, -7.15f, -5.42f)
                curveToRelative(-2.286f, 0.0f, -4.413f, 1.029f, -5.806f, 2.78f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
