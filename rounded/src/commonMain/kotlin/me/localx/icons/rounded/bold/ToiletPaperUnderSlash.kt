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

public val Icons.Bold.ToiletPaperUnderSlash: ImageVector
    get() {
        if (_toiletPaperUnderSlash != null) {
            return _toiletPaperUnderSlash!!
        }
        _toiletPaperUnderSlash = Builder(name = "ToiletPaperUnderSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 22.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-2.532f)
                curveToRelative(-2.841f, -0.356f, -5.0f, -3.728f, -5.0f, -7.968f)
                curveToRelative(0.0f, -0.829f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                curveToRelative(0.0f, 2.862f, 1.32f, 5.0f, 2.5f, 5.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.653f, -0.417f, 1.208f, -1.0f, 1.414f)
                verticalLineToRelative(2.586f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.384f, -0.146f, 0.768f, -0.439f, 1.061f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                lineTo(0.439f, 2.561f)
                curveTo(-0.146f, 1.975f, -0.146f, 1.025f, 0.439f, 0.439f)
                curveTo(1.025f, -0.146f, 1.975f, -0.146f, 2.561f, 0.439f)
                lineToRelative(0.418f, 0.418f)
                curveToRelative(0.767f, -0.56f, 1.629f, -0.857f, 2.521f, -0.857f)
                curveToRelative(0.0f, 0.0f, 12.552f, 0.0f, 12.577f, 0.002f)
                curveToRelative(2.173f, 0.083f, 3.923f, 3.631f, 3.923f, 7.998f)
                curveToRelative(0.0f, 0.042f, -0.012f, 10.071f, 0.009f, 10.114f)
                curveToRelative(1.184f, 0.433f, 1.991f, 1.591f, 1.991f, 2.886f)
                close()
                moveTo(14.0f, 8.0f)
                curveToRelative(0.0f, -1.892f, 0.329f, -3.63f, 0.878f, -5.0f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-0.112f, 0.0f, -0.221f, 0.02f, -0.325f, 0.054f)
                lineToRelative(9.557f, 9.557f)
                curveToRelative(-0.461f, -1.302f, -0.732f, -2.893f, -0.732f, -4.611f)
                close()
                moveTo(19.0f, 8.0f)
                curveToRelative(0.0f, -1.933f, -0.448f, -3.5f, -1.0f, -3.5f)
                reflectiveCurveToRelative(-1.0f, 1.567f, -1.0f, 3.5f)
                reflectiveCurveToRelative(0.448f, 3.5f, 1.0f, 3.5f)
                reflectiveCurveToRelative(1.0f, -1.567f, 1.0f, -3.5f)
                close()
            }
        }
        .build()
        return _toiletPaperUnderSlash!!
    }

private var _toiletPaperUnderSlash: ImageVector? = null
