package me.localx.icons.rounded.bold

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

public val Icons.Bold.StarSharpHalfStroke: ImageVector
    get() {
        if (_starSharpHalfStroke != null) {
            return _starSharpHalfStroke!!
        }
        _starSharpHalfStroke = Builder(name = "StarSharpHalfStroke", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.816f, 8.589f)
                curveToRelative(-0.495f, -1.52f, -1.848f, -2.502f, -3.446f, -2.502f)
                horizontalLineToRelative(-3.772f)
                lineToRelative(-1.145f, -3.57f)
                curveToRelative(-0.491f, -1.529f, -1.847f, -2.517f, -3.453f, -2.517f)
                reflectiveCurveToRelative(-2.962f, 0.988f, -3.454f, 2.519f)
                lineToRelative(-1.144f, 3.568f)
                horizontalLineToRelative(-3.772f)
                curveToRelative(-1.599f, 0.0f, -2.951f, 0.981f, -3.446f, 2.501f)
                curveToRelative(-0.496f, 1.52f, 0.018f, 3.11f, 1.307f, 4.052f)
                lineToRelative(3.08f, 2.252f)
                lineToRelative(-1.169f, 3.618f)
                curveToRelative(-0.493f, 1.527f, 0.028f, 3.119f, 1.329f, 4.056f)
                curveToRelative(1.279f, 0.922f, 2.994f, 0.917f, 4.27f, -0.02f)
                lineToRelative(3.0f, -2.207f)
                lineToRelative(3.0f, 2.205f)
                curveToRelative(0.651f, 0.48f, 1.399f, 0.72f, 2.148f, 0.72f)
                curveToRelative(0.737f, 0.0f, 1.475f, -0.232f, 2.12f, -0.697f)
                curveToRelative(1.302f, -0.938f, 1.823f, -2.53f, 1.33f, -4.056f)
                lineToRelative(-1.169f, -3.619f)
                lineToRelative(3.079f, -2.251f)
                curveToRelative(1.29f, -0.942f, 1.804f, -2.532f, 1.308f, -4.051f)
                close()
                moveTo(20.738f, 10.218f)
                lineToRelative(-3.955f, 2.892f)
                curveToRelative(-0.522f, 0.382f, -0.74f, 1.056f, -0.542f, 1.672f)
                lineToRelative(1.503f, 4.651f)
                curveToRelative(0.093f, 0.287f, 0.016f, 0.522f, -0.229f, 0.699f)
                curveToRelative(-0.247f, 0.177f, -0.493f, 0.175f, -0.736f, -0.004f)
                lineToRelative(-3.89f, -2.859f)
                curveToRelative(-0.265f, -0.194f, -0.576f, -0.292f, -0.889f, -0.292f)
                lineTo(12.0f, 3.0f)
                curveToRelative(0.303f, 0.0f, 0.504f, 0.146f, 0.596f, 0.434f)
                lineToRelative(1.479f, 4.611f)
                curveToRelative(0.199f, 0.621f, 0.776f, 1.042f, 1.429f, 1.042f)
                horizontalLineToRelative(4.867f)
                curveToRelative(0.301f, 0.0f, 0.501f, 0.145f, 0.595f, 0.432f)
                curveToRelative(0.093f, 0.286f, 0.018f, 0.521f, -0.227f, 0.699f)
                close()
            }
        }
        .build()
        return _starSharpHalfStroke!!
    }

private var _starSharpHalfStroke: ImageVector? = null
