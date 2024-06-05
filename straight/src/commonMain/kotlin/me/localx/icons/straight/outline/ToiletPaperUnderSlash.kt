package me.localx.icons.straight.outline

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

public val Icons.Outline.ToiletPaperUnderSlash: ImageVector
    get() {
        if (_toiletPaperUnderSlash != null) {
            return _toiletPaperUnderSlash!!
        }
        _toiletPaperUnderSlash = Builder(name = "ToiletPaperUnderSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 8.5f)
                curveToRelative(0.0f, -0.828f, 0.448f, -1.5f, 1.0f, -1.5f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                reflectiveCurveToRelative(-0.448f, 1.5f, -1.0f, 1.5f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                close()
                moveTo(23.952f, 22.538f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(0.018f, 1.432f)
                lineTo(1.432f, 0.018f)
                lineToRelative(1.069f, 1.069f)
                curveToRelative(0.745f, -0.708f, 1.607f, -1.087f, 2.499f, -1.087f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.604f, 0.0f, 4.684f, 3.221f, 4.967f, 7.5f)
                lineToRelative(0.033f, 13.086f)
                lineToRelative(1.952f, 1.952f)
                close()
                moveTo(20.0f, 15.345f)
                curveToRelative(-0.531f, 0.667f, -1.146f, 1.158f, -1.817f, 1.425f)
                lineToRelative(1.817f, 1.817f)
                verticalLineToRelative(-3.241f)
                close()
                moveTo(17.0f, 2.0f)
                curveToRelative(-1.419f, 0.0f, -3.0f, 2.669f, -3.0f, 6.5f)
                curveToRelative(0.0f, 2.618f, 0.738f, 4.693f, 1.659f, 5.745f)
                curveToRelative(0.0f, 0.0f, 0.726f, 0.755f, 1.341f, 0.755f)
                curveToRelative(1.419f, 0.0f, 3.0f, -2.669f, 3.0f, -6.5f)
                reflectiveCurveToRelative(-1.581f, -6.5f, -3.0f, -6.5f)
                close()
                moveTo(3.916f, 2.502f)
                lineToRelative(8.256f, 8.256f)
                curveToRelative(-0.112f, -0.717f, -0.172f, -1.473f, -0.172f, -2.258f)
                curveToRelative(0.0f, -2.634f, 0.671f, -4.953f, 1.745f, -6.5f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-0.416f, 0.0f, -0.789f, 0.23f, -1.084f, 0.502f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.757f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(-5.757f)
                curveToRelative(-1.419f, 0.0f, -3.0f, -2.669f, -3.0f, -6.5f)
                curveToRelative(0.0f, -0.717f, 0.064f, -1.417f, 0.175f, -2.082f)
                lineToRelative(-1.677f, -1.677f)
                curveToRelative(-0.323f, 1.149f, -0.498f, 2.428f, -0.498f, 3.759f)
                curveToRelative(0.0f, 4.767f, 2.196f, 8.5f, 5.0f, 8.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(7.757f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(-5.757f)
                close()
            }
        }
        .build()
        return _toiletPaperUnderSlash!!
    }

private var _toiletPaperUnderSlash: ImageVector? = null
