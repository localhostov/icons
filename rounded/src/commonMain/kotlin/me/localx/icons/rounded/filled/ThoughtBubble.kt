package me.localx.icons.rounded.filled

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

public val Icons.Filled.ThoughtBubble: ImageVector
    get() {
        if (_thoughtBubble != null) {
            return _thoughtBubble!!
        }
        _thoughtBubble = Builder(name = "ThoughtBubble", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(6.0f, 17.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(15.485f, 15.862f)
                curveToRelative(0.221f, -0.162f, 0.532f, -0.209f, 0.817f, -0.12f)
                curveToRelative(1.137f, 0.35f, 2.298f, 0.346f, 3.452f, -0.014f)
                curveToRelative(2.258f, -0.701f, 3.949f, -2.729f, 4.207f, -5.044f)
                curveToRelative(0.309f, -2.77f, -1.302f, -5.364f, -3.917f, -6.311f)
                curveToRelative(-0.292f, -0.105f, -0.515f, -0.301f, -0.627f, -0.548f)
                curveToRelative(-1.049f, -2.324f, -3.372f, -3.826f, -5.918f, -3.826f)
                curveToRelative(-1.691f, 0.0f, -3.293f, 0.65f, -4.51f, 1.833f)
                curveToRelative(-0.233f, 0.227f, -0.563f, 0.329f, -0.852f, 0.276f)
                curveToRelative(-0.847f, -0.165f, -1.716f, -0.143f, -2.583f, 0.062f)
                curveTo(3.263f, 2.72f, 1.466f, 4.656f, 1.084f, 6.989f)
                curveToRelative(-0.53f, 3.22f, 1.542f, 6.247f, 4.719f, 6.892f)
                curveToRelative(0.154f, 0.031f, 0.423f, 0.056f, 0.702f, 0.068f)
                curveToRelative(0.172f, 0.008f, 0.325f, 0.101f, 0.424f, 0.257f)
                curveToRelative(1.108f, 1.749f, 3.004f, 2.794f, 5.071f, 2.794f)
                curveToRelative(1.257f, 0.0f, 2.462f, -0.394f, 3.485f, -1.138f)
                close()
            }
        }
        .build()
        return _thoughtBubble!!
    }

private var _thoughtBubble: ImageVector? = null
